package org.apache.commons.compress.archivers.zip;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

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
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray3 = new byte[] {};
        int int6 = zipArchiveInputStream2.read(byteArray3, (-1), 0);
        long long8 = zipArchiveInputStream2.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveInputStream2.canReadEntryData(archiveEntry9);
        int int11 = zipArchiveInputStream2.available();
        byte[] byteArray13 = zipArchiveInputStream2.readNBytes((int) '#');
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        int int15 = zipArchiveInputStream14.read();
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream16);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream17);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream18);
        java.io.InputStream inputStream20 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream20);
        boolean boolean22 = zipArchiveInputStream21.markSupported();
        zipArchiveInputStream21.mark((int) '4');
        java.io.InputStream inputStream25 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream25);
        zipArchiveInputStream26.mark(100);
        byte[] byteArray30 = zipArchiveInputStream26.readNBytes(0);
        int int31 = zipArchiveInputStream21.read(byteArray30);
        int int34 = zipArchiveInputStream18.read(byteArray30, (int) (short) -1, (int) (byte) 1);
        int int35 = zipArchiveInputStream14.read(byteArray30);
        java.io.InputStream inputStream36 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream37 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream36);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream38 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream37);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = zipArchiveInputStream38.getNextZipEntry();
        byte[] byteArray40 = zipArchiveInputStream38.readAllBytes();
        java.io.InputStream inputStream41 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream42 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream41);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream43 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream42);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream44 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream43);
        java.io.InputStream inputStream45 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream46 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream45);
        boolean boolean47 = zipArchiveInputStream46.markSupported();
        zipArchiveInputStream46.mark((int) '4');
        java.io.InputStream inputStream50 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream51 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream50);
        zipArchiveInputStream51.mark(100);
        byte[] byteArray55 = zipArchiveInputStream51.readNBytes(0);
        int int56 = zipArchiveInputStream46.read(byteArray55);
        int int59 = zipArchiveInputStream43.read(byteArray55, (int) (short) -1, (int) (byte) 1);
        int int62 = zipArchiveInputStream38.read(byteArray55, 100, 0);
        int int63 = zipArchiveInputStream14.read(byteArray55);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry64 = null;
        boolean boolean65 = zipArchiveInputStream14.canReadEntryData(archiveEntry64);
        zipArchiveInputStream14.mark(0);
        byte[] byteArray69 = zipArchiveInputStream14.readNBytes((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream73 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream14, "hi!", true, true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] {});
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        zipArchiveInputStream8.mark(100);
        byte[] byteArray12 = zipArchiveInputStream8.readNBytes(0);
        int int13 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean14 = zipArchiveInputStream1.markSupported();
        boolean boolean15 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        boolean boolean23 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray21, 0);
        boolean boolean25 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray21, 1);
        boolean boolean27 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray21, (int) ' ');
        int int28 = zipArchiveInputStream16.read(byteArray21);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry29 = null;
        boolean boolean30 = zipArchiveInputStream16.canReadEntryData(archiveEntry29);
        int int31 = zipArchiveInputStream16.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = zipArchiveInputStream16.getNextEntry();
        java.io.InputStream inputStream33 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream34 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream33);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream35 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream34);
        byte[] byteArray36 = new byte[] {};
        int int39 = zipArchiveInputStream35.read(byteArray36, (-1), 0);
        byte[] byteArray40 = zipArchiveInputStream35.readAllBytes();
        int int41 = zipArchiveInputStream16.read(byteArray40);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream42 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream16);
        zipArchiveInputStream16.mark(10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(archiveEntry32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        long long4 = zipArchiveInputStream1.skip((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = zipArchiveInputStream1.getNextZipEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        byte[] byteArray6 = zipArchiveInputStream1.readAllBytes();
        long long8 = zipArchiveInputStream1.skip((long) 1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveInputStream1.canReadEntryData(archiveEntry9);
        byte[] byteArray11 = zipArchiveInputStream1.readAllBytes();
        int int12 = zipArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream1.canReadEntryData(archiveEntry13);
        byte[] byteArray15 = zipArchiveInputStream1.readAllBytes();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveInputStream1.canReadEntryData(archiveEntry6);
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        zipArchiveInputStream9.mark(100);
        long long13 = zipArchiveInputStream9.skip((long) 1);
        int int14 = zipArchiveInputStream9.getCount();
        boolean boolean15 = zipArchiveInputStream9.markSupported();
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream16);
        zipArchiveInputStream17.mark(100);
        long long21 = zipArchiveInputStream17.skip((long) 1);
        boolean boolean22 = zipArchiveInputStream17.markSupported();
        java.io.InputStream inputStream23 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream23);
        zipArchiveInputStream24.mark(100);
        byte[] byteArray28 = zipArchiveInputStream24.readNBytes(0);
        int int29 = zipArchiveInputStream17.read(byteArray28);
        int int30 = zipArchiveInputStream9.read(byteArray28);
        byte[] byteArray31 = zipArchiveInputStream9.readAllBytes();
        int int34 = zipArchiveInputStream1.read(byteArray31, (int) (short) 10, 10);
        long long35 = zipArchiveInputStream1.getBytesRead();
        int int36 = zipArchiveInputStream1.getCount();
        boolean boolean37 = zipArchiveInputStream1.markSupported();
        int int38 = zipArchiveInputStream1.read();
        java.io.OutputStream outputStream39 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long40 = zipArchiveInputStream1.transferTo(outputStream39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream4);
        boolean boolean6 = zipArchiveInputStream5.markSupported();
        zipArchiveInputStream5.mark((int) '4');
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        zipArchiveInputStream10.mark(100);
        byte[] byteArray14 = zipArchiveInputStream10.readNBytes(0);
        int int15 = zipArchiveInputStream5.read(byteArray14);
        int int18 = zipArchiveInputStream2.read(byteArray14, (int) (short) -1, (int) (byte) 1);
        boolean boolean19 = zipArchiveInputStream2.markSupported();
        byte[] byteArray20 = zipArchiveInputStream2.readAllBytes();
        byte[] byteArray21 = zipArchiveInputStream2.readAllBytes();
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream22);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream23);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = zipArchiveInputStream24.getNextZipEntry();
        byte[] byteArray26 = zipArchiveInputStream24.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = zipArchiveInputStream24.getNextZipEntry();
        byte[] byteArray28 = zipArchiveInputStream24.readAllBytes();
        int int31 = zipArchiveInputStream2.read(byteArray28, (int) '#', (int) (short) 10);
        boolean boolean33 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray28, (int) (byte) -1);
        java.lang.Class<?> wildcardClass34 = byteArray28.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNull(zipArchiveEntry25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNull(zipArchiveEntry27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        byte[] byteArray4 = zipArchiveInputStream2.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        byte[] byteArray6 = zipArchiveInputStream2.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        long long8 = zipArchiveInputStream7.getBytesRead();
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        zipArchiveInputStream10.mark(100);
        long long14 = zipArchiveInputStream10.skip((long) 1);
        boolean boolean15 = zipArchiveInputStream10.markSupported();
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream16);
        zipArchiveInputStream17.mark(100);
        byte[] byteArray21 = zipArchiveInputStream17.readNBytes(0);
        int int22 = zipArchiveInputStream10.read(byteArray21);
        boolean boolean23 = zipArchiveInputStream10.markSupported();
        boolean boolean24 = zipArchiveInputStream10.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        byte[] byteArray26 = zipArchiveInputStream25.readAllBytes();
        long long28 = zipArchiveInputStream25.skip((long) (short) 100);
        byte[] byteArray29 = zipArchiveInputStream25.readAllBytes();
        byte[] byteArray31 = zipArchiveInputStream25.readNBytes((int) '4');
        int int32 = zipArchiveInputStream7.read(byteArray31);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7);
        int int34 = zipArchiveInputStream7.getCount();
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        long long7 = zipArchiveInputStream1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream4);
        byte[] byteArray6 = zipArchiveInputStream4.readAllBytes();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        boolean boolean9 = zipArchiveInputStream8.markSupported();
        zipArchiveInputStream8.mark((int) '4');
        int int12 = zipArchiveInputStream8.getCount();
        long long14 = zipArchiveInputStream8.skip((long) 0);
        int int15 = zipArchiveInputStream8.read();
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream16);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream17);
        int int19 = zipArchiveInputStream18.available();
        byte[] byteArray20 = zipArchiveInputStream18.readAllBytes();
        int int21 = zipArchiveInputStream8.read(byteArray20);
        byte[] byteArray23 = zipArchiveInputStream8.readNBytes((int) (byte) 100);
        int int24 = zipArchiveInputStream8.getCount();
        byte[] byteArray25 = zipArchiveInputStream8.readAllBytes();
        int int26 = zipArchiveInputStream4.read(byteArray25);
        long long28 = zipArchiveInputStream4.skip((long) (short) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream4);
        long long31 = zipArchiveInputStream29.skip(10L);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream29);
        int int33 = zipArchiveInputStream29.read();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveInputStream29.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        zipArchiveInputStream1.mark((int) (byte) 100);
        int int8 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveInputStream1.canReadEntryData(archiveEntry9);
        int int11 = zipArchiveInputStream1.getCount();
        int int12 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream1.canReadEntryData(archiveEntry13);
        byte[] byteArray15 = zipArchiveInputStream1.readAllBytes();
        long long17 = zipArchiveInputStream1.skip(10L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "", true, true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray3 = new byte[] {};
        int int6 = zipArchiveInputStream2.read(byteArray3, (-1), 0);
        long long8 = zipArchiveInputStream2.skip((long) (short) 0);
        byte[] byteArray9 = zipArchiveInputStream2.readAllBytes();
        long long10 = zipArchiveInputStream2.getBytesRead();
        byte[] byteArray11 = zipArchiveInputStream2.readAllBytes();
        zipArchiveInputStream2.mark(1);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream14);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream15);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream16);
        byte[] byteArray19 = zipArchiveInputStream16.readNBytes((int) (byte) 10);
        boolean boolean21 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray19, (int) (short) 0);
        int int22 = zipArchiveInputStream2.read(byteArray19);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = zipArchiveInputStream2.getNextEntry();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(archiveEntry23);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        byte[] byteArray7 = zipArchiveInputStream1.readNBytes((int) ' ');
        boolean boolean8 = zipArchiveInputStream1.markSupported();
        byte[] byteArray9 = zipArchiveInputStream1.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray9, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream4);
        zipArchiveInputStream5.mark(100);
        byte[] byteArray9 = zipArchiveInputStream5.readNBytes(0);
        zipArchiveInputStream5.mark((int) (byte) 100);
        int int12 = zipArchiveInputStream5.getCount();
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream13);
        boolean boolean15 = zipArchiveInputStream14.markSupported();
        zipArchiveInputStream14.mark((int) '4');
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream18);
        zipArchiveInputStream19.mark(100);
        byte[] byteArray23 = zipArchiveInputStream19.readNBytes(0);
        int int24 = zipArchiveInputStream14.read(byteArray23);
        int int27 = zipArchiveInputStream5.readNBytes(byteArray23, 0, (int) (byte) 0);
        int int30 = zipArchiveInputStream2.read(byteArray23, (int) '4', (int) '#');
        java.io.InputStream inputStream31 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream31);
        zipArchiveInputStream32.mark(100);
        long long36 = zipArchiveInputStream32.skip((long) 1);
        byte[] byteArray38 = zipArchiveInputStream32.readNBytes((int) ' ');
        int int39 = zipArchiveInputStream2.read(byteArray38);
        byte[] byteArray40 = zipArchiveInputStream2.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream41 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        int int42 = zipArchiveInputStream41.available();
        int int43 = zipArchiveInputStream41.read();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveInputStream41.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray8 = zipArchiveInputStream6.readNBytes(0);
        long long10 = zipArchiveInputStream6.skip((long) (short) 0);
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream11);
        boolean boolean13 = zipArchiveInputStream12.markSupported();
        zipArchiveInputStream12.mark((int) '4');
        int int16 = zipArchiveInputStream12.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = zipArchiveInputStream12.canReadEntryData(archiveEntry17);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream19);
        zipArchiveInputStream20.mark(100);
        byte[] byteArray24 = zipArchiveInputStream20.readNBytes(0);
        int int27 = zipArchiveInputStream12.read(byteArray24, (int) (short) 100, (int) (byte) 0);
        int int28 = zipArchiveInputStream6.read(byteArray24);
        long long30 = zipArchiveInputStream6.skip(100L);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        byte[] byteArray4 = zipArchiveInputStream2.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = zipArchiveInputStream2.getNextZipEntry();
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream6);
        boolean boolean8 = zipArchiveInputStream7.markSupported();
        zipArchiveInputStream7.mark((int) '4');
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream11);
        zipArchiveInputStream12.mark(100);
        byte[] byteArray16 = zipArchiveInputStream12.readNBytes(0);
        int int17 = zipArchiveInputStream7.read(byteArray16);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = zipArchiveInputStream7.canReadEntryData(archiveEntry18);
        int int20 = zipArchiveInputStream7.getCount();
        java.io.InputStream inputStream21 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream21);
        long long23 = zipArchiveInputStream22.getBytesRead();
        long long24 = zipArchiveInputStream22.getBytesRead();
        int int25 = zipArchiveInputStream22.read();
        byte[] byteArray26 = zipArchiveInputStream22.readAllBytes();
        int int29 = zipArchiveInputStream7.read(byteArray26, (int) (byte) 100, (int) (short) 0);
        int int30 = zipArchiveInputStream2.read(byteArray26);
        java.io.InputStream inputStream31 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream31);
        zipArchiveInputStream32.mark(100);
        boolean boolean35 = zipArchiveInputStream32.markSupported();
        int int36 = zipArchiveInputStream32.getCount();
        byte[] byteArray38 = zipArchiveInputStream32.readNBytes((int) (byte) 0);
        int int39 = zipArchiveInputStream2.read(byteArray38);
        zipArchiveInputStream2.close();
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNull(zipArchiveEntry5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        long long6 = zipArchiveInputStream1.skip((long) (short) 10);
        zipArchiveInputStream1.mark((int) (short) -1);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        byte[] byteArray12 = new byte[] {};
        int int15 = zipArchiveInputStream11.read(byteArray12, (-1), 0);
        int int16 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean17 = zipArchiveInputStream1.markSupported();
        int int18 = zipArchiveInputStream1.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = zipArchiveInputStream19.getNextEntry();
        java.io.InputStream inputStream21 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream21);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream22);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream23);
        int int25 = zipArchiveInputStream23.getCount();
        byte[] byteArray27 = zipArchiveInputStream23.readNBytes((int) ' ');
        boolean boolean29 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray27, (int) (short) 1);
        int int32 = zipArchiveInputStream19.read(byteArray27, (int) (short) 100, (int) (byte) 100);
        boolean boolean34 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray27, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(archiveEntry20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        zipArchiveInputStream8.mark(100);
        byte[] byteArray12 = zipArchiveInputStream8.readNBytes(0);
        int int13 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean14 = zipArchiveInputStream1.markSupported();
        boolean boolean15 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        boolean boolean23 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray21, 0);
        boolean boolean25 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray21, 1);
        boolean boolean27 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray21, (int) ' ');
        int int28 = zipArchiveInputStream16.read(byteArray21);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry29 = null;
        boolean boolean30 = zipArchiveInputStream16.canReadEntryData(archiveEntry29);
        int int31 = zipArchiveInputStream16.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = zipArchiveInputStream16.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream16);
        boolean boolean34 = zipArchiveInputStream33.markSupported();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(archiveEntry32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream4);
        byte[] byteArray6 = zipArchiveInputStream4.readAllBytes();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        boolean boolean9 = zipArchiveInputStream8.markSupported();
        zipArchiveInputStream8.mark((int) '4');
        int int12 = zipArchiveInputStream8.getCount();
        long long14 = zipArchiveInputStream8.skip((long) 0);
        int int15 = zipArchiveInputStream8.read();
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream16);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream17);
        int int19 = zipArchiveInputStream18.available();
        byte[] byteArray20 = zipArchiveInputStream18.readAllBytes();
        int int21 = zipArchiveInputStream8.read(byteArray20);
        byte[] byteArray23 = zipArchiveInputStream8.readNBytes((int) (byte) 100);
        int int24 = zipArchiveInputStream8.getCount();
        byte[] byteArray25 = zipArchiveInputStream8.readAllBytes();
        int int26 = zipArchiveInputStream4.read(byteArray25);
        long long28 = zipArchiveInputStream4.skip((long) (short) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = null;
        boolean boolean31 = zipArchiveInputStream29.canReadEntryData(archiveEntry30);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream29);
        int int33 = zipArchiveInputStream32.getCount();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        int int5 = zipArchiveInputStream2.getCount();
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream6);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = zipArchiveInputStream8.getNextZipEntry();
        byte[] byteArray10 = zipArchiveInputStream8.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = zipArchiveInputStream8.getNextZipEntry();
        byte[] byteArray12 = zipArchiveInputStream8.readAllBytes();
        int int15 = zipArchiveInputStream2.read(byteArray12, (int) 'a', (int) (short) 1);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream16);
        zipArchiveInputStream17.mark(100);
        long long21 = zipArchiveInputStream17.skip((long) 1);
        byte[] byteArray23 = zipArchiveInputStream17.readNBytes((int) ' ');
        int int26 = zipArchiveInputStream2.read(byteArray23, (int) (byte) 100, (-1));
        byte[] byteArray27 = zipArchiveInputStream2.readAllBytes();
        boolean boolean29 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray27, (int) (byte) 0);
        java.lang.Class<?> wildcardClass30 = byteArray27.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(zipArchiveEntry9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNull(zipArchiveEntry11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream5);
        boolean boolean7 = zipArchiveInputStream6.markSupported();
        zipArchiveInputStream6.mark((int) '4');
        int int10 = zipArchiveInputStream6.getCount();
        long long12 = zipArchiveInputStream6.skip((long) 0);
        int int13 = zipArchiveInputStream6.read();
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream14);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream15);
        int int17 = zipArchiveInputStream16.available();
        byte[] byteArray18 = zipArchiveInputStream16.readAllBytes();
        int int19 = zipArchiveInputStream6.read(byteArray18);
        int int22 = zipArchiveInputStream1.read(byteArray18, 1, (int) (byte) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = null;
        boolean boolean24 = zipArchiveInputStream1.canReadEntryData(archiveEntry23);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int26 = zipArchiveInputStream1.getCount();
        long long27 = zipArchiveInputStream1.getBytesRead();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark(100);
        boolean boolean5 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream6);
        zipArchiveInputStream7.mark(100);
        long long11 = zipArchiveInputStream7.skip((long) 1);
        byte[] byteArray13 = zipArchiveInputStream7.readNBytes(100);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream14);
        zipArchiveInputStream15.mark(100);
        byte[] byteArray19 = zipArchiveInputStream15.readNBytes(0);
        zipArchiveInputStream15.mark((int) (byte) 100);
        int int22 = zipArchiveInputStream15.getCount();
        byte[] byteArray23 = zipArchiveInputStream15.readAllBytes();
        int int24 = zipArchiveInputStream7.read(byteArray23);
        int int25 = zipArchiveInputStream1.read(byteArray23);
        byte[] byteArray27 = zipArchiveInputStream1.readNBytes((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int3 = zipArchiveInputStream1.available();
        boolean boolean4 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveInputStream1.canReadEntryData(archiveEntry5);
        boolean boolean7 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.close();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry2 = null;
        boolean boolean3 = zipArchiveInputStream1.canReadEntryData(archiveEntry2);
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream4);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        byte[] byteArray7 = new byte[] {};
        int int10 = zipArchiveInputStream6.read(byteArray7, (-1), 0);
        long long12 = zipArchiveInputStream6.skip((long) (short) 0);
        byte[] byteArray13 = zipArchiveInputStream6.readAllBytes();
        int int14 = zipArchiveInputStream1.read(byteArray13);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = zipArchiveInputStream1.canReadEntryData(archiveEntry15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark(1);
        long long6 = zipArchiveInputStream1.skip((long) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        boolean boolean3 = zipArchiveInputStream2.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream2.canReadEntryData(archiveEntry4);
        byte[] byteArray6 = zipArchiveInputStream2.readAllBytes();
        long long8 = zipArchiveInputStream2.skip((long) '4');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveInputStream2.canReadEntryData(archiveEntry9);
        byte[] byteArray11 = zipArchiveInputStream2.readAllBytes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        byte[] byteArray4 = zipArchiveInputStream2.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        long long7 = zipArchiveInputStream5.skip(0L);
        long long8 = zipArchiveInputStream5.getBytesRead();
        int int9 = zipArchiveInputStream5.available();
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.close();
        long long4 = zipArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveInputStream1.canReadEntryData(archiveEntry6);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = zipArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The stream is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(archiveEntry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        zipArchiveInputStream1.mark((int) (byte) 100);
        int int8 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveInputStream1.canReadEntryData(archiveEntry9);
        int int11 = zipArchiveInputStream1.read();
        long long13 = zipArchiveInputStream1.skip((long) (byte) 0);
        zipArchiveInputStream1.mark(1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = null;
        boolean boolean17 = zipArchiveInputStream1.canReadEntryData(archiveEntry16);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = zipArchiveInputStream1.canReadEntryData(archiveEntry18);
        byte[] byteArray21 = zipArchiveInputStream1.readNBytes(0);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream22);
        boolean boolean24 = zipArchiveInputStream23.markSupported();
        zipArchiveInputStream23.mark((int) '4');
        long long28 = zipArchiveInputStream23.skip((long) (short) 10);
        zipArchiveInputStream23.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream31 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream23);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream23);
        int int33 = zipArchiveInputStream32.read();
        byte[] byteArray35 = zipArchiveInputStream32.readNBytes((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream36 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream32);
        java.io.InputStream inputStream37 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream38 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream37);
        zipArchiveInputStream38.mark(100);
        long long42 = zipArchiveInputStream38.skip((long) 1);
        byte[] byteArray43 = zipArchiveInputStream38.readAllBytes();
        int int44 = zipArchiveInputStream36.read(byteArray43);
        java.io.InputStream inputStream45 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream46 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream45);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream47 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream46);
        int int48 = zipArchiveInputStream47.available();
        byte[] byteArray49 = zipArchiveInputStream47.readAllBytes();
        long long51 = zipArchiveInputStream47.skip(1L);
        byte[] byteArray53 = zipArchiveInputStream47.readNBytes(0);
        int int54 = zipArchiveInputStream36.read(byteArray53);
        byte[] byteArray56 = zipArchiveInputStream36.readNBytes((int) (byte) 100);
        int int57 = zipArchiveInputStream1.read(byteArray56);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        byte[] byteArray4 = zipArchiveInputStream2.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        long long7 = zipArchiveInputStream5.skip(0L);
        byte[] byteArray8 = null;
        int int11 = zipArchiveInputStream5.read(byteArray8, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        long long6 = zipArchiveInputStream1.skip((long) (short) 10);
        zipArchiveInputStream1.mark((int) (short) -1);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        byte[] byteArray12 = new byte[] {};
        int int15 = zipArchiveInputStream11.read(byteArray12, (-1), 0);
        int int16 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean17 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        zipArchiveInputStream18.mark((int) '#');
        zipArchiveInputStream18.close();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = zipArchiveInputStream18.getNextEntry();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(archiveEntry22);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        zipArchiveInputStream1.mark((int) (byte) 100);
        int int8 = zipArchiveInputStream1.getCount();
        long long10 = zipArchiveInputStream1.skip((long) (byte) 0);
        int int11 = zipArchiveInputStream1.getCount();
        long long12 = zipArchiveInputStream1.getBytesRead();
        boolean boolean13 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream14);
        boolean boolean16 = zipArchiveInputStream15.markSupported();
        zipArchiveInputStream15.mark((int) '4');
        long long20 = zipArchiveInputStream15.skip((long) (short) 10);
        zipArchiveInputStream15.mark((int) (short) -1);
        java.io.InputStream inputStream23 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream23);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream24);
        byte[] byteArray26 = new byte[] {};
        int int29 = zipArchiveInputStream25.read(byteArray26, (-1), 0);
        int int30 = zipArchiveInputStream15.read(byteArray26);
        boolean boolean31 = zipArchiveInputStream15.markSupported();
        int int32 = zipArchiveInputStream15.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream15);
        java.io.InputStream inputStream34 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream35 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream34);
        zipArchiveInputStream35.mark(100);
        long long38 = zipArchiveInputStream35.getBytesRead();
        zipArchiveInputStream35.mark((int) (byte) 0);
        int int41 = zipArchiveInputStream35.available();
        java.io.InputStream inputStream42 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream43 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream42);
        zipArchiveInputStream43.mark(100);
        byte[] byteArray47 = zipArchiveInputStream43.readNBytes(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream48 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream43);
        byte[] byteArray50 = zipArchiveInputStream48.readNBytes(0);
        boolean boolean52 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray50, (int) (short) 0);
        int int53 = zipArchiveInputStream35.read(byteArray50);
        int int54 = zipArchiveInputStream33.read(byteArray50);
        int int55 = zipArchiveInputStream1.read(byteArray50);
        java.io.InputStream inputStream56 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream57 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream56);
        zipArchiveInputStream57.mark(100);
        long long61 = zipArchiveInputStream57.skip((long) 1);
        int int62 = zipArchiveInputStream57.read();
        byte[] byteArray63 = zipArchiveInputStream57.readAllBytes();
        int int64 = zipArchiveInputStream57.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream65 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream57);
        java.io.InputStream inputStream66 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream67 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream66);
        boolean boolean68 = zipArchiveInputStream67.markSupported();
        zipArchiveInputStream67.mark((int) '4');
        int int71 = zipArchiveInputStream67.getCount();
        long long73 = zipArchiveInputStream67.skip((long) 0);
        byte[] byteArray75 = zipArchiveInputStream67.readNBytes((int) (short) 10);
        int int76 = zipArchiveInputStream65.read(byteArray75);
        int int77 = zipArchiveInputStream1.read(byteArray75);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream80 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] {});
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] {});
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray3 = zipArchiveInputStream2.readAllBytes();
        zipArchiveInputStream2.close();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long4 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.mark((int) (byte) 0);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        zipArchiveInputStream8.mark(100);
        long long12 = zipArchiveInputStream8.skip((long) 1);
        boolean boolean13 = zipArchiveInputStream8.markSupported();
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream14);
        zipArchiveInputStream15.mark(100);
        byte[] byteArray19 = zipArchiveInputStream15.readNBytes(0);
        int int20 = zipArchiveInputStream8.read(byteArray19);
        boolean boolean21 = zipArchiveInputStream8.markSupported();
        boolean boolean22 = zipArchiveInputStream8.markSupported();
        byte[] byteArray24 = zipArchiveInputStream8.readNBytes((int) ' ');
        int int25 = zipArchiveInputStream1.read(byteArray24);
        int int26 = zipArchiveInputStream1.available();
        java.io.InputStream inputStream27 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream27);
        zipArchiveInputStream28.mark(100);
        long long32 = zipArchiveInputStream28.skip((long) 1);
        boolean boolean33 = zipArchiveInputStream28.markSupported();
        java.io.InputStream inputStream34 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream35 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream34);
        zipArchiveInputStream35.mark(100);
        byte[] byteArray39 = zipArchiveInputStream35.readNBytes(0);
        int int40 = zipArchiveInputStream28.read(byteArray39);
        boolean boolean41 = zipArchiveInputStream28.markSupported();
        boolean boolean42 = zipArchiveInputStream28.markSupported();
        byte[] byteArray44 = zipArchiveInputStream28.readNBytes((int) ' ');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry45 = null;
        boolean boolean46 = zipArchiveInputStream28.canReadEntryData(archiveEntry45);
        int int47 = zipArchiveInputStream28.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry48 = null;
        boolean boolean49 = zipArchiveInputStream28.canReadEntryData(archiveEntry48);
        java.io.InputStream inputStream50 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream51 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream50);
        long long52 = zipArchiveInputStream51.getBytesRead();
        long long53 = zipArchiveInputStream51.getBytesRead();
        int int54 = zipArchiveInputStream51.read();
        byte[] byteArray55 = zipArchiveInputStream51.readAllBytes();
        int int58 = zipArchiveInputStream28.read(byteArray55, (int) '#', 10);
        int int61 = zipArchiveInputStream1.read(byteArray55, (int) (byte) 100, (-1));
        int int62 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream63 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream64 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream63);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream65 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream64);
        byte[] byteArray66 = new byte[] {};
        int int69 = zipArchiveInputStream65.read(byteArray66, (-1), 0);
        long long71 = zipArchiveInputStream65.skip((long) (short) 0);
        long long72 = zipArchiveInputStream65.getBytesRead();
        byte[] byteArray74 = zipArchiveInputStream65.readNBytes((int) (byte) 1);
        int int75 = zipArchiveInputStream1.read(byteArray74);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] {});
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] {});
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        byte[] byteArray0 = null;
        boolean boolean2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        zipArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray10 = zipArchiveInputStream8.readNBytes(0);
        zipArchiveInputStream8.close();
        int int12 = zipArchiveInputStream8.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = zipArchiveInputStream8.getNextZipEntry();
        int int16 = zipArchiveInputStream8.available();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(zipArchiveEntry15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveInputStream1.canReadEntryData(archiveEntry6);
        byte[] byteArray9 = zipArchiveInputStream1.readNBytes(10);
        int int10 = zipArchiveInputStream1.getCount();
        int int11 = zipArchiveInputStream1.available();
        int int12 = zipArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream1.canReadEntryData(archiveEntry13);
        long long16 = zipArchiveInputStream1.skip((long) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        zipArchiveInputStream8.mark(100);
        byte[] byteArray12 = zipArchiveInputStream8.readNBytes(0);
        int int13 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean14 = zipArchiveInputStream1.markSupported();
        boolean boolean15 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        boolean boolean23 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray21, 0);
        boolean boolean25 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray21, 1);
        boolean boolean27 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray21, (int) ' ');
        int int28 = zipArchiveInputStream16.read(byteArray21);
        java.io.InputStream inputStream29 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream29);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream31 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream30);
        int int32 = zipArchiveInputStream30.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream30);
        byte[] byteArray35 = zipArchiveInputStream33.readNBytes((int) (byte) 0);
        int int36 = zipArchiveInputStream16.read(byteArray35);
        long long38 = zipArchiveInputStream16.skip((long) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry39 = null;
        boolean boolean40 = zipArchiveInputStream16.canReadEntryData(archiveEntry39);
        int int41 = zipArchiveInputStream16.available();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        int int4 = zipArchiveInputStream2.read();
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream5);
        boolean boolean7 = zipArchiveInputStream6.markSupported();
        zipArchiveInputStream6.mark((int) '4');
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream10);
        zipArchiveInputStream11.mark(100);
        byte[] byteArray15 = zipArchiveInputStream11.readNBytes(0);
        int int16 = zipArchiveInputStream6.read(byteArray15);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = zipArchiveInputStream6.canReadEntryData(archiveEntry17);
        int int19 = zipArchiveInputStream6.getCount();
        byte[] byteArray20 = zipArchiveInputStream6.readAllBytes();
        int int21 = zipArchiveInputStream2.read(byteArray20);
        long long23 = zipArchiveInputStream2.skip(0L);
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream24);
        boolean boolean26 = zipArchiveInputStream25.markSupported();
        zipArchiveInputStream25.mark((int) '4');
        long long30 = zipArchiveInputStream25.skip((long) (short) 10);
        zipArchiveInputStream25.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream25);
        java.io.InputStream inputStream34 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream35 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream34);
        zipArchiveInputStream35.mark(100);
        byte[] byteArray39 = zipArchiveInputStream35.readNBytes(0);
        zipArchiveInputStream35.mark((int) (byte) 100);
        int int42 = zipArchiveInputStream35.getCount();
        byte[] byteArray43 = zipArchiveInputStream35.readAllBytes();
        int int46 = zipArchiveInputStream25.read(byteArray43, (int) (byte) 10, 100);
        int int47 = zipArchiveInputStream2.read(byteArray43);
        byte[] byteArray49 = zipArchiveInputStream2.readNBytes((int) (byte) 100);
        int int50 = zipArchiveInputStream2.available();
        zipArchiveInputStream2.mark((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream54 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark(100);
        boolean boolean5 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = zipArchiveInputStream6.getNextEntry();
        int int8 = zipArchiveInputStream6.available();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(archiveEntry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        long long6 = zipArchiveInputStream1.skip((long) (short) 10);
        zipArchiveInputStream1.mark((int) (short) -1);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        byte[] byteArray12 = new byte[] {};
        int int15 = zipArchiveInputStream11.read(byteArray12, (-1), 0);
        int int16 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean17 = zipArchiveInputStream1.markSupported();
        byte[] byteArray18 = zipArchiveInputStream1.readAllBytes();
        boolean boolean19 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = zipArchiveInputStream1.canReadEntryData(archiveEntry20);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = null;
        boolean boolean23 = zipArchiveInputStream1.canReadEntryData(archiveEntry22);
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream24);
        zipArchiveInputStream25.mark(100);
        long long29 = zipArchiveInputStream25.skip((long) 1);
        boolean boolean30 = zipArchiveInputStream25.markSupported();
        java.io.InputStream inputStream31 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream31);
        zipArchiveInputStream32.mark(100);
        byte[] byteArray36 = zipArchiveInputStream32.readNBytes(0);
        int int37 = zipArchiveInputStream25.read(byteArray36);
        int int38 = zipArchiveInputStream25.available();
        long long39 = zipArchiveInputStream25.getBytesRead();
        byte[] byteArray40 = zipArchiveInputStream25.readAllBytes();
        int int41 = zipArchiveInputStream1.read(byteArray40);
        zipArchiveInputStream1.mark((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        long long6 = zipArchiveInputStream1.skip((long) (short) 10);
        zipArchiveInputStream1.mark((int) (short) -1);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        byte[] byteArray12 = new byte[] {};
        int int15 = zipArchiveInputStream11.read(byteArray12, (-1), 0);
        int int16 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean17 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream19);
        zipArchiveInputStream20.mark(100);
        long long24 = zipArchiveInputStream20.skip((long) 1);
        byte[] byteArray26 = zipArchiveInputStream20.readNBytes(100);
        java.io.InputStream inputStream27 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream27);
        zipArchiveInputStream28.mark(100);
        byte[] byteArray32 = zipArchiveInputStream28.readNBytes(0);
        zipArchiveInputStream28.mark((int) (byte) 100);
        int int35 = zipArchiveInputStream28.getCount();
        byte[] byteArray36 = zipArchiveInputStream28.readAllBytes();
        int int37 = zipArchiveInputStream20.read(byteArray36);
        int int38 = zipArchiveInputStream18.read(byteArray36);
        java.io.InputStream inputStream39 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream40 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream39);
        boolean boolean41 = zipArchiveInputStream40.markSupported();
        zipArchiveInputStream40.mark((int) '4');
        int int44 = zipArchiveInputStream40.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry45 = null;
        boolean boolean46 = zipArchiveInputStream40.canReadEntryData(archiveEntry45);
        java.io.InputStream inputStream47 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream48 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream47);
        zipArchiveInputStream48.mark(100);
        byte[] byteArray52 = zipArchiveInputStream48.readNBytes(0);
        zipArchiveInputStream48.mark((int) (byte) 100);
        int int55 = zipArchiveInputStream48.getCount();
        byte[] byteArray56 = zipArchiveInputStream48.readAllBytes();
        int int57 = zipArchiveInputStream40.read(byteArray56);
        int int60 = zipArchiveInputStream18.read(byteArray56, (int) (byte) 1, (-1));
        byte[] byteArray61 = zipArchiveInputStream18.readAllBytes();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry62 = zipArchiveInputStream18.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream63 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream18);
        long long64 = zipArchiveInputStream18.getBytesRead();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream65 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream18);
        boolean boolean66 = zipArchiveInputStream18.markSupported();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] {});
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] {});
        org.junit.Assert.assertNull(archiveEntry62);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        zipArchiveInputStream6.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        int int9 = zipArchiveInputStream6.available();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = zipArchiveInputStream6.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = zipArchiveInputStream6.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveInputStream6.canReadEntryData(archiveEntry12);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = zipArchiveInputStream6.readNBytes((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The stream is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(archiveEntry10);
        org.junit.Assert.assertNull(archiveEntry11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        long long6 = zipArchiveInputStream1.skip((long) (short) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = zipArchiveInputStream7.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveInputStream9.canReadEntryData(archiveEntry10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(archiveEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        zipArchiveInputStream8.mark(100);
        byte[] byteArray12 = zipArchiveInputStream8.readNBytes(0);
        int int13 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean14 = zipArchiveInputStream1.markSupported();
        boolean boolean15 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        zipArchiveInputStream16.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = zipArchiveInputStream16.getNextZipEntry();
        zipArchiveInputStream16.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream16);
        int int21 = zipArchiveInputStream16.getCount();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(zipArchiveEntry18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int3 = zipArchiveInputStream2.available();
        zipArchiveInputStream2.mark((int) ' ');
        byte[] byteArray7 = zipArchiveInputStream2.readNBytes((int) 'a');
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        zipArchiveInputStream9.mark(100);
        byte[] byteArray13 = zipArchiveInputStream9.readNBytes(0);
        zipArchiveInputStream9.mark((int) (byte) 100);
        int int16 = zipArchiveInputStream9.getCount();
        byte[] byteArray17 = zipArchiveInputStream9.readAllBytes();
        int int18 = zipArchiveInputStream2.read(byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveInputStream1.canReadEntryData(archiveEntry6);
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        zipArchiveInputStream9.mark(100);
        byte[] byteArray13 = zipArchiveInputStream9.readNBytes(0);
        zipArchiveInputStream9.mark((int) (byte) 100);
        int int16 = zipArchiveInputStream9.getCount();
        byte[] byteArray17 = zipArchiveInputStream9.readAllBytes();
        int int18 = zipArchiveInputStream1.read(byteArray17);
        zipArchiveInputStream1.mark((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        zipArchiveInputStream21.close();
        long long23 = zipArchiveInputStream21.getBytesRead();
        zipArchiveInputStream21.close();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry25 = zipArchiveInputStream21.getNextEntry();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNull(archiveEntry25);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        zipArchiveInputStream6.close();
        zipArchiveInputStream6.close();
        zipArchiveInputStream6.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = zipArchiveInputStream6.getNextZipEntry();
        long long11 = zipArchiveInputStream6.getBytesRead();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNull(zipArchiveEntry10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream4);
        boolean boolean6 = zipArchiveInputStream5.markSupported();
        zipArchiveInputStream5.mark(100);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream11);
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream13);
        boolean boolean15 = zipArchiveInputStream14.markSupported();
        zipArchiveInputStream14.mark((int) '4');
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream18);
        zipArchiveInputStream19.mark(100);
        byte[] byteArray23 = zipArchiveInputStream19.readNBytes(0);
        int int24 = zipArchiveInputStream14.read(byteArray23);
        int int27 = zipArchiveInputStream11.read(byteArray23, (int) (short) -1, (int) (byte) 1);
        int int30 = zipArchiveInputStream5.read(byteArray23, (int) (byte) -1, (int) ' ');
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream31 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = zipArchiveInputStream31.getNextEntry();
        byte[] byteArray34 = zipArchiveInputStream31.readNBytes(0);
        int int35 = zipArchiveInputStream2.read(byteArray34);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry36 = null;
        boolean boolean37 = zipArchiveInputStream2.canReadEntryData(archiveEntry36);
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(archiveEntry32);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        long long7 = zipArchiveInputStream1.skip((long) 0);
        int int8 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        int int12 = zipArchiveInputStream11.available();
        byte[] byteArray13 = zipArchiveInputStream11.readAllBytes();
        int int14 = zipArchiveInputStream1.read(byteArray13);
        byte[] byteArray16 = zipArchiveInputStream1.readNBytes((int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray16, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        long long3 = zipArchiveInputStream1.getBytesRead();
        long long4 = zipArchiveInputStream1.getBytesRead();
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream5);
        long long7 = zipArchiveInputStream6.getBytesRead();
        long long8 = zipArchiveInputStream6.getBytesRead();
        int int9 = zipArchiveInputStream6.read();
        int int10 = zipArchiveInputStream6.available();
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream11);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = zipArchiveInputStream13.getNextZipEntry();
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream15);
        zipArchiveInputStream16.mark(100);
        byte[] byteArray20 = zipArchiveInputStream16.readNBytes(0);
        zipArchiveInputStream16.mark((int) (byte) 100);
        int int23 = zipArchiveInputStream16.getCount();
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream24);
        boolean boolean26 = zipArchiveInputStream25.markSupported();
        zipArchiveInputStream25.mark((int) '4');
        java.io.InputStream inputStream29 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream29);
        zipArchiveInputStream30.mark(100);
        byte[] byteArray34 = zipArchiveInputStream30.readNBytes(0);
        int int35 = zipArchiveInputStream25.read(byteArray34);
        int int38 = zipArchiveInputStream16.readNBytes(byteArray34, 0, (int) (byte) 0);
        int int41 = zipArchiveInputStream13.read(byteArray34, (int) '4', (int) '#');
        int int42 = zipArchiveInputStream6.read(byteArray34);
        int int45 = zipArchiveInputStream1.read(byteArray34, (int) '4', (int) (short) 100);
        zipArchiveInputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream47 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry48 = zipArchiveInputStream47.getNextZipEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The stream is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(zipArchiveEntry14);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray3 = zipArchiveInputStream2.readAllBytes();
        int int4 = zipArchiveInputStream2.read();
        zipArchiveInputStream2.mark((-1));
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        int int3 = zipArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark(100);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        boolean boolean11 = zipArchiveInputStream10.markSupported();
        zipArchiveInputStream10.mark((int) '4');
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream14);
        zipArchiveInputStream15.mark(100);
        byte[] byteArray19 = zipArchiveInputStream15.readNBytes(0);
        int int20 = zipArchiveInputStream10.read(byteArray19);
        int int23 = zipArchiveInputStream7.read(byteArray19, (int) (short) -1, (int) (byte) 1);
        int int26 = zipArchiveInputStream1.read(byteArray19, (int) (byte) -1, (int) ' ');
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = null;
        boolean boolean29 = zipArchiveInputStream27.canReadEntryData(archiveEntry28);
        java.io.InputStream inputStream30 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream31 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream30);
        zipArchiveInputStream31.mark(100);
        long long34 = zipArchiveInputStream31.getBytesRead();
        byte[] byteArray35 = zipArchiveInputStream31.readAllBytes();
        java.io.InputStream inputStream36 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream37 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream36);
        boolean boolean38 = zipArchiveInputStream37.markSupported();
        zipArchiveInputStream37.mark(100);
        boolean boolean41 = zipArchiveInputStream37.markSupported();
        byte[] byteArray42 = zipArchiveInputStream37.readAllBytes();
        int int43 = zipArchiveInputStream31.read(byteArray42);
        int int46 = zipArchiveInputStream27.read(byteArray42, (int) (short) 100, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry47 = zipArchiveInputStream27.getNextZipEntry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass48 = zipArchiveEntry47.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry47);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        zipArchiveInputStream8.mark(100);
        byte[] byteArray12 = zipArchiveInputStream8.readNBytes(0);
        int int13 = zipArchiveInputStream1.read(byteArray12);
        int int14 = zipArchiveInputStream1.available();
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream15);
        zipArchiveInputStream16.mark(100);
        long long20 = zipArchiveInputStream16.skip((long) 1);
        byte[] byteArray21 = zipArchiveInputStream16.readAllBytes();
        int int22 = zipArchiveInputStream1.read(byteArray21);
        int int23 = zipArchiveInputStream1.getCount();
        byte[] byteArray25 = zipArchiveInputStream1.readNBytes(1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry26 = null;
        boolean boolean27 = zipArchiveInputStream1.canReadEntryData(archiveEntry26);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = null;
        boolean boolean29 = zipArchiveInputStream1.canReadEntryData(archiveEntry28);
        byte[] byteArray31 = zipArchiveInputStream1.readNBytes((int) (short) 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long4 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.mark((int) (byte) 0);
        int int7 = zipArchiveInputStream1.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        int int12 = zipArchiveInputStream11.available();
        byte[] byteArray13 = zipArchiveInputStream11.readAllBytes();
        int int16 = zipArchiveInputStream8.read(byteArray13, (int) (short) -1, (int) (short) 0);
        java.io.OutputStream outputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = zipArchiveInputStream8.transferTo(outputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        long long3 = zipArchiveInputStream1.getBytesRead();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream4);
        zipArchiveInputStream5.mark(100);
        long long9 = zipArchiveInputStream5.skip((long) 1);
        byte[] byteArray11 = zipArchiveInputStream5.readNBytes(100);
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream12);
        zipArchiveInputStream13.mark(100);
        byte[] byteArray17 = zipArchiveInputStream13.readNBytes(0);
        zipArchiveInputStream13.mark((int) (byte) 100);
        int int20 = zipArchiveInputStream13.getCount();
        byte[] byteArray21 = zipArchiveInputStream13.readAllBytes();
        int int22 = zipArchiveInputStream5.read(byteArray21);
        int int25 = zipArchiveInputStream1.read(byteArray21, (int) (short) 0, 0);
        java.io.InputStream inputStream26 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream26);
        boolean boolean28 = zipArchiveInputStream27.markSupported();
        zipArchiveInputStream27.mark((int) '4');
        long long32 = zipArchiveInputStream27.skip((long) (short) 10);
        zipArchiveInputStream27.mark((int) (short) -1);
        java.io.InputStream inputStream35 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream36 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream35);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream37 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream36);
        byte[] byteArray38 = new byte[] {};
        int int41 = zipArchiveInputStream37.read(byteArray38, (-1), 0);
        int int42 = zipArchiveInputStream27.read(byteArray38);
        int int43 = zipArchiveInputStream1.read(byteArray38);
        int int44 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry45 = null;
        boolean boolean46 = zipArchiveInputStream1.canReadEntryData(archiveEntry45);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream47 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        long long48 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream51 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveInputStream1.canReadEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveInputStream1.canReadEntryData(archiveEntry8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int3 = zipArchiveInputStream1.available();
        zipArchiveInputStream1.mark(0);
        byte[] byteArray6 = zipArchiveInputStream1.readAllBytes();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream8);
        boolean boolean10 = zipArchiveInputStream9.markSupported();
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream11);
        zipArchiveInputStream12.mark(100);
        long long16 = zipArchiveInputStream12.skip((long) 1);
        byte[] byteArray18 = zipArchiveInputStream12.readNBytes((int) ' ');
        int int21 = zipArchiveInputStream9.read(byteArray18, 10, 0);
        int int22 = zipArchiveInputStream1.read(byteArray18);
        boolean boolean23 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        byte[] byteArray4 = zipArchiveInputStream2.readAllBytes();
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        boolean boolean11 = zipArchiveInputStream10.markSupported();
        zipArchiveInputStream10.mark((int) '4');
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream14);
        zipArchiveInputStream15.mark(100);
        byte[] byteArray19 = zipArchiveInputStream15.readNBytes(0);
        int int20 = zipArchiveInputStream10.read(byteArray19);
        int int23 = zipArchiveInputStream7.read(byteArray19, (int) (short) -1, (int) (byte) 1);
        int int26 = zipArchiveInputStream2.read(byteArray19, 100, 0);
        long long28 = zipArchiveInputStream2.skip((long) (short) 100);
        zipArchiveInputStream2.close();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = zipArchiveInputStream2.getNextEntry();
        zipArchiveInputStream2.close();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = null;
        boolean boolean33 = zipArchiveInputStream2.canReadEntryData(archiveEntry32);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry34 = null;
        boolean boolean35 = zipArchiveInputStream2.canReadEntryData(archiveEntry34);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream37 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNull(archiveEntry30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray3 = new byte[] {};
        int int6 = zipArchiveInputStream2.read(byteArray3, (-1), 0);
        long long8 = zipArchiveInputStream2.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveInputStream2.canReadEntryData(archiveEntry9);
        int int11 = zipArchiveInputStream2.available();
        byte[] byteArray13 = zipArchiveInputStream2.readNBytes((int) '#');
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        int int15 = zipArchiveInputStream14.read();
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream16);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream17);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream18);
        java.io.InputStream inputStream20 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream20);
        boolean boolean22 = zipArchiveInputStream21.markSupported();
        zipArchiveInputStream21.mark((int) '4');
        java.io.InputStream inputStream25 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream25);
        zipArchiveInputStream26.mark(100);
        byte[] byteArray30 = zipArchiveInputStream26.readNBytes(0);
        int int31 = zipArchiveInputStream21.read(byteArray30);
        int int34 = zipArchiveInputStream18.read(byteArray30, (int) (short) -1, (int) (byte) 1);
        int int35 = zipArchiveInputStream14.read(byteArray30);
        boolean boolean36 = zipArchiveInputStream14.markSupported();
        int int37 = zipArchiveInputStream14.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry38 = zipArchiveInputStream14.getNextZipEntry();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry38);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        byte[] byteArray4 = zipArchiveInputStream2.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        long long7 = zipArchiveInputStream5.skip(0L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = zipArchiveInputStream5.getNextZipEntry();
        int int9 = zipArchiveInputStream5.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = zipArchiveInputStream10.transferTo(outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        long long7 = zipArchiveInputStream1.skip((long) 0);
        int int8 = zipArchiveInputStream1.read();
        boolean boolean9 = zipArchiveInputStream1.markSupported();
        boolean boolean10 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream12);
        zipArchiveInputStream13.mark(100);
        byte[] byteArray17 = zipArchiveInputStream13.readNBytes(0);
        zipArchiveInputStream13.mark((int) (byte) 100);
        int int20 = zipArchiveInputStream13.getCount();
        long long22 = zipArchiveInputStream13.skip((long) (byte) 0);
        int int23 = zipArchiveInputStream13.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream13);
        byte[] byteArray25 = zipArchiveInputStream13.readAllBytes();
        int int28 = zipArchiveInputStream11.read(byteArray25, 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream11, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        zipArchiveInputStream1.mark((int) (byte) 100);
        int int8 = zipArchiveInputStream1.getCount();
        long long10 = zipArchiveInputStream1.skip((long) (byte) 0);
        int int11 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int13 = zipArchiveInputStream1.read();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        zipArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        long long10 = zipArchiveInputStream1.skip((long) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = zipArchiveInputStream1.canReadEntryData(archiveEntry11);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream3);
        boolean boolean5 = zipArchiveInputStream4.markSupported();
        zipArchiveInputStream4.mark((int) '4');
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        zipArchiveInputStream9.mark(100);
        byte[] byteArray13 = zipArchiveInputStream9.readNBytes(0);
        int int14 = zipArchiveInputStream4.read(byteArray13);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = zipArchiveInputStream4.canReadEntryData(archiveEntry15);
        int int17 = zipArchiveInputStream4.getCount();
        byte[] byteArray18 = zipArchiveInputStream4.readAllBytes();
        int int19 = zipArchiveInputStream1.read(byteArray18);
        byte[] byteArray21 = zipArchiveInputStream1.readNBytes((int) (short) 10);
        long long23 = zipArchiveInputStream1.skip((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.close();
        zipArchiveInputStream1.mark((int) (short) 100);
        zipArchiveInputStream1.mark(0);
        int int8 = zipArchiveInputStream1.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = zipArchiveInputStream1.getNextZipEntry();
        boolean boolean10 = zipArchiveInputStream1.markSupported();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(zipArchiveEntry9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveInputStream1.canReadEntryData(archiveEntry6);
        byte[] byteArray9 = zipArchiveInputStream1.readNBytes(10);
        int int10 = zipArchiveInputStream1.getCount();
        boolean boolean11 = zipArchiveInputStream1.markSupported();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        int int4 = zipArchiveInputStream2.getCount();
        long long5 = zipArchiveInputStream2.getBytesRead();
        int int6 = zipArchiveInputStream2.read();
        byte[] byteArray8 = zipArchiveInputStream2.readNBytes((int) (short) 100);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        byte[] byteArray12 = new byte[] {};
        int int15 = zipArchiveInputStream11.read(byteArray12, (-1), 0);
        long long17 = zipArchiveInputStream11.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = zipArchiveInputStream11.canReadEntryData(archiveEntry18);
        int int20 = zipArchiveInputStream11.available();
        byte[] byteArray22 = zipArchiveInputStream11.readNBytes((int) '#');
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream11);
        int int24 = zipArchiveInputStream23.read();
        java.io.InputStream inputStream25 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream25);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream26);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream27);
        int int29 = zipArchiveInputStream27.getCount();
        long long30 = zipArchiveInputStream27.getBytesRead();
        int int31 = zipArchiveInputStream27.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream27);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry33 = zipArchiveInputStream32.getNextEntry();
        byte[] byteArray35 = zipArchiveInputStream32.readNBytes((int) '4');
        byte[] byteArray36 = zipArchiveInputStream32.readAllBytes();
        int int39 = zipArchiveInputStream23.read(byteArray36, 1, (int) (byte) 0);
        int int42 = zipArchiveInputStream2.read(byteArray36, (int) (short) 0, 0);
        boolean boolean44 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray36, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(archiveEntry33);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        zipArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        long long10 = zipArchiveInputStream1.skip((long) 0);
        zipArchiveInputStream1.mark((int) (byte) 10);
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream13);
        long long15 = zipArchiveInputStream14.getBytesRead();
        long long16 = zipArchiveInputStream14.getBytesRead();
        int int17 = zipArchiveInputStream14.read();
        byte[] byteArray19 = zipArchiveInputStream14.readNBytes(0);
        int int20 = zipArchiveInputStream1.read(byteArray19);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveInputStream1.canReadEntryData(archiveEntry6);
        byte[] byteArray9 = zipArchiveInputStream1.readNBytes(10);
        int int10 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long4 = zipArchiveInputStream1.getBytesRead();
        byte[] byteArray5 = zipArchiveInputStream1.readAllBytes();
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream6);
        boolean boolean8 = zipArchiveInputStream7.markSupported();
        zipArchiveInputStream7.mark(100);
        boolean boolean11 = zipArchiveInputStream7.markSupported();
        byte[] byteArray12 = zipArchiveInputStream7.readAllBytes();
        int int13 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean14 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream15);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream16);
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream18);
        boolean boolean20 = zipArchiveInputStream19.markSupported();
        zipArchiveInputStream19.mark((int) '4');
        java.io.InputStream inputStream23 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream23);
        zipArchiveInputStream24.mark(100);
        byte[] byteArray28 = zipArchiveInputStream24.readNBytes(0);
        int int29 = zipArchiveInputStream19.read(byteArray28);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = null;
        boolean boolean31 = zipArchiveInputStream19.canReadEntryData(archiveEntry30);
        int int32 = zipArchiveInputStream19.getCount();
        byte[] byteArray33 = zipArchiveInputStream19.readAllBytes();
        int int34 = zipArchiveInputStream16.read(byteArray33);
        int int35 = zipArchiveInputStream1.read(byteArray33);
        zipArchiveInputStream1.close();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray38 = zipArchiveInputStream1.readNBytes((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The stream is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        byte[] byteArray4 = zipArchiveInputStream2.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        zipArchiveInputStream2.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = zipArchiveInputStream2.getNextZipEntry();
        boolean boolean8 = zipArchiveInputStream2.markSupported();
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNull(zipArchiveEntry7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        long long6 = zipArchiveInputStream1.skip((long) (short) 10);
        zipArchiveInputStream1.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int11 = zipArchiveInputStream10.read();
        byte[] byteArray13 = zipArchiveInputStream10.readNBytes((int) (byte) 10);
        long long14 = zipArchiveInputStream10.getBytesRead();
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream15);
        zipArchiveInputStream16.mark(100);
        long long20 = zipArchiveInputStream16.skip((long) 1);
        boolean boolean21 = zipArchiveInputStream16.markSupported();
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream22);
        zipArchiveInputStream23.mark(100);
        byte[] byteArray27 = zipArchiveInputStream23.readNBytes(0);
        int int28 = zipArchiveInputStream16.read(byteArray27);
        boolean boolean29 = zipArchiveInputStream16.markSupported();
        boolean boolean30 = zipArchiveInputStream16.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream31 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream16);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        boolean boolean38 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray36, 0);
        boolean boolean40 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray36, 1);
        boolean boolean42 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray36, (int) ' ');
        int int43 = zipArchiveInputStream31.read(byteArray36);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry44 = null;
        boolean boolean45 = zipArchiveInputStream31.canReadEntryData(archiveEntry44);
        int int46 = zipArchiveInputStream31.getCount();
        java.io.InputStream inputStream47 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream48 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream47);
        zipArchiveInputStream48.mark(100);
        long long52 = zipArchiveInputStream48.skip((long) 1);
        int int53 = zipArchiveInputStream48.read();
        byte[] byteArray54 = zipArchiveInputStream48.readAllBytes();
        int int55 = zipArchiveInputStream31.read(byteArray54);
        byte[] byteArray56 = zipArchiveInputStream31.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream57 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream31);
        java.io.InputStream inputStream58 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream59 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream58);
        boolean boolean60 = zipArchiveInputStream59.markSupported();
        zipArchiveInputStream59.mark((int) '4');
        int int63 = zipArchiveInputStream59.getCount();
        long long65 = zipArchiveInputStream59.skip((long) 0);
        boolean boolean66 = zipArchiveInputStream59.markSupported();
        java.io.InputStream inputStream67 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream68 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream67);
        boolean boolean69 = zipArchiveInputStream68.markSupported();
        zipArchiveInputStream68.mark((int) '4');
        int int72 = zipArchiveInputStream68.getCount();
        long long74 = zipArchiveInputStream68.skip((long) 0);
        int int75 = zipArchiveInputStream68.read();
        java.io.InputStream inputStream76 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream77 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream76);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream78 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream77);
        int int79 = zipArchiveInputStream78.available();
        byte[] byteArray80 = zipArchiveInputStream78.readAllBytes();
        int int81 = zipArchiveInputStream68.read(byteArray80);
        int int82 = zipArchiveInputStream59.read(byteArray80);
        int int83 = zipArchiveInputStream31.read(byteArray80);
        int int86 = zipArchiveInputStream10.read(byteArray80, (int) '#', (int) ' ');
        zipArchiveInputStream10.mark(10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream89 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] {});
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        zipArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        boolean boolean9 = zipArchiveInputStream8.markSupported();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        byte[] byteArray4 = zipArchiveInputStream2.readAllBytes();
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        boolean boolean11 = zipArchiveInputStream10.markSupported();
        zipArchiveInputStream10.mark((int) '4');
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream14);
        zipArchiveInputStream15.mark(100);
        byte[] byteArray19 = zipArchiveInputStream15.readNBytes(0);
        int int20 = zipArchiveInputStream10.read(byteArray19);
        int int23 = zipArchiveInputStream7.read(byteArray19, (int) (short) -1, (int) (byte) 1);
        int int26 = zipArchiveInputStream2.read(byteArray19, 100, 0);
        long long28 = zipArchiveInputStream2.skip((long) (short) 100);
        zipArchiveInputStream2.close();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = zipArchiveInputStream2.getNextEntry();
        zipArchiveInputStream2.close();
        int int32 = zipArchiveInputStream2.available();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray33 = zipArchiveInputStream2.readAllBytes();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The stream is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNull(archiveEntry30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        int int7 = zipArchiveInputStream1.getCount();
        int int8 = zipArchiveInputStream1.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int10 = zipArchiveInputStream9.read();
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream11);
        zipArchiveInputStream12.mark(100);
        byte[] byteArray16 = zipArchiveInputStream12.readNBytes(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream12);
        int int18 = zipArchiveInputStream17.available();
        zipArchiveInputStream17.mark((int) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream17);
        int int22 = zipArchiveInputStream21.read();
        int int23 = zipArchiveInputStream21.available();
        byte[] byteArray24 = zipArchiveInputStream21.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int27 = zipArchiveInputStream9.readNBytes(byteArray24, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [10, 10 + -1) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        zipArchiveInputStream8.mark(100);
        byte[] byteArray12 = zipArchiveInputStream8.readNBytes(0);
        int int13 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean14 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = null;
        boolean boolean17 = zipArchiveInputStream1.canReadEntryData(archiveEntry16);
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream18);
        zipArchiveInputStream19.mark(100);
        long long23 = zipArchiveInputStream19.skip((long) 1);
        boolean boolean24 = zipArchiveInputStream19.markSupported();
        java.io.InputStream inputStream25 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream25);
        zipArchiveInputStream26.mark(100);
        byte[] byteArray30 = zipArchiveInputStream26.readNBytes(0);
        int int31 = zipArchiveInputStream19.read(byteArray30);
        boolean boolean32 = zipArchiveInputStream19.markSupported();
        boolean boolean33 = zipArchiveInputStream19.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream34 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream19);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        boolean boolean41 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray39, 0);
        boolean boolean43 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray39, 1);
        boolean boolean45 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray39, (int) ' ');
        int int46 = zipArchiveInputStream34.read(byteArray39);
        byte[] byteArray48 = zipArchiveInputStream34.readNBytes((int) (short) 1);
        int int49 = zipArchiveInputStream34.read();
        boolean boolean50 = zipArchiveInputStream34.markSupported();
        long long52 = zipArchiveInputStream34.skip((long) (byte) 100);
        int int53 = zipArchiveInputStream34.getCount();
        byte[] byteArray55 = zipArchiveInputStream34.readNBytes((int) '#');
        int int56 = zipArchiveInputStream1.read(byteArray55);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        int int7 = zipArchiveInputStream1.getCount();
        int int8 = zipArchiveInputStream1.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream12);
        zipArchiveInputStream13.mark(100);
        byte[] byteArray17 = zipArchiveInputStream13.readNBytes(0);
        int int18 = zipArchiveInputStream13.getCount();
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream19);
        zipArchiveInputStream20.mark(100);
        byte[] byteArray24 = zipArchiveInputStream20.readNBytes(0);
        zipArchiveInputStream20.mark((int) (byte) 100);
        int int27 = zipArchiveInputStream20.getCount();
        java.io.InputStream inputStream28 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream28);
        boolean boolean30 = zipArchiveInputStream29.markSupported();
        zipArchiveInputStream29.mark((int) '4');
        java.io.InputStream inputStream33 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream34 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream33);
        zipArchiveInputStream34.mark(100);
        byte[] byteArray38 = zipArchiveInputStream34.readNBytes(0);
        int int39 = zipArchiveInputStream29.read(byteArray38);
        int int42 = zipArchiveInputStream20.readNBytes(byteArray38, 0, (int) (byte) 0);
        int int43 = zipArchiveInputStream13.read(byteArray38);
        java.io.InputStream inputStream44 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream45 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream44);
        boolean boolean46 = zipArchiveInputStream45.markSupported();
        zipArchiveInputStream45.mark((int) '4');
        long long50 = zipArchiveInputStream45.skip((long) (short) 10);
        zipArchiveInputStream45.mark((int) (short) -1);
        java.io.InputStream inputStream53 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream54 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream53);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream55 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream54);
        byte[] byteArray56 = new byte[] {};
        int int59 = zipArchiveInputStream55.read(byteArray56, (-1), 0);
        int int60 = zipArchiveInputStream45.read(byteArray56);
        boolean boolean61 = zipArchiveInputStream45.markSupported();
        int int62 = zipArchiveInputStream45.available();
        int int63 = zipArchiveInputStream45.read();
        int int64 = zipArchiveInputStream45.read();
        byte[] byteArray66 = zipArchiveInputStream45.readNBytes((int) (byte) 10);
        int int69 = zipArchiveInputStream13.read(byteArray66, 10, 10);
        int int72 = zipArchiveInputStream11.read(byteArray66, 100, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream73 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream11);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] {});
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        boolean boolean4 = zipArchiveInputStream2.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = zipArchiveInputStream2.getNextZipEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveInputStream2.canReadEntryData(archiveEntry6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(zipArchiveEntry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream5);
        zipArchiveInputStream6.mark(100);
        byte[] byteArray10 = zipArchiveInputStream6.readNBytes(0);
        int int11 = zipArchiveInputStream1.read(byteArray10);
        long long13 = zipArchiveInputStream1.skip(1L);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        long long15 = zipArchiveInputStream14.getBytesRead();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = zipArchiveInputStream14.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = zipArchiveInputStream14.getNextEntry();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(archiveEntry16);
        org.junit.Assert.assertNull(archiveEntry17);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark(100);
        boolean boolean5 = zipArchiveInputStream1.markSupported();
        byte[] byteArray6 = zipArchiveInputStream1.readAllBytes();
        int int7 = zipArchiveInputStream1.getCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        boolean boolean3 = zipArchiveInputStream2.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream2.canReadEntryData(archiveEntry4);
        byte[] byteArray6 = zipArchiveInputStream2.readAllBytes();
        byte[] byteArray7 = zipArchiveInputStream2.readAllBytes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark(100);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        boolean boolean11 = zipArchiveInputStream10.markSupported();
        zipArchiveInputStream10.mark((int) '4');
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream14);
        zipArchiveInputStream15.mark(100);
        byte[] byteArray19 = zipArchiveInputStream15.readNBytes(0);
        int int20 = zipArchiveInputStream10.read(byteArray19);
        int int23 = zipArchiveInputStream7.read(byteArray19, (int) (short) -1, (int) (byte) 1);
        int int26 = zipArchiveInputStream1.read(byteArray19, (int) (byte) -1, (int) ' ');
        boolean boolean27 = zipArchiveInputStream1.markSupported();
        long long29 = zipArchiveInputStream1.skip((long) (byte) 1);
        int int30 = zipArchiveInputStream1.available();
        zipArchiveInputStream1.mark((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        zipArchiveInputStream1.close();
        long long7 = zipArchiveInputStream1.getBytesRead();
        int int8 = zipArchiveInputStream1.getCount();
        zipArchiveInputStream1.mark(0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = zipArchiveInputStream1.getNextEntry();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(archiveEntry11);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        byte[] byteArray4 = zipArchiveInputStream2.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        zipArchiveInputStream2.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        int int8 = zipArchiveInputStream2.getCount();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = zipArchiveInputStream2.readAllBytes();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The stream is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray3 = new byte[] {};
        int int6 = zipArchiveInputStream2.read(byteArray3, (-1), 0);
        long long8 = zipArchiveInputStream2.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveInputStream2.canReadEntryData(archiveEntry9);
        int int11 = zipArchiveInputStream2.available();
        byte[] byteArray13 = zipArchiveInputStream2.readNBytes((int) '#');
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        int int15 = zipArchiveInputStream14.read();
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream16);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream17);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream18);
        java.io.InputStream inputStream20 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream20);
        boolean boolean22 = zipArchiveInputStream21.markSupported();
        zipArchiveInputStream21.mark((int) '4');
        java.io.InputStream inputStream25 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream25);
        zipArchiveInputStream26.mark(100);
        byte[] byteArray30 = zipArchiveInputStream26.readNBytes(0);
        int int31 = zipArchiveInputStream21.read(byteArray30);
        int int34 = zipArchiveInputStream18.read(byteArray30, (int) (short) -1, (int) (byte) 1);
        int int35 = zipArchiveInputStream14.read(byteArray30);
        java.io.InputStream inputStream36 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream37 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream36);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream38 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream37);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = zipArchiveInputStream38.getNextZipEntry();
        byte[] byteArray40 = zipArchiveInputStream38.readAllBytes();
        java.io.InputStream inputStream41 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream42 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream41);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream43 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream42);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream44 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream43);
        java.io.InputStream inputStream45 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream46 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream45);
        boolean boolean47 = zipArchiveInputStream46.markSupported();
        zipArchiveInputStream46.mark((int) '4');
        java.io.InputStream inputStream50 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream51 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream50);
        zipArchiveInputStream51.mark(100);
        byte[] byteArray55 = zipArchiveInputStream51.readNBytes(0);
        int int56 = zipArchiveInputStream46.read(byteArray55);
        int int59 = zipArchiveInputStream43.read(byteArray55, (int) (short) -1, (int) (byte) 1);
        int int62 = zipArchiveInputStream38.read(byteArray55, 100, 0);
        int int63 = zipArchiveInputStream14.read(byteArray55);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry64 = null;
        boolean boolean65 = zipArchiveInputStream14.canReadEntryData(archiveEntry64);
        boolean boolean66 = zipArchiveInputStream14.markSupported();
        long long68 = zipArchiveInputStream14.skip(100L);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        zipArchiveInputStream8.mark(100);
        byte[] byteArray12 = zipArchiveInputStream8.readNBytes(0);
        int int13 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean14 = zipArchiveInputStream1.markSupported();
        boolean boolean15 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = zipArchiveInputStream16.getNextEntry();
        zipArchiveInputStream16.mark((int) '4');
        java.io.InputStream inputStream20 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream20);
        zipArchiveInputStream21.mark(100);
        byte[] byteArray25 = zipArchiveInputStream21.readNBytes(0);
        int int26 = zipArchiveInputStream21.getCount();
        java.io.InputStream inputStream27 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream27);
        zipArchiveInputStream28.mark(100);
        byte[] byteArray32 = zipArchiveInputStream28.readNBytes(0);
        zipArchiveInputStream28.mark((int) (byte) 100);
        int int35 = zipArchiveInputStream28.getCount();
        java.io.InputStream inputStream36 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream37 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream36);
        boolean boolean38 = zipArchiveInputStream37.markSupported();
        zipArchiveInputStream37.mark((int) '4');
        java.io.InputStream inputStream41 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream42 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream41);
        zipArchiveInputStream42.mark(100);
        byte[] byteArray46 = zipArchiveInputStream42.readNBytes(0);
        int int47 = zipArchiveInputStream37.read(byteArray46);
        int int50 = zipArchiveInputStream28.readNBytes(byteArray46, 0, (int) (byte) 0);
        int int51 = zipArchiveInputStream21.read(byteArray46);
        int int52 = zipArchiveInputStream16.read(byteArray46);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry53 = null;
        boolean boolean54 = zipArchiveInputStream16.canReadEntryData(archiveEntry53);
        int int55 = zipArchiveInputStream16.getCount();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(archiveEntry17);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        byte[] byteArray7 = zipArchiveInputStream1.readNBytes(100);
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        zipArchiveInputStream9.mark(100);
        byte[] byteArray13 = zipArchiveInputStream9.readNBytes(0);
        zipArchiveInputStream9.mark((int) (byte) 100);
        int int16 = zipArchiveInputStream9.getCount();
        byte[] byteArray17 = zipArchiveInputStream9.readAllBytes();
        int int18 = zipArchiveInputStream1.read(byteArray17);
        boolean boolean19 = zipArchiveInputStream1.markSupported();
        java.lang.Class<?> wildcardClass20 = zipArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveInputStream1.canReadEntryData(archiveEntry6);
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        zipArchiveInputStream9.mark(100);
        byte[] byteArray13 = zipArchiveInputStream9.readNBytes(0);
        zipArchiveInputStream9.mark((int) (byte) 100);
        int int16 = zipArchiveInputStream9.getCount();
        byte[] byteArray17 = zipArchiveInputStream9.readAllBytes();
        int int18 = zipArchiveInputStream1.read(byteArray17);
        zipArchiveInputStream1.mark((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = null;
        boolean boolean23 = zipArchiveInputStream1.canReadEntryData(archiveEntry22);
        int int24 = zipArchiveInputStream1.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray3 = new byte[] {};
        int int6 = zipArchiveInputStream2.read(byteArray3, (-1), 0);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        boolean boolean9 = zipArchiveInputStream8.markSupported();
        zipArchiveInputStream8.mark((int) '4');
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream12);
        zipArchiveInputStream13.mark(100);
        byte[] byteArray17 = zipArchiveInputStream13.readNBytes(0);
        int int18 = zipArchiveInputStream8.read(byteArray17);
        int int19 = zipArchiveInputStream2.read(byteArray17);
        int int20 = zipArchiveInputStream2.available();
        boolean boolean21 = zipArchiveInputStream2.markSupported();
        int int22 = zipArchiveInputStream2.getCount();
        int int23 = zipArchiveInputStream2.getCount();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int3 = zipArchiveInputStream1.available();
        boolean boolean4 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveInputStream1.canReadEntryData(archiveEntry5);
        int int7 = zipArchiveInputStream1.read();
        byte[] byteArray8 = null;
        int int11 = zipArchiveInputStream1.read(byteArray8, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        zipArchiveInputStream8.mark(100);
        byte[] byteArray12 = zipArchiveInputStream8.readNBytes(0);
        int int13 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean14 = zipArchiveInputStream1.markSupported();
        boolean boolean15 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        boolean boolean23 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray21, 0);
        boolean boolean25 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray21, 1);
        boolean boolean27 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray21, (int) ' ');
        int int28 = zipArchiveInputStream16.read(byteArray21);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry29 = null;
        boolean boolean30 = zipArchiveInputStream16.canReadEntryData(archiveEntry29);
        byte[] byteArray31 = zipArchiveInputStream16.readAllBytes();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = null;
        boolean boolean33 = zipArchiveInputStream16.canReadEntryData(archiveEntry32);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        int int4 = zipArchiveInputStream2.getCount();
        byte[] byteArray6 = zipArchiveInputStream2.readNBytes((int) ' ');
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        int int8 = zipArchiveInputStream7.available();
        zipArchiveInputStream7.close();
        int int10 = zipArchiveInputStream7.getCount();
        long long11 = zipArchiveInputStream7.getBytesRead();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        byte[] byteArray4 = zipArchiveInputStream2.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2, "", false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        long long6 = zipArchiveInputStream1.skip((long) (short) 10);
        zipArchiveInputStream1.mark((int) (short) -1);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        byte[] byteArray12 = new byte[] {};
        int int15 = zipArchiveInputStream11.read(byteArray12, (-1), 0);
        int int16 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean17 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((-1));
        java.io.InputStream inputStream20 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream20);
        long long22 = zipArchiveInputStream21.getBytesRead();
        long long23 = zipArchiveInputStream21.getBytesRead();
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream24);
        zipArchiveInputStream25.mark(100);
        long long29 = zipArchiveInputStream25.skip((long) 1);
        byte[] byteArray31 = zipArchiveInputStream25.readNBytes(100);
        java.io.InputStream inputStream32 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream32);
        zipArchiveInputStream33.mark(100);
        byte[] byteArray37 = zipArchiveInputStream33.readNBytes(0);
        zipArchiveInputStream33.mark((int) (byte) 100);
        int int40 = zipArchiveInputStream33.getCount();
        byte[] byteArray41 = zipArchiveInputStream33.readAllBytes();
        int int42 = zipArchiveInputStream25.read(byteArray41);
        int int45 = zipArchiveInputStream21.read(byteArray41, (int) (short) 0, 0);
        int int46 = zipArchiveInputStream1.read(byteArray41);
        int int47 = zipArchiveInputStream1.getCount();
        zipArchiveInputStream1.close();
        boolean boolean49 = zipArchiveInputStream1.markSupported();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        zipArchiveInputStream1.close();
        zipArchiveInputStream1.mark(1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(archiveEntry10);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        int int6 = zipArchiveInputStream1.read();
        byte[] byteArray7 = zipArchiveInputStream1.readAllBytes();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        boolean boolean10 = zipArchiveInputStream9.markSupported();
        zipArchiveInputStream9.mark(100);
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream13);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream14);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream15);
        java.io.InputStream inputStream17 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream17);
        boolean boolean19 = zipArchiveInputStream18.markSupported();
        zipArchiveInputStream18.mark((int) '4');
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream22);
        zipArchiveInputStream23.mark(100);
        byte[] byteArray27 = zipArchiveInputStream23.readNBytes(0);
        int int28 = zipArchiveInputStream18.read(byteArray27);
        int int31 = zipArchiveInputStream15.read(byteArray27, (int) (short) -1, (int) (byte) 1);
        int int34 = zipArchiveInputStream9.read(byteArray27, (int) (byte) -1, (int) ' ');
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream35 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream9);
        int int36 = zipArchiveInputStream35.available();
        java.io.InputStream inputStream37 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream38 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream37);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream39 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream38);
        byte[] byteArray40 = new byte[] {};
        int int43 = zipArchiveInputStream39.read(byteArray40, (-1), 0);
        int int44 = zipArchiveInputStream35.read(byteArray40);
        int int45 = zipArchiveInputStream1.read(byteArray40);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        long long6 = zipArchiveInputStream1.skip((long) (short) 10);
        zipArchiveInputStream1.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int11 = zipArchiveInputStream10.read();
        byte[] byteArray13 = zipArchiveInputStream10.readNBytes((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = zipArchiveInputStream10.getNextZipEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        int int17 = zipArchiveInputStream16.getCount();
        boolean boolean18 = zipArchiveInputStream16.markSupported();
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream19);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream20);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = zipArchiveInputStream21.getNextZipEntry();
        byte[] byteArray23 = zipArchiveInputStream21.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream21);
        long long26 = zipArchiveInputStream24.skip(0L);
        int int27 = zipArchiveInputStream24.available();
        int int28 = zipArchiveInputStream24.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream24);
        java.io.InputStream inputStream30 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream31 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream30);
        boolean boolean32 = zipArchiveInputStream31.markSupported();
        zipArchiveInputStream31.mark(100);
        boolean boolean35 = zipArchiveInputStream31.markSupported();
        java.io.InputStream inputStream36 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream37 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream36);
        zipArchiveInputStream37.mark(100);
        long long41 = zipArchiveInputStream37.skip((long) 1);
        byte[] byteArray43 = zipArchiveInputStream37.readNBytes(100);
        java.io.InputStream inputStream44 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream45 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream44);
        zipArchiveInputStream45.mark(100);
        byte[] byteArray49 = zipArchiveInputStream45.readNBytes(0);
        zipArchiveInputStream45.mark((int) (byte) 100);
        int int52 = zipArchiveInputStream45.getCount();
        byte[] byteArray53 = zipArchiveInputStream45.readAllBytes();
        int int54 = zipArchiveInputStream37.read(byteArray53);
        int int55 = zipArchiveInputStream31.read(byteArray53);
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 0 };
        boolean boolean63 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray61, (-1));
        boolean boolean65 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray61, (int) (short) 0);
        int int66 = zipArchiveInputStream31.read(byteArray61);
        int int69 = zipArchiveInputStream29.read(byteArray61, (int) (byte) 1, (int) 'a');
        int int72 = zipArchiveInputStream16.read(byteArray61, (int) '#', 0);
        zipArchiveInputStream16.close();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNull(zipArchiveEntry15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(zipArchiveEntry22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        byte[] byteArray6 = zipArchiveInputStream1.readAllBytes();
        long long8 = zipArchiveInputStream1.skip((long) 1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveInputStream1.canReadEntryData(archiveEntry9);
        byte[] byteArray11 = zipArchiveInputStream1.readAllBytes();
        int int12 = zipArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream1.canReadEntryData(archiveEntry13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "hi!", true, true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream4);
        byte[] byteArray6 = zipArchiveInputStream4.readAllBytes();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        boolean boolean9 = zipArchiveInputStream8.markSupported();
        zipArchiveInputStream8.mark((int) '4');
        int int12 = zipArchiveInputStream8.getCount();
        long long14 = zipArchiveInputStream8.skip((long) 0);
        int int15 = zipArchiveInputStream8.read();
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream16);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream17);
        int int19 = zipArchiveInputStream18.available();
        byte[] byteArray20 = zipArchiveInputStream18.readAllBytes();
        int int21 = zipArchiveInputStream8.read(byteArray20);
        byte[] byteArray23 = zipArchiveInputStream8.readNBytes((int) (byte) 100);
        int int24 = zipArchiveInputStream8.getCount();
        byte[] byteArray25 = zipArchiveInputStream8.readAllBytes();
        int int26 = zipArchiveInputStream4.read(byteArray25);
        long long28 = zipArchiveInputStream4.skip((long) (short) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = null;
        boolean boolean31 = zipArchiveInputStream29.canReadEntryData(archiveEntry30);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = zipArchiveInputStream29.getNextEntry();
        zipArchiveInputStream29.mark((int) '#');
        int int35 = zipArchiveInputStream29.getCount();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(archiveEntry32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        long long6 = zipArchiveInputStream1.skip((long) (short) 10);
        zipArchiveInputStream1.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int11 = zipArchiveInputStream10.read();
        byte[] byteArray13 = zipArchiveInputStream10.readNBytes((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        int int15 = zipArchiveInputStream10.read();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10, "", false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray8 = zipArchiveInputStream6.readNBytes(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        byte[] byteArray11 = zipArchiveInputStream9.readNBytes(10);
        boolean boolean12 = zipArchiveInputStream9.markSupported();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        long long6 = zipArchiveInputStream1.skip((long) (short) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = zipArchiveInputStream7.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveInputStream7.canReadEntryData(archiveEntry10);
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = zipArchiveInputStream7.transferTo(outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(archiveEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        long long7 = zipArchiveInputStream1.skip((long) 0);
        boolean boolean8 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        boolean boolean11 = zipArchiveInputStream10.markSupported();
        zipArchiveInputStream10.mark((int) '4');
        int int14 = zipArchiveInputStream10.getCount();
        long long16 = zipArchiveInputStream10.skip((long) 0);
        int int17 = zipArchiveInputStream10.read();
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream18);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream19);
        int int21 = zipArchiveInputStream20.available();
        byte[] byteArray22 = zipArchiveInputStream20.readAllBytes();
        int int23 = zipArchiveInputStream10.read(byteArray22);
        int int24 = zipArchiveInputStream1.read(byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = zipArchiveInputStream1.getNextZipEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray3 = new byte[] {};
        int int6 = zipArchiveInputStream2.read(byteArray3, (-1), 0);
        byte[] byteArray8 = zipArchiveInputStream2.readNBytes((int) (short) 10);
        int int9 = zipArchiveInputStream2.available();
        zipArchiveInputStream2.mark(100);
        int int12 = zipArchiveInputStream2.read();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        zipArchiveInputStream1.mark((int) (byte) 100);
        int int8 = zipArchiveInputStream1.getCount();
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        boolean boolean11 = zipArchiveInputStream10.markSupported();
        zipArchiveInputStream10.mark((int) '4');
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream14);
        zipArchiveInputStream15.mark(100);
        byte[] byteArray19 = zipArchiveInputStream15.readNBytes(0);
        int int20 = zipArchiveInputStream10.read(byteArray19);
        int int23 = zipArchiveInputStream1.readNBytes(byteArray19, 0, (int) (byte) 0);
        int int24 = zipArchiveInputStream1.available();
        java.io.InputStream inputStream25 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream25);
        boolean boolean27 = zipArchiveInputStream26.markSupported();
        zipArchiveInputStream26.mark((int) '4');
        int int30 = zipArchiveInputStream26.getCount();
        long long32 = zipArchiveInputStream26.skip((long) 0);
        int int33 = zipArchiveInputStream26.read();
        java.io.InputStream inputStream34 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream35 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream34);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream36 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream35);
        int int37 = zipArchiveInputStream36.available();
        byte[] byteArray38 = zipArchiveInputStream36.readAllBytes();
        int int39 = zipArchiveInputStream26.read(byteArray38);
        byte[] byteArray41 = zipArchiveInputStream26.readNBytes((int) (byte) 100);
        int int44 = zipArchiveInputStream1.read(byteArray41, (int) (byte) -1, 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream45 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream46 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream45);
        long long48 = zipArchiveInputStream46.skip((long) '4');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        zipArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray10 = zipArchiveInputStream8.readNBytes(0);
        int int11 = zipArchiveInputStream8.available();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveInputStream8.canReadEntryData(archiveEntry12);
        boolean boolean14 = zipArchiveInputStream8.markSupported();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        byte[] byteArray4 = zipArchiveInputStream2.readAllBytes();
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        boolean boolean11 = zipArchiveInputStream10.markSupported();
        zipArchiveInputStream10.mark((int) '4');
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream14);
        zipArchiveInputStream15.mark(100);
        byte[] byteArray19 = zipArchiveInputStream15.readNBytes(0);
        int int20 = zipArchiveInputStream10.read(byteArray19);
        int int23 = zipArchiveInputStream7.read(byteArray19, (int) (short) -1, (int) (byte) 1);
        int int26 = zipArchiveInputStream2.read(byteArray19, 100, 0);
        zipArchiveInputStream2.close();
        boolean boolean28 = zipArchiveInputStream2.markSupported();
        java.io.InputStream inputStream29 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream29);
        zipArchiveInputStream30.mark(100);
        long long34 = zipArchiveInputStream30.skip((long) 1);
        byte[] byteArray35 = zipArchiveInputStream30.readAllBytes();
        long long37 = zipArchiveInputStream30.skip((long) 1);
        int int38 = zipArchiveInputStream30.getCount();
        byte[] byteArray39 = zipArchiveInputStream30.readAllBytes();
        boolean boolean41 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray39, (int) (short) -1);
        int int44 = zipArchiveInputStream2.readNBytes(byteArray39, (int) (byte) 0, 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry45 = zipArchiveInputStream2.getNextEntry();
        // The following exception was thrown during execution in test generation
        try {
            long long47 = zipArchiveInputStream2.skip((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(archiveEntry45);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark(100);
        int int5 = zipArchiveInputStream1.available();
        zipArchiveInputStream1.close();
        zipArchiveInputStream1.mark((int) ' ');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = zipArchiveInputStream1.getNextEntry();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(archiveEntry9);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        zipArchiveInputStream1.mark((int) (byte) 100);
        int int8 = zipArchiveInputStream1.getCount();
        long long10 = zipArchiveInputStream1.skip((long) (byte) 0);
        int int11 = zipArchiveInputStream1.getCount();
        byte[] byteArray12 = zipArchiveInputStream1.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        byte[] byteArray4 = zipArchiveInputStream2.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        zipArchiveInputStream2.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = zipArchiveInputStream2.getNextZipEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = zipArchiveInputStream2.getNextZipEntry();
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNull(zipArchiveEntry7);
        org.junit.Assert.assertNull(zipArchiveEntry8);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveInputStream1.canReadEntryData(archiveEntry6);
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        zipArchiveInputStream9.mark(100);
        byte[] byteArray13 = zipArchiveInputStream9.readNBytes(0);
        int int16 = zipArchiveInputStream1.read(byteArray13, (int) (short) 100, (int) (byte) 0);
        int int17 = zipArchiveInputStream1.available();
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream18);
        long long20 = zipArchiveInputStream19.getBytesRead();
        long long21 = zipArchiveInputStream19.getBytesRead();
        int int22 = zipArchiveInputStream19.read();
        int int23 = zipArchiveInputStream19.available();
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream24);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream25);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = zipArchiveInputStream26.getNextZipEntry();
        java.io.InputStream inputStream28 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream28);
        zipArchiveInputStream29.mark(100);
        byte[] byteArray33 = zipArchiveInputStream29.readNBytes(0);
        zipArchiveInputStream29.mark((int) (byte) 100);
        int int36 = zipArchiveInputStream29.getCount();
        java.io.InputStream inputStream37 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream38 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream37);
        boolean boolean39 = zipArchiveInputStream38.markSupported();
        zipArchiveInputStream38.mark((int) '4');
        java.io.InputStream inputStream42 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream43 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream42);
        zipArchiveInputStream43.mark(100);
        byte[] byteArray47 = zipArchiveInputStream43.readNBytes(0);
        int int48 = zipArchiveInputStream38.read(byteArray47);
        int int51 = zipArchiveInputStream29.readNBytes(byteArray47, 0, (int) (byte) 0);
        int int54 = zipArchiveInputStream26.read(byteArray47, (int) '4', (int) '#');
        int int55 = zipArchiveInputStream19.read(byteArray47);
        java.io.InputStream inputStream56 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream57 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream56);
        zipArchiveInputStream57.mark(100);
        long long61 = zipArchiveInputStream57.skip((long) 1);
        boolean boolean62 = zipArchiveInputStream57.markSupported();
        java.io.InputStream inputStream63 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream64 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream63);
        zipArchiveInputStream64.mark(100);
        byte[] byteArray68 = zipArchiveInputStream64.readNBytes(0);
        int int69 = zipArchiveInputStream57.read(byteArray68);
        int int72 = zipArchiveInputStream19.read(byteArray68, (int) (short) -1, (int) (byte) 100);
        int int73 = zipArchiveInputStream1.read(byteArray68);
        boolean boolean74 = zipArchiveInputStream1.markSupported();
        int int75 = zipArchiveInputStream1.read();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(zipArchiveEntry27);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] {});
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        zipArchiveInputStream1.close();
        int int7 = zipArchiveInputStream1.getCount();
        zipArchiveInputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int11 = zipArchiveInputStream10.read();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        int int4 = zipArchiveInputStream2.read();
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream5);
        boolean boolean7 = zipArchiveInputStream6.markSupported();
        zipArchiveInputStream6.mark((int) '4');
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream10);
        zipArchiveInputStream11.mark(100);
        byte[] byteArray15 = zipArchiveInputStream11.readNBytes(0);
        int int16 = zipArchiveInputStream6.read(byteArray15);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = zipArchiveInputStream6.canReadEntryData(archiveEntry17);
        int int19 = zipArchiveInputStream6.getCount();
        byte[] byteArray20 = zipArchiveInputStream6.readAllBytes();
        int int21 = zipArchiveInputStream2.read(byteArray20);
        long long23 = zipArchiveInputStream2.skip(0L);
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream24);
        boolean boolean26 = zipArchiveInputStream25.markSupported();
        zipArchiveInputStream25.mark((int) '4');
        long long30 = zipArchiveInputStream25.skip((long) (short) 10);
        zipArchiveInputStream25.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream25);
        java.io.InputStream inputStream34 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream35 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream34);
        zipArchiveInputStream35.mark(100);
        byte[] byteArray39 = zipArchiveInputStream35.readNBytes(0);
        zipArchiveInputStream35.mark((int) (byte) 100);
        int int42 = zipArchiveInputStream35.getCount();
        byte[] byteArray43 = zipArchiveInputStream35.readAllBytes();
        int int46 = zipArchiveInputStream25.read(byteArray43, (int) (byte) 10, 100);
        int int47 = zipArchiveInputStream2.read(byteArray43);
        byte[] byteArray49 = zipArchiveInputStream2.readNBytes((int) (byte) 100);
        zipArchiveInputStream2.close();
        int int51 = zipArchiveInputStream2.available();
        byte[] byteArray52 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int53 = zipArchiveInputStream2.read(byteArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        zipArchiveInputStream8.mark(100);
        byte[] byteArray12 = zipArchiveInputStream8.readNBytes(0);
        int int13 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean14 = zipArchiveInputStream1.markSupported();
        boolean boolean15 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = zipArchiveInputStream16.getNextEntry();
        zipArchiveInputStream16.mark((int) (short) 10);
        int int20 = zipArchiveInputStream16.getCount();
        long long21 = zipArchiveInputStream16.getBytesRead();
        byte[] byteArray23 = zipArchiveInputStream16.readNBytes(1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry24 = null;
        boolean boolean25 = zipArchiveInputStream16.canReadEntryData(archiveEntry24);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(archiveEntry17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        byte[] byteArray4 = zipArchiveInputStream2.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        byte[] byteArray6 = zipArchiveInputStream2.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        long long8 = zipArchiveInputStream7.getBytesRead();
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        zipArchiveInputStream10.mark(100);
        long long14 = zipArchiveInputStream10.skip((long) 1);
        boolean boolean15 = zipArchiveInputStream10.markSupported();
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream16);
        zipArchiveInputStream17.mark(100);
        byte[] byteArray21 = zipArchiveInputStream17.readNBytes(0);
        int int22 = zipArchiveInputStream10.read(byteArray21);
        boolean boolean23 = zipArchiveInputStream10.markSupported();
        boolean boolean24 = zipArchiveInputStream10.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        byte[] byteArray26 = zipArchiveInputStream25.readAllBytes();
        long long28 = zipArchiveInputStream25.skip((long) (short) 100);
        byte[] byteArray29 = zipArchiveInputStream25.readAllBytes();
        byte[] byteArray31 = zipArchiveInputStream25.readNBytes((int) '4');
        int int32 = zipArchiveInputStream7.read(byteArray31);
        java.io.InputStream inputStream33 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream34 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream33);
        zipArchiveInputStream34.mark(100);
        long long38 = zipArchiveInputStream34.skip((long) 1);
        boolean boolean39 = zipArchiveInputStream34.markSupported();
        java.io.InputStream inputStream40 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream41 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream40);
        zipArchiveInputStream41.mark(100);
        byte[] byteArray45 = zipArchiveInputStream41.readNBytes(0);
        int int46 = zipArchiveInputStream34.read(byteArray45);
        boolean boolean47 = zipArchiveInputStream34.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream48 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream34);
        byte[] byteArray49 = zipArchiveInputStream34.readAllBytes();
        int int50 = zipArchiveInputStream7.read(byteArray49);
        zipArchiveInputStream7.mark((int) '#');
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        int int6 = zipArchiveInputStream1.getCount();
        boolean boolean7 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        zipArchiveInputStream9.mark(100);
        long long13 = zipArchiveInputStream9.skip((long) 1);
        boolean boolean14 = zipArchiveInputStream9.markSupported();
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream15);
        zipArchiveInputStream16.mark(100);
        byte[] byteArray20 = zipArchiveInputStream16.readNBytes(0);
        int int21 = zipArchiveInputStream9.read(byteArray20);
        int int22 = zipArchiveInputStream1.read(byteArray20);
        byte[] byteArray23 = zipArchiveInputStream1.readAllBytes();
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream24);
        zipArchiveInputStream25.mark(100);
        long long29 = zipArchiveInputStream25.skip((long) 1);
        int int30 = zipArchiveInputStream25.getCount();
        long long32 = zipArchiveInputStream25.skip((long) '#');
        int int33 = zipArchiveInputStream25.getCount();
        int int34 = zipArchiveInputStream25.read();
        byte[] byteArray35 = zipArchiveInputStream25.readAllBytes();
        int int36 = zipArchiveInputStream1.read(byteArray35);
        java.lang.Class<?> wildcardClass37 = byteArray35.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry2 = null;
        boolean boolean3 = zipArchiveInputStream1.canReadEntryData(archiveEntry2);
        byte[] byteArray4 = zipArchiveInputStream1.readAllBytes();
        zipArchiveInputStream1.mark((int) (byte) 0);
        int int7 = zipArchiveInputStream1.getCount();
        java.lang.Class<?> wildcardClass8 = zipArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        zipArchiveInputStream1.mark((int) (byte) 100);
        int int8 = zipArchiveInputStream1.getCount();
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        boolean boolean11 = zipArchiveInputStream10.markSupported();
        zipArchiveInputStream10.mark((int) '4');
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream14);
        zipArchiveInputStream15.mark(100);
        byte[] byteArray19 = zipArchiveInputStream15.readNBytes(0);
        int int20 = zipArchiveInputStream10.read(byteArray19);
        int int23 = zipArchiveInputStream1.readNBytes(byteArray19, 0, (int) (byte) 0);
        boolean boolean25 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray19, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray19, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray3 = new byte[] {};
        int int6 = zipArchiveInputStream2.read(byteArray3, (-1), 0);
        long long8 = zipArchiveInputStream2.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveInputStream2.canReadEntryData(archiveEntry9);
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream11);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream12);
        byte[] byteArray14 = new byte[] {};
        int int17 = zipArchiveInputStream13.read(byteArray14, (-1), 0);
        long long19 = zipArchiveInputStream13.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = zipArchiveInputStream13.canReadEntryData(archiveEntry20);
        int int22 = zipArchiveInputStream13.available();
        byte[] byteArray24 = zipArchiveInputStream13.readNBytes((int) '#');
        int int27 = zipArchiveInputStream2.read(byteArray24, (int) (byte) 0, 10);
        int int28 = zipArchiveInputStream2.getCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream31 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream6);
        boolean boolean8 = zipArchiveInputStream7.markSupported();
        zipArchiveInputStream7.mark((int) '4');
        long long12 = zipArchiveInputStream7.skip((long) (short) 10);
        zipArchiveInputStream7.mark((int) (short) -1);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream15);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream16);
        byte[] byteArray18 = new byte[] {};
        int int21 = zipArchiveInputStream17.read(byteArray18, (-1), 0);
        int int22 = zipArchiveInputStream7.read(byteArray18);
        boolean boolean23 = zipArchiveInputStream7.markSupported();
        int int24 = zipArchiveInputStream7.available();
        int int25 = zipArchiveInputStream7.read();
        int int26 = zipArchiveInputStream7.read();
        byte[] byteArray28 = zipArchiveInputStream7.readNBytes((int) (byte) 10);
        int int31 = zipArchiveInputStream1.read(byteArray28, (int) ' ', (int) (byte) 0);
        int int32 = zipArchiveInputStream1.getCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long4 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.mark((int) (byte) 0);
        int int7 = zipArchiveInputStream1.available();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        zipArchiveInputStream9.mark(100);
        byte[] byteArray13 = zipArchiveInputStream9.readNBytes(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream9);
        byte[] byteArray16 = zipArchiveInputStream14.readNBytes(0);
        boolean boolean18 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray16, (int) (short) 0);
        int int19 = zipArchiveInputStream1.read(byteArray16);
        int int20 = zipArchiveInputStream1.getCount();
        int int21 = zipArchiveInputStream1.read();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        zipArchiveInputStream1.mark((int) (byte) 100);
        int int8 = zipArchiveInputStream1.getCount();
        long long10 = zipArchiveInputStream1.skip((long) (byte) 0);
        int int11 = zipArchiveInputStream1.getCount();
        long long12 = zipArchiveInputStream1.getBytesRead();
        byte[] byteArray14 = zipArchiveInputStream1.readNBytes((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "", false, false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        zipArchiveInputStream8.mark(100);
        byte[] byteArray12 = zipArchiveInputStream8.readNBytes(0);
        int int13 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean14 = zipArchiveInputStream1.markSupported();
        boolean boolean15 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = zipArchiveInputStream16.getNextEntry();
        zipArchiveInputStream16.mark((int) (short) 10);
        int int20 = zipArchiveInputStream16.getCount();
        long long21 = zipArchiveInputStream16.getBytesRead();
        byte[] byteArray23 = zipArchiveInputStream16.readNBytes(1);
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream24);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream25);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = zipArchiveInputStream26.getNextZipEntry();
        byte[] byteArray28 = zipArchiveInputStream26.readAllBytes();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry29 = null;
        boolean boolean30 = zipArchiveInputStream26.canReadEntryData(archiveEntry29);
        java.io.InputStream inputStream31 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream31);
        boolean boolean33 = zipArchiveInputStream32.markSupported();
        zipArchiveInputStream32.mark((int) '4');
        java.io.InputStream inputStream36 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream37 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream36);
        zipArchiveInputStream37.mark(100);
        byte[] byteArray41 = zipArchiveInputStream37.readNBytes(0);
        int int42 = zipArchiveInputStream32.read(byteArray41);
        java.io.InputStream inputStream43 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream44 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream43);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream45 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream44);
        int int46 = zipArchiveInputStream45.available();
        byte[] byteArray47 = zipArchiveInputStream45.readAllBytes();
        int int50 = zipArchiveInputStream32.read(byteArray47, 1, (int) (byte) 1);
        int int53 = zipArchiveInputStream26.read(byteArray47, (int) (short) 0, (int) (byte) 100);
        int int56 = zipArchiveInputStream16.read(byteArray47, 0, (int) (byte) 1);
        boolean boolean57 = zipArchiveInputStream16.markSupported();
        int int58 = zipArchiveInputStream16.getCount();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(archiveEntry17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertNull(zipArchiveEntry27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        zipArchiveInputStream1.mark((int) (byte) 100);
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        zipArchiveInputStream9.mark(100);
        byte[] byteArray13 = zipArchiveInputStream9.readNBytes(0);
        int int14 = zipArchiveInputStream9.getCount();
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream15);
        zipArchiveInputStream16.mark(100);
        byte[] byteArray20 = zipArchiveInputStream16.readNBytes(0);
        zipArchiveInputStream16.mark((int) (byte) 100);
        int int23 = zipArchiveInputStream16.getCount();
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream24);
        boolean boolean26 = zipArchiveInputStream25.markSupported();
        zipArchiveInputStream25.mark((int) '4');
        java.io.InputStream inputStream29 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream29);
        zipArchiveInputStream30.mark(100);
        byte[] byteArray34 = zipArchiveInputStream30.readNBytes(0);
        int int35 = zipArchiveInputStream25.read(byteArray34);
        int int38 = zipArchiveInputStream16.readNBytes(byteArray34, 0, (int) (byte) 0);
        int int39 = zipArchiveInputStream9.read(byteArray34);
        java.io.InputStream inputStream40 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream41 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream40);
        boolean boolean42 = zipArchiveInputStream41.markSupported();
        zipArchiveInputStream41.mark((int) '4');
        long long46 = zipArchiveInputStream41.skip((long) (short) 10);
        zipArchiveInputStream41.mark((int) (short) -1);
        java.io.InputStream inputStream49 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream50 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream49);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream51 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream50);
        byte[] byteArray52 = new byte[] {};
        int int55 = zipArchiveInputStream51.read(byteArray52, (-1), 0);
        int int56 = zipArchiveInputStream41.read(byteArray52);
        boolean boolean57 = zipArchiveInputStream41.markSupported();
        int int58 = zipArchiveInputStream41.available();
        int int59 = zipArchiveInputStream41.read();
        int int60 = zipArchiveInputStream41.read();
        byte[] byteArray62 = zipArchiveInputStream41.readNBytes((int) (byte) 10);
        int int65 = zipArchiveInputStream9.read(byteArray62, 10, 10);
        int int66 = zipArchiveInputStream1.read(byteArray62);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry67 = null;
        boolean boolean68 = zipArchiveInputStream1.canReadEntryData(archiveEntry67);
        zipArchiveInputStream1.mark((int) (short) -1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] {});
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] {});
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        int int4 = zipArchiveInputStream2.getCount();
        long long5 = zipArchiveInputStream2.getBytesRead();
        long long6 = zipArchiveInputStream2.getBytesRead();
        int int7 = zipArchiveInputStream2.read();
        zipArchiveInputStream2.close();
        zipArchiveInputStream2.close();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long4 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.mark((int) (byte) 0);
        long long7 = zipArchiveInputStream1.getBytesRead();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        long long10 = zipArchiveInputStream9.getBytesRead();
        long long11 = zipArchiveInputStream9.getBytesRead();
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream12);
        zipArchiveInputStream13.mark(100);
        long long17 = zipArchiveInputStream13.skip((long) 1);
        byte[] byteArray19 = zipArchiveInputStream13.readNBytes(100);
        java.io.InputStream inputStream20 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream20);
        zipArchiveInputStream21.mark(100);
        byte[] byteArray25 = zipArchiveInputStream21.readNBytes(0);
        zipArchiveInputStream21.mark((int) (byte) 100);
        int int28 = zipArchiveInputStream21.getCount();
        byte[] byteArray29 = zipArchiveInputStream21.readAllBytes();
        int int30 = zipArchiveInputStream13.read(byteArray29);
        int int33 = zipArchiveInputStream9.read(byteArray29, (int) (short) 0, 0);
        java.io.InputStream inputStream34 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream35 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream34);
        boolean boolean36 = zipArchiveInputStream35.markSupported();
        zipArchiveInputStream35.mark((int) '4');
        long long40 = zipArchiveInputStream35.skip((long) (short) 10);
        zipArchiveInputStream35.mark((int) (short) -1);
        java.io.InputStream inputStream43 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream44 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream43);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream45 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream44);
        byte[] byteArray46 = new byte[] {};
        int int49 = zipArchiveInputStream45.read(byteArray46, (-1), 0);
        int int50 = zipArchiveInputStream35.read(byteArray46);
        int int51 = zipArchiveInputStream9.read(byteArray46);
        int int54 = zipArchiveInputStream1.read(byteArray46, (int) 'a', 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry55 = zipArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry2 = null;
        boolean boolean3 = zipArchiveInputStream1.canReadEntryData(archiveEntry2);
        byte[] byteArray4 = zipArchiveInputStream1.readAllBytes();
        zipArchiveInputStream1.mark(100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveInputStream1.canReadEntryData(archiveEntry7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        int int6 = zipArchiveInputStream1.getCount();
        boolean boolean7 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        zipArchiveInputStream9.mark(100);
        long long13 = zipArchiveInputStream9.skip((long) 1);
        boolean boolean14 = zipArchiveInputStream9.markSupported();
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream15);
        zipArchiveInputStream16.mark(100);
        byte[] byteArray20 = zipArchiveInputStream16.readNBytes(0);
        int int21 = zipArchiveInputStream9.read(byteArray20);
        int int22 = zipArchiveInputStream1.read(byteArray20);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = null;
        boolean boolean24 = zipArchiveInputStream1.canReadEntryData(archiveEntry23);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        long long26 = zipArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry27 = null;
        boolean boolean28 = zipArchiveInputStream1.canReadEntryData(archiveEntry27);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        byte[] byteArray4 = zipArchiveInputStream2.readAllBytes();
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        boolean boolean11 = zipArchiveInputStream10.markSupported();
        zipArchiveInputStream10.mark((int) '4');
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream14);
        zipArchiveInputStream15.mark(100);
        byte[] byteArray19 = zipArchiveInputStream15.readNBytes(0);
        int int20 = zipArchiveInputStream10.read(byteArray19);
        int int23 = zipArchiveInputStream7.read(byteArray19, (int) (short) -1, (int) (byte) 1);
        int int26 = zipArchiveInputStream2.read(byteArray19, 100, 0);
        zipArchiveInputStream2.close();
        int int28 = zipArchiveInputStream2.getCount();
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        zipArchiveInputStream6.close();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = zipArchiveInputStream6.getNextEntry();
        int int9 = zipArchiveInputStream6.available();
        boolean boolean10 = zipArchiveInputStream6.markSupported();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(archiveEntry8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        long long3 = zipArchiveInputStream1.getBytesRead();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream4);
        zipArchiveInputStream5.mark(100);
        long long9 = zipArchiveInputStream5.skip((long) 1);
        byte[] byteArray11 = zipArchiveInputStream5.readNBytes(100);
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream12);
        zipArchiveInputStream13.mark(100);
        byte[] byteArray17 = zipArchiveInputStream13.readNBytes(0);
        zipArchiveInputStream13.mark((int) (byte) 100);
        int int20 = zipArchiveInputStream13.getCount();
        byte[] byteArray21 = zipArchiveInputStream13.readAllBytes();
        int int22 = zipArchiveInputStream5.read(byteArray21);
        int int25 = zipArchiveInputStream1.read(byteArray21, (int) (short) 0, 0);
        java.io.InputStream inputStream26 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream26);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream27);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = zipArchiveInputStream28.getNextZipEntry();
        java.io.InputStream inputStream30 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream31 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream30);
        zipArchiveInputStream31.mark(100);
        byte[] byteArray35 = zipArchiveInputStream31.readNBytes(0);
        zipArchiveInputStream31.mark((int) (byte) 100);
        int int38 = zipArchiveInputStream31.getCount();
        java.io.InputStream inputStream39 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream40 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream39);
        boolean boolean41 = zipArchiveInputStream40.markSupported();
        zipArchiveInputStream40.mark((int) '4');
        java.io.InputStream inputStream44 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream45 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream44);
        zipArchiveInputStream45.mark(100);
        byte[] byteArray49 = zipArchiveInputStream45.readNBytes(0);
        int int50 = zipArchiveInputStream40.read(byteArray49);
        int int53 = zipArchiveInputStream31.readNBytes(byteArray49, 0, (int) (byte) 0);
        int int56 = zipArchiveInputStream28.read(byteArray49, (int) '4', (int) '#');
        java.io.InputStream inputStream57 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream58 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream57);
        zipArchiveInputStream58.mark(100);
        long long62 = zipArchiveInputStream58.skip((long) 1);
        byte[] byteArray64 = zipArchiveInputStream58.readNBytes((int) ' ');
        int int65 = zipArchiveInputStream28.read(byteArray64);
        int int68 = zipArchiveInputStream1.read(byteArray64, (int) (short) 10, (int) '#');
        boolean boolean70 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray64, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry29);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] {});
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        zipArchiveInputStream1.mark((int) (byte) 100);
        int int8 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveInputStream1.canReadEntryData(archiveEntry9);
        int int11 = zipArchiveInputStream1.read();
        int int12 = zipArchiveInputStream1.read();
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        boolean boolean19 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray17, 0);
        int int20 = zipArchiveInputStream1.read(byteArray17);
        byte[] byteArray22 = zipArchiveInputStream1.readNBytes(0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveInputStream1.canReadEntryData(archiveEntry6);
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        zipArchiveInputStream9.mark(100);
        byte[] byteArray13 = zipArchiveInputStream9.readNBytes(0);
        int int16 = zipArchiveInputStream1.read(byteArray13, (int) (short) 100, (int) (byte) 0);
        byte[] byteArray17 = zipArchiveInputStream1.readAllBytes();
        int int18 = zipArchiveInputStream1.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray20 = zipArchiveInputStream19.readAllBytes();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        zipArchiveInputStream6.close();
        zipArchiveInputStream6.close();
        int int9 = zipArchiveInputStream6.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = zipArchiveInputStream6.getNextEntry();
        int int11 = zipArchiveInputStream6.getCount();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = zipArchiveInputStream6.skip((long) 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The stream is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(archiveEntry10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream5);
        zipArchiveInputStream6.mark(100);
        byte[] byteArray10 = zipArchiveInputStream6.readNBytes(0);
        int int11 = zipArchiveInputStream1.read(byteArray10);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveInputStream1.canReadEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray16 = zipArchiveInputStream1.readNBytes((int) ' ');
        zipArchiveInputStream1.mark(1);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream19);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream20);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = zipArchiveInputStream21.getNextZipEntry();
        byte[] byteArray23 = zipArchiveInputStream21.readAllBytes();
        int int26 = zipArchiveInputStream1.read(byteArray23, 0, (-1));
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 0 };
        boolean boolean34 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray32, (-1));
        int int35 = zipArchiveInputStream1.read(byteArray32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNull(zipArchiveEntry22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray3 = new byte[] {};
        int int6 = zipArchiveInputStream2.read(byteArray3, (-1), 0);
        long long8 = zipArchiveInputStream2.skip((long) (short) 0);
        byte[] byteArray9 = zipArchiveInputStream2.readAllBytes();
        int int10 = zipArchiveInputStream2.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream2.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        int int14 = zipArchiveInputStream13.available();
        long long16 = zipArchiveInputStream13.skip(0L);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int7 = zipArchiveInputStream6.available();
        zipArchiveInputStream6.mark((int) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        int int11 = zipArchiveInputStream10.read();
        boolean boolean12 = zipArchiveInputStream10.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = zipArchiveInputStream10.getNextZipEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10, "hi!", false, false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(zipArchiveEntry13);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream3);
        boolean boolean5 = zipArchiveInputStream4.markSupported();
        zipArchiveInputStream4.mark((int) '4');
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        zipArchiveInputStream9.mark(100);
        byte[] byteArray13 = zipArchiveInputStream9.readNBytes(0);
        int int14 = zipArchiveInputStream4.read(byteArray13);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = zipArchiveInputStream4.canReadEntryData(archiveEntry15);
        int int17 = zipArchiveInputStream4.getCount();
        byte[] byteArray18 = zipArchiveInputStream4.readAllBytes();
        int int19 = zipArchiveInputStream1.read(byteArray18);
        zipArchiveInputStream1.mark((int) (short) 10);
        boolean boolean22 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) (short) 10);
        zipArchiveInputStream1.mark((int) (short) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry27 = null;
        boolean boolean28 = zipArchiveInputStream1.canReadEntryData(archiveEntry27);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        zipArchiveInputStream8.mark(100);
        byte[] byteArray12 = zipArchiveInputStream8.readNBytes(0);
        int int13 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean14 = zipArchiveInputStream1.markSupported();
        boolean boolean15 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = zipArchiveInputStream16.getNextEntry();
        zipArchiveInputStream16.mark((int) '4');
        byte[] byteArray21 = zipArchiveInputStream16.readNBytes((int) ' ');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(archiveEntry17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        int int4 = zipArchiveInputStream2.getCount();
        long long5 = zipArchiveInputStream2.getBytesRead();
        long long6 = zipArchiveInputStream2.getBytesRead();
        int int7 = zipArchiveInputStream2.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = zipArchiveInputStream2.getNextZipEntry();
        byte[] byteArray10 = zipArchiveInputStream2.readNBytes((int) (byte) 0);
        long long11 = zipArchiveInputStream2.getBytesRead();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveInputStream2.canReadEntryData(archiveEntry12);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry8);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        int int4 = zipArchiveInputStream2.getCount();
        byte[] byteArray6 = zipArchiveInputStream2.readNBytes((int) ' ');
        byte[] byteArray7 = zipArchiveInputStream2.readAllBytes();
        boolean boolean8 = zipArchiveInputStream2.markSupported();
        zipArchiveInputStream2.mark((int) '4');
        long long11 = zipArchiveInputStream2.getBytesRead();
        zipArchiveInputStream2.mark((int) (short) 100);
        zipArchiveInputStream2.close();
        zipArchiveInputStream2.close();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0, "", true, true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int7 = zipArchiveInputStream6.read();
        int int8 = zipArchiveInputStream6.getCount();
        zipArchiveInputStream6.mark((int) (short) 0);
        int int11 = zipArchiveInputStream6.getCount();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        zipArchiveInputStream8.mark(100);
        byte[] byteArray12 = zipArchiveInputStream8.readNBytes(0);
        int int13 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean14 = zipArchiveInputStream1.markSupported();
        boolean boolean15 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = zipArchiveInputStream16.getNextEntry();
        zipArchiveInputStream16.mark((int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = zipArchiveInputStream16.getNextZipEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream16);
        long long22 = zipArchiveInputStream16.getBytesRead();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(archiveEntry17);
        org.junit.Assert.assertNull(zipArchiveEntry20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int7 = zipArchiveInputStream6.read();
        int int8 = zipArchiveInputStream6.getCount();
        zipArchiveInputStream6.mark((int) (short) 0);
        long long12 = zipArchiveInputStream6.skip((long) 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        zipArchiveInputStream6.close();
        zipArchiveInputStream6.close();
        zipArchiveInputStream6.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = zipArchiveInputStream6.getNextZipEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = zipArchiveInputStream6.getNextZipEntry();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = zipArchiveInputStream6.readAllBytes();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The stream is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNull(zipArchiveEntry10);
        org.junit.Assert.assertNull(zipArchiveEntry11);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        long long6 = zipArchiveInputStream1.skip((long) (short) 10);
        zipArchiveInputStream1.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int11 = zipArchiveInputStream1.read();
        int int12 = zipArchiveInputStream1.available();
        long long13 = zipArchiveInputStream1.getBytesRead();
        long long14 = zipArchiveInputStream1.getBytesRead();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray3 = new byte[] {};
        int int6 = zipArchiveInputStream2.read(byteArray3, (-1), 0);
        byte[] byteArray8 = zipArchiveInputStream2.readNBytes((int) (short) 10);
        int int9 = zipArchiveInputStream2.available();
        zipArchiveInputStream2.mark(100);
        zipArchiveInputStream2.close();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long4 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.mark((int) (byte) 0);
        int int7 = zipArchiveInputStream1.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        long long10 = zipArchiveInputStream1.skip((long) (byte) 100);
        zipArchiveInputStream1.mark(0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveInputStream1.canReadEntryData(archiveEntry6);
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        zipArchiveInputStream9.mark(100);
        byte[] byteArray13 = zipArchiveInputStream9.readNBytes(0);
        zipArchiveInputStream9.mark((int) (byte) 100);
        int int16 = zipArchiveInputStream9.getCount();
        byte[] byteArray17 = zipArchiveInputStream9.readAllBytes();
        int int18 = zipArchiveInputStream1.read(byteArray17);
        zipArchiveInputStream1.mark((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray22 = zipArchiveInputStream1.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        int int6 = zipArchiveInputStream1.read();
        byte[] byteArray7 = zipArchiveInputStream1.readAllBytes();
        int int8 = zipArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveInputStream1.canReadEntryData(archiveEntry9);
        boolean boolean11 = zipArchiveInputStream1.markSupported();
        byte[] byteArray12 = zipArchiveInputStream1.readAllBytes();
        int int13 = zipArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "hi!", true, true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        int int5 = zipArchiveInputStream2.getCount();
        int int6 = zipArchiveInputStream2.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveInputStream2.canReadEntryData(archiveEntry7);
        zipArchiveInputStream2.close();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.close();
        boolean boolean4 = zipArchiveInputStream1.markSupported();
        long long5 = zipArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveInputStream1.canReadEntryData(archiveEntry6);
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        zipArchiveInputStream9.mark(100);
        byte[] byteArray13 = zipArchiveInputStream9.readNBytes(0);
        int int16 = zipArchiveInputStream1.read(byteArray13, (int) (short) 100, (int) (byte) 0);
        int int17 = zipArchiveInputStream1.available();
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream18);
        long long20 = zipArchiveInputStream19.getBytesRead();
        long long21 = zipArchiveInputStream19.getBytesRead();
        int int22 = zipArchiveInputStream19.read();
        int int23 = zipArchiveInputStream19.available();
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream24);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream25);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = zipArchiveInputStream26.getNextZipEntry();
        java.io.InputStream inputStream28 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream28);
        zipArchiveInputStream29.mark(100);
        byte[] byteArray33 = zipArchiveInputStream29.readNBytes(0);
        zipArchiveInputStream29.mark((int) (byte) 100);
        int int36 = zipArchiveInputStream29.getCount();
        java.io.InputStream inputStream37 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream38 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream37);
        boolean boolean39 = zipArchiveInputStream38.markSupported();
        zipArchiveInputStream38.mark((int) '4');
        java.io.InputStream inputStream42 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream43 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream42);
        zipArchiveInputStream43.mark(100);
        byte[] byteArray47 = zipArchiveInputStream43.readNBytes(0);
        int int48 = zipArchiveInputStream38.read(byteArray47);
        int int51 = zipArchiveInputStream29.readNBytes(byteArray47, 0, (int) (byte) 0);
        int int54 = zipArchiveInputStream26.read(byteArray47, (int) '4', (int) '#');
        int int55 = zipArchiveInputStream19.read(byteArray47);
        java.io.InputStream inputStream56 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream57 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream56);
        zipArchiveInputStream57.mark(100);
        long long61 = zipArchiveInputStream57.skip((long) 1);
        boolean boolean62 = zipArchiveInputStream57.markSupported();
        java.io.InputStream inputStream63 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream64 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream63);
        zipArchiveInputStream64.mark(100);
        byte[] byteArray68 = zipArchiveInputStream64.readNBytes(0);
        int int69 = zipArchiveInputStream57.read(byteArray68);
        int int72 = zipArchiveInputStream19.read(byteArray68, (int) (short) -1, (int) (byte) 100);
        int int73 = zipArchiveInputStream1.read(byteArray68);
        int int74 = zipArchiveInputStream1.available();
        boolean boolean75 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry76 = null;
        boolean boolean77 = zipArchiveInputStream1.canReadEntryData(archiveEntry76);
        zipArchiveInputStream1.mark((int) (short) 0);
        long long81 = zipArchiveInputStream1.skip((long) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(zipArchiveEntry27);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] {});
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        int int6 = zipArchiveInputStream1.read();
        byte[] byteArray7 = zipArchiveInputStream1.readAllBytes();
        long long8 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.close();
        boolean boolean10 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = zipArchiveInputStream1.getNextZipEntry();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(zipArchiveEntry11);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        byte[] byteArray4 = zipArchiveInputStream2.readAllBytes();
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        boolean boolean11 = zipArchiveInputStream10.markSupported();
        zipArchiveInputStream10.mark((int) '4');
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream14);
        zipArchiveInputStream15.mark(100);
        byte[] byteArray19 = zipArchiveInputStream15.readNBytes(0);
        int int20 = zipArchiveInputStream10.read(byteArray19);
        int int23 = zipArchiveInputStream7.read(byteArray19, (int) (short) -1, (int) (byte) 1);
        int int26 = zipArchiveInputStream2.read(byteArray19, 100, 0);
        zipArchiveInputStream2.close();
        zipArchiveInputStream2.mark((int) (short) 10);
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        long long6 = zipArchiveInputStream1.getBytesRead();
        byte[] byteArray7 = zipArchiveInputStream1.readAllBytes();
        zipArchiveInputStream1.mark((int) (short) 10);
        byte[] byteArray11 = zipArchiveInputStream1.readNBytes(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveInputStream1.canReadEntryData(archiveEntry6);
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        zipArchiveInputStream9.mark(100);
        byte[] byteArray13 = zipArchiveInputStream9.readNBytes(0);
        zipArchiveInputStream9.mark((int) (byte) 100);
        int int16 = zipArchiveInputStream9.getCount();
        byte[] byteArray17 = zipArchiveInputStream9.readAllBytes();
        int int18 = zipArchiveInputStream1.read(byteArray17);
        zipArchiveInputStream1.mark((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        zipArchiveInputStream21.close();
        long long23 = zipArchiveInputStream21.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream21, "", true, true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        long long6 = zipArchiveInputStream1.skip((long) (short) 10);
        zipArchiveInputStream1.mark((int) (short) -1);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        byte[] byteArray12 = new byte[] {};
        int int15 = zipArchiveInputStream11.read(byteArray12, (-1), 0);
        int int16 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean17 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream19);
        zipArchiveInputStream20.mark(100);
        long long24 = zipArchiveInputStream20.skip((long) 1);
        byte[] byteArray26 = zipArchiveInputStream20.readNBytes(100);
        java.io.InputStream inputStream27 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream27);
        zipArchiveInputStream28.mark(100);
        byte[] byteArray32 = zipArchiveInputStream28.readNBytes(0);
        zipArchiveInputStream28.mark((int) (byte) 100);
        int int35 = zipArchiveInputStream28.getCount();
        byte[] byteArray36 = zipArchiveInputStream28.readAllBytes();
        int int37 = zipArchiveInputStream20.read(byteArray36);
        int int38 = zipArchiveInputStream18.read(byteArray36);
        java.io.InputStream inputStream39 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream40 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream39);
        boolean boolean41 = zipArchiveInputStream40.markSupported();
        zipArchiveInputStream40.mark((int) '4');
        int int44 = zipArchiveInputStream40.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry45 = null;
        boolean boolean46 = zipArchiveInputStream40.canReadEntryData(archiveEntry45);
        java.io.InputStream inputStream47 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream48 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream47);
        zipArchiveInputStream48.mark(100);
        byte[] byteArray52 = zipArchiveInputStream48.readNBytes(0);
        zipArchiveInputStream48.mark((int) (byte) 100);
        int int55 = zipArchiveInputStream48.getCount();
        byte[] byteArray56 = zipArchiveInputStream48.readAllBytes();
        int int57 = zipArchiveInputStream40.read(byteArray56);
        int int60 = zipArchiveInputStream18.read(byteArray56, (int) (byte) 1, (-1));
        byte[] byteArray61 = zipArchiveInputStream18.readAllBytes();
        int int62 = zipArchiveInputStream18.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry63 = null;
        boolean boolean64 = zipArchiveInputStream18.canReadEntryData(archiveEntry63);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] {});
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] {});
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        long long4 = zipArchiveInputStream1.skip((long) 0);
        byte[] byteArray5 = zipArchiveInputStream1.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = zipArchiveInputStream2.getNextEntry();
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream6);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        boolean boolean11 = zipArchiveInputStream10.markSupported();
        zipArchiveInputStream10.mark((int) '4');
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream14);
        zipArchiveInputStream15.mark(100);
        byte[] byteArray19 = zipArchiveInputStream15.readNBytes(0);
        int int20 = zipArchiveInputStream10.read(byteArray19);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = null;
        boolean boolean22 = zipArchiveInputStream10.canReadEntryData(archiveEntry21);
        int int23 = zipArchiveInputStream10.getCount();
        byte[] byteArray24 = zipArchiveInputStream10.readAllBytes();
        int int25 = zipArchiveInputStream7.read(byteArray24);
        byte[] byteArray26 = zipArchiveInputStream7.readAllBytes();
        int int27 = zipArchiveInputStream2.read(byteArray26);
        java.io.InputStream inputStream28 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream28);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream29);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream31 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream30);
        int int32 = zipArchiveInputStream30.getCount();
        byte[] byteArray34 = zipArchiveInputStream30.readNBytes((int) ' ');
        byte[] byteArray35 = zipArchiveInputStream30.readAllBytes();
        int int36 = zipArchiveInputStream2.read(byteArray35);
        int int37 = zipArchiveInputStream2.available();
        long long38 = zipArchiveInputStream2.getBytesRead();
        zipArchiveInputStream2.mark((int) 'a');
        org.junit.Assert.assertNull(archiveEntry5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        boolean boolean3 = zipArchiveInputStream2.markSupported();
        long long5 = zipArchiveInputStream2.skip((long) (byte) 1);
        zipArchiveInputStream2.close();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveInputStream2.canReadEntryData(archiveEntry7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        byte[] byteArray7 = zipArchiveInputStream1.readAllBytes();
        zipArchiveInputStream1.mark((-1));
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream11);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream12);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream14);
        boolean boolean16 = zipArchiveInputStream15.markSupported();
        zipArchiveInputStream15.mark((int) '4');
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream19);
        zipArchiveInputStream20.mark(100);
        byte[] byteArray24 = zipArchiveInputStream20.readNBytes(0);
        int int25 = zipArchiveInputStream15.read(byteArray24);
        int int28 = zipArchiveInputStream12.read(byteArray24, (int) (short) -1, (int) (byte) 1);
        int int31 = zipArchiveInputStream1.read(byteArray24, (int) '#', 10);
        int int32 = zipArchiveInputStream1.read();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        long long3 = zipArchiveInputStream1.getBytesRead();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream4);
        zipArchiveInputStream5.mark(100);
        long long9 = zipArchiveInputStream5.skip((long) 1);
        byte[] byteArray11 = zipArchiveInputStream5.readNBytes(100);
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream12);
        zipArchiveInputStream13.mark(100);
        byte[] byteArray17 = zipArchiveInputStream13.readNBytes(0);
        zipArchiveInputStream13.mark((int) (byte) 100);
        int int20 = zipArchiveInputStream13.getCount();
        byte[] byteArray21 = zipArchiveInputStream13.readAllBytes();
        int int22 = zipArchiveInputStream5.read(byteArray21);
        int int25 = zipArchiveInputStream1.read(byteArray21, (int) (short) 0, 0);
        java.io.InputStream inputStream26 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream26);
        boolean boolean28 = zipArchiveInputStream27.markSupported();
        zipArchiveInputStream27.mark((int) '4');
        long long32 = zipArchiveInputStream27.skip((long) (short) 10);
        zipArchiveInputStream27.mark((int) (short) -1);
        java.io.InputStream inputStream35 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream36 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream35);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream37 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream36);
        byte[] byteArray38 = new byte[] {};
        int int41 = zipArchiveInputStream37.read(byteArray38, (-1), 0);
        int int42 = zipArchiveInputStream27.read(byteArray38);
        int int43 = zipArchiveInputStream1.read(byteArray38);
        int int44 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry45 = null;
        boolean boolean46 = zipArchiveInputStream1.canReadEntryData(archiveEntry45);
        boolean boolean47 = zipArchiveInputStream1.markSupported();
        byte[] byteArray49 = zipArchiveInputStream1.readNBytes((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        zipArchiveInputStream1.mark((int) (byte) 100);
        int int8 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveInputStream1.canReadEntryData(archiveEntry9);
        int int11 = zipArchiveInputStream1.read();
        long long13 = zipArchiveInputStream1.skip((long) (byte) 0);
        zipArchiveInputStream1.close();
        int int15 = zipArchiveInputStream1.available();
        java.io.OutputStream outputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = zipArchiveInputStream1.transferTo(outputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveInputStream1.canReadEntryData(archiveEntry6);
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        zipArchiveInputStream9.mark(100);
        byte[] byteArray13 = zipArchiveInputStream9.readNBytes(0);
        int int16 = zipArchiveInputStream1.read(byteArray13, (int) (short) 100, (int) (byte) 0);
        java.io.InputStream inputStream17 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream17);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream18);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream19);
        byte[] byteArray22 = zipArchiveInputStream19.readNBytes((int) (byte) 10);
        int int25 = zipArchiveInputStream1.read(byteArray22, (int) (short) 100, (int) (byte) 0);
        byte[] byteArray26 = zipArchiveInputStream1.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream3);
        boolean boolean5 = zipArchiveInputStream4.markSupported();
        zipArchiveInputStream4.mark((int) '4');
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        zipArchiveInputStream9.mark(100);
        byte[] byteArray13 = zipArchiveInputStream9.readNBytes(0);
        int int14 = zipArchiveInputStream4.read(byteArray13);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = zipArchiveInputStream4.canReadEntryData(archiveEntry15);
        int int17 = zipArchiveInputStream4.getCount();
        byte[] byteArray18 = zipArchiveInputStream4.readAllBytes();
        int int19 = zipArchiveInputStream1.read(byteArray18);
        byte[] byteArray20 = zipArchiveInputStream1.readAllBytes();
        java.io.InputStream inputStream21 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream21);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream22);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = zipArchiveInputStream23.getNextZipEntry();
        byte[] byteArray25 = zipArchiveInputStream23.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = zipArchiveInputStream23.getNextZipEntry();
        java.io.InputStream inputStream27 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream27);
        boolean boolean29 = zipArchiveInputStream28.markSupported();
        zipArchiveInputStream28.mark((int) '4');
        java.io.InputStream inputStream32 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream32);
        zipArchiveInputStream33.mark(100);
        byte[] byteArray37 = zipArchiveInputStream33.readNBytes(0);
        int int38 = zipArchiveInputStream28.read(byteArray37);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry39 = null;
        boolean boolean40 = zipArchiveInputStream28.canReadEntryData(archiveEntry39);
        int int41 = zipArchiveInputStream28.getCount();
        java.io.InputStream inputStream42 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream43 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream42);
        long long44 = zipArchiveInputStream43.getBytesRead();
        long long45 = zipArchiveInputStream43.getBytesRead();
        int int46 = zipArchiveInputStream43.read();
        byte[] byteArray47 = zipArchiveInputStream43.readAllBytes();
        int int50 = zipArchiveInputStream28.read(byteArray47, (int) (byte) 100, (int) (short) 0);
        int int51 = zipArchiveInputStream23.read(byteArray47);
        java.io.InputStream inputStream52 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream53 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream52);
        zipArchiveInputStream53.mark(100);
        boolean boolean56 = zipArchiveInputStream53.markSupported();
        int int57 = zipArchiveInputStream53.getCount();
        byte[] byteArray59 = zipArchiveInputStream53.readNBytes((int) (byte) 0);
        int int60 = zipArchiveInputStream23.read(byteArray59);
        int int61 = zipArchiveInputStream1.read(byteArray59);
        long long63 = zipArchiveInputStream1.skip((long) (byte) 1);
        java.io.InputStream inputStream64 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream65 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream64);
        boolean boolean66 = zipArchiveInputStream65.markSupported();
        zipArchiveInputStream65.mark((int) '4');
        int int69 = zipArchiveInputStream65.getCount();
        int int70 = zipArchiveInputStream65.read();
        byte[] byteArray71 = zipArchiveInputStream65.readAllBytes();
        long long72 = zipArchiveInputStream65.getBytesRead();
        byte[] byteArray74 = zipArchiveInputStream65.readNBytes(10);
        int int77 = zipArchiveInputStream1.read(byteArray74, (int) (short) 100, (int) '#');
        byte[] byteArray78 = zipArchiveInputStream1.readAllBytes();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNull(zipArchiveEntry24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNull(zipArchiveEntry26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] {});
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] {});
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] {});
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] {});
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        zipArchiveInputStream1.mark((int) (byte) 100);
        int int8 = zipArchiveInputStream1.read();
        int int9 = zipArchiveInputStream1.getCount();
        long long11 = zipArchiveInputStream1.skip(0L);
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream12);
        boolean boolean14 = zipArchiveInputStream13.markSupported();
        zipArchiveInputStream13.mark((int) '4');
        int int17 = zipArchiveInputStream13.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = zipArchiveInputStream13.canReadEntryData(archiveEntry18);
        java.io.InputStream inputStream20 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream20);
        zipArchiveInputStream21.mark(100);
        byte[] byteArray25 = zipArchiveInputStream21.readNBytes(0);
        int int28 = zipArchiveInputStream13.read(byteArray25, (int) (short) 100, (int) (byte) 0);
        byte[] byteArray29 = zipArchiveInputStream13.readAllBytes();
        int int30 = zipArchiveInputStream1.read(byteArray29);
        java.io.InputStream inputStream31 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream31);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream32);
        byte[] byteArray34 = new byte[] {};
        int int37 = zipArchiveInputStream33.read(byteArray34, (-1), 0);
        int int40 = zipArchiveInputStream1.read(byteArray34, 1, (int) (byte) -1);
        java.io.InputStream inputStream41 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream42 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream41);
        boolean boolean43 = zipArchiveInputStream42.markSupported();
        zipArchiveInputStream42.mark((int) '4');
        int int46 = zipArchiveInputStream42.getCount();
        int int47 = zipArchiveInputStream42.read();
        byte[] byteArray48 = zipArchiveInputStream42.readAllBytes();
        int int49 = zipArchiveInputStream42.available();
        boolean boolean50 = zipArchiveInputStream42.markSupported();
        byte[] byteArray51 = zipArchiveInputStream42.readAllBytes();
        int int52 = zipArchiveInputStream1.read(byteArray51);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry53 = zipArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        zipArchiveInputStream1.mark((int) (byte) 100);
        int int8 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveInputStream1.canReadEntryData(archiveEntry9);
        boolean boolean11 = zipArchiveInputStream1.markSupported();
        boolean boolean12 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.close();
        int int14 = zipArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = null;
        boolean boolean17 = zipArchiveInputStream1.canReadEntryData(archiveEntry16);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = zipArchiveInputStream1.getNextZipEntry();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(archiveEntry15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(zipArchiveEntry18);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        long long6 = zipArchiveInputStream1.skip((long) (short) 10);
        zipArchiveInputStream1.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream14);
        zipArchiveInputStream15.mark(100);
        byte[] byteArray19 = zipArchiveInputStream15.readNBytes(0);
        zipArchiveInputStream15.mark((int) (byte) 100);
        int int22 = zipArchiveInputStream15.getCount();
        java.io.InputStream inputStream23 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream23);
        boolean boolean25 = zipArchiveInputStream24.markSupported();
        zipArchiveInputStream24.mark((int) '4');
        java.io.InputStream inputStream28 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream28);
        zipArchiveInputStream29.mark(100);
        byte[] byteArray33 = zipArchiveInputStream29.readNBytes(0);
        int int34 = zipArchiveInputStream24.read(byteArray33);
        int int37 = zipArchiveInputStream15.readNBytes(byteArray33, 0, (int) (byte) 0);
        boolean boolean39 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray33, (int) (byte) 1);
        boolean boolean41 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray33, (int) (byte) -1);
        int int42 = zipArchiveInputStream13.read(byteArray33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark(100);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        boolean boolean11 = zipArchiveInputStream10.markSupported();
        zipArchiveInputStream10.mark((int) '4');
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream14);
        zipArchiveInputStream15.mark(100);
        byte[] byteArray19 = zipArchiveInputStream15.readNBytes(0);
        int int20 = zipArchiveInputStream10.read(byteArray19);
        int int23 = zipArchiveInputStream7.read(byteArray19, (int) (short) -1, (int) (byte) 1);
        int int26 = zipArchiveInputStream1.read(byteArray19, (int) (byte) -1, (int) ' ');
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        boolean boolean28 = zipArchiveInputStream1.markSupported();
        byte[] byteArray30 = zipArchiveInputStream1.readNBytes((int) '#');
        zipArchiveInputStream1.close();
        java.io.OutputStream outputStream32 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long33 = zipArchiveInputStream1.transferTo(outputStream32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        byte[] byteArray4 = zipArchiveInputStream2.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        long long7 = zipArchiveInputStream5.skip(0L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = zipArchiveInputStream5.getNextZipEntry();
        int int9 = zipArchiveInputStream5.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        byte[] byteArray12 = zipArchiveInputStream5.readNBytes((int) ' ');
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = zipArchiveInputStream5.getNextZipEntry();
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNull(zipArchiveEntry13);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        byte[] byteArray6 = zipArchiveInputStream1.readAllBytes();
        long long8 = zipArchiveInputStream1.skip((long) 1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveInputStream1.canReadEntryData(archiveEntry9);
        byte[] byteArray11 = zipArchiveInputStream1.readAllBytes();
        int int12 = zipArchiveInputStream1.available();
        boolean boolean13 = zipArchiveInputStream1.markSupported();
        long long14 = zipArchiveInputStream1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "", false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        zipArchiveInputStream8.mark(100);
        byte[] byteArray12 = zipArchiveInputStream8.readNBytes(0);
        int int13 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean14 = zipArchiveInputStream1.markSupported();
        boolean boolean15 = zipArchiveInputStream1.markSupported();
        byte[] byteArray17 = zipArchiveInputStream1.readNBytes((int) ' ');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = zipArchiveInputStream1.canReadEntryData(archiveEntry18);
        byte[] byteArray20 = null;
        int int23 = zipArchiveInputStream1.read(byteArray20, (int) '#', (int) (byte) 10);
        java.io.OutputStream outputStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long25 = zipArchiveInputStream1.transferTo(outputStream24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray3 = new byte[] {};
        int int6 = zipArchiveInputStream2.read(byteArray3, (-1), 0);
        long long8 = zipArchiveInputStream2.skip((long) (short) 0);
        long long9 = zipArchiveInputStream2.getBytesRead();
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream10);
        zipArchiveInputStream11.mark(100);
        byte[] byteArray15 = zipArchiveInputStream11.readNBytes(0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = null;
        boolean boolean17 = zipArchiveInputStream11.canReadEntryData(archiveEntry16);
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream18);
        boolean boolean20 = zipArchiveInputStream19.markSupported();
        zipArchiveInputStream19.mark(100);
        java.io.InputStream inputStream23 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream23);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream24);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream25);
        java.io.InputStream inputStream27 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream27);
        boolean boolean29 = zipArchiveInputStream28.markSupported();
        zipArchiveInputStream28.mark((int) '4');
        java.io.InputStream inputStream32 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream32);
        zipArchiveInputStream33.mark(100);
        byte[] byteArray37 = zipArchiveInputStream33.readNBytes(0);
        int int38 = zipArchiveInputStream28.read(byteArray37);
        int int41 = zipArchiveInputStream25.read(byteArray37, (int) (short) -1, (int) (byte) 1);
        int int44 = zipArchiveInputStream19.read(byteArray37, (int) (byte) -1, (int) ' ');
        int int45 = zipArchiveInputStream11.read(byteArray37);
        int int46 = zipArchiveInputStream2.read(byteArray37);
        java.lang.Class<?> wildcardClass47 = byteArray37.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        int int7 = zipArchiveInputStream1.getCount();
        int int8 = zipArchiveInputStream1.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray12 = zipArchiveInputStream10.readNBytes((int) (short) 100);
        long long13 = zipArchiveInputStream10.getBytesRead();
        boolean boolean14 = zipArchiveInputStream10.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = zipArchiveInputStream10.getNextZipEntry();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(zipArchiveEntry15);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        zipArchiveInputStream1.close();
        int int7 = zipArchiveInputStream1.getCount();
        zipArchiveInputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        long long11 = zipArchiveInputStream9.skip(1L);
        zipArchiveInputStream9.mark(1);
        int int14 = zipArchiveInputStream9.read();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        zipArchiveInputStream1.mark((int) (byte) 100);
        int int8 = zipArchiveInputStream1.getCount();
        long long10 = zipArchiveInputStream1.skip((long) (byte) 0);
        int int11 = zipArchiveInputStream1.getCount();
        long long12 = zipArchiveInputStream1.getBytesRead();
        boolean boolean13 = zipArchiveInputStream1.markSupported();
        byte[] byteArray14 = zipArchiveInputStream1.readAllBytes();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream5);
        zipArchiveInputStream6.mark(100);
        byte[] byteArray10 = zipArchiveInputStream6.readNBytes(0);
        int int11 = zipArchiveInputStream1.read(byteArray10);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveInputStream1.canReadEntryData(archiveEntry12);
        int int14 = zipArchiveInputStream1.getCount();
        byte[] byteArray15 = zipArchiveInputStream1.readAllBytes();
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream16);
        boolean boolean18 = zipArchiveInputStream17.markSupported();
        zipArchiveInputStream17.mark((int) '4');
        java.io.InputStream inputStream21 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream21);
        zipArchiveInputStream22.mark(100);
        byte[] byteArray26 = zipArchiveInputStream22.readNBytes(0);
        int int27 = zipArchiveInputStream17.read(byteArray26);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = null;
        boolean boolean29 = zipArchiveInputStream17.canReadEntryData(archiveEntry28);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream17);
        byte[] byteArray32 = zipArchiveInputStream17.readNBytes((int) ' ');
        zipArchiveInputStream17.mark(1);
        java.io.InputStream inputStream35 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream36 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream35);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream37 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream36);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry38 = zipArchiveInputStream37.getNextZipEntry();
        byte[] byteArray39 = zipArchiveInputStream37.readAllBytes();
        int int42 = zipArchiveInputStream17.read(byteArray39, 0, (-1));
        int int45 = zipArchiveInputStream1.read(byteArray39, (int) (byte) -1, 1);
        int int46 = zipArchiveInputStream1.available();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNull(zipArchiveEntry38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        zipArchiveInputStream8.mark(100);
        byte[] byteArray12 = zipArchiveInputStream8.readNBytes(0);
        int int13 = zipArchiveInputStream1.read(byteArray12);
        int int14 = zipArchiveInputStream1.available();
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream15);
        zipArchiveInputStream16.mark(100);
        long long20 = zipArchiveInputStream16.skip((long) 1);
        byte[] byteArray21 = zipArchiveInputStream16.readAllBytes();
        int int22 = zipArchiveInputStream1.read(byteArray21);
        int int23 = zipArchiveInputStream1.getCount();
        byte[] byteArray25 = zipArchiveInputStream1.readNBytes(1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry26 = null;
        boolean boolean27 = zipArchiveInputStream1.canReadEntryData(archiveEntry26);
        long long29 = zipArchiveInputStream1.skip((long) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray3 = new byte[] {};
        int int6 = zipArchiveInputStream2.read(byteArray3, (-1), 0);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        boolean boolean9 = zipArchiveInputStream8.markSupported();
        zipArchiveInputStream8.mark((int) '4');
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream12);
        zipArchiveInputStream13.mark(100);
        byte[] byteArray17 = zipArchiveInputStream13.readNBytes(0);
        int int18 = zipArchiveInputStream8.read(byteArray17);
        int int19 = zipArchiveInputStream2.read(byteArray17);
        int int20 = zipArchiveInputStream2.available();
        boolean boolean21 = zipArchiveInputStream2.markSupported();
        byte[] byteArray22 = zipArchiveInputStream2.readAllBytes();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = null;
        boolean boolean24 = zipArchiveInputStream2.canReadEntryData(archiveEntry23);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry25 = zipArchiveInputStream2.getNextEntry();
        int int26 = zipArchiveInputStream2.getCount();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(archiveEntry25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        int int7 = zipArchiveInputStream1.getCount();
        zipArchiveInputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "", false, false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray3 = new byte[] {};
        int int6 = zipArchiveInputStream2.read(byteArray3, (-1), 0);
        long long8 = zipArchiveInputStream2.skip((long) (short) 0);
        byte[] byteArray9 = zipArchiveInputStream2.readAllBytes();
        long long10 = zipArchiveInputStream2.getBytesRead();
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream11);
        zipArchiveInputStream12.mark(100);
        long long16 = zipArchiveInputStream12.skip((long) 1);
        boolean boolean17 = zipArchiveInputStream12.markSupported();
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream18);
        zipArchiveInputStream19.mark(100);
        byte[] byteArray23 = zipArchiveInputStream19.readNBytes(0);
        int int24 = zipArchiveInputStream12.read(byteArray23);
        boolean boolean25 = zipArchiveInputStream12.markSupported();
        boolean boolean26 = zipArchiveInputStream12.markSupported();
        byte[] byteArray28 = zipArchiveInputStream12.readNBytes((int) ' ');
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        boolean boolean35 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray33, 0);
        int int36 = zipArchiveInputStream12.read(byteArray33);
        boolean boolean38 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray33, 0);
        int int41 = zipArchiveInputStream2.read(byteArray33, (int) (short) 1, (int) (short) 0);
        int int42 = zipArchiveInputStream2.getCount();
        int int43 = zipArchiveInputStream2.available();
        zipArchiveInputStream2.close();
        int int45 = zipArchiveInputStream2.getCount();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        int int6 = zipArchiveInputStream1.getCount();
        long long8 = zipArchiveInputStream1.skip((long) '#');
        int int9 = zipArchiveInputStream1.getCount();
        long long11 = zipArchiveInputStream1.skip((long) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream13);
        boolean boolean15 = zipArchiveInputStream14.markSupported();
        zipArchiveInputStream14.mark((int) '4');
        int int18 = zipArchiveInputStream14.getCount();
        long long20 = zipArchiveInputStream14.skip((long) 0);
        boolean boolean21 = zipArchiveInputStream14.markSupported();
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream22);
        zipArchiveInputStream23.mark(100);
        long long27 = zipArchiveInputStream23.skip((long) 1);
        byte[] byteArray29 = zipArchiveInputStream23.readNBytes((int) ' ');
        int int32 = zipArchiveInputStream14.read(byteArray29, (int) (byte) 100, (int) '#');
        byte[] byteArray34 = zipArchiveInputStream14.readNBytes((int) (short) 10);
        int int37 = zipArchiveInputStream1.read(byteArray34, 1, (int) (short) 10);
        java.io.InputStream inputStream38 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream39 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream38);
        boolean boolean40 = zipArchiveInputStream39.markSupported();
        zipArchiveInputStream39.mark((int) '4');
        int int43 = zipArchiveInputStream39.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry44 = null;
        boolean boolean45 = zipArchiveInputStream39.canReadEntryData(archiveEntry44);
        java.io.InputStream inputStream46 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream47 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream46);
        zipArchiveInputStream47.mark(100);
        byte[] byteArray51 = zipArchiveInputStream47.readNBytes(0);
        int int54 = zipArchiveInputStream39.read(byteArray51, (int) (short) 100, (int) (byte) 0);
        byte[] byteArray55 = zipArchiveInputStream39.readAllBytes();
        zipArchiveInputStream39.mark(0);
        byte[] byteArray58 = zipArchiveInputStream39.readAllBytes();
        int int59 = zipArchiveInputStream1.read(byteArray58);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry60 = null;
        boolean boolean61 = zipArchiveInputStream1.canReadEntryData(archiveEntry60);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream62 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        long long63 = zipArchiveInputStream1.getBytesRead();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] {});
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        boolean boolean3 = zipArchiveInputStream2.markSupported();
        long long5 = zipArchiveInputStream2.skip((long) (byte) 1);
        byte[] byteArray6 = zipArchiveInputStream2.readAllBytes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        long long6 = zipArchiveInputStream1.skip((long) (short) 10);
        zipArchiveInputStream1.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream9);
        int int11 = zipArchiveInputStream10.available();
        byte[] byteArray12 = zipArchiveInputStream10.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        long long15 = zipArchiveInputStream10.skip((long) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        long long6 = zipArchiveInputStream1.skip((long) (short) 10);
        zipArchiveInputStream1.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream9);
        int int11 = zipArchiveInputStream10.available();
        byte[] byteArray12 = zipArchiveInputStream10.readAllBytes();
        byte[] byteArray13 = zipArchiveInputStream10.readAllBytes();
        zipArchiveInputStream10.mark((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        long long6 = zipArchiveInputStream1.skip((long) (short) 10);
        zipArchiveInputStream1.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = zipArchiveInputStream10.getNextZipEntry();
        java.lang.Class<?> wildcardClass12 = zipArchiveInputStream10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream4);
        boolean boolean6 = zipArchiveInputStream5.markSupported();
        zipArchiveInputStream5.mark((int) '4');
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        zipArchiveInputStream10.mark(100);
        byte[] byteArray14 = zipArchiveInputStream10.readNBytes(0);
        int int15 = zipArchiveInputStream5.read(byteArray14);
        int int18 = zipArchiveInputStream2.read(byteArray14, (int) (short) -1, (int) (byte) 1);
        boolean boolean19 = zipArchiveInputStream2.markSupported();
        byte[] byteArray20 = zipArchiveInputStream2.readAllBytes();
        byte[] byteArray21 = zipArchiveInputStream2.readAllBytes();
        boolean boolean22 = zipArchiveInputStream2.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        byte[] byteArray24 = zipArchiveInputStream23.readAllBytes();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        long long3 = zipArchiveInputStream1.getBytesRead();
        long long4 = zipArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveInputStream1.canReadEntryData(archiveEntry5);
        byte[] byteArray8 = zipArchiveInputStream1.readNBytes((int) (short) 1);
        byte[] byteArray9 = null;
        int int12 = zipArchiveInputStream1.read(byteArray9, (int) (short) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = zipArchiveInputStream1.getNextZipEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        zipArchiveInputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = zipArchiveInputStream1.getNextZipEntry();
        long long8 = zipArchiveInputStream1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = zipArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The stream is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        zipArchiveInputStream8.mark(100);
        byte[] byteArray12 = zipArchiveInputStream8.readNBytes(0);
        int int13 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean14 = zipArchiveInputStream1.markSupported();
        boolean boolean15 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = zipArchiveInputStream16.getNextEntry();
        int int18 = zipArchiveInputStream16.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream16);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = zipArchiveInputStream16.getNextEntry();
        int int21 = zipArchiveInputStream16.read();
        int int22 = zipArchiveInputStream16.available();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(archiveEntry17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(archiveEntry20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int7 = zipArchiveInputStream6.available();
        zipArchiveInputStream6.close();
        int int9 = zipArchiveInputStream6.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveInputStream6.canReadEntryData(archiveEntry10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        long long14 = zipArchiveInputStream12.skip((long) 'a');
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream15);
        boolean boolean17 = zipArchiveInputStream16.markSupported();
        zipArchiveInputStream16.mark((int) '4');
        long long21 = zipArchiveInputStream16.skip((long) (short) 10);
        zipArchiveInputStream16.mark((int) (short) -1);
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream24);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream25);
        byte[] byteArray27 = new byte[] {};
        int int30 = zipArchiveInputStream26.read(byteArray27, (-1), 0);
        int int31 = zipArchiveInputStream16.read(byteArray27);
        boolean boolean32 = zipArchiveInputStream16.markSupported();
        byte[] byteArray33 = zipArchiveInputStream16.readAllBytes();
        boolean boolean34 = zipArchiveInputStream16.markSupported();
        byte[] byteArray35 = zipArchiveInputStream16.readAllBytes();
        boolean boolean37 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray35, (int) (byte) 1);
        int int38 = zipArchiveInputStream12.read(byteArray35);
        long long39 = zipArchiveInputStream12.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry40 = zipArchiveInputStream12.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The stream is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        zipArchiveInputStream1.close();
        int int7 = zipArchiveInputStream1.getCount();
        zipArchiveInputStream1.close();
        java.lang.Class<?> wildcardClass9 = zipArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        long long3 = zipArchiveInputStream1.getBytesRead();
        int int4 = zipArchiveInputStream1.read();
        long long5 = zipArchiveInputStream1.getBytesRead();
        long long7 = zipArchiveInputStream1.skip((long) ' ');
        zipArchiveInputStream1.mark((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "", false, true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        int int6 = zipArchiveInputStream1.read();
        byte[] byteArray7 = zipArchiveInputStream1.readAllBytes();
        long long8 = zipArchiveInputStream1.getBytesRead();
        java.lang.Class<?> wildcardClass9 = zipArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        int int4 = zipArchiveInputStream2.read();
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream5);
        boolean boolean7 = zipArchiveInputStream6.markSupported();
        zipArchiveInputStream6.mark((int) '4');
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream10);
        zipArchiveInputStream11.mark(100);
        byte[] byteArray15 = zipArchiveInputStream11.readNBytes(0);
        int int16 = zipArchiveInputStream6.read(byteArray15);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = zipArchiveInputStream6.canReadEntryData(archiveEntry17);
        int int19 = zipArchiveInputStream6.getCount();
        byte[] byteArray20 = zipArchiveInputStream6.readAllBytes();
        int int21 = zipArchiveInputStream2.read(byteArray20);
        long long23 = zipArchiveInputStream2.skip(0L);
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream24);
        boolean boolean26 = zipArchiveInputStream25.markSupported();
        zipArchiveInputStream25.mark((int) '4');
        long long30 = zipArchiveInputStream25.skip((long) (short) 10);
        zipArchiveInputStream25.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream25);
        java.io.InputStream inputStream34 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream35 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream34);
        zipArchiveInputStream35.mark(100);
        byte[] byteArray39 = zipArchiveInputStream35.readNBytes(0);
        zipArchiveInputStream35.mark((int) (byte) 100);
        int int42 = zipArchiveInputStream35.getCount();
        byte[] byteArray43 = zipArchiveInputStream35.readAllBytes();
        int int46 = zipArchiveInputStream25.read(byteArray43, (int) (byte) 10, 100);
        int int47 = zipArchiveInputStream2.read(byteArray43);
        int int48 = zipArchiveInputStream2.getCount();
        zipArchiveInputStream2.mark((-1));
        int int51 = zipArchiveInputStream2.read();
        long long53 = zipArchiveInputStream2.skip((long) (short) 10);
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream5);
        zipArchiveInputStream6.mark(100);
        byte[] byteArray10 = zipArchiveInputStream6.readNBytes(0);
        int int11 = zipArchiveInputStream1.read(byteArray10);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveInputStream1.canReadEntryData(archiveEntry12);
        int int14 = zipArchiveInputStream1.getCount();
        boolean boolean15 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream16);
        zipArchiveInputStream17.mark(100);
        long long21 = zipArchiveInputStream17.skip((long) 1);
        byte[] byteArray23 = zipArchiveInputStream17.readNBytes(100);
        int int24 = zipArchiveInputStream1.read(byteArray23);
        byte[] byteArray25 = zipArchiveInputStream1.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        boolean boolean4 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = zipArchiveInputStream5.getNextEntry();
        int int7 = zipArchiveInputStream5.read();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        boolean boolean10 = zipArchiveInputStream9.markSupported();
        zipArchiveInputStream9.mark((int) '4');
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream13);
        zipArchiveInputStream14.mark(100);
        byte[] byteArray18 = zipArchiveInputStream14.readNBytes(0);
        int int19 = zipArchiveInputStream9.read(byteArray18);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = zipArchiveInputStream9.canReadEntryData(archiveEntry20);
        int int22 = zipArchiveInputStream9.getCount();
        boolean boolean23 = zipArchiveInputStream9.markSupported();
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream24);
        zipArchiveInputStream25.mark(100);
        long long29 = zipArchiveInputStream25.skip((long) 1);
        byte[] byteArray31 = zipArchiveInputStream25.readNBytes(100);
        int int32 = zipArchiveInputStream9.read(byteArray31);
        byte[] byteArray33 = zipArchiveInputStream9.readAllBytes();
        int int36 = zipArchiveInputStream5.read(byteArray33, 1, (int) (byte) 0);
        int int37 = zipArchiveInputStream5.available();
        int int38 = zipArchiveInputStream5.read();
        byte[] byteArray39 = zipArchiveInputStream5.readAllBytes();
        byte[] byteArray40 = zipArchiveInputStream5.readAllBytes();
        boolean boolean41 = zipArchiveInputStream5.markSupported();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(archiveEntry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        long long3 = zipArchiveInputStream1.getBytesRead();
        int int4 = zipArchiveInputStream1.read();
        int int5 = zipArchiveInputStream1.available();
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream6);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = zipArchiveInputStream8.getNextZipEntry();
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream10);
        zipArchiveInputStream11.mark(100);
        byte[] byteArray15 = zipArchiveInputStream11.readNBytes(0);
        zipArchiveInputStream11.mark((int) (byte) 100);
        int int18 = zipArchiveInputStream11.getCount();
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream19);
        boolean boolean21 = zipArchiveInputStream20.markSupported();
        zipArchiveInputStream20.mark((int) '4');
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream24);
        zipArchiveInputStream25.mark(100);
        byte[] byteArray29 = zipArchiveInputStream25.readNBytes(0);
        int int30 = zipArchiveInputStream20.read(byteArray29);
        int int33 = zipArchiveInputStream11.readNBytes(byteArray29, 0, (int) (byte) 0);
        int int36 = zipArchiveInputStream8.read(byteArray29, (int) '4', (int) '#');
        int int37 = zipArchiveInputStream1.read(byteArray29);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(zipArchiveEntry9);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream4);
        boolean boolean6 = zipArchiveInputStream5.markSupported();
        zipArchiveInputStream5.mark(100);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream11);
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream13);
        boolean boolean15 = zipArchiveInputStream14.markSupported();
        zipArchiveInputStream14.mark((int) '4');
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream18);
        zipArchiveInputStream19.mark(100);
        byte[] byteArray23 = zipArchiveInputStream19.readNBytes(0);
        int int24 = zipArchiveInputStream14.read(byteArray23);
        int int27 = zipArchiveInputStream11.read(byteArray23, (int) (short) -1, (int) (byte) 1);
        int int30 = zipArchiveInputStream5.read(byteArray23, (int) (byte) -1, (int) ' ');
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream31 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = zipArchiveInputStream31.getNextEntry();
        byte[] byteArray34 = zipArchiveInputStream31.readNBytes(0);
        int int35 = zipArchiveInputStream2.read(byteArray34);
        java.io.InputStream inputStream36 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream37 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream36);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream38 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream37);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream39 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream38);
        byte[] byteArray41 = zipArchiveInputStream38.readNBytes((int) (byte) 10);
        boolean boolean42 = zipArchiveInputStream38.markSupported();
        long long43 = zipArchiveInputStream38.getBytesRead();
        byte[] byteArray44 = zipArchiveInputStream38.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream45 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream38);
        byte[] byteArray46 = zipArchiveInputStream45.readAllBytes();
        int int49 = zipArchiveInputStream2.read(byteArray46, 1, (int) '4');
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(archiveEntry32);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int7 = zipArchiveInputStream6.available();
        int int8 = zipArchiveInputStream6.read();
        boolean boolean9 = zipArchiveInputStream6.markSupported();
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream10);
        boolean boolean12 = zipArchiveInputStream11.markSupported();
        zipArchiveInputStream11.mark((int) '4');
        int int15 = zipArchiveInputStream11.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = null;
        boolean boolean17 = zipArchiveInputStream11.canReadEntryData(archiveEntry16);
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream18);
        zipArchiveInputStream19.mark(100);
        byte[] byteArray23 = zipArchiveInputStream19.readNBytes(0);
        int int26 = zipArchiveInputStream11.read(byteArray23, (int) (short) 100, (int) (byte) 0);
        byte[] byteArray27 = zipArchiveInputStream11.readAllBytes();
        zipArchiveInputStream11.mark(0);
        byte[] byteArray30 = zipArchiveInputStream11.readAllBytes();
        int int31 = zipArchiveInputStream6.read(byteArray30);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        byte[] byteArray4 = zipArchiveInputStream2.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = zipArchiveInputStream2.getNextZipEntry();
        byte[] byteArray6 = zipArchiveInputStream2.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = zipArchiveInputStream2.getNextZipEntry();
        int int9 = zipArchiveInputStream2.available();
        long long10 = zipArchiveInputStream2.getBytesRead();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = zipArchiveInputStream2.readNBytes((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: len < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNull(zipArchiveEntry5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNull(zipArchiveEntry8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        long long7 = zipArchiveInputStream1.skip((long) 0);
        int int8 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        int int12 = zipArchiveInputStream11.available();
        byte[] byteArray13 = zipArchiveInputStream11.readAllBytes();
        int int14 = zipArchiveInputStream1.read(byteArray13);
        byte[] byteArray16 = zipArchiveInputStream1.readNBytes((int) (byte) 100);
        int int17 = zipArchiveInputStream1.getCount();
        byte[] byteArray18 = zipArchiveInputStream1.readAllBytes();
        int int19 = zipArchiveInputStream1.read();
        int int20 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream21 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream21);
        boolean boolean23 = zipArchiveInputStream22.markSupported();
        zipArchiveInputStream22.mark(100);
        zipArchiveInputStream22.close();
        int int27 = zipArchiveInputStream22.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = zipArchiveInputStream22.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream22);
        boolean boolean30 = zipArchiveInputStream29.markSupported();
        java.io.InputStream inputStream31 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream31);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream34 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream33);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream35 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream33);
        long long36 = zipArchiveInputStream33.getBytesRead();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry37 = null;
        boolean boolean38 = zipArchiveInputStream33.canReadEntryData(archiveEntry37);
        long long39 = zipArchiveInputStream33.getBytesRead();
        java.io.InputStream inputStream40 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream41 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream40);
        zipArchiveInputStream41.mark(100);
        long long45 = zipArchiveInputStream41.skip((long) 1);
        boolean boolean46 = zipArchiveInputStream41.markSupported();
        java.io.InputStream inputStream47 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream48 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream47);
        zipArchiveInputStream48.mark(100);
        byte[] byteArray52 = zipArchiveInputStream48.readNBytes(0);
        int int53 = zipArchiveInputStream41.read(byteArray52);
        boolean boolean54 = zipArchiveInputStream41.markSupported();
        boolean boolean55 = zipArchiveInputStream41.markSupported();
        byte[] byteArray57 = zipArchiveInputStream41.readNBytes((int) ' ');
        byte[] byteArray62 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        boolean boolean64 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray62, 0);
        int int65 = zipArchiveInputStream41.read(byteArray62);
        int int66 = zipArchiveInputStream33.read(byteArray62);
        long long67 = zipArchiveInputStream33.getBytesRead();
        java.io.InputStream inputStream68 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream69 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream68);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream70 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream69);
        int int71 = zipArchiveInputStream70.available();
        byte[] byteArray72 = zipArchiveInputStream70.readAllBytes();
        byte[] byteArray73 = zipArchiveInputStream70.readAllBytes();
        boolean boolean75 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray73, (int) (byte) 0);
        int int76 = zipArchiveInputStream33.read(byteArray73);
        int int77 = zipArchiveInputStream29.read(byteArray73);
        int int80 = zipArchiveInputStream1.read(byteArray73, (-1), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(archiveEntry28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] {});
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        byte[] byteArray6 = zipArchiveInputStream1.readAllBytes();
        long long8 = zipArchiveInputStream1.skip((long) 1);
        int int9 = zipArchiveInputStream1.getCount();
        byte[] byteArray10 = zipArchiveInputStream1.readAllBytes();
        long long12 = zipArchiveInputStream1.skip(0L);
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream13);
        boolean boolean15 = zipArchiveInputStream14.markSupported();
        zipArchiveInputStream14.mark((int) '4');
        long long19 = zipArchiveInputStream14.skip((long) (short) 10);
        zipArchiveInputStream14.mark((int) (short) -1);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream22);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream23);
        byte[] byteArray25 = new byte[] {};
        int int28 = zipArchiveInputStream24.read(byteArray25, (-1), 0);
        int int29 = zipArchiveInputStream14.read(byteArray25);
        boolean boolean30 = zipArchiveInputStream14.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream31 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream14);
        java.io.InputStream inputStream32 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream32);
        zipArchiveInputStream33.mark(100);
        long long37 = zipArchiveInputStream33.skip((long) 1);
        byte[] byteArray39 = zipArchiveInputStream33.readNBytes(100);
        java.io.InputStream inputStream40 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream41 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream40);
        zipArchiveInputStream41.mark(100);
        byte[] byteArray45 = zipArchiveInputStream41.readNBytes(0);
        zipArchiveInputStream41.mark((int) (byte) 100);
        int int48 = zipArchiveInputStream41.getCount();
        byte[] byteArray49 = zipArchiveInputStream41.readAllBytes();
        int int50 = zipArchiveInputStream33.read(byteArray49);
        int int51 = zipArchiveInputStream31.read(byteArray49);
        byte[] byteArray53 = zipArchiveInputStream31.readNBytes(0);
        byte[] byteArray54 = zipArchiveInputStream31.readAllBytes();
        byte[] byteArray55 = zipArchiveInputStream31.readAllBytes();
        int int56 = zipArchiveInputStream1.read(byteArray55);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        long long6 = zipArchiveInputStream1.skip((long) (short) 10);
        zipArchiveInputStream1.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream9);
        byte[] byteArray12 = zipArchiveInputStream9.readNBytes((int) (byte) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream9.canReadEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = zipArchiveInputStream9.getNextZipEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = zipArchiveInputStream9.getNextZipEntry();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(zipArchiveEntry15);
        org.junit.Assert.assertNull(zipArchiveEntry16);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        long long3 = zipArchiveInputStream1.getBytesRead();
        long long4 = zipArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveInputStream1.canReadEntryData(archiveEntry5);
        byte[] byteArray8 = zipArchiveInputStream1.readNBytes(100);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        long long11 = zipArchiveInputStream10.getBytesRead();
        long long12 = zipArchiveInputStream10.getBytesRead();
        int int13 = zipArchiveInputStream10.read();
        int int14 = zipArchiveInputStream10.available();
        long long15 = zipArchiveInputStream10.getBytesRead();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = null;
        boolean boolean17 = zipArchiveInputStream10.canReadEntryData(archiveEntry16);
        byte[] byteArray18 = zipArchiveInputStream10.readAllBytes();
        int int21 = zipArchiveInputStream1.read(byteArray18, 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = zipArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        zipArchiveInputStream8.mark(100);
        byte[] byteArray12 = zipArchiveInputStream8.readNBytes(0);
        int int13 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean14 = zipArchiveInputStream1.markSupported();
        boolean boolean15 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int17 = zipArchiveInputStream1.available();
        int int18 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream19);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream20);
        byte[] byteArray22 = new byte[] {};
        int int25 = zipArchiveInputStream21.read(byteArray22, (-1), 0);
        long long27 = zipArchiveInputStream21.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = null;
        boolean boolean29 = zipArchiveInputStream21.canReadEntryData(archiveEntry28);
        int int30 = zipArchiveInputStream21.available();
        byte[] byteArray32 = zipArchiveInputStream21.readNBytes((int) '#');
        int int35 = zipArchiveInputStream1.read(byteArray32, (int) '4', (-1));
        zipArchiveInputStream1.mark((int) (byte) 10);
        int int38 = zipArchiveInputStream1.available();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        long long7 = zipArchiveInputStream1.skip((long) 0);
        long long9 = zipArchiveInputStream1.skip((long) 10);
        byte[] byteArray11 = zipArchiveInputStream1.readNBytes(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark(100);
        int int5 = zipArchiveInputStream1.read();
        int int6 = zipArchiveInputStream1.read();
        int int7 = zipArchiveInputStream1.available();
        long long8 = zipArchiveInputStream1.getBytesRead();
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        boolean boolean11 = zipArchiveInputStream10.markSupported();
        zipArchiveInputStream10.mark((int) '4');
        long long15 = zipArchiveInputStream10.skip((long) (short) 10);
        zipArchiveInputStream10.mark((int) (short) -1);
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream18);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream19);
        byte[] byteArray21 = new byte[] {};
        int int24 = zipArchiveInputStream20.read(byteArray21, (-1), 0);
        int int25 = zipArchiveInputStream10.read(byteArray21);
        boolean boolean26 = zipArchiveInputStream10.markSupported();
        int int27 = zipArchiveInputStream10.available();
        int int28 = zipArchiveInputStream10.read();
        int int29 = zipArchiveInputStream10.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        java.io.InputStream inputStream31 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream31);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream32);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = zipArchiveInputStream33.getNextZipEntry();
        int int35 = zipArchiveInputStream33.read();
        java.io.InputStream inputStream36 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream37 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream36);
        boolean boolean38 = zipArchiveInputStream37.markSupported();
        zipArchiveInputStream37.mark((int) '4');
        java.io.InputStream inputStream41 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream42 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream41);
        zipArchiveInputStream42.mark(100);
        byte[] byteArray46 = zipArchiveInputStream42.readNBytes(0);
        int int47 = zipArchiveInputStream37.read(byteArray46);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry48 = null;
        boolean boolean49 = zipArchiveInputStream37.canReadEntryData(archiveEntry48);
        int int50 = zipArchiveInputStream37.getCount();
        byte[] byteArray51 = zipArchiveInputStream37.readAllBytes();
        int int52 = zipArchiveInputStream33.read(byteArray51);
        long long54 = zipArchiveInputStream33.skip(0L);
        java.io.InputStream inputStream55 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream56 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream55);
        boolean boolean57 = zipArchiveInputStream56.markSupported();
        zipArchiveInputStream56.mark((int) '4');
        long long61 = zipArchiveInputStream56.skip((long) (short) 10);
        zipArchiveInputStream56.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream64 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream56);
        java.io.InputStream inputStream65 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream66 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream65);
        zipArchiveInputStream66.mark(100);
        byte[] byteArray70 = zipArchiveInputStream66.readNBytes(0);
        zipArchiveInputStream66.mark((int) (byte) 100);
        int int73 = zipArchiveInputStream66.getCount();
        byte[] byteArray74 = zipArchiveInputStream66.readAllBytes();
        int int77 = zipArchiveInputStream56.read(byteArray74, (int) (byte) 10, 100);
        int int78 = zipArchiveInputStream33.read(byteArray74);
        byte[] byteArray80 = zipArchiveInputStream33.readNBytes((int) (byte) 100);
        int int81 = zipArchiveInputStream30.read(byteArray80);
        int int82 = zipArchiveInputStream1.read(byteArray80);
        int int83 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry84 = null;
        boolean boolean85 = zipArchiveInputStream1.canReadEntryData(archiveEntry84);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] {});
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] {});
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] {});
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        long long3 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.close();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        zipArchiveInputStream1.close();
        zipArchiveInputStream1.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int7 = zipArchiveInputStream6.read();
        int int8 = zipArchiveInputStream6.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream9);
        java.lang.Class<?> wildcardClass11 = zipArchiveInputStream10.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        boolean boolean4 = zipArchiveInputStream1.markSupported();
        int int5 = zipArchiveInputStream1.getCount();
        byte[] byteArray7 = zipArchiveInputStream1.readNBytes((int) (byte) 0);
        long long8 = zipArchiveInputStream1.getBytesRead();
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        zipArchiveInputStream10.mark(100);
        long long14 = zipArchiveInputStream10.skip((long) 1);
        int int15 = zipArchiveInputStream10.getCount();
        byte[] byteArray17 = zipArchiveInputStream10.readNBytes(100);
        int int20 = zipArchiveInputStream1.read(byteArray17, (int) (byte) 1, 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = null;
        boolean boolean23 = zipArchiveInputStream21.canReadEntryData(archiveEntry22);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry24 = null;
        boolean boolean25 = zipArchiveInputStream21.canReadEntryData(archiveEntry24);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream21, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        zipArchiveInputStream8.mark(100);
        byte[] byteArray12 = zipArchiveInputStream8.readNBytes(0);
        int int13 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean14 = zipArchiveInputStream1.markSupported();
        boolean boolean15 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        boolean boolean23 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray21, 0);
        boolean boolean25 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray21, 1);
        boolean boolean27 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray21, (int) ' ');
        int int28 = zipArchiveInputStream16.read(byteArray21);
        long long30 = zipArchiveInputStream16.skip((long) '#');
        int int31 = zipArchiveInputStream16.getCount();
        int int32 = zipArchiveInputStream16.read();
        boolean boolean33 = zipArchiveInputStream16.markSupported();
        java.io.InputStream inputStream34 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream35 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream34);
        zipArchiveInputStream35.mark(100);
        long long39 = zipArchiveInputStream35.skip((long) 1);
        int int40 = zipArchiveInputStream35.getCount();
        boolean boolean41 = zipArchiveInputStream35.markSupported();
        int int42 = zipArchiveInputStream35.available();
        int int43 = zipArchiveInputStream35.getCount();
        java.io.InputStream inputStream44 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream45 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream44);
        zipArchiveInputStream45.mark(100);
        byte[] byteArray49 = zipArchiveInputStream45.readNBytes(0);
        int int50 = zipArchiveInputStream45.getCount();
        java.io.InputStream inputStream51 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream52 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream51);
        zipArchiveInputStream52.mark(100);
        byte[] byteArray56 = zipArchiveInputStream52.readNBytes(0);
        zipArchiveInputStream52.mark((int) (byte) 100);
        int int59 = zipArchiveInputStream52.getCount();
        java.io.InputStream inputStream60 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream61 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream60);
        boolean boolean62 = zipArchiveInputStream61.markSupported();
        zipArchiveInputStream61.mark((int) '4');
        java.io.InputStream inputStream65 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream66 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream65);
        zipArchiveInputStream66.mark(100);
        byte[] byteArray70 = zipArchiveInputStream66.readNBytes(0);
        int int71 = zipArchiveInputStream61.read(byteArray70);
        int int74 = zipArchiveInputStream52.readNBytes(byteArray70, 0, (int) (byte) 0);
        int int75 = zipArchiveInputStream45.read(byteArray70);
        byte[] byteArray80 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        boolean boolean82 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray80, 0);
        int int85 = zipArchiveInputStream45.read(byteArray80, (int) (short) 0, 0);
        boolean boolean87 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray80, (int) '#');
        int int88 = zipArchiveInputStream35.read(byteArray80);
        int int91 = zipArchiveInputStream16.read(byteArray80, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] {});
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        long long6 = zipArchiveInputStream1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "hi!", true, true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveInputStream1.canReadEntryData(archiveEntry6);
        int int8 = zipArchiveInputStream1.read();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark(100);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream6);
        boolean boolean8 = zipArchiveInputStream7.markSupported();
        zipArchiveInputStream7.mark((int) '4');
        int int11 = zipArchiveInputStream7.getCount();
        int int12 = zipArchiveInputStream7.read();
        byte[] byteArray13 = zipArchiveInputStream7.readAllBytes();
        int int16 = zipArchiveInputStream5.read(byteArray13, (int) (short) 100, (int) (short) 0);
        byte[] byteArray18 = zipArchiveInputStream5.readNBytes((int) (short) 1);
        boolean boolean19 = zipArchiveInputStream5.markSupported();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        int int6 = zipArchiveInputStream1.read();
        byte[] byteArray7 = zipArchiveInputStream1.readAllBytes();
        int int8 = zipArchiveInputStream1.available();
        long long10 = zipArchiveInputStream1.skip((long) 'a');
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        long long12 = zipArchiveInputStream1.getBytesRead();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        long long6 = zipArchiveInputStream1.skip((long) (short) 10);
        zipArchiveInputStream1.mark((int) (short) -1);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        byte[] byteArray12 = new byte[] {};
        int int15 = zipArchiveInputStream11.read(byteArray12, (-1), 0);
        int int16 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean17 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream19);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream20);
        byte[] byteArray23 = zipArchiveInputStream20.readNBytes((int) 'a');
        boolean boolean25 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray23, 1);
        int int26 = zipArchiveInputStream18.read(byteArray23);
        zipArchiveInputStream18.mark(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream18);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = null;
        boolean boolean31 = zipArchiveInputStream29.canReadEntryData(archiveEntry30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray3 = new byte[] {};
        int int6 = zipArchiveInputStream2.read(byteArray3, (-1), 0);
        long long8 = zipArchiveInputStream2.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveInputStream2.canReadEntryData(archiveEntry9);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = zipArchiveInputStream2.canReadEntryData(archiveEntry11);
        int int13 = zipArchiveInputStream2.getCount();
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream14);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream15);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream16);
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream18);
        boolean boolean20 = zipArchiveInputStream19.markSupported();
        zipArchiveInputStream19.mark((int) '4');
        java.io.InputStream inputStream23 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream23);
        zipArchiveInputStream24.mark(100);
        byte[] byteArray28 = zipArchiveInputStream24.readNBytes(0);
        int int29 = zipArchiveInputStream19.read(byteArray28);
        int int32 = zipArchiveInputStream16.read(byteArray28, (int) (short) -1, (int) (byte) 1);
        boolean boolean33 = zipArchiveInputStream16.markSupported();
        byte[] byteArray34 = zipArchiveInputStream16.readAllBytes();
        byte[] byteArray35 = zipArchiveInputStream16.readAllBytes();
        java.io.InputStream inputStream36 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream37 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream36);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream38 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream37);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = zipArchiveInputStream38.getNextZipEntry();
        byte[] byteArray40 = zipArchiveInputStream38.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry41 = zipArchiveInputStream38.getNextZipEntry();
        byte[] byteArray42 = zipArchiveInputStream38.readAllBytes();
        int int45 = zipArchiveInputStream16.read(byteArray42, (int) '#', (int) (short) 10);
        boolean boolean47 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray42, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = zipArchiveInputStream2.readNBytes(byteArray42, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [10, 10 + 0) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNull(zipArchiveEntry39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertNull(zipArchiveEntry41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        zipArchiveInputStream8.mark(100);
        byte[] byteArray12 = zipArchiveInputStream8.readNBytes(0);
        int int13 = zipArchiveInputStream1.read(byteArray12);
        long long14 = zipArchiveInputStream1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "", false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry2 = null;
        boolean boolean3 = zipArchiveInputStream1.canReadEntryData(archiveEntry2);
        byte[] byteArray4 = zipArchiveInputStream1.readAllBytes();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveInputStream1.canReadEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        boolean boolean9 = zipArchiveInputStream8.markSupported();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int7 = zipArchiveInputStream6.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = zipArchiveInputStream6.getNextZipEntry();
        boolean boolean9 = zipArchiveInputStream6.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = zipArchiveInputStream6.getNextZipEntry();
        byte[] byteArray12 = zipArchiveInputStream6.readNBytes((int) 'a');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(zipArchiveEntry8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(zipArchiveEntry10);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray3 = new byte[] {};
        int int6 = zipArchiveInputStream2.read(byteArray3, (-1), 0);
        long long8 = zipArchiveInputStream2.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveInputStream2.canReadEntryData(archiveEntry9);
        int int11 = zipArchiveInputStream2.available();
        byte[] byteArray13 = zipArchiveInputStream2.readNBytes((int) '#');
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        int int15 = zipArchiveInputStream14.read();
        int int16 = zipArchiveInputStream14.getCount();
        long long18 = zipArchiveInputStream14.skip(10L);
        zipArchiveInputStream14.mark((int) ' ');
        long long22 = zipArchiveInputStream14.skip((long) '4');
        int int23 = zipArchiveInputStream14.available();
        int int24 = zipArchiveInputStream14.available();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        long long7 = zipArchiveInputStream1.skip((long) 0);
        int int8 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        int int12 = zipArchiveInputStream11.available();
        byte[] byteArray13 = zipArchiveInputStream11.readAllBytes();
        int int14 = zipArchiveInputStream1.read(byteArray13);
        byte[] byteArray16 = zipArchiveInputStream1.readNBytes((int) (byte) 100);
        int int17 = zipArchiveInputStream1.getCount();
        byte[] byteArray18 = zipArchiveInputStream1.readAllBytes();
        int int19 = zipArchiveInputStream1.read();
        int int20 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray22 = null;
        int int25 = zipArchiveInputStream21.read(byteArray22, (int) '#', 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray3 = new byte[] {};
        int int6 = zipArchiveInputStream2.read(byteArray3, (-1), 0);
        byte[] byteArray8 = zipArchiveInputStream2.readNBytes((int) (short) 10);
        int int9 = zipArchiveInputStream2.available();
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream10);
        zipArchiveInputStream11.mark(100);
        byte[] byteArray15 = zipArchiveInputStream11.readNBytes(0);
        zipArchiveInputStream11.mark((int) (byte) 100);
        int int18 = zipArchiveInputStream11.read();
        int int19 = zipArchiveInputStream11.getCount();
        long long21 = zipArchiveInputStream11.skip(0L);
        byte[] byteArray22 = zipArchiveInputStream11.readAllBytes();
        int int23 = zipArchiveInputStream2.read(byteArray22);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        zipArchiveInputStream8.mark(100);
        byte[] byteArray12 = zipArchiveInputStream8.readNBytes(0);
        int int13 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean14 = zipArchiveInputStream1.markSupported();
        boolean boolean15 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        boolean boolean23 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray21, 0);
        boolean boolean25 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray21, 1);
        boolean boolean27 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray21, (int) ' ');
        int int28 = zipArchiveInputStream16.read(byteArray21);
        byte[] byteArray30 = zipArchiveInputStream16.readNBytes((int) (short) 1);
        int int31 = zipArchiveInputStream16.read();
        boolean boolean32 = zipArchiveInputStream16.markSupported();
        long long34 = zipArchiveInputStream16.skip((long) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream35 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream16);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream36 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream35);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        long long6 = zipArchiveInputStream1.skip((long) (short) 10);
        zipArchiveInputStream1.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream10);
        boolean boolean12 = zipArchiveInputStream11.markSupported();
        zipArchiveInputStream11.mark((int) '4');
        int int15 = zipArchiveInputStream11.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = null;
        boolean boolean17 = zipArchiveInputStream11.canReadEntryData(archiveEntry16);
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream18);
        zipArchiveInputStream19.mark(100);
        long long23 = zipArchiveInputStream19.skip((long) 1);
        int int24 = zipArchiveInputStream19.getCount();
        boolean boolean25 = zipArchiveInputStream19.markSupported();
        java.io.InputStream inputStream26 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream26);
        zipArchiveInputStream27.mark(100);
        long long31 = zipArchiveInputStream27.skip((long) 1);
        boolean boolean32 = zipArchiveInputStream27.markSupported();
        java.io.InputStream inputStream33 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream34 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream33);
        zipArchiveInputStream34.mark(100);
        byte[] byteArray38 = zipArchiveInputStream34.readNBytes(0);
        int int39 = zipArchiveInputStream27.read(byteArray38);
        int int40 = zipArchiveInputStream19.read(byteArray38);
        byte[] byteArray41 = zipArchiveInputStream19.readAllBytes();
        int int44 = zipArchiveInputStream11.read(byteArray41, (int) (short) 10, 10);
        int int47 = zipArchiveInputStream9.read(byteArray41, (int) (byte) 0, 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream48 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream9);
        boolean boolean49 = zipArchiveInputStream48.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream51 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream48, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        zipArchiveInputStream1.mark((int) (byte) 100);
        int int8 = zipArchiveInputStream1.getCount();
        byte[] byteArray9 = zipArchiveInputStream1.readAllBytes();
        long long10 = zipArchiveInputStream1.getBytesRead();
        int int11 = zipArchiveInputStream1.getCount();
        long long13 = zipArchiveInputStream1.skip((long) (byte) 100);
        byte[] byteArray14 = zipArchiveInputStream1.readAllBytes();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        long long6 = zipArchiveInputStream1.skip((long) (short) 10);
        zipArchiveInputStream1.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream9);
        int int11 = zipArchiveInputStream10.available();
        byte[] byteArray12 = zipArchiveInputStream10.readAllBytes();
        byte[] byteArray13 = zipArchiveInputStream10.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = zipArchiveInputStream10.getNextZipEntry();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNull(zipArchiveEntry14);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.close();
        long long4 = zipArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = zipArchiveInputStream1.readAllBytes();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The stream is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(archiveEntry5);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        zipArchiveInputStream6.close();
        boolean boolean8 = zipArchiveInputStream6.markSupported();
        int int9 = zipArchiveInputStream6.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = zipArchiveInputStream6.getNextEntry();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(archiveEntry10);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        zipArchiveInputStream1.mark((int) (byte) 100);
        int int8 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveInputStream1.canReadEntryData(archiveEntry9);
        zipArchiveInputStream1.close();
        zipArchiveInputStream1.mark((int) (short) 100);
        long long14 = zipArchiveInputStream1.getBytesRead();
        long long15 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.mark((int) (byte) 0);
        long long18 = zipArchiveInputStream1.getBytesRead();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        byte[] byteArray4 = zipArchiveInputStream2.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        long long7 = zipArchiveInputStream5.skip(0L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = zipArchiveInputStream5.getNextZipEntry();
        int int9 = zipArchiveInputStream5.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream11);
        zipArchiveInputStream12.mark(100);
        boolean boolean15 = zipArchiveInputStream12.markSupported();
        int int16 = zipArchiveInputStream12.getCount();
        zipArchiveInputStream12.close();
        zipArchiveInputStream12.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream12);
        byte[] byteArray21 = zipArchiveInputStream19.readNBytes((int) (short) 0);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream22);
        boolean boolean24 = zipArchiveInputStream23.markSupported();
        zipArchiveInputStream23.mark((int) '4');
        long long28 = zipArchiveInputStream23.skip((long) (short) 10);
        zipArchiveInputStream23.mark((int) (short) -1);
        java.io.InputStream inputStream31 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream31);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream32);
        byte[] byteArray34 = new byte[] {};
        int int37 = zipArchiveInputStream33.read(byteArray34, (-1), 0);
        int int38 = zipArchiveInputStream23.read(byteArray34);
        boolean boolean39 = zipArchiveInputStream23.markSupported();
        byte[] byteArray40 = zipArchiveInputStream23.readAllBytes();
        boolean boolean41 = zipArchiveInputStream23.markSupported();
        byte[] byteArray42 = zipArchiveInputStream23.readAllBytes();
        boolean boolean44 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray42, (int) (byte) 1);
        int int45 = zipArchiveInputStream19.read(byteArray42);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = zipArchiveInputStream5.readNBytes(byteArray42, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [100, 100 + -1) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long4 = zipArchiveInputStream1.getBytesRead();
        boolean boolean5 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        long long8 = zipArchiveInputStream1.skip((long) (short) 1);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        boolean boolean11 = zipArchiveInputStream10.markSupported();
        zipArchiveInputStream10.mark((int) '4');
        long long15 = zipArchiveInputStream10.skip((long) (short) 10);
        zipArchiveInputStream10.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream18);
        int int20 = zipArchiveInputStream19.available();
        byte[] byteArray21 = zipArchiveInputStream19.readAllBytes();
        int int22 = zipArchiveInputStream1.read(byteArray21);
        boolean boolean23 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.close();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        zipArchiveInputStream1.close();
        long long8 = zipArchiveInputStream1.getBytesRead();
        boolean boolean9 = zipArchiveInputStream1.markSupported();
        long long10 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.mark((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark(100);
        boolean boolean5 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.close();
        zipArchiveInputStream1.close();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        boolean boolean10 = zipArchiveInputStream9.markSupported();
        zipArchiveInputStream9.mark((int) '4');
        long long14 = zipArchiveInputStream9.skip((long) (short) 10);
        zipArchiveInputStream9.mark((int) (short) -1);
        java.io.InputStream inputStream17 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream17);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream18);
        byte[] byteArray20 = new byte[] {};
        int int23 = zipArchiveInputStream19.read(byteArray20, (-1), 0);
        int int24 = zipArchiveInputStream9.read(byteArray20);
        boolean boolean25 = zipArchiveInputStream9.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream9);
        byte[] byteArray27 = zipArchiveInputStream26.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int28 = zipArchiveInputStream1.read(byteArray27);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The stream is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        long long6 = zipArchiveInputStream1.skip((long) (short) 10);
        zipArchiveInputStream1.mark((int) (short) -1);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        byte[] byteArray12 = new byte[] {};
        int int15 = zipArchiveInputStream11.read(byteArray12, (-1), 0);
        int int16 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean17 = zipArchiveInputStream1.markSupported();
        int int18 = zipArchiveInputStream1.available();
        int int19 = zipArchiveInputStream1.read();
        int int20 = zipArchiveInputStream1.read();
        byte[] byteArray22 = zipArchiveInputStream1.readNBytes((int) (byte) 10);
        zipArchiveInputStream1.mark(0);
        byte[] byteArray26 = zipArchiveInputStream1.readNBytes((int) (byte) 1);
        byte[] byteArray27 = zipArchiveInputStream1.readAllBytes();
        java.lang.Class<?> wildcardClass28 = zipArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.close();
        long long4 = zipArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = zipArchiveInputStream1.getNextEntry();
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream6);
        boolean boolean8 = zipArchiveInputStream7.markSupported();
        zipArchiveInputStream7.mark((int) '4');
        long long12 = zipArchiveInputStream7.skip((long) (short) 10);
        zipArchiveInputStream7.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7);
        int int17 = zipArchiveInputStream16.read();
        byte[] byteArray19 = zipArchiveInputStream16.readNBytes((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream16);
        java.io.InputStream inputStream21 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream21);
        zipArchiveInputStream22.mark(100);
        long long26 = zipArchiveInputStream22.skip((long) 1);
        byte[] byteArray27 = zipArchiveInputStream22.readAllBytes();
        int int28 = zipArchiveInputStream20.read(byteArray27);
        java.io.InputStream inputStream29 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream29);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream31 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream30);
        int int32 = zipArchiveInputStream31.available();
        byte[] byteArray33 = zipArchiveInputStream31.readAllBytes();
        long long35 = zipArchiveInputStream31.skip(1L);
        byte[] byteArray37 = zipArchiveInputStream31.readNBytes(0);
        int int38 = zipArchiveInputStream20.read(byteArray37);
        byte[] byteArray40 = zipArchiveInputStream20.readNBytes((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int43 = zipArchiveInputStream1.readNBytes(byteArray40, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [100, 100 + 52) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(archiveEntry5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        byte[] byteArray4 = zipArchiveInputStream2.readAllBytes();
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        boolean boolean11 = zipArchiveInputStream10.markSupported();
        zipArchiveInputStream10.mark((int) '4');
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream14);
        zipArchiveInputStream15.mark(100);
        byte[] byteArray19 = zipArchiveInputStream15.readNBytes(0);
        int int20 = zipArchiveInputStream10.read(byteArray19);
        int int23 = zipArchiveInputStream7.read(byteArray19, (int) (short) -1, (int) (byte) 1);
        int int26 = zipArchiveInputStream2.read(byteArray19, 100, 0);
        long long28 = zipArchiveInputStream2.skip((long) (short) 100);
        zipArchiveInputStream2.close();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = zipArchiveInputStream2.getNextEntry();
        zipArchiveInputStream2.mark((int) (short) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        byte[] byteArray34 = zipArchiveInputStream33.readAllBytes();
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNull(archiveEntry30);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        zipArchiveInputStream2.close();
        zipArchiveInputStream2.close();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = zipArchiveInputStream2.skip(10L);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The stream is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        long long6 = zipArchiveInputStream1.skip((long) (short) 10);
        zipArchiveInputStream1.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        long long10 = zipArchiveInputStream1.getBytesRead();
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream11);
        zipArchiveInputStream12.mark(100);
        byte[] byteArray16 = zipArchiveInputStream12.readNBytes(0);
        zipArchiveInputStream12.mark((int) (byte) 100);
        int int19 = zipArchiveInputStream12.getCount();
        byte[] byteArray20 = zipArchiveInputStream12.readAllBytes();
        int int23 = zipArchiveInputStream1.read(byteArray20, (int) ' ', 1);
        boolean boolean24 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry25 = null;
        boolean boolean26 = zipArchiveInputStream1.canReadEntryData(archiveEntry25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        int int6 = zipArchiveInputStream1.read();
        byte[] byteArray7 = zipArchiveInputStream1.readAllBytes();
        int int8 = zipArchiveInputStream1.available();
        boolean boolean9 = zipArchiveInputStream1.markSupported();
        byte[] byteArray10 = zipArchiveInputStream1.readAllBytes();
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream11);
        boolean boolean13 = zipArchiveInputStream12.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream12);
        int int15 = zipArchiveInputStream12.available();
        byte[] byteArray17 = zipArchiveInputStream12.readNBytes((int) '4');
        int int18 = zipArchiveInputStream12.available();
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream19);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream20);
        int int22 = zipArchiveInputStream21.available();
        byte[] byteArray23 = zipArchiveInputStream21.readAllBytes();
        byte[] byteArray24 = zipArchiveInputStream21.readAllBytes();
        int int27 = zipArchiveInputStream12.read(byteArray24, 10, (int) (short) 1);
        int int30 = zipArchiveInputStream1.read(byteArray24, 0, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        int int6 = zipArchiveInputStream1.read();
        byte[] byteArray7 = zipArchiveInputStream1.readAllBytes();
        int int8 = zipArchiveInputStream1.available();
        long long10 = zipArchiveInputStream1.skip((long) 'a');
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream11);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark(100);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        boolean boolean11 = zipArchiveInputStream10.markSupported();
        zipArchiveInputStream10.mark((int) '4');
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream14);
        zipArchiveInputStream15.mark(100);
        byte[] byteArray19 = zipArchiveInputStream15.readNBytes(0);
        int int20 = zipArchiveInputStream10.read(byteArray19);
        int int23 = zipArchiveInputStream7.read(byteArray19, (int) (short) -1, (int) (byte) 1);
        int int26 = zipArchiveInputStream1.read(byteArray19, (int) (byte) -1, (int) ' ');
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int28 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream29 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream29);
        zipArchiveInputStream30.mark(100);
        long long34 = zipArchiveInputStream30.skip((long) 1);
        boolean boolean35 = zipArchiveInputStream30.markSupported();
        java.io.InputStream inputStream36 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream37 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream36);
        zipArchiveInputStream37.mark(100);
        byte[] byteArray41 = zipArchiveInputStream37.readNBytes(0);
        int int42 = zipArchiveInputStream30.read(byteArray41);
        boolean boolean43 = zipArchiveInputStream30.markSupported();
        boolean boolean44 = zipArchiveInputStream30.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream45 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream30);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        boolean boolean52 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray50, 0);
        boolean boolean54 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray50, 1);
        boolean boolean56 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray50, (int) ' ');
        int int57 = zipArchiveInputStream45.read(byteArray50);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry58 = null;
        boolean boolean59 = zipArchiveInputStream45.canReadEntryData(archiveEntry58);
        int int60 = zipArchiveInputStream45.getCount();
        java.io.InputStream inputStream61 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream62 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream61);
        zipArchiveInputStream62.mark(100);
        long long66 = zipArchiveInputStream62.skip((long) 1);
        int int67 = zipArchiveInputStream62.read();
        byte[] byteArray68 = zipArchiveInputStream62.readAllBytes();
        int int69 = zipArchiveInputStream45.read(byteArray68);
        byte[] byteArray70 = zipArchiveInputStream45.readAllBytes();
        int int73 = zipArchiveInputStream1.read(byteArray70, (int) (short) 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream76 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] {});
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] {});
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        boolean boolean4 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = zipArchiveInputStream5.getNextEntry();
        int int7 = zipArchiveInputStream5.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        byte[] byteArray9 = zipArchiveInputStream5.readAllBytes();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = zipArchiveInputStream5.getNextEntry();
        int int11 = zipArchiveInputStream5.getCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(archiveEntry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNull(archiveEntry10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        byte[] byteArray4 = zipArchiveInputStream2.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = zipArchiveInputStream2.getNextZipEntry();
        byte[] byteArray6 = zipArchiveInputStream2.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        zipArchiveInputStream7.mark(0);
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNull(zipArchiveEntry5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        boolean boolean4 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = zipArchiveInputStream5.getNextEntry();
        int int7 = zipArchiveInputStream5.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        byte[] byteArray9 = zipArchiveInputStream5.readAllBytes();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = zipArchiveInputStream5.getNextEntry();
        java.lang.Class<?> wildcardClass11 = zipArchiveInputStream5.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(archiveEntry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNull(archiveEntry10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        boolean boolean4 = zipArchiveInputStream1.markSupported();
        int int5 = zipArchiveInputStream1.getCount();
        byte[] byteArray7 = zipArchiveInputStream1.readNBytes((int) (byte) 0);
        byte[] byteArray9 = zipArchiveInputStream1.readNBytes(0);
        java.lang.Class<?> wildcardClass10 = byteArray9.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long4 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.close();
        long long6 = zipArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = zipArchiveInputStream7.getNextZipEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The stream is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark(100);
        boolean boolean5 = zipArchiveInputStream1.markSupported();
        byte[] byteArray6 = zipArchiveInputStream1.readAllBytes();
        long long7 = zipArchiveInputStream1.getBytesRead();
        int int8 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveInputStream1.canReadEntryData(archiveEntry9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        zipArchiveInputStream8.mark(100);
        byte[] byteArray12 = zipArchiveInputStream8.readNBytes(0);
        int int13 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean14 = zipArchiveInputStream1.markSupported();
        boolean boolean15 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        long long17 = zipArchiveInputStream16.getBytesRead();
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream18);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream19);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = zipArchiveInputStream20.getNextZipEntry();
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream22);
        zipArchiveInputStream23.mark(100);
        byte[] byteArray27 = zipArchiveInputStream23.readNBytes(0);
        zipArchiveInputStream23.mark((int) (byte) 100);
        int int30 = zipArchiveInputStream23.getCount();
        java.io.InputStream inputStream31 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream31);
        boolean boolean33 = zipArchiveInputStream32.markSupported();
        zipArchiveInputStream32.mark((int) '4');
        java.io.InputStream inputStream36 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream37 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream36);
        zipArchiveInputStream37.mark(100);
        byte[] byteArray41 = zipArchiveInputStream37.readNBytes(0);
        int int42 = zipArchiveInputStream32.read(byteArray41);
        int int45 = zipArchiveInputStream23.readNBytes(byteArray41, 0, (int) (byte) 0);
        int int48 = zipArchiveInputStream20.read(byteArray41, (int) '4', (int) '#');
        java.io.InputStream inputStream49 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream50 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream49);
        zipArchiveInputStream50.mark(100);
        long long54 = zipArchiveInputStream50.skip((long) 1);
        byte[] byteArray56 = zipArchiveInputStream50.readNBytes((int) ' ');
        int int57 = zipArchiveInputStream20.read(byteArray56);
        byte[] byteArray58 = zipArchiveInputStream20.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream59 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream20);
        byte[] byteArray61 = zipArchiveInputStream59.readNBytes(0);
        int int64 = zipArchiveInputStream16.read(byteArray61, (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry21);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] {});
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream3);
        boolean boolean5 = zipArchiveInputStream4.markSupported();
        zipArchiveInputStream4.mark((int) '4');
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        zipArchiveInputStream9.mark(100);
        byte[] byteArray13 = zipArchiveInputStream9.readNBytes(0);
        int int14 = zipArchiveInputStream4.read(byteArray13);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = zipArchiveInputStream4.canReadEntryData(archiveEntry15);
        int int17 = zipArchiveInputStream4.getCount();
        byte[] byteArray18 = zipArchiveInputStream4.readAllBytes();
        int int19 = zipArchiveInputStream1.read(byteArray18);
        zipArchiveInputStream1.mark((int) (short) 10);
        byte[] byteArray22 = zipArchiveInputStream1.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = zipArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long4 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.close();
        long long6 = zipArchiveInputStream1.getBytesRead();
        long long7 = zipArchiveInputStream1.getBytesRead();
        long long8 = zipArchiveInputStream1.getBytesRead();
        int int9 = zipArchiveInputStream1.getCount();
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream10);
        zipArchiveInputStream11.mark(100);
        long long15 = zipArchiveInputStream11.skip((long) 1);
        byte[] byteArray17 = zipArchiveInputStream11.readNBytes(100);
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream18);
        zipArchiveInputStream19.mark(100);
        byte[] byteArray23 = zipArchiveInputStream19.readNBytes(0);
        zipArchiveInputStream19.mark((int) (byte) 100);
        int int26 = zipArchiveInputStream19.getCount();
        byte[] byteArray27 = zipArchiveInputStream19.readAllBytes();
        int int28 = zipArchiveInputStream11.read(byteArray27);
        boolean boolean29 = zipArchiveInputStream11.markSupported();
        java.io.InputStream inputStream30 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream31 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream30);
        zipArchiveInputStream31.mark(100);
        long long35 = zipArchiveInputStream31.skip((long) 1);
        boolean boolean36 = zipArchiveInputStream31.markSupported();
        java.io.InputStream inputStream37 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream38 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream37);
        zipArchiveInputStream38.mark(100);
        byte[] byteArray42 = zipArchiveInputStream38.readNBytes(0);
        int int43 = zipArchiveInputStream31.read(byteArray42);
        boolean boolean44 = zipArchiveInputStream31.markSupported();
        boolean boolean45 = zipArchiveInputStream31.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream46 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream31);
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        boolean boolean53 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray51, 0);
        boolean boolean55 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray51, 1);
        boolean boolean57 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray51, (int) ' ');
        int int58 = zipArchiveInputStream46.read(byteArray51);
        byte[] byteArray60 = zipArchiveInputStream46.readNBytes((int) (short) 1);
        int int61 = zipArchiveInputStream46.read();
        java.io.InputStream inputStream62 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream63 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream62);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream64 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream63);
        int int65 = zipArchiveInputStream63.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream66 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream63);
        boolean boolean67 = zipArchiveInputStream66.markSupported();
        byte[] byteArray68 = zipArchiveInputStream66.readAllBytes();
        int int71 = zipArchiveInputStream46.read(byteArray68, (int) (short) 100, (int) ' ');
        int int74 = zipArchiveInputStream11.read(byteArray68, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int75 = zipArchiveInputStream1.read(byteArray68);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The stream is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] {});
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] {});
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        long long6 = zipArchiveInputStream1.skip((long) (short) 10);
        zipArchiveInputStream1.mark((int) (short) -1);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        byte[] byteArray12 = new byte[] {};
        int int15 = zipArchiveInputStream11.read(byteArray12, (-1), 0);
        int int16 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean17 = zipArchiveInputStream1.markSupported();
        int int18 = zipArchiveInputStream1.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        java.io.InputStream inputStream20 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream20);
        zipArchiveInputStream21.mark(100);
        long long24 = zipArchiveInputStream21.getBytesRead();
        zipArchiveInputStream21.mark((int) (byte) 0);
        int int27 = zipArchiveInputStream21.available();
        java.io.InputStream inputStream28 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream28);
        zipArchiveInputStream29.mark(100);
        byte[] byteArray33 = zipArchiveInputStream29.readNBytes(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream34 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream29);
        byte[] byteArray36 = zipArchiveInputStream34.readNBytes(0);
        boolean boolean38 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray36, (int) (short) 0);
        int int39 = zipArchiveInputStream21.read(byteArray36);
        int int40 = zipArchiveInputStream19.read(byteArray36);
        long long42 = zipArchiveInputStream19.skip(10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        zipArchiveInputStream8.mark(100);
        byte[] byteArray12 = zipArchiveInputStream8.readNBytes(0);
        int int13 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean14 = zipArchiveInputStream1.markSupported();
        boolean boolean15 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = zipArchiveInputStream16.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream16);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream19);
        zipArchiveInputStream20.mark(100);
        long long24 = zipArchiveInputStream20.skip((long) 1);
        boolean boolean25 = zipArchiveInputStream20.markSupported();
        java.io.InputStream inputStream26 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream26);
        zipArchiveInputStream27.mark(100);
        byte[] byteArray31 = zipArchiveInputStream27.readNBytes(0);
        int int32 = zipArchiveInputStream20.read(byteArray31);
        boolean boolean33 = zipArchiveInputStream20.markSupported();
        boolean boolean34 = zipArchiveInputStream20.markSupported();
        byte[] byteArray36 = zipArchiveInputStream20.readNBytes((int) ' ');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry37 = null;
        boolean boolean38 = zipArchiveInputStream20.canReadEntryData(archiveEntry37);
        byte[] byteArray40 = zipArchiveInputStream20.readNBytes(1);
        int int43 = zipArchiveInputStream18.read(byteArray40, (int) (short) -1, (int) ' ');
        long long45 = zipArchiveInputStream18.skip(0L);
        zipArchiveInputStream18.mark((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(archiveEntry17);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        zipArchiveInputStream1.mark((int) (byte) 100);
        int int8 = zipArchiveInputStream1.read();
        int int9 = zipArchiveInputStream1.getCount();
        int int10 = zipArchiveInputStream1.getCount();
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream11);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream13);
        int int15 = zipArchiveInputStream13.getCount();
        long long16 = zipArchiveInputStream13.getBytesRead();
        long long17 = zipArchiveInputStream13.getBytesRead();
        int int18 = zipArchiveInputStream13.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = zipArchiveInputStream13.getNextZipEntry();
        byte[] byteArray21 = zipArchiveInputStream13.readNBytes((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = zipArchiveInputStream1.readNBytes(byteArray21, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [100, 100 + 10) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry19);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        boolean boolean3 = zipArchiveInputStream2.markSupported();
        int int4 = zipArchiveInputStream2.getCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2, "", false, false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int3 = zipArchiveInputStream1.available();
        boolean boolean4 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "", false, false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark(100);
        int int5 = zipArchiveInputStream1.available();
        zipArchiveInputStream1.close();
        boolean boolean7 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.close();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        long long6 = zipArchiveInputStream1.skip((long) (short) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        zipArchiveInputStream7.mark((int) (short) 1);
        zipArchiveInputStream7.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark(100);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        boolean boolean11 = zipArchiveInputStream10.markSupported();
        zipArchiveInputStream10.mark((int) '4');
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream14);
        zipArchiveInputStream15.mark(100);
        byte[] byteArray19 = zipArchiveInputStream15.readNBytes(0);
        int int20 = zipArchiveInputStream10.read(byteArray19);
        int int23 = zipArchiveInputStream7.read(byteArray19, (int) (short) -1, (int) (byte) 1);
        int int26 = zipArchiveInputStream1.read(byteArray19, (int) (byte) -1, (int) ' ');
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int28 = zipArchiveInputStream1.read();
        long long30 = zipArchiveInputStream1.skip((long) 10);
        int int31 = zipArchiveInputStream1.getCount();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray33 = zipArchiveInputStream1.readNBytes((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: len < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark(100);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        boolean boolean11 = zipArchiveInputStream10.markSupported();
        zipArchiveInputStream10.mark((int) '4');
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream14);
        zipArchiveInputStream15.mark(100);
        byte[] byteArray19 = zipArchiveInputStream15.readNBytes(0);
        int int20 = zipArchiveInputStream10.read(byteArray19);
        int int23 = zipArchiveInputStream7.read(byteArray19, (int) (short) -1, (int) (byte) 1);
        int int26 = zipArchiveInputStream1.read(byteArray19, (int) (byte) -1, (int) ' ');
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = null;
        boolean boolean29 = zipArchiveInputStream27.canReadEntryData(archiveEntry28);
        java.io.InputStream inputStream30 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream31 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream30);
        zipArchiveInputStream31.mark(100);
        long long34 = zipArchiveInputStream31.getBytesRead();
        byte[] byteArray35 = zipArchiveInputStream31.readAllBytes();
        java.io.InputStream inputStream36 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream37 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream36);
        boolean boolean38 = zipArchiveInputStream37.markSupported();
        zipArchiveInputStream37.mark(100);
        boolean boolean41 = zipArchiveInputStream37.markSupported();
        byte[] byteArray42 = zipArchiveInputStream37.readAllBytes();
        int int43 = zipArchiveInputStream31.read(byteArray42);
        int int46 = zipArchiveInputStream27.read(byteArray42, (int) (short) 100, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream47 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream27);
        java.io.InputStream inputStream48 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream49 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream48);
        boolean boolean50 = zipArchiveInputStream49.markSupported();
        zipArchiveInputStream49.mark((int) '4');
        int int53 = zipArchiveInputStream49.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry54 = null;
        boolean boolean55 = zipArchiveInputStream49.canReadEntryData(archiveEntry54);
        java.io.InputStream inputStream56 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream57 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream56);
        zipArchiveInputStream57.mark(100);
        long long61 = zipArchiveInputStream57.skip((long) 1);
        int int62 = zipArchiveInputStream57.getCount();
        boolean boolean63 = zipArchiveInputStream57.markSupported();
        java.io.InputStream inputStream64 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream65 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream64);
        zipArchiveInputStream65.mark(100);
        long long69 = zipArchiveInputStream65.skip((long) 1);
        boolean boolean70 = zipArchiveInputStream65.markSupported();
        java.io.InputStream inputStream71 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream72 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream71);
        zipArchiveInputStream72.mark(100);
        byte[] byteArray76 = zipArchiveInputStream72.readNBytes(0);
        int int77 = zipArchiveInputStream65.read(byteArray76);
        int int78 = zipArchiveInputStream57.read(byteArray76);
        byte[] byteArray79 = zipArchiveInputStream57.readAllBytes();
        int int82 = zipArchiveInputStream49.read(byteArray79, (int) (short) 10, 10);
        int int83 = zipArchiveInputStream49.read();
        byte[] byteArray84 = zipArchiveInputStream49.readAllBytes();
        int int87 = zipArchiveInputStream47.read(byteArray84, (int) (short) -1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass88 = byteArray84.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] {});
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] {});
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] {});
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        byte[] byteArray4 = zipArchiveInputStream2.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        long long7 = zipArchiveInputStream5.skip(0L);
        int int8 = zipArchiveInputStream5.available();
        int int9 = zipArchiveInputStream5.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        zipArchiveInputStream10.close();
        int int12 = zipArchiveInputStream10.getCount();
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        zipArchiveInputStream1.mark((int) (byte) 100);
        int int8 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveInputStream1.canReadEntryData(archiveEntry9);
        zipArchiveInputStream1.close();
        int int12 = zipArchiveInputStream1.available();
        zipArchiveInputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray16 = zipArchiveInputStream14.readNBytes((int) (short) 10);
        java.io.InputStream inputStream17 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream17);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream18);
        byte[] byteArray21 = zipArchiveInputStream18.readNBytes((int) 'a');
        int int22 = zipArchiveInputStream14.read(byteArray21);
        long long23 = zipArchiveInputStream14.getBytesRead();
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream24);
        zipArchiveInputStream25.mark(100);
        long long29 = zipArchiveInputStream25.skip((long) 1);
        byte[] byteArray30 = zipArchiveInputStream25.readAllBytes();
        long long32 = zipArchiveInputStream25.skip((long) 1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry33 = null;
        boolean boolean34 = zipArchiveInputStream25.canReadEntryData(archiveEntry33);
        byte[] byteArray35 = zipArchiveInputStream25.readAllBytes();
        int int36 = zipArchiveInputStream25.available();
        boolean boolean37 = zipArchiveInputStream25.markSupported();
        long long38 = zipArchiveInputStream25.getBytesRead();
        byte[] byteArray40 = zipArchiveInputStream25.readNBytes((int) (byte) 100);
        int int41 = zipArchiveInputStream14.read(byteArray40);
        int int42 = zipArchiveInputStream14.available();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        zipArchiveInputStream8.mark(100);
        byte[] byteArray12 = zipArchiveInputStream8.readNBytes(0);
        int int13 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean14 = zipArchiveInputStream1.markSupported();
        boolean boolean15 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray18 = zipArchiveInputStream16.readNBytes((int) '#');
        byte[] byteArray20 = zipArchiveInputStream16.readNBytes((int) (short) 10);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = null;
        boolean boolean22 = zipArchiveInputStream16.canReadEntryData(archiveEntry21);
        int int23 = zipArchiveInputStream16.available();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry24 = null;
        boolean boolean25 = zipArchiveInputStream16.canReadEntryData(archiveEntry24);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        zipArchiveInputStream8.mark(100);
        byte[] byteArray12 = zipArchiveInputStream8.readNBytes(0);
        int int13 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean14 = zipArchiveInputStream1.markSupported();
        boolean boolean15 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        boolean boolean23 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray21, 0);
        boolean boolean25 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray21, 1);
        boolean boolean27 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray21, (int) ' ');
        int int28 = zipArchiveInputStream16.read(byteArray21);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry29 = null;
        boolean boolean30 = zipArchiveInputStream16.canReadEntryData(archiveEntry29);
        int int31 = zipArchiveInputStream16.getCount();
        java.io.InputStream inputStream32 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream32);
        zipArchiveInputStream33.mark(100);
        long long37 = zipArchiveInputStream33.skip((long) 1);
        int int38 = zipArchiveInputStream33.read();
        byte[] byteArray39 = zipArchiveInputStream33.readAllBytes();
        int int40 = zipArchiveInputStream16.read(byteArray39);
        byte[] byteArray41 = zipArchiveInputStream16.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream42 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream16);
        long long43 = zipArchiveInputStream42.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            long long45 = zipArchiveInputStream42.skip((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray3 = new byte[] {};
        int int6 = zipArchiveInputStream2.read(byteArray3, (-1), 0);
        byte[] byteArray8 = zipArchiveInputStream2.readNBytes((int) (short) 10);
        int int9 = zipArchiveInputStream2.available();
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream11);
        byte[] byteArray13 = new byte[] {};
        int int16 = zipArchiveInputStream12.read(byteArray13, (-1), 0);
        long long18 = zipArchiveInputStream12.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        boolean boolean20 = zipArchiveInputStream12.canReadEntryData(archiveEntry19);
        int int21 = zipArchiveInputStream12.available();
        byte[] byteArray23 = zipArchiveInputStream12.readNBytes((int) '#');
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream12);
        int int25 = zipArchiveInputStream24.read();
        java.io.InputStream inputStream26 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream26);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream27);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream28);
        java.io.InputStream inputStream30 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream31 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream30);
        boolean boolean32 = zipArchiveInputStream31.markSupported();
        zipArchiveInputStream31.mark((int) '4');
        java.io.InputStream inputStream35 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream36 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream35);
        zipArchiveInputStream36.mark(100);
        byte[] byteArray40 = zipArchiveInputStream36.readNBytes(0);
        int int41 = zipArchiveInputStream31.read(byteArray40);
        int int44 = zipArchiveInputStream28.read(byteArray40, (int) (short) -1, (int) (byte) 1);
        int int45 = zipArchiveInputStream24.read(byteArray40);
        java.io.InputStream inputStream46 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream47 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream46);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream48 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream47);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry49 = zipArchiveInputStream48.getNextZipEntry();
        byte[] byteArray50 = zipArchiveInputStream48.readAllBytes();
        java.io.InputStream inputStream51 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream52 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream51);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream53 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream52);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream54 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream53);
        java.io.InputStream inputStream55 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream56 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream55);
        boolean boolean57 = zipArchiveInputStream56.markSupported();
        zipArchiveInputStream56.mark((int) '4');
        java.io.InputStream inputStream60 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream61 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream60);
        zipArchiveInputStream61.mark(100);
        byte[] byteArray65 = zipArchiveInputStream61.readNBytes(0);
        int int66 = zipArchiveInputStream56.read(byteArray65);
        int int69 = zipArchiveInputStream53.read(byteArray65, (int) (short) -1, (int) (byte) 1);
        int int72 = zipArchiveInputStream48.read(byteArray65, 100, 0);
        int int73 = zipArchiveInputStream24.read(byteArray65);
        long long75 = zipArchiveInputStream24.skip((long) (short) 0);
        byte[] byteArray77 = zipArchiveInputStream24.readNBytes((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int80 = zipArchiveInputStream2.readNBytes(byteArray77, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [52, 52 + 52) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry49);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] {});
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] {});
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        byte[] byteArray4 = zipArchiveInputStream2.readAllBytes();
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        boolean boolean11 = zipArchiveInputStream10.markSupported();
        zipArchiveInputStream10.mark((int) '4');
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream14);
        zipArchiveInputStream15.mark(100);
        byte[] byteArray19 = zipArchiveInputStream15.readNBytes(0);
        int int20 = zipArchiveInputStream10.read(byteArray19);
        int int23 = zipArchiveInputStream7.read(byteArray19, (int) (short) -1, (int) (byte) 1);
        int int26 = zipArchiveInputStream2.read(byteArray19, 100, 0);
        long long28 = zipArchiveInputStream2.skip((long) (short) 100);
        long long30 = zipArchiveInputStream2.skip((long) 1);
        int int31 = zipArchiveInputStream2.available();
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        zipArchiveInputStream1.mark((int) (byte) 100);
        int int8 = zipArchiveInputStream1.read();
        int int9 = zipArchiveInputStream1.getCount();
        long long11 = zipArchiveInputStream1.skip(0L);
        byte[] byteArray12 = zipArchiveInputStream1.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = zipArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        zipArchiveInputStream8.mark(100);
        byte[] byteArray12 = zipArchiveInputStream8.readNBytes(0);
        int int13 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean14 = zipArchiveInputStream1.markSupported();
        boolean boolean15 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = zipArchiveInputStream16.getNextEntry();
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream18);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream19);
        byte[] byteArray21 = new byte[] {};
        int int24 = zipArchiveInputStream20.read(byteArray21, (-1), 0);
        long long26 = zipArchiveInputStream20.skip((long) (short) 0);
        long long27 = zipArchiveInputStream20.getBytesRead();
        java.io.InputStream inputStream28 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream28);
        zipArchiveInputStream29.mark(100);
        byte[] byteArray33 = zipArchiveInputStream29.readNBytes(0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry34 = null;
        boolean boolean35 = zipArchiveInputStream29.canReadEntryData(archiveEntry34);
        java.io.InputStream inputStream36 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream37 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream36);
        boolean boolean38 = zipArchiveInputStream37.markSupported();
        zipArchiveInputStream37.mark(100);
        java.io.InputStream inputStream41 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream42 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream41);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream43 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream42);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream44 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream43);
        java.io.InputStream inputStream45 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream46 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream45);
        boolean boolean47 = zipArchiveInputStream46.markSupported();
        zipArchiveInputStream46.mark((int) '4');
        java.io.InputStream inputStream50 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream51 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream50);
        zipArchiveInputStream51.mark(100);
        byte[] byteArray55 = zipArchiveInputStream51.readNBytes(0);
        int int56 = zipArchiveInputStream46.read(byteArray55);
        int int59 = zipArchiveInputStream43.read(byteArray55, (int) (short) -1, (int) (byte) 1);
        int int62 = zipArchiveInputStream37.read(byteArray55, (int) (byte) -1, (int) ' ');
        int int63 = zipArchiveInputStream29.read(byteArray55);
        int int64 = zipArchiveInputStream20.read(byteArray55);
        int int67 = zipArchiveInputStream16.read(byteArray55, (int) '#', 0);
        byte[] byteArray69 = zipArchiveInputStream16.readNBytes((int) (short) 1);
        zipArchiveInputStream16.close();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(archiveEntry17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] {});
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        zipArchiveInputStream1.mark((int) (byte) 100);
        int int8 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveInputStream1.canReadEntryData(archiveEntry9);
        int int11 = zipArchiveInputStream1.read();
        int int12 = zipArchiveInputStream1.read();
        zipArchiveInputStream1.mark(10);
        long long15 = zipArchiveInputStream1.getBytesRead();
        long long16 = zipArchiveInputStream1.getBytesRead();
        int int17 = zipArchiveInputStream1.read();
        long long18 = zipArchiveInputStream1.getBytesRead();
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream19);
        boolean boolean21 = zipArchiveInputStream20.markSupported();
        zipArchiveInputStream20.mark((int) '4');
        int int24 = zipArchiveInputStream20.read();
        java.io.InputStream inputStream25 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream25);
        boolean boolean27 = zipArchiveInputStream26.markSupported();
        zipArchiveInputStream26.mark((int) '4');
        long long31 = zipArchiveInputStream26.skip((long) (short) 10);
        zipArchiveInputStream26.mark((int) (short) -1);
        java.io.InputStream inputStream34 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream35 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream34);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream36 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream35);
        byte[] byteArray37 = new byte[] {};
        int int40 = zipArchiveInputStream36.read(byteArray37, (-1), 0);
        int int41 = zipArchiveInputStream26.read(byteArray37);
        boolean boolean42 = zipArchiveInputStream26.markSupported();
        int int43 = zipArchiveInputStream26.available();
        int int44 = zipArchiveInputStream26.read();
        int int45 = zipArchiveInputStream26.read();
        byte[] byteArray47 = zipArchiveInputStream26.readNBytes((int) (byte) 10);
        int int50 = zipArchiveInputStream20.read(byteArray47, (int) ' ', (int) (byte) 0);
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 0 };
        boolean boolean58 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray56, (-1));
        int int61 = zipArchiveInputStream20.read(byteArray56, (int) (byte) 100, (int) 'a');
        int int64 = zipArchiveInputStream1.read(byteArray56, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        long long4 = zipArchiveInputStream2.skip((long) 1);
        long long5 = zipArchiveInputStream2.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        long long3 = zipArchiveInputStream1.getBytesRead();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream4);
        zipArchiveInputStream5.mark(100);
        long long9 = zipArchiveInputStream5.skip((long) 1);
        byte[] byteArray11 = zipArchiveInputStream5.readNBytes(100);
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream12);
        zipArchiveInputStream13.mark(100);
        byte[] byteArray17 = zipArchiveInputStream13.readNBytes(0);
        zipArchiveInputStream13.mark((int) (byte) 100);
        int int20 = zipArchiveInputStream13.getCount();
        byte[] byteArray21 = zipArchiveInputStream13.readAllBytes();
        int int22 = zipArchiveInputStream5.read(byteArray21);
        int int25 = zipArchiveInputStream1.read(byteArray21, (int) (short) 0, 0);
        java.io.InputStream inputStream26 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream26);
        boolean boolean28 = zipArchiveInputStream27.markSupported();
        zipArchiveInputStream27.mark((int) '4');
        long long32 = zipArchiveInputStream27.skip((long) (short) 10);
        zipArchiveInputStream27.mark((int) (short) -1);
        java.io.InputStream inputStream35 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream36 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream35);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream37 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream36);
        byte[] byteArray38 = new byte[] {};
        int int41 = zipArchiveInputStream37.read(byteArray38, (-1), 0);
        int int42 = zipArchiveInputStream27.read(byteArray38);
        int int43 = zipArchiveInputStream1.read(byteArray38);
        int int44 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream45 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream46 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream45);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream47 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream46);
        byte[] byteArray48 = new byte[] {};
        int int51 = zipArchiveInputStream47.read(byteArray48, (-1), 0);
        long long53 = zipArchiveInputStream47.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry54 = null;
        boolean boolean55 = zipArchiveInputStream47.canReadEntryData(archiveEntry54);
        int int56 = zipArchiveInputStream47.available();
        byte[] byteArray58 = zipArchiveInputStream47.readNBytes((int) '#');
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream59 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream47);
        int int60 = zipArchiveInputStream59.read();
        java.io.InputStream inputStream61 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream62 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream61);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream63 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream62);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream64 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream63);
        java.io.InputStream inputStream65 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream66 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream65);
        boolean boolean67 = zipArchiveInputStream66.markSupported();
        zipArchiveInputStream66.mark((int) '4');
        java.io.InputStream inputStream70 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream71 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream70);
        zipArchiveInputStream71.mark(100);
        byte[] byteArray75 = zipArchiveInputStream71.readNBytes(0);
        int int76 = zipArchiveInputStream66.read(byteArray75);
        int int79 = zipArchiveInputStream63.read(byteArray75, (int) (short) -1, (int) (byte) 1);
        int int80 = zipArchiveInputStream59.read(byteArray75);
        int int83 = zipArchiveInputStream1.read(byteArray75, (int) (byte) 1, 10);
        byte[] byteArray85 = zipArchiveInputStream1.readNBytes((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] {});
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] {});
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] {});
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        int int4 = zipArchiveInputStream2.getCount();
        byte[] byteArray6 = zipArchiveInputStream2.readNBytes((int) ' ');
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        int int8 = zipArchiveInputStream7.available();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = zipArchiveInputStream7.getNextEntry();
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream11);
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream13);
        boolean boolean15 = zipArchiveInputStream14.markSupported();
        zipArchiveInputStream14.mark((int) '4');
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream18);
        zipArchiveInputStream19.mark(100);
        byte[] byteArray23 = zipArchiveInputStream19.readNBytes(0);
        int int24 = zipArchiveInputStream14.read(byteArray23);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry25 = null;
        boolean boolean26 = zipArchiveInputStream14.canReadEntryData(archiveEntry25);
        int int27 = zipArchiveInputStream14.getCount();
        byte[] byteArray28 = zipArchiveInputStream14.readAllBytes();
        int int29 = zipArchiveInputStream11.read(byteArray28);
        zipArchiveInputStream11.mark((int) (short) 10);
        byte[] byteArray32 = zipArchiveInputStream11.readAllBytes();
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        boolean boolean39 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray37, 0);
        boolean boolean41 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray37, 1);
        boolean boolean43 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray37, (int) ' ');
        int int44 = zipArchiveInputStream11.read(byteArray37);
        int int47 = zipArchiveInputStream7.read(byteArray37, (int) (byte) 0, (int) (byte) 10);
        boolean boolean49 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray37, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(archiveEntry9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark(100);
        int int5 = zipArchiveInputStream1.read();
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray8 = zipArchiveInputStream7.readAllBytes();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        byte[] byteArray5 = zipArchiveInputStream1.readNBytes(0);
        zipArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray10 = zipArchiveInputStream8.readNBytes(0);
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream11);
        zipArchiveInputStream12.mark(100);
        long long16 = zipArchiveInputStream12.skip((long) 1);
        boolean boolean17 = zipArchiveInputStream12.markSupported();
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream18);
        zipArchiveInputStream19.mark(100);
        byte[] byteArray23 = zipArchiveInputStream19.readNBytes(0);
        int int24 = zipArchiveInputStream12.read(byteArray23);
        boolean boolean25 = zipArchiveInputStream12.markSupported();
        boolean boolean26 = zipArchiveInputStream12.markSupported();
        int int27 = zipArchiveInputStream12.getCount();
        byte[] byteArray29 = zipArchiveInputStream12.readNBytes((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int32 = zipArchiveInputStream8.readNBytes(byteArray29, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [10, 10 + -1) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry2 = null;
        boolean boolean3 = zipArchiveInputStream1.canReadEntryData(archiveEntry2);
        byte[] byteArray4 = zipArchiveInputStream1.readAllBytes();
        byte[] byteArray5 = zipArchiveInputStream1.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark(100);
        int int5 = zipArchiveInputStream1.read();
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int8 = zipArchiveInputStream7.getCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        long long7 = zipArchiveInputStream1.skip((long) 0);
        int int8 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        int int12 = zipArchiveInputStream11.available();
        byte[] byteArray13 = zipArchiveInputStream11.readAllBytes();
        int int14 = zipArchiveInputStream1.read(byteArray13);
        boolean boolean15 = zipArchiveInputStream1.markSupported();
        boolean boolean16 = zipArchiveInputStream1.markSupported();
        int int17 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = zipArchiveInputStream1.canReadEntryData(archiveEntry18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream5);
        boolean boolean7 = zipArchiveInputStream6.markSupported();
        zipArchiveInputStream6.mark((int) '4');
        int int10 = zipArchiveInputStream6.getCount();
        long long12 = zipArchiveInputStream6.skip((long) 0);
        int int13 = zipArchiveInputStream6.read();
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream14);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream15);
        int int17 = zipArchiveInputStream16.available();
        byte[] byteArray18 = zipArchiveInputStream16.readAllBytes();
        int int19 = zipArchiveInputStream6.read(byteArray18);
        int int22 = zipArchiveInputStream1.read(byteArray18, 1, (int) (byte) 0);
        int int23 = zipArchiveInputStream1.available();
        boolean boolean24 = zipArchiveInputStream1.markSupported();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream3);
        boolean boolean5 = zipArchiveInputStream4.markSupported();
        zipArchiveInputStream4.mark((int) '4');
        int int8 = zipArchiveInputStream4.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveInputStream4.canReadEntryData(archiveEntry9);
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream11);
        zipArchiveInputStream12.mark(100);
        byte[] byteArray16 = zipArchiveInputStream12.readNBytes(0);
        int int19 = zipArchiveInputStream4.read(byteArray16, (int) (short) 100, (int) (byte) 0);
        java.io.InputStream inputStream20 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream20);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream21);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream22);
        byte[] byteArray25 = zipArchiveInputStream22.readNBytes((int) (byte) 10);
        int int28 = zipArchiveInputStream4.read(byteArray25, (int) (short) 100, (int) (byte) 0);
        byte[] byteArray29 = zipArchiveInputStream4.readAllBytes();
        int int30 = zipArchiveInputStream2.read(byteArray29);
        java.io.InputStream inputStream31 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream31);
        boolean boolean33 = zipArchiveInputStream32.markSupported();
        zipArchiveInputStream32.mark((int) '4');
        int int36 = zipArchiveInputStream32.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry37 = null;
        boolean boolean38 = zipArchiveInputStream32.canReadEntryData(archiveEntry37);
        java.io.InputStream inputStream39 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream40 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream39);
        zipArchiveInputStream40.mark(100);
        byte[] byteArray44 = zipArchiveInputStream40.readNBytes(0);
        zipArchiveInputStream40.mark((int) (byte) 100);
        int int47 = zipArchiveInputStream40.getCount();
        byte[] byteArray48 = zipArchiveInputStream40.readAllBytes();
        int int49 = zipArchiveInputStream32.read(byteArray48);
        int int50 = zipArchiveInputStream32.getCount();
        byte[] byteArray52 = zipArchiveInputStream32.readNBytes((int) ' ');
        int int53 = zipArchiveInputStream2.read(byteArray52);
        int int54 = zipArchiveInputStream2.available();
        int int55 = zipArchiveInputStream2.available();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] {});
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray3 = new byte[] {};
        int int6 = zipArchiveInputStream2.read(byteArray3, (-1), 0);
        long long8 = zipArchiveInputStream2.skip((long) (short) 0);
        boolean boolean9 = zipArchiveInputStream2.markSupported();
        zipArchiveInputStream2.mark(1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        int int6 = zipArchiveInputStream1.read();
        byte[] byteArray7 = zipArchiveInputStream1.readAllBytes();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        zipArchiveInputStream9.mark(100);
        long long13 = zipArchiveInputStream9.skip((long) 1);
        boolean boolean14 = zipArchiveInputStream9.markSupported();
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream15);
        zipArchiveInputStream16.mark(100);
        byte[] byteArray20 = zipArchiveInputStream16.readNBytes(0);
        int int21 = zipArchiveInputStream9.read(byteArray20);
        boolean boolean22 = zipArchiveInputStream9.markSupported();
        boolean boolean23 = zipArchiveInputStream9.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream9);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        boolean boolean31 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray29, 0);
        boolean boolean33 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray29, 1);
        boolean boolean35 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray29, (int) ' ');
        int int36 = zipArchiveInputStream24.read(byteArray29);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry37 = null;
        boolean boolean38 = zipArchiveInputStream24.canReadEntryData(archiveEntry37);
        int int39 = zipArchiveInputStream24.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry40 = zipArchiveInputStream24.getNextEntry();
        java.io.InputStream inputStream41 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream42 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream41);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream43 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream42);
        byte[] byteArray44 = new byte[] {};
        int int47 = zipArchiveInputStream43.read(byteArray44, (-1), 0);
        byte[] byteArray48 = zipArchiveInputStream43.readAllBytes();
        int int49 = zipArchiveInputStream24.read(byteArray48);
        int int52 = zipArchiveInputStream1.read(byteArray48, (int) 'a', 100);
        byte[] byteArray54 = zipArchiveInputStream1.readNBytes((int) (byte) 10);
        int int55 = zipArchiveInputStream1.read();
        int int56 = zipArchiveInputStream1.read();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(archiveEntry40);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.close();
        long long4 = zipArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = zipArchiveInputStream1.getNextEntry();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = zipArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The stream is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(archiveEntry5);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        byte[] byteArray4 = zipArchiveInputStream2.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        long long7 = zipArchiveInputStream5.skip(0L);
        int int8 = zipArchiveInputStream5.available();
        boolean boolean9 = zipArchiveInputStream5.markSupported();
        int int10 = zipArchiveInputStream5.available();
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        zipArchiveInputStream8.mark(100);
        byte[] byteArray12 = zipArchiveInputStream8.readNBytes(0);
        int int13 = zipArchiveInputStream1.read(byteArray12);
        boolean boolean14 = zipArchiveInputStream1.markSupported();
        boolean boolean15 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int17 = zipArchiveInputStream1.available();
        int int18 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream19);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream20);
        byte[] byteArray22 = new byte[] {};
        int int25 = zipArchiveInputStream21.read(byteArray22, (-1), 0);
        long long27 = zipArchiveInputStream21.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = null;
        boolean boolean29 = zipArchiveInputStream21.canReadEntryData(archiveEntry28);
        int int30 = zipArchiveInputStream21.available();
        byte[] byteArray32 = zipArchiveInputStream21.readNBytes((int) '#');
        int int35 = zipArchiveInputStream1.read(byteArray32, (int) '4', (-1));
        long long36 = zipArchiveInputStream1.getBytesRead();
        int int37 = zipArchiveInputStream1.read();
        byte[] byteArray38 = zipArchiveInputStream1.readAllBytes();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry39 = null;
        boolean boolean40 = zipArchiveInputStream1.canReadEntryData(archiveEntry39);
        long long42 = zipArchiveInputStream1.skip((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark(100);
        long long5 = zipArchiveInputStream1.skip((long) 1);
        int int6 = zipArchiveInputStream1.getCount();
        boolean boolean7 = zipArchiveInputStream1.markSupported();
        int int8 = zipArchiveInputStream1.available();
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        zipArchiveInputStream10.mark(100);
        boolean boolean13 = zipArchiveInputStream10.markSupported();
        int int14 = zipArchiveInputStream10.getCount();
        byte[] byteArray16 = zipArchiveInputStream10.readNBytes((int) (byte) 0);
        long long17 = zipArchiveInputStream10.getBytesRead();
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream18);
        zipArchiveInputStream19.mark(100);
        long long23 = zipArchiveInputStream19.skip((long) 1);
        int int24 = zipArchiveInputStream19.getCount();
        byte[] byteArray26 = zipArchiveInputStream19.readNBytes(100);
        int int29 = zipArchiveInputStream10.read(byteArray26, (int) (byte) 1, 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        int int31 = zipArchiveInputStream30.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream30);
        int int33 = zipArchiveInputStream30.available();
        byte[] byteArray35 = zipArchiveInputStream30.readNBytes(10);
        int int36 = zipArchiveInputStream1.read(byteArray35);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray3 = new byte[] {};
        int int6 = zipArchiveInputStream2.read(byteArray3, (-1), 0);
        long long8 = zipArchiveInputStream2.skip((long) (short) 0);
        boolean boolean9 = zipArchiveInputStream2.markSupported();
        int int10 = zipArchiveInputStream2.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = zipArchiveInputStream2.getNextZipEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = zipArchiveInputStream2.getNextZipEntry();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry11);
        org.junit.Assert.assertNull(zipArchiveEntry12);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream2.getNextZipEntry();
        byte[] byteArray4 = zipArchiveInputStream2.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = zipArchiveInputStream2.getNextZipEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = zipArchiveInputStream2.getNextEntry();
        byte[] byteArray7 = zipArchiveInputStream2.readAllBytes();
        boolean boolean8 = zipArchiveInputStream2.markSupported();
        int int9 = zipArchiveInputStream2.available();
        byte[] byteArray10 = zipArchiveInputStream2.readAllBytes();
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = zipArchiveInputStream2.transferTo(outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(zipArchiveEntry3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNull(zipArchiveEntry5);
        org.junit.Assert.assertNull(archiveEntry6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        boolean boolean2 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.mark((int) '4');
        int int5 = zipArchiveInputStream1.getCount();
        long long7 = zipArchiveInputStream1.skip((long) 0);
        int int8 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        int int12 = zipArchiveInputStream11.available();
        byte[] byteArray13 = zipArchiveInputStream11.readAllBytes();
        int int14 = zipArchiveInputStream1.read(byteArray13);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = zipArchiveInputStream1.canReadEntryData(archiveEntry15);
        int int17 = zipArchiveInputStream1.available();
        boolean boolean18 = zipArchiveInputStream1.markSupported();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        int int4 = zipArchiveInputStream2.getCount();
        byte[] byteArray6 = zipArchiveInputStream2.readNBytes((int) ' ');
        byte[] byteArray7 = zipArchiveInputStream2.readAllBytes();
        boolean boolean8 = zipArchiveInputStream2.markSupported();
        zipArchiveInputStream2.mark((int) '4');
        int int11 = zipArchiveInputStream2.getCount();
        byte[] byteArray12 = zipArchiveInputStream2.readAllBytes();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }
}

