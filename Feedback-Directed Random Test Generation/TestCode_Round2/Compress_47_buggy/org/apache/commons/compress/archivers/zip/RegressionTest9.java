package org.apache.commons.compress.archivers.zip;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = zipArchiveInputStream1.getNextEntry();
        long long5 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.mark((int) (short) -1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = zipArchiveInputStream1.getNextEntry();
        zipArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8");
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(archiveEntry4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(archiveEntry8);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", true);
        byte[] byteArray7 = zipArchiveInputStream5.readNBytes(0);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        long long10 = zipArchiveInputStream9.getBytesRead();
        boolean boolean11 = zipArchiveInputStream9.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream9.getNextEntry();
        long long13 = zipArchiveInputStream9.getBytesRead();
        zipArchiveInputStream9.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = zipArchiveInputStream9.getNextZipEntry();
        byte[] byteArray18 = zipArchiveInputStream9.readNBytes((int) (byte) 0);
        byte[] byteArray20 = zipArchiveInputStream9.readNBytes((int) (short) 1);
        int int23 = zipArchiveInputStream5.read(byteArray20, (int) (short) 10, (int) 'a');
        int int24 = zipArchiveInputStream5.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = zipArchiveInputStream5.getNextZipEntry();
        int int26 = zipArchiveInputStream5.read();
        byte[] byteArray27 = zipArchiveInputStream5.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(zipArchiveEntry25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = zipArchiveInputStream1.getNextEntry();
        long long5 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.mark((int) (short) -1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = zipArchiveInputStream1.getNextEntry();
        zipArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8");
        long long14 = zipArchiveInputStream12.skip((long) (byte) 10);
        long long15 = zipArchiveInputStream12.getBytesRead();
        int int16 = zipArchiveInputStream12.read();
        byte[] byteArray17 = zipArchiveInputStream12.readAllBytes();
        java.io.InputStream inputStream18 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream18);
        int int20 = zipArchiveInputStream19.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = zipArchiveInputStream19.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = null;
        boolean boolean23 = zipArchiveInputStream19.canReadEntryData(archiveEntry22);
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        inputStream24.mark((int) ' ');
        byte[] byteArray28 = new byte[] { (byte) 0 };
        int int29 = inputStream24.read(byteArray28);
        int int30 = zipArchiveInputStream19.read(byteArray28);
        long long31 = zipArchiveInputStream19.getBytesRead();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream19);
        int int33 = zipArchiveInputStream19.available();
        zipArchiveInputStream19.mark(1);
        byte[] byteArray37 = zipArchiveInputStream19.readNBytes((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = zipArchiveInputStream12.readNBytes(byteArray37, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [0, 0 + -1) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(archiveEntry4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(archiveEntry8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(archiveEntry21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        inputStream6.mark((int) ' ');
        byte[] byteArray10 = new byte[] { (byte) 0 };
        int int11 = inputStream6.read(byteArray10);
        int int12 = zipArchiveInputStream1.read(byteArray10);
        long long13 = zipArchiveInputStream1.getBytesRead();
        long long14 = zipArchiveInputStream1.getBytesRead();
        java.lang.String str15 = zipArchiveInputStream1.encoding;
        int int16 = zipArchiveInputStream1.read();
        java.lang.String str17 = zipArchiveInputStream1.encoding;
        int int18 = zipArchiveInputStream1.available();
        java.lang.Class<?> wildcardClass19 = zipArchiveInputStream1.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF8" + "'", str15, "UTF8");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTF8" + "'", str17, "UTF8");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        java.lang.String str6 = zipArchiveInputStream1.encoding;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveInputStream1.canReadEntryData(archiveEntry7);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveInputStream1.canReadEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", true, true);
        boolean boolean21 = zipArchiveInputStream20.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        zipArchiveInputStream11.mark((int) (short) 0);
        int int14 = zipArchiveInputStream11.getCount();
        long long15 = zipArchiveInputStream11.getBytesRead();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream11, "UTF8");
        java.lang.String str18 = zipArchiveInputStream11.encoding;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = zipArchiveInputStream11.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream11);
        byte[] byteArray21 = null;
        int int24 = zipArchiveInputStream20.read(byteArray21, (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTF8" + "'", str18, "UTF8");
        org.junit.Assert.assertNull(archiveEntry19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        zipArchiveInputStream11.mark((int) (short) 0);
        long long15 = zipArchiveInputStream11.skip((long) 0);
        int int16 = zipArchiveInputStream11.getCount();
        int int17 = zipArchiveInputStream11.read();
        int int18 = zipArchiveInputStream11.getCount();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        boolean boolean4 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7, "UTF8");
        int int10 = zipArchiveInputStream7.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7, "UTF8");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream7.canReadEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = zipArchiveInputStream7.getNextZipEntry();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(zipArchiveEntry15);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = zipArchiveInputStream11.getNextZipEntry();
        byte[] byteArray14 = zipArchiveInputStream11.readNBytes((int) (short) 100);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream15);
        long long17 = zipArchiveInputStream16.getBytesRead();
        boolean boolean18 = zipArchiveInputStream16.markSupported();
        int int19 = zipArchiveInputStream16.read();
        long long21 = zipArchiveInputStream16.skip((long) 0);
        zipArchiveInputStream16.mark((int) (short) 0);
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream24);
        int int26 = zipArchiveInputStream25.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry27 = zipArchiveInputStream25.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = null;
        boolean boolean29 = zipArchiveInputStream25.canReadEntryData(archiveEntry28);
        long long31 = zipArchiveInputStream25.skip((long) (short) 0);
        int int32 = zipArchiveInputStream25.getCount();
        java.io.InputStream inputStream33 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream34 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream33);
        int int35 = zipArchiveInputStream34.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry36 = zipArchiveInputStream34.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry37 = null;
        boolean boolean38 = zipArchiveInputStream34.canReadEntryData(archiveEntry37);
        java.io.InputStream inputStream39 = java.io.InputStream.nullInputStream();
        inputStream39.mark((int) ' ');
        byte[] byteArray43 = new byte[] { (byte) 0 };
        int int44 = inputStream39.read(byteArray43);
        int int45 = zipArchiveInputStream34.read(byteArray43);
        int int48 = zipArchiveInputStream25.read(byteArray43, (int) 'a', (int) (byte) 10);
        byte[] byteArray49 = zipArchiveInputStream25.readAllBytes();
        int int52 = zipArchiveInputStream16.read(byteArray49, (int) ' ', (int) (short) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream53 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream16);
        byte[] byteArray54 = zipArchiveInputStream16.readAllBytes();
        int int57 = zipArchiveInputStream11.read(byteArray54, (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry12);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(archiveEntry27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(inputStream33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(archiveEntry36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(inputStream39);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.getCount();
        java.lang.String str9 = zipArchiveInputStream1.encoding;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = zipArchiveInputStream1.getNextEntry();
        java.lang.String str11 = zipArchiveInputStream1.encoding;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false, true);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream16);
        int int18 = zipArchiveInputStream17.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = zipArchiveInputStream17.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = zipArchiveInputStream17.canReadEntryData(archiveEntry20);
        zipArchiveInputStream17.mark((int) (short) 10);
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream24);
        int int26 = zipArchiveInputStream25.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry27 = zipArchiveInputStream25.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = null;
        boolean boolean29 = zipArchiveInputStream25.canReadEntryData(archiveEntry28);
        long long31 = zipArchiveInputStream25.skip((long) (short) 0);
        int int32 = zipArchiveInputStream25.read();
        java.io.InputStream inputStream33 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream34 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream33);
        int int35 = zipArchiveInputStream34.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry36 = zipArchiveInputStream34.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry37 = null;
        boolean boolean38 = zipArchiveInputStream34.canReadEntryData(archiveEntry37);
        java.io.InputStream inputStream39 = java.io.InputStream.nullInputStream();
        inputStream39.mark((int) ' ');
        byte[] byteArray43 = new byte[] { (byte) 0 };
        int int44 = inputStream39.read(byteArray43);
        int int45 = zipArchiveInputStream34.read(byteArray43);
        int int48 = zipArchiveInputStream25.read(byteArray43, (int) (short) 100, (int) (byte) 0);
        java.io.InputStream inputStream49 = java.io.InputStream.nullInputStream();
        byte[] byteArray51 = inputStream49.readNBytes(100);
        int int54 = zipArchiveInputStream25.read(byteArray51, (int) (short) -1, (-1));
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry55 = null;
        boolean boolean56 = zipArchiveInputStream25.canReadEntryData(archiveEntry55);
        boolean boolean57 = zipArchiveInputStream25.markSupported();
        byte[] byteArray59 = zipArchiveInputStream25.readNBytes((int) (short) 0);
        int int62 = zipArchiveInputStream17.read(byteArray59, (int) '4', (int) (byte) 100);
        int int65 = zipArchiveInputStream15.read(byteArray59, 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
        org.junit.Assert.assertNull(archiveEntry10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(archiveEntry19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(archiveEntry27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(inputStream33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(archiveEntry36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(inputStream39);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(inputStream49);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] {});
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        long long4 = zipArchiveInputStream1.skip((long) 'a');
        java.lang.String str5 = zipArchiveInputStream1.encoding;
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        java.lang.String str7 = zipArchiveInputStream1.encoding;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        long long11 = zipArchiveInputStream10.getBytesRead();
        boolean boolean12 = zipArchiveInputStream10.markSupported();
        boolean boolean13 = zipArchiveInputStream10.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10, "UTF8", false);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream16, "UTF8");
        int int19 = zipArchiveInputStream16.getCount();
        byte[] byteArray20 = zipArchiveInputStream16.readAllBytes();
        int int21 = zipArchiveInputStream8.read(byteArray20);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        boolean boolean4 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7, "UTF8");
        zipArchiveInputStream7.mark(1);
        java.io.InputStream inputStream12 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream12);
        long long14 = zipArchiveInputStream13.getBytesRead();
        boolean boolean15 = zipArchiveInputStream13.markSupported();
        boolean boolean16 = zipArchiveInputStream13.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream13, "UTF8", false);
        java.io.InputStream inputStream20 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream20);
        int int22 = zipArchiveInputStream21.read();
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        byte[] byteArray25 = new byte[] { (byte) 0 };
        int int26 = inputStream23.read(byteArray25);
        int int29 = zipArchiveInputStream21.read(byteArray25, 0, (int) (short) -1);
        int int32 = zipArchiveInputStream13.read(byteArray25, (int) (byte) 100, (int) 'a');
        int int35 = zipArchiveInputStream7.read(byteArray25, (int) (byte) 100, (int) (byte) 0);
        int int36 = zipArchiveInputStream7.read();
        java.io.InputStream inputStream37 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream38 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream37);
        long long39 = zipArchiveInputStream38.getBytesRead();
        int int40 = zipArchiveInputStream38.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream43 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream38, "UTF8", false);
        java.io.InputStream inputStream44 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream45 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream44);
        int int46 = zipArchiveInputStream45.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry47 = zipArchiveInputStream45.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry48 = null;
        boolean boolean49 = zipArchiveInputStream45.canReadEntryData(archiveEntry48);
        java.io.InputStream inputStream50 = java.io.InputStream.nullInputStream();
        inputStream50.mark((int) ' ');
        byte[] byteArray54 = new byte[] { (byte) 0 };
        int int55 = inputStream50.read(byteArray54);
        int int56 = zipArchiveInputStream45.read(byteArray54);
        boolean boolean58 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray54, (int) (short) 100);
        int int59 = zipArchiveInputStream43.read(byteArray54);
        long long60 = zipArchiveInputStream43.getBytesRead();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry61 = zipArchiveInputStream43.getNextEntry();
        byte[] byteArray63 = zipArchiveInputStream43.readNBytes((int) (short) 10);
        int int64 = zipArchiveInputStream7.read(byteArray63);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry65 = null;
        boolean boolean66 = zipArchiveInputStream7.canReadEntryData(archiveEntry65);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(inputStream37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(inputStream44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(archiveEntry47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(inputStream50);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNull(archiveEntry61);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] {});
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        int int3 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        int int10 = zipArchiveInputStream9.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = zipArchiveInputStream9.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveInputStream9.canReadEntryData(archiveEntry12);
        java.lang.String str14 = zipArchiveInputStream9.encoding;
        zipArchiveInputStream9.mark((int) (short) 10);
        byte[] byteArray17 = zipArchiveInputStream9.readAllBytes();
        java.lang.String str18 = zipArchiveInputStream9.encoding;
        byte[] byteArray19 = zipArchiveInputStream9.readAllBytes();
        int int22 = zipArchiveInputStream1.read(byteArray19, (-1), 10);
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream23);
        long long25 = zipArchiveInputStream24.getBytesRead();
        boolean boolean26 = zipArchiveInputStream24.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry27 = zipArchiveInputStream24.getNextEntry();
        long long28 = zipArchiveInputStream24.getBytesRead();
        zipArchiveInputStream24.mark((int) (short) -1);
        byte[] byteArray32 = zipArchiveInputStream24.readNBytes((int) (short) 0);
        boolean boolean34 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray32, (int) (byte) 0);
        int int37 = zipArchiveInputStream1.read(byteArray32, (int) (short) -1, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream41 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", true, true);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(archiveEntry11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF8" + "'", str14, "UTF8");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTF8" + "'", str18, "UTF8");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(archiveEntry27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        int int11 = zipArchiveInputStream10.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream10.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream10.canReadEntryData(archiveEntry13);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        inputStream15.mark((int) ' ');
        byte[] byteArray19 = new byte[] { (byte) 0 };
        int int20 = inputStream15.read(byteArray19);
        int int21 = zipArchiveInputStream10.read(byteArray19);
        int int24 = zipArchiveInputStream1.read(byteArray19, (int) (short) 100, (int) (byte) 0);
        java.io.InputStream inputStream25 = java.io.InputStream.nullInputStream();
        byte[] byteArray27 = inputStream25.readNBytes(100);
        int int30 = zipArchiveInputStream1.read(byteArray27, (int) (short) -1, (-1));
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry31 = null;
        boolean boolean32 = zipArchiveInputStream1.canReadEntryData(archiveEntry31);
        boolean boolean33 = zipArchiveInputStream1.markSupported();
        byte[] byteArray35 = zipArchiveInputStream1.readNBytes((int) (short) 0);
        boolean boolean36 = zipArchiveInputStream1.markSupported();
        int int37 = zipArchiveInputStream1.available();
        boolean boolean38 = zipArchiveInputStream1.markSupported();
        byte[] byteArray39 = zipArchiveInputStream1.readAllBytes();
        zipArchiveInputStream1.mark(10);
        java.lang.String str42 = zipArchiveInputStream1.encoding;
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTF8" + "'", str42, "UTF8");
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = zipArchiveInputStream1.getNextEntry();
        long long5 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.mark((int) (short) -1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = zipArchiveInputStream1.getNextEntry();
        java.lang.String str9 = zipArchiveInputStream1.encoding;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = zipArchiveInputStream1.getNextEntry();
        java.io.InputStream inputStream12 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream12);
        long long14 = zipArchiveInputStream13.getBytesRead();
        boolean boolean15 = zipArchiveInputStream13.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = zipArchiveInputStream13.getNextEntry();
        long long17 = zipArchiveInputStream13.getBytesRead();
        zipArchiveInputStream13.mark((int) (short) -1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = zipArchiveInputStream13.getNextEntry();
        java.lang.String str21 = zipArchiveInputStream13.encoding;
        boolean boolean22 = zipArchiveInputStream13.markSupported();
        byte[] byteArray23 = zipArchiveInputStream13.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = zipArchiveInputStream1.readNBytes(byteArray23, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [10, 10 + 100) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(archiveEntry4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(archiveEntry8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
        org.junit.Assert.assertNull(archiveEntry10);
        org.junit.Assert.assertNull(archiveEntry11);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(archiveEntry16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(archiveEntry20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTF8" + "'", str21, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        int int3 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        int int10 = zipArchiveInputStream9.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = zipArchiveInputStream9.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveInputStream9.canReadEntryData(archiveEntry12);
        java.lang.String str14 = zipArchiveInputStream9.encoding;
        zipArchiveInputStream9.mark((int) (short) 10);
        byte[] byteArray17 = zipArchiveInputStream9.readAllBytes();
        java.lang.String str18 = zipArchiveInputStream9.encoding;
        byte[] byteArray19 = zipArchiveInputStream9.readAllBytes();
        int int22 = zipArchiveInputStream1.read(byteArray19, (-1), 10);
        java.io.OutputStream outputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long24 = zipArchiveInputStream1.transferTo(outputStream23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(archiveEntry11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF8" + "'", str14, "UTF8");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTF8" + "'", str18, "UTF8");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = zipArchiveInputStream1.getNextEntry();
        long long5 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = zipArchiveInputStream1.getNextZipEntry();
        byte[] byteArray10 = zipArchiveInputStream1.readNBytes((int) (byte) 0);
        byte[] byteArray12 = zipArchiveInputStream1.readNBytes((int) (short) 1);
        int int13 = zipArchiveInputStream1.read();
        int int14 = zipArchiveInputStream1.available();
        java.lang.String str15 = zipArchiveInputStream1.encoding;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int17 = zipArchiveInputStream1.getCount();
        byte[] byteArray18 = zipArchiveInputStream1.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(archiveEntry4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry8);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF8" + "'", str15, "UTF8");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        long long4 = zipArchiveInputStream1.skip((long) '#');
        zipArchiveInputStream1.mark((int) ' ');
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = zipArchiveInputStream1.getNextZipEntry();
        int int8 = zipArchiveInputStream1.getCount();
        zipArchiveInputStream1.close();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = zipArchiveInputStream1.getNextZipEntry();
        long long10 = zipArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false, false);
        int int17 = zipArchiveInputStream16.read();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(zipArchiveEntry9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        java.lang.String str12 = zipArchiveInputStream11.encoding;
        long long14 = zipArchiveInputStream11.skip((long) (short) 0);
        byte[] byteArray15 = zipArchiveInputStream11.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream11);
        int int17 = zipArchiveInputStream16.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream16);
        zipArchiveInputStream16.mark(0);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        int int4 = zipArchiveInputStream1.read();
        long long6 = zipArchiveInputStream1.skip((long) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveInputStream1.canReadEntryData(archiveEntry7);
        zipArchiveInputStream1.mark((int) (short) 1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream1.getNextEntry();
        byte[] byteArray14 = zipArchiveInputStream1.readNBytes((int) ' ');
        boolean boolean16 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray14, (int) (byte) 0);
        boolean boolean18 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray14, 1);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(archiveEntry11);
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        byte[] byteArray5 = new byte[] { (byte) 0 };
        int int6 = inputStream3.read(byteArray5);
        int int9 = zipArchiveInputStream1.read(byteArray5, 0, (int) (short) -1);
        java.lang.String str10 = zipArchiveInputStream1.encoding;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = zipArchiveInputStream1.getNextZipEntry();
        long long12 = zipArchiveInputStream1.getBytesRead();
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream13);
        long long15 = zipArchiveInputStream14.getBytesRead();
        boolean boolean16 = zipArchiveInputStream14.markSupported();
        int int17 = zipArchiveInputStream14.read();
        long long19 = zipArchiveInputStream14.skip((long) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = zipArchiveInputStream14.canReadEntryData(archiveEntry20);
        zipArchiveInputStream14.mark((int) (short) 1);
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream24);
        int int26 = zipArchiveInputStream25.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry27 = zipArchiveInputStream25.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = null;
        boolean boolean29 = zipArchiveInputStream25.canReadEntryData(archiveEntry28);
        java.io.InputStream inputStream30 = java.io.InputStream.nullInputStream();
        inputStream30.mark((int) ' ');
        byte[] byteArray34 = new byte[] { (byte) 0 };
        int int35 = inputStream30.read(byteArray34);
        int int36 = zipArchiveInputStream25.read(byteArray34);
        long long37 = zipArchiveInputStream25.getBytesRead();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream38 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream25);
        int int39 = zipArchiveInputStream25.available();
        java.io.InputStream inputStream40 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream41 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream40);
        int int42 = zipArchiveInputStream41.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry43 = zipArchiveInputStream41.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry44 = null;
        boolean boolean45 = zipArchiveInputStream41.canReadEntryData(archiveEntry44);
        long long47 = zipArchiveInputStream41.skip((long) (short) 0);
        int int48 = zipArchiveInputStream41.read();
        java.io.InputStream inputStream49 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream50 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream49);
        int int51 = zipArchiveInputStream50.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry52 = zipArchiveInputStream50.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry53 = null;
        boolean boolean54 = zipArchiveInputStream50.canReadEntryData(archiveEntry53);
        java.io.InputStream inputStream55 = java.io.InputStream.nullInputStream();
        inputStream55.mark((int) ' ');
        byte[] byteArray59 = new byte[] { (byte) 0 };
        int int60 = inputStream55.read(byteArray59);
        int int61 = zipArchiveInputStream50.read(byteArray59);
        int int64 = zipArchiveInputStream41.read(byteArray59, (int) (short) 100, (int) (byte) 0);
        java.io.InputStream inputStream65 = java.io.InputStream.nullInputStream();
        byte[] byteArray67 = inputStream65.readNBytes(100);
        int int70 = zipArchiveInputStream41.read(byteArray67, (int) (short) -1, (-1));
        byte[] byteArray71 = zipArchiveInputStream41.readAllBytes();
        int int74 = zipArchiveInputStream25.read(byteArray71, 0, (int) (byte) 0);
        int int77 = zipArchiveInputStream14.read(byteArray71, (int) '4', (int) '#');
        long long78 = zipArchiveInputStream14.getBytesRead();
        byte[] byteArray80 = zipArchiveInputStream14.readNBytes(0);
        int int83 = zipArchiveInputStream1.read(byteArray80, (int) '#', (-1));
        byte[] byteArray85 = zipArchiveInputStream1.readNBytes((int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream87 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8");
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
        org.junit.Assert.assertNull(zipArchiveEntry11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(archiveEntry27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(inputStream30);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(inputStream40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(archiveEntry43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(inputStream49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(archiveEntry52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(inputStream55);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(inputStream65);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] {});
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] {});
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] {});
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] {});
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        int int11 = zipArchiveInputStream10.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream10.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream10.canReadEntryData(archiveEntry13);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        inputStream15.mark((int) ' ');
        byte[] byteArray19 = new byte[] { (byte) 0 };
        int int20 = inputStream15.read(byteArray19);
        int int21 = zipArchiveInputStream10.read(byteArray19);
        int int24 = zipArchiveInputStream1.read(byteArray19, (int) (short) 100, (int) (byte) 0);
        java.io.InputStream inputStream25 = java.io.InputStream.nullInputStream();
        byte[] byteArray27 = inputStream25.readNBytes(100);
        int int30 = zipArchiveInputStream1.read(byteArray27, (int) (short) -1, (-1));
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry31 = null;
        boolean boolean32 = zipArchiveInputStream1.canReadEntryData(archiveEntry31);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        long long35 = zipArchiveInputStream1.skip((long) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream39 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false, false);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream40 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream44 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream40, "UTF8", false, true);
        byte[] byteArray45 = zipArchiveInputStream44.readAllBytes();
        boolean boolean46 = zipArchiveInputStream44.markSupported();
        long long47 = zipArchiveInputStream44.getBytesRead();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        int int4 = zipArchiveInputStream1.read();
        long long6 = zipArchiveInputStream1.skip((long) 0);
        byte[] byteArray8 = zipArchiveInputStream1.readNBytes((int) ' ');
        long long10 = zipArchiveInputStream1.skip((long) 0);
        java.lang.String str11 = zipArchiveInputStream1.encoding;
        long long13 = zipArchiveInputStream1.skip((long) (short) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        zipArchiveInputStream1.close();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = zipArchiveInputStream1.readAllBytes();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The stream is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        inputStream6.mark((int) ' ');
        byte[] byteArray10 = new byte[] { (byte) 0 };
        int int11 = inputStream6.read(byteArray10);
        int int12 = zipArchiveInputStream1.read(byteArray10);
        long long13 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.close();
        zipArchiveInputStream1.mark((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        int int11 = zipArchiveInputStream10.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream10.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream10.canReadEntryData(archiveEntry13);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        inputStream15.mark((int) ' ');
        byte[] byteArray19 = new byte[] { (byte) 0 };
        int int20 = inputStream15.read(byteArray19);
        int int21 = zipArchiveInputStream10.read(byteArray19);
        int int24 = zipArchiveInputStream1.read(byteArray19, (int) (short) 100, (int) (byte) 0);
        java.io.InputStream inputStream25 = java.io.InputStream.nullInputStream();
        byte[] byteArray27 = inputStream25.readNBytes(100);
        int int30 = zipArchiveInputStream1.read(byteArray27, (int) (short) -1, (-1));
        long long31 = zipArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = null;
        boolean boolean33 = zipArchiveInputStream1.canReadEntryData(archiveEntry32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream34 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        java.lang.String str35 = zipArchiveInputStream1.encoding;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry36 = zipArchiveInputStream1.getNextEntry();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTF8" + "'", str35, "UTF8");
        org.junit.Assert.assertNull(archiveEntry36);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        int int3 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        int int7 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        long long4 = zipArchiveInputStream1.skip((long) '#');
        byte[] byteArray5 = zipArchiveInputStream1.readAllBytes();
        long long6 = zipArchiveInputStream1.getBytesRead();
        int int7 = zipArchiveInputStream1.getCount();
        int int8 = zipArchiveInputStream1.available();
        zipArchiveInputStream1.mark(0);
        int int11 = zipArchiveInputStream1.read();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        inputStream0.mark((int) ' ');
        boolean boolean3 = inputStream0.markSupported();
        int int4 = inputStream0.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0, "UTF8", true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveInputStream7.canReadEntryData(archiveEntry8);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = zipArchiveInputStream7.getNextEntry();
        java.lang.String str11 = zipArchiveInputStream7.encoding;
        int int12 = zipArchiveInputStream7.getCount();
        int int13 = zipArchiveInputStream7.getCount();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveInputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(archiveEntry10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        inputStream6.mark((int) ' ');
        byte[] byteArray10 = new byte[] { (byte) 0 };
        int int11 = inputStream6.read(byteArray10);
        int int12 = zipArchiveInputStream1.read(byteArray10);
        int int13 = zipArchiveInputStream1.getCount();
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = zipArchiveInputStream1.transferTo(outputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        int int11 = zipArchiveInputStream10.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream10.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream10.canReadEntryData(archiveEntry13);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        inputStream15.mark((int) ' ');
        byte[] byteArray19 = new byte[] { (byte) 0 };
        int int20 = inputStream15.read(byteArray19);
        int int21 = zipArchiveInputStream10.read(byteArray19);
        int int24 = zipArchiveInputStream1.read(byteArray19, (int) (short) 100, (int) (byte) 0);
        int int25 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = zipArchiveInputStream1.getNextZipEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream28, "UTF8", false, false);
        boolean boolean33 = zipArchiveInputStream32.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        inputStream6.mark((int) ' ');
        byte[] byteArray10 = new byte[] { (byte) 0 };
        int int11 = inputStream6.read(byteArray10);
        int int12 = zipArchiveInputStream1.read(byteArray10);
        long long13 = zipArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        boolean boolean15 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = zipArchiveInputStream1.getNextEntry();
        int int17 = zipArchiveInputStream1.read();
        long long19 = zipArchiveInputStream1.skip((long) 10);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(archiveEntry16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        long long4 = zipArchiveInputStream1.skip((long) '#');
        java.lang.String str5 = zipArchiveInputStream1.encoding;
        java.lang.String str6 = zipArchiveInputStream1.encoding;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = zipArchiveInputStream1.getNextEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNull(archiveEntry7);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        java.lang.String str12 = zipArchiveInputStream11.encoding;
        long long14 = zipArchiveInputStream11.skip((long) (short) 0);
        boolean boolean15 = zipArchiveInputStream11.markSupported();
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream16);
        long long18 = zipArchiveInputStream17.getBytesRead();
        boolean boolean19 = zipArchiveInputStream17.markSupported();
        int int20 = zipArchiveInputStream17.read();
        long long22 = zipArchiveInputStream17.skip((long) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = null;
        boolean boolean24 = zipArchiveInputStream17.canReadEntryData(archiveEntry23);
        zipArchiveInputStream17.mark((int) (short) 1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry27 = zipArchiveInputStream17.getNextEntry();
        java.io.InputStream inputStream28 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream28);
        int int30 = zipArchiveInputStream29.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry31 = zipArchiveInputStream29.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = null;
        boolean boolean33 = zipArchiveInputStream29.canReadEntryData(archiveEntry32);
        long long35 = zipArchiveInputStream29.skip((long) (short) 0);
        int int36 = zipArchiveInputStream29.read();
        java.io.InputStream inputStream37 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream38 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream37);
        int int39 = zipArchiveInputStream38.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry40 = zipArchiveInputStream38.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry41 = null;
        boolean boolean42 = zipArchiveInputStream38.canReadEntryData(archiveEntry41);
        java.io.InputStream inputStream43 = java.io.InputStream.nullInputStream();
        inputStream43.mark((int) ' ');
        byte[] byteArray47 = new byte[] { (byte) 0 };
        int int48 = inputStream43.read(byteArray47);
        int int49 = zipArchiveInputStream38.read(byteArray47);
        int int52 = zipArchiveInputStream29.read(byteArray47, (int) (short) 100, (int) (byte) 0);
        java.io.InputStream inputStream53 = java.io.InputStream.nullInputStream();
        byte[] byteArray55 = inputStream53.readNBytes(100);
        int int58 = zipArchiveInputStream29.read(byteArray55, (int) (short) -1, (-1));
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry59 = null;
        boolean boolean60 = zipArchiveInputStream29.canReadEntryData(archiveEntry59);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream61 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream29);
        long long63 = zipArchiveInputStream29.skip((long) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream67 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream29, "UTF8", false, false);
        byte[] byteArray69 = zipArchiveInputStream67.readNBytes(0);
        int int70 = zipArchiveInputStream17.read(byteArray69);
        int int71 = zipArchiveInputStream11.read(byteArray69);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry72 = zipArchiveInputStream11.getNextZipEntry();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(archiveEntry27);
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(archiveEntry31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(inputStream37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(archiveEntry40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(inputStream43);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(inputStream53);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] {});
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry72);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        int int11 = zipArchiveInputStream10.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream10.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream10.canReadEntryData(archiveEntry13);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        inputStream15.mark((int) ' ');
        byte[] byteArray19 = new byte[] { (byte) 0 };
        int int20 = inputStream15.read(byteArray19);
        int int21 = zipArchiveInputStream10.read(byteArray19);
        int int24 = zipArchiveInputStream1.read(byteArray19, (int) (short) 100, (int) (byte) 0);
        java.io.InputStream inputStream25 = java.io.InputStream.nullInputStream();
        byte[] byteArray27 = inputStream25.readNBytes(100);
        int int30 = zipArchiveInputStream1.read(byteArray27, (int) (short) -1, (-1));
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry31 = null;
        boolean boolean32 = zipArchiveInputStream1.canReadEntryData(archiveEntry31);
        boolean boolean33 = zipArchiveInputStream1.markSupported();
        byte[] byteArray35 = zipArchiveInputStream1.readNBytes((int) (short) 0);
        byte[] byteArray37 = zipArchiveInputStream1.readNBytes((int) (short) 0);
        long long38 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.close();
        // The following exception was thrown during execution in test generation
        try {
            int int40 = zipArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The stream is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        int int3 = zipArchiveInputStream1.getCount();
        long long5 = zipArchiveInputStream1.skip((long) ' ');
        int int6 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", true, false);
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream11);
        int int13 = zipArchiveInputStream12.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream12, "UTF8", true);
        byte[] byteArray18 = zipArchiveInputStream16.readNBytes(0);
        java.io.InputStream inputStream19 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream19);
        long long21 = zipArchiveInputStream20.getBytesRead();
        boolean boolean22 = zipArchiveInputStream20.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = zipArchiveInputStream20.getNextEntry();
        long long24 = zipArchiveInputStream20.getBytesRead();
        zipArchiveInputStream20.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = zipArchiveInputStream20.getNextZipEntry();
        byte[] byteArray29 = zipArchiveInputStream20.readNBytes((int) (byte) 0);
        byte[] byteArray31 = zipArchiveInputStream20.readNBytes((int) (short) 1);
        int int34 = zipArchiveInputStream16.read(byteArray31, (int) (short) 10, (int) 'a');
        int int35 = zipArchiveInputStream16.available();
        java.lang.String str36 = zipArchiveInputStream16.encoding;
        long long37 = zipArchiveInputStream16.getBytesRead();
        java.io.InputStream inputStream38 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream39 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream38);
        int int40 = zipArchiveInputStream39.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry41 = zipArchiveInputStream39.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry42 = null;
        boolean boolean43 = zipArchiveInputStream39.canReadEntryData(archiveEntry42);
        long long45 = zipArchiveInputStream39.skip((long) (short) 0);
        int int46 = zipArchiveInputStream39.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream49 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream39, "UTF8", false);
        byte[] byteArray50 = zipArchiveInputStream49.readAllBytes();
        int int53 = zipArchiveInputStream16.read(byteArray50, 100, (int) (byte) 1);
        int int54 = zipArchiveInputStream1.read(byteArray50);
        zipArchiveInputStream1.mark(1);
        int int57 = zipArchiveInputStream1.available();
        byte[] byteArray58 = zipArchiveInputStream1.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream60 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(archiveEntry23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry27);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTF8" + "'", str36, "UTF8");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(inputStream38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(archiveEntry41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] {});
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] {});
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        java.lang.String str6 = zipArchiveInputStream1.encoding;
        zipArchiveInputStream1.mark((int) (short) 10);
        byte[] byteArray9 = zipArchiveInputStream1.readAllBytes();
        byte[] byteArray11 = zipArchiveInputStream1.readNBytes((int) (byte) 1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream1.getNextEntry();
        zipArchiveInputStream1.close();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = zipArchiveInputStream1.canReadEntryData(archiveEntry14);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = zipArchiveInputStream1.getNextZipEntry();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(zipArchiveEntry16);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        int int4 = zipArchiveInputStream1.read();
        long long6 = zipArchiveInputStream1.skip((long) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveInputStream1.canReadEntryData(archiveEntry7);
        zipArchiveInputStream1.mark((int) (short) 1);
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        byte[] byteArray13 = new byte[] { (byte) 0 };
        int int14 = inputStream11.read(byteArray13);
        boolean boolean16 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray13, (int) (short) 1);
        int int19 = zipArchiveInputStream1.read(byteArray13, 0, (int) (short) 0);
        long long21 = zipArchiveInputStream1.skip((long) (byte) 0);
        long long23 = zipArchiveInputStream1.skip(0L);
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        byte[] byteArray26 = inputStream24.readNBytes(100);
        boolean boolean28 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray26, (int) (byte) -1);
        int int31 = zipArchiveInputStream1.read(byteArray26, (int) 'a', 0);
        boolean boolean32 = zipArchiveInputStream1.markSupported();
        long long34 = zipArchiveInputStream1.skip((long) 1);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        int int11 = zipArchiveInputStream10.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream10.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream10.canReadEntryData(archiveEntry13);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        inputStream15.mark((int) ' ');
        byte[] byteArray19 = new byte[] { (byte) 0 };
        int int20 = inputStream15.read(byteArray19);
        int int21 = zipArchiveInputStream10.read(byteArray19);
        int int24 = zipArchiveInputStream1.read(byteArray19, (int) (short) 100, (int) (byte) 0);
        java.io.InputStream inputStream25 = java.io.InputStream.nullInputStream();
        byte[] byteArray27 = inputStream25.readNBytes(100);
        int int30 = zipArchiveInputStream1.read(byteArray27, (int) (short) -1, (-1));
        byte[] byteArray31 = zipArchiveInputStream1.readAllBytes();
        long long32 = zipArchiveInputStream1.getBytesRead();
        java.io.InputStream inputStream33 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream34 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream33);
        byte[] byteArray35 = inputStream33.readAllBytes();
        byte[] byteArray36 = inputStream33.readAllBytes();
        boolean boolean38 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray36, 0);
        boolean boolean40 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray36, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int43 = zipArchiveInputStream1.readNBytes(byteArray36, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [1, 1 + -1) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(inputStream33);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", true);
        byte[] byteArray7 = zipArchiveInputStream5.readNBytes(0);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        long long10 = zipArchiveInputStream9.getBytesRead();
        boolean boolean11 = zipArchiveInputStream9.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream9.getNextEntry();
        long long13 = zipArchiveInputStream9.getBytesRead();
        zipArchiveInputStream9.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = zipArchiveInputStream9.getNextZipEntry();
        byte[] byteArray18 = zipArchiveInputStream9.readNBytes((int) (byte) 0);
        byte[] byteArray20 = zipArchiveInputStream9.readNBytes((int) (short) 1);
        int int23 = zipArchiveInputStream5.read(byteArray20, (int) (short) 10, (int) 'a');
        byte[] byteArray25 = zipArchiveInputStream5.readNBytes((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        byte[] byteArray28 = zipArchiveInputStream26.readNBytes(10);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", true);
        byte[] byteArray7 = zipArchiveInputStream5.readNBytes(0);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        long long10 = zipArchiveInputStream9.getBytesRead();
        boolean boolean11 = zipArchiveInputStream9.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream9.getNextEntry();
        long long13 = zipArchiveInputStream9.getBytesRead();
        zipArchiveInputStream9.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = zipArchiveInputStream9.getNextZipEntry();
        byte[] byteArray18 = zipArchiveInputStream9.readNBytes((int) (byte) 0);
        byte[] byteArray20 = zipArchiveInputStream9.readNBytes((int) (short) 1);
        int int23 = zipArchiveInputStream5.read(byteArray20, (int) (short) 10, (int) 'a');
        int int24 = zipArchiveInputStream5.available();
        java.lang.String str25 = zipArchiveInputStream5.encoding;
        java.io.InputStream inputStream26 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream26);
        byte[] byteArray28 = inputStream26.readAllBytes();
        byte[] byteArray29 = inputStream26.readAllBytes();
        boolean boolean31 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray29, 0);
        boolean boolean33 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray29, (int) (short) 1);
        int int34 = zipArchiveInputStream5.read(byteArray29);
        java.io.OutputStream outputStream35 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long36 = zipArchiveInputStream5.transferTo(outputStream35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTF8" + "'", str25, "UTF8");
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        zipArchiveInputStream11.mark((int) (short) 0);
        int int14 = zipArchiveInputStream11.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream11, "UTF8", false);
        boolean boolean18 = zipArchiveInputStream17.markSupported();
        long long20 = zipArchiveInputStream17.skip((long) (short) 10);
        zipArchiveInputStream17.mark((int) (byte) 1);
        java.lang.String str23 = zipArchiveInputStream17.encoding;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = zipArchiveInputStream17.getNextZipEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream17);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTF8" + "'", str23, "UTF8");
        org.junit.Assert.assertNull(zipArchiveEntry24);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        int int11 = zipArchiveInputStream10.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream10.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream10.canReadEntryData(archiveEntry13);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        inputStream15.mark((int) ' ');
        byte[] byteArray19 = new byte[] { (byte) 0 };
        int int20 = inputStream15.read(byteArray19);
        int int21 = zipArchiveInputStream10.read(byteArray19);
        int int24 = zipArchiveInputStream1.read(byteArray19, (int) (short) 100, (int) (byte) 0);
        java.io.InputStream inputStream25 = java.io.InputStream.nullInputStream();
        byte[] byteArray27 = inputStream25.readNBytes(100);
        int int30 = zipArchiveInputStream1.read(byteArray27, (int) (short) -1, (-1));
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry31 = null;
        boolean boolean32 = zipArchiveInputStream1.canReadEntryData(archiveEntry31);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        zipArchiveInputStream1.mark((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream36 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        zipArchiveInputStream1.mark((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = zipArchiveInputStream1.getNextZipEntry();
        long long41 = zipArchiveInputStream1.skip((long) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream42 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry43 = null;
        boolean boolean44 = zipArchiveInputStream1.canReadEntryData(archiveEntry43);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream45 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int46 = zipArchiveInputStream1.available();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(zipArchiveEntry39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        int int4 = zipArchiveInputStream1.read();
        long long6 = zipArchiveInputStream1.skip((long) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveInputStream1.canReadEntryData(archiveEntry7);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        int int11 = zipArchiveInputStream10.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10, "UTF8", true);
        byte[] byteArray16 = zipArchiveInputStream14.readNBytes(0);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream17);
        long long19 = zipArchiveInputStream18.getBytesRead();
        boolean boolean20 = zipArchiveInputStream18.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = zipArchiveInputStream18.getNextEntry();
        long long22 = zipArchiveInputStream18.getBytesRead();
        zipArchiveInputStream18.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = zipArchiveInputStream18.getNextZipEntry();
        byte[] byteArray27 = zipArchiveInputStream18.readNBytes((int) (byte) 0);
        byte[] byteArray29 = zipArchiveInputStream18.readNBytes((int) (short) 1);
        int int32 = zipArchiveInputStream14.read(byteArray29, (int) (short) 10, (int) 'a');
        int int33 = zipArchiveInputStream14.available();
        java.lang.String str34 = zipArchiveInputStream14.encoding;
        long long35 = zipArchiveInputStream14.getBytesRead();
        java.io.InputStream inputStream36 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream37 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream36);
        int int38 = zipArchiveInputStream37.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry39 = zipArchiveInputStream37.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry40 = null;
        boolean boolean41 = zipArchiveInputStream37.canReadEntryData(archiveEntry40);
        long long43 = zipArchiveInputStream37.skip((long) (short) 0);
        int int44 = zipArchiveInputStream37.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream47 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream37, "UTF8", false);
        byte[] byteArray48 = zipArchiveInputStream47.readAllBytes();
        int int51 = zipArchiveInputStream14.read(byteArray48, 100, (int) (byte) 1);
        int int54 = zipArchiveInputStream1.read(byteArray48, (int) (byte) 10, (int) '#');
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream57 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", true);
        int int58 = zipArchiveInputStream57.getCount();
        java.lang.String str59 = zipArchiveInputStream57.encoding;
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(archiveEntry21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry25);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTF8" + "'", str34, "UTF8");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(inputStream36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(archiveEntry39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "UTF8" + "'", str59, "UTF8");
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        inputStream6.mark((int) ' ');
        byte[] byteArray10 = new byte[] { (byte) 0 };
        int int11 = inputStream6.read(byteArray10);
        int int12 = zipArchiveInputStream1.read(byteArray10);
        long long13 = zipArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int15 = zipArchiveInputStream1.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", true);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", true, true);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = zipArchiveInputStream1.getNextEntry();
        long long5 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = zipArchiveInputStream1.getNextZipEntry();
        byte[] byteArray10 = zipArchiveInputStream1.readNBytes((int) (byte) 0);
        byte[] byteArray12 = zipArchiveInputStream1.readNBytes((int) (short) 1);
        int int13 = zipArchiveInputStream1.read();
        int int14 = zipArchiveInputStream1.available();
        java.lang.String str15 = zipArchiveInputStream1.encoding;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveInputStream16.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(archiveEntry4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry8);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF8" + "'", str15, "UTF8");
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = zipArchiveInputStream1.getNextEntry();
        long long5 = zipArchiveInputStream1.getBytesRead();
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        long long8 = zipArchiveInputStream1.skip(1L);
        long long9 = zipArchiveInputStream1.getBytesRead();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(archiveEntry4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        java.lang.String str6 = zipArchiveInputStream1.encoding;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveInputStream1.canReadEntryData(archiveEntry7);
        long long9 = zipArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = zipArchiveInputStream1.getNextEntry();
        byte[] byteArray12 = zipArchiveInputStream1.readNBytes((int) ' ');
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream13);
        int int15 = zipArchiveInputStream14.read();
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = new byte[] { (byte) 0 };
        int int19 = inputStream16.read(byteArray18);
        int int22 = zipArchiveInputStream14.read(byteArray18, 0, (int) (short) -1);
        byte[] byteArray24 = zipArchiveInputStream14.readNBytes((int) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream14, "UTF8");
        java.io.InputStream inputStream27 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream27);
        int int29 = zipArchiveInputStream28.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = zipArchiveInputStream28.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry31 = null;
        boolean boolean32 = zipArchiveInputStream28.canReadEntryData(archiveEntry31);
        java.lang.String str33 = zipArchiveInputStream28.encoding;
        zipArchiveInputStream28.mark((int) (short) 10);
        byte[] byteArray36 = zipArchiveInputStream28.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry37 = zipArchiveInputStream28.getNextZipEntry();
        boolean boolean38 = zipArchiveInputStream28.markSupported();
        byte[] byteArray40 = zipArchiveInputStream28.readNBytes((int) ' ');
        int int41 = zipArchiveInputStream26.read(byteArray40);
        int int42 = zipArchiveInputStream1.read(byteArray40);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry43 = null;
        boolean boolean44 = zipArchiveInputStream1.canReadEntryData(archiveEntry43);
        byte[] byteArray46 = zipArchiveInputStream1.readNBytes((int) (byte) 10);
        byte[] byteArray47 = zipArchiveInputStream1.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(archiveEntry10);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(archiveEntry30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTF8" + "'", str33, "UTF8");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertNull(zipArchiveEntry37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = zipArchiveInputStream1.getNextZipEntry();
        int int5 = zipArchiveInputStream1.getCount();
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        long long8 = zipArchiveInputStream1.skip(0L);
        int int9 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = zipArchiveInputStream1.getNextZipEntry();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertNull(zipArchiveEntry4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(zipArchiveEntry10);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = zipArchiveInputStream1.getNextEntry();
        long long5 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.mark((int) (short) -1);
        byte[] byteArray9 = zipArchiveInputStream1.readNBytes((int) (short) 0);
        java.io.InputStream inputStream10 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream10);
        int int12 = zipArchiveInputStream11.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = zipArchiveInputStream11.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = zipArchiveInputStream11.canReadEntryData(archiveEntry14);
        java.lang.String str16 = zipArchiveInputStream11.encoding;
        zipArchiveInputStream11.mark((int) (short) 1);
        java.lang.String str19 = zipArchiveInputStream11.encoding;
        int int20 = zipArchiveInputStream11.available();
        zipArchiveInputStream11.mark((int) (byte) 1);
        byte[] byteArray24 = zipArchiveInputStream11.readNBytes((int) ' ');
        int int25 = zipArchiveInputStream1.read(byteArray24);
        zipArchiveInputStream1.mark((-1));
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(archiveEntry4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(archiveEntry13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTF8" + "'", str16, "UTF8");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTF8" + "'", str19, "UTF8");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        long long4 = zipArchiveInputStream1.skip((long) '#');
        byte[] byteArray5 = zipArchiveInputStream1.readAllBytes();
        zipArchiveInputStream1.mark((int) ' ');
        zipArchiveInputStream1.mark((int) (short) -1);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = zipArchiveInputStream1.getNextZipEntry();
        long long10 = zipArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8");
        zipArchiveInputStream12.mark((int) '#');
        long long15 = zipArchiveInputStream12.getBytesRead();
        byte[] byteArray17 = zipArchiveInputStream12.readNBytes(0);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(zipArchiveEntry9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        int int11 = zipArchiveInputStream10.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream10.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream10.canReadEntryData(archiveEntry13);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        inputStream15.mark((int) ' ');
        byte[] byteArray19 = new byte[] { (byte) 0 };
        int int20 = inputStream15.read(byteArray19);
        int int21 = zipArchiveInputStream10.read(byteArray19);
        int int24 = zipArchiveInputStream1.read(byteArray19, (int) (short) 100, (int) (byte) 0);
        int int25 = zipArchiveInputStream1.read();
        zipArchiveInputStream1.mark(10);
        long long28 = zipArchiveInputStream1.getBytesRead();
        long long29 = zipArchiveInputStream1.getBytesRead();
        int int30 = zipArchiveInputStream1.read();
        int int31 = zipArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        long long4 = zipArchiveInputStream1.skip((long) '#');
        java.lang.String str5 = zipArchiveInputStream1.encoding;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = zipArchiveInputStream1.getNextEntry();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertNull(archiveEntry6);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        int int4 = zipArchiveInputStream1.read();
        long long6 = zipArchiveInputStream1.skip((long) 0);
        byte[] byteArray8 = zipArchiveInputStream1.readNBytes((int) ' ');
        long long10 = zipArchiveInputStream1.skip((long) 0);
        int int11 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = zipArchiveInputStream1.getNextZipEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = zipArchiveInputStream1.getNextEntry();
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream14);
        int int16 = zipArchiveInputStream15.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = zipArchiveInputStream15.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = zipArchiveInputStream15.canReadEntryData(archiveEntry18);
        long long21 = zipArchiveInputStream15.skip((long) (short) 0);
        int int22 = zipArchiveInputStream15.read();
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream23);
        int int25 = zipArchiveInputStream24.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry26 = zipArchiveInputStream24.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry27 = null;
        boolean boolean28 = zipArchiveInputStream24.canReadEntryData(archiveEntry27);
        java.io.InputStream inputStream29 = java.io.InputStream.nullInputStream();
        inputStream29.mark((int) ' ');
        byte[] byteArray33 = new byte[] { (byte) 0 };
        int int34 = inputStream29.read(byteArray33);
        int int35 = zipArchiveInputStream24.read(byteArray33);
        int int38 = zipArchiveInputStream15.read(byteArray33, (int) (short) 100, (int) (byte) 0);
        java.io.InputStream inputStream39 = java.io.InputStream.nullInputStream();
        byte[] byteArray41 = inputStream39.readNBytes(100);
        int int44 = zipArchiveInputStream15.read(byteArray41, (int) (short) -1, (-1));
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry45 = null;
        boolean boolean46 = zipArchiveInputStream15.canReadEntryData(archiveEntry45);
        boolean boolean47 = zipArchiveInputStream15.markSupported();
        byte[] byteArray49 = zipArchiveInputStream15.readNBytes((int) (short) 0);
        int int52 = zipArchiveInputStream1.read(byteArray49, (int) (byte) 1, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream54 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8");
        int int55 = zipArchiveInputStream54.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream57 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream54, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(zipArchiveEntry12);
        org.junit.Assert.assertNull(archiveEntry13);
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(archiveEntry17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(archiveEntry26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(inputStream29);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(inputStream39);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        zipArchiveInputStream1.close();
        zipArchiveInputStream1.mark((int) (byte) 10);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveInputStream1.canReadEntryData(archiveEntry7);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = zipArchiveInputStream1.getNextZipEntry();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(zipArchiveEntry9);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        java.lang.String str6 = zipArchiveInputStream1.encoding;
        zipArchiveInputStream1.mark((int) (short) 10);
        byte[] byteArray9 = zipArchiveInputStream1.readAllBytes();
        byte[] byteArray11 = zipArchiveInputStream1.readNBytes((int) (byte) 1);
        byte[] byteArray13 = zipArchiveInputStream1.readNBytes((int) (short) 10);
        java.lang.String str14 = zipArchiveInputStream1.encoding;
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF8" + "'", str14, "UTF8");
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        zipArchiveInputStream11.mark((int) (short) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = zipArchiveInputStream11.getNextEntry();
        int int15 = zipArchiveInputStream11.getCount();
        boolean boolean16 = zipArchiveInputStream11.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream11);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(archiveEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) ' ');
        zipArchiveInputStream1.mark((int) '#');
        byte[] byteArray6 = zipArchiveInputStream1.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        java.lang.String str6 = zipArchiveInputStream1.encoding;
        zipArchiveInputStream1.mark((int) (short) 10);
        byte[] byteArray9 = zipArchiveInputStream1.readAllBytes();
        byte[] byteArray11 = zipArchiveInputStream1.readNBytes((int) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray14 = zipArchiveInputStream1.readNBytes((int) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream15, "", false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        boolean boolean4 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7, "UTF8");
        zipArchiveInputStream7.mark(1);
        int int12 = zipArchiveInputStream7.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7, "UTF8", false);
        int int16 = zipArchiveInputStream7.getCount();
        long long17 = zipArchiveInputStream7.getBytesRead();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7, "UTF8", true, false);
        java.lang.String str22 = zipArchiveInputStream21.encoding;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = zipArchiveInputStream21.getNextZipEntry();
        long long25 = zipArchiveInputStream21.skip(10L);
        java.io.InputStream inputStream26 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream26);
        int int28 = zipArchiveInputStream27.read();
        byte[] byteArray29 = zipArchiveInputStream27.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int32 = zipArchiveInputStream21.readNBytes(byteArray29, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [100, 100 + -1) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTF8" + "'", str22, "UTF8");
        org.junit.Assert.assertNull(zipArchiveEntry23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        inputStream6.mark((int) ' ');
        byte[] byteArray10 = new byte[] { (byte) 0 };
        int int11 = inputStream6.read(byteArray10);
        int int12 = zipArchiveInputStream1.read(byteArray10);
        byte[] byteArray13 = zipArchiveInputStream1.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int15 = zipArchiveInputStream1.available();
        java.lang.String str16 = zipArchiveInputStream1.encoding;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTF8" + "'", str16, "UTF8");
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        int int4 = zipArchiveInputStream1.read();
        long long6 = zipArchiveInputStream1.skip((long) 0);
        zipArchiveInputStream1.mark((int) (short) 0);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        int int11 = zipArchiveInputStream10.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream10.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream10.canReadEntryData(archiveEntry13);
        long long16 = zipArchiveInputStream10.skip((long) (short) 0);
        int int17 = zipArchiveInputStream10.getCount();
        java.io.InputStream inputStream18 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream18);
        int int20 = zipArchiveInputStream19.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = zipArchiveInputStream19.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = null;
        boolean boolean23 = zipArchiveInputStream19.canReadEntryData(archiveEntry22);
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        inputStream24.mark((int) ' ');
        byte[] byteArray28 = new byte[] { (byte) 0 };
        int int29 = inputStream24.read(byteArray28);
        int int30 = zipArchiveInputStream19.read(byteArray28);
        int int33 = zipArchiveInputStream10.read(byteArray28, (int) 'a', (int) (byte) 10);
        byte[] byteArray34 = zipArchiveInputStream10.readAllBytes();
        int int37 = zipArchiveInputStream1.read(byteArray34, (int) ' ', (int) (short) 10);
        boolean boolean38 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry39 = null;
        boolean boolean40 = zipArchiveInputStream1.canReadEntryData(archiveEntry39);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(archiveEntry21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        java.lang.String str6 = zipArchiveInputStream1.encoding;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveInputStream1.canReadEntryData(archiveEntry7);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveInputStream1.canReadEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        long long18 = zipArchiveInputStream1.skip((long) (short) 100);
        java.io.InputStream inputStream19 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream19);
        int int21 = zipArchiveInputStream20.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = zipArchiveInputStream20.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = null;
        boolean boolean24 = zipArchiveInputStream20.canReadEntryData(archiveEntry23);
        long long26 = zipArchiveInputStream20.skip((long) (short) 0);
        int int27 = zipArchiveInputStream20.read();
        java.io.InputStream inputStream28 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream28);
        int int30 = zipArchiveInputStream29.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry31 = zipArchiveInputStream29.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = null;
        boolean boolean33 = zipArchiveInputStream29.canReadEntryData(archiveEntry32);
        java.io.InputStream inputStream34 = java.io.InputStream.nullInputStream();
        inputStream34.mark((int) ' ');
        byte[] byteArray38 = new byte[] { (byte) 0 };
        int int39 = inputStream34.read(byteArray38);
        int int40 = zipArchiveInputStream29.read(byteArray38);
        int int43 = zipArchiveInputStream20.read(byteArray38, (int) (short) 100, (int) (byte) 0);
        java.io.InputStream inputStream44 = java.io.InputStream.nullInputStream();
        byte[] byteArray46 = inputStream44.readNBytes(100);
        int int49 = zipArchiveInputStream20.read(byteArray46, (int) (short) -1, (-1));
        byte[] byteArray51 = zipArchiveInputStream20.readNBytes((int) (byte) 0);
        int int54 = zipArchiveInputStream1.read(byteArray51, (-1), 1);
        long long56 = zipArchiveInputStream1.skip((long) '4');
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(archiveEntry22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(archiveEntry31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(inputStream44);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        byte[] byteArray5 = new byte[] { (byte) 0 };
        int int6 = inputStream3.read(byteArray5);
        int int9 = zipArchiveInputStream1.read(byteArray5, 0, (int) (short) -1);
        byte[] byteArray11 = zipArchiveInputStream1.readNBytes((int) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream13);
        boolean boolean15 = zipArchiveInputStream13.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = null;
        boolean boolean17 = zipArchiveInputStream13.canReadEntryData(archiveEntry16);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        zipArchiveInputStream1.close();
        long long13 = zipArchiveInputStream1.getBytesRead();
        int int14 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", true);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream17);
        zipArchiveInputStream17.mark((int) (byte) 1);
        java.io.InputStream inputStream21 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream21);
        long long23 = zipArchiveInputStream22.getBytesRead();
        boolean boolean24 = zipArchiveInputStream22.markSupported();
        int int25 = zipArchiveInputStream22.read();
        long long27 = zipArchiveInputStream22.skip((long) 0);
        java.io.InputStream inputStream28 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream28);
        long long30 = zipArchiveInputStream29.getBytesRead();
        boolean boolean31 = zipArchiveInputStream29.markSupported();
        boolean boolean32 = zipArchiveInputStream29.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream35 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream29, "UTF8", false);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream37 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream35, "UTF8");
        zipArchiveInputStream35.mark(1);
        java.io.InputStream inputStream40 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream41 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream40);
        long long42 = zipArchiveInputStream41.getBytesRead();
        boolean boolean43 = zipArchiveInputStream41.markSupported();
        boolean boolean44 = zipArchiveInputStream41.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream47 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream41, "UTF8", false);
        java.io.InputStream inputStream48 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream49 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream48);
        int int50 = zipArchiveInputStream49.read();
        java.io.InputStream inputStream51 = java.io.InputStream.nullInputStream();
        byte[] byteArray53 = new byte[] { (byte) 0 };
        int int54 = inputStream51.read(byteArray53);
        int int57 = zipArchiveInputStream49.read(byteArray53, 0, (int) (short) -1);
        int int60 = zipArchiveInputStream41.read(byteArray53, (int) (byte) 100, (int) 'a');
        int int63 = zipArchiveInputStream35.read(byteArray53, (int) (byte) 100, (int) (byte) 0);
        int int66 = zipArchiveInputStream22.read(byteArray53, (int) (byte) 1, (int) (byte) 1);
        int int67 = zipArchiveInputStream17.read(byteArray53);
        boolean boolean69 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray53, 1);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(inputStream40);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(inputStream48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(inputStream51);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        int int3 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        int int9 = zipArchiveInputStream8.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = zipArchiveInputStream8.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = zipArchiveInputStream8.canReadEntryData(archiveEntry11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        inputStream13.mark((int) ' ');
        byte[] byteArray17 = new byte[] { (byte) 0 };
        int int18 = inputStream13.read(byteArray17);
        int int19 = zipArchiveInputStream8.read(byteArray17);
        boolean boolean21 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray17, (int) (short) 100);
        int int22 = zipArchiveInputStream6.read(byteArray17);
        long long23 = zipArchiveInputStream6.getBytesRead();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = zipArchiveInputStream6.getNextZipEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream6, "UTF8", true, true);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(archiveEntry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry24);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8");
        int int11 = zipArchiveInputStream10.available();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream10.getNextEntry();
        int int13 = zipArchiveInputStream10.getCount();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        long long4 = zipArchiveInputStream1.skip((long) 'a');
        int int5 = zipArchiveInputStream1.available();
        long long7 = zipArchiveInputStream1.skip(100L);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        int int4 = zipArchiveInputStream1.read();
        long long6 = zipArchiveInputStream1.skip((long) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveInputStream1.canReadEntryData(archiveEntry7);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = zipArchiveInputStream11.getNextZipEntry();
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream13);
        int int15 = zipArchiveInputStream14.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = zipArchiveInputStream14.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = zipArchiveInputStream14.getNextZipEntry();
        int int18 = zipArchiveInputStream14.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        boolean boolean20 = zipArchiveInputStream14.canReadEntryData(archiveEntry19);
        java.io.InputStream inputStream21 = java.io.InputStream.nullInputStream();
        inputStream21.mark((int) ' ');
        byte[] byteArray25 = new byte[] { (byte) 0 };
        int int26 = inputStream21.read(byteArray25);
        int int29 = zipArchiveInputStream14.read(byteArray25, 100, (int) (byte) 100);
        int int30 = zipArchiveInputStream11.read(byteArray25);
        long long31 = zipArchiveInputStream11.getBytesRead();
        long long33 = zipArchiveInputStream11.skip((long) (byte) 1);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(zipArchiveEntry12);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(archiveEntry16);
        org.junit.Assert.assertNull(zipArchiveEntry17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        int int11 = zipArchiveInputStream10.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream10.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream10.canReadEntryData(archiveEntry13);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        inputStream15.mark((int) ' ');
        byte[] byteArray19 = new byte[] { (byte) 0 };
        int int20 = inputStream15.read(byteArray19);
        int int21 = zipArchiveInputStream10.read(byteArray19);
        int int24 = zipArchiveInputStream1.read(byteArray19, (int) (short) 100, (int) (byte) 0);
        int int25 = zipArchiveInputStream1.read();
        zipArchiveInputStream1.mark(10);
        long long28 = zipArchiveInputStream1.getBytesRead();
        long long29 = zipArchiveInputStream1.getBytesRead();
        int int30 = zipArchiveInputStream1.read();
        int int31 = zipArchiveInputStream1.available();
        java.lang.String str32 = zipArchiveInputStream1.encoding;
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTF8" + "'", str32, "UTF8");
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray2 = inputStream0.readNBytes(100);
        boolean boolean3 = inputStream0.markSupported();
        java.io.InputStream inputStream4 = java.io.InputStream.nullInputStream();
        inputStream4.mark((int) ' ');
        boolean boolean7 = inputStream4.markSupported();
        byte[] byteArray8 = inputStream4.readAllBytes();
        int int9 = inputStream0.read(byteArray8);
        java.lang.Class<?> wildcardClass10 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        long long4 = zipArchiveInputStream1.skip((long) '#');
        byte[] byteArray5 = zipArchiveInputStream1.readAllBytes();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveInputStream1.canReadEntryData(archiveEntry6);
        java.lang.String str8 = zipArchiveInputStream1.encoding;
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        byte[] byteArray11 = new byte[] { (byte) 0 };
        int int12 = inputStream9.read(byteArray11);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray11, (int) (short) 1);
        int int15 = zipArchiveInputStream1.read(byteArray11);
        int int16 = zipArchiveInputStream1.available();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        inputStream6.mark((int) ' ');
        byte[] byteArray10 = new byte[] { (byte) 0 };
        int int11 = inputStream6.read(byteArray10);
        int int12 = zipArchiveInputStream1.read(byteArray10);
        int int13 = zipArchiveInputStream1.getCount();
        int int14 = zipArchiveInputStream1.available();
        boolean boolean15 = zipArchiveInputStream1.markSupported();
        zipArchiveInputStream1.close();
        int int17 = zipArchiveInputStream1.available();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        int int4 = zipArchiveInputStream1.read();
        long long6 = zipArchiveInputStream1.skip((long) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveInputStream1.canReadEntryData(archiveEntry7);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        int int12 = zipArchiveInputStream1.read();
        long long13 = zipArchiveInputStream1.getBytesRead();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        int int11 = zipArchiveInputStream10.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream10.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream10.canReadEntryData(archiveEntry13);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        inputStream15.mark((int) ' ');
        byte[] byteArray19 = new byte[] { (byte) 0 };
        int int20 = inputStream15.read(byteArray19);
        int int21 = zipArchiveInputStream10.read(byteArray19);
        int int24 = zipArchiveInputStream1.read(byteArray19, (int) (short) 100, (int) (byte) 0);
        int int25 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = zipArchiveInputStream1.getNextZipEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8");
        int int29 = zipArchiveInputStream28.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream28);
        byte[] byteArray32 = zipArchiveInputStream28.readNBytes(10);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry33 = null;
        boolean boolean34 = zipArchiveInputStream28.canReadEntryData(archiveEntry33);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream35 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream28);
        long long37 = zipArchiveInputStream35.skip(10L);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        byte[] byteArray12 = zipArchiveInputStream11.readAllBytes();
        java.lang.String str13 = zipArchiveInputStream11.encoding;
        zipArchiveInputStream11.mark((int) (byte) 10);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = zipArchiveInputStream11.getNextEntry();
        java.lang.String str17 = zipArchiveInputStream11.encoding;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = zipArchiveInputStream11.getNextEntry();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTF8" + "'", str13, "UTF8");
        org.junit.Assert.assertNull(archiveEntry16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTF8" + "'", str17, "UTF8");
        org.junit.Assert.assertNull(archiveEntry18);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        zipArchiveInputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int8 = zipArchiveInputStream7.read();
        byte[] byteArray9 = zipArchiveInputStream7.readAllBytes();
        java.io.InputStream inputStream10 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream10);
        int int12 = zipArchiveInputStream11.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream11, "UTF8", true);
        byte[] byteArray17 = zipArchiveInputStream15.readNBytes(0);
        java.io.InputStream inputStream18 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream18);
        long long20 = zipArchiveInputStream19.getBytesRead();
        boolean boolean21 = zipArchiveInputStream19.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = zipArchiveInputStream19.getNextEntry();
        long long23 = zipArchiveInputStream19.getBytesRead();
        zipArchiveInputStream19.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = zipArchiveInputStream19.getNextZipEntry();
        byte[] byteArray28 = zipArchiveInputStream19.readNBytes((int) (byte) 0);
        byte[] byteArray30 = zipArchiveInputStream19.readNBytes((int) (short) 1);
        int int33 = zipArchiveInputStream15.read(byteArray30, (int) (short) 10, (int) 'a');
        int int36 = zipArchiveInputStream7.read(byteArray30, 0, (int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream37 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7);
        java.io.OutputStream outputStream38 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long39 = zipArchiveInputStream7.transferTo(outputStream38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(archiveEntry22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry26);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        int int11 = zipArchiveInputStream10.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream10.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream10.canReadEntryData(archiveEntry13);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        inputStream15.mark((int) ' ');
        byte[] byteArray19 = new byte[] { (byte) 0 };
        int int20 = inputStream15.read(byteArray19);
        int int21 = zipArchiveInputStream10.read(byteArray19);
        int int24 = zipArchiveInputStream1.read(byteArray19, (int) (short) 100, (int) (byte) 0);
        int int25 = zipArchiveInputStream1.read();
        zipArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream31 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", true, true);
        long long32 = zipArchiveInputStream1.getBytesRead();
        byte[] byteArray33 = zipArchiveInputStream1.readAllBytes();
        int int34 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream35 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream36 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream35);
        zipArchiveInputStream36.mark((int) '#');
        long long40 = zipArchiveInputStream36.skip((long) (byte) 10);
        long long42 = zipArchiveInputStream36.skip((long) '#');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry43 = null;
        boolean boolean44 = zipArchiveInputStream36.canReadEntryData(archiveEntry43);
        zipArchiveInputStream36.mark((int) ' ');
        java.lang.String str47 = zipArchiveInputStream36.encoding;
        java.io.InputStream inputStream48 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream49 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream48);
        int int50 = zipArchiveInputStream49.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry51 = zipArchiveInputStream49.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry52 = zipArchiveInputStream49.getNextZipEntry();
        int int53 = zipArchiveInputStream49.getCount();
        boolean boolean54 = zipArchiveInputStream49.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry55 = null;
        boolean boolean56 = zipArchiveInputStream49.canReadEntryData(archiveEntry55);
        int int57 = zipArchiveInputStream49.getCount();
        byte[] byteArray58 = zipArchiveInputStream49.readAllBytes();
        int int61 = zipArchiveInputStream36.read(byteArray58, (int) (short) 1, 100);
        int int64 = zipArchiveInputStream1.readNBytes(byteArray58, 0, 0);
        java.io.InputStream inputStream65 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream66 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream65);
        long long67 = zipArchiveInputStream66.getBytesRead();
        boolean boolean68 = zipArchiveInputStream66.markSupported();
        int int69 = zipArchiveInputStream66.read();
        long long71 = zipArchiveInputStream66.skip((long) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry72 = null;
        boolean boolean73 = zipArchiveInputStream66.canReadEntryData(archiveEntry72);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream76 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream66, "UTF8", false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry77 = zipArchiveInputStream76.getNextZipEntry();
        byte[] byteArray78 = zipArchiveInputStream76.readAllBytes();
        int int79 = zipArchiveInputStream1.read(byteArray78);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(inputStream35);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "UTF8" + "'", str47, "UTF8");
        org.junit.Assert.assertNotNull(inputStream48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNull(archiveEntry51);
        org.junit.Assert.assertNull(zipArchiveEntry52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] {});
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(inputStream65);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(zipArchiveEntry77);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] {});
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        zipArchiveInputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int5 = zipArchiveInputStream4.read();
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream6);
        int int8 = zipArchiveInputStream7.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = zipArchiveInputStream7.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveInputStream7.canReadEntryData(archiveEntry10);
        long long13 = zipArchiveInputStream7.skip((long) (short) 0);
        int int14 = zipArchiveInputStream7.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7, "UTF8", false);
        byte[] byteArray19 = zipArchiveInputStream7.readNBytes((int) '#');
        java.io.InputStream inputStream20 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream20);
        int int22 = zipArchiveInputStream21.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = zipArchiveInputStream21.getNextEntry();
        zipArchiveInputStream21.mark(1);
        java.io.InputStream inputStream26 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream26);
        int int28 = zipArchiveInputStream27.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry29 = zipArchiveInputStream27.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = null;
        boolean boolean31 = zipArchiveInputStream27.canReadEntryData(archiveEntry30);
        java.io.InputStream inputStream32 = java.io.InputStream.nullInputStream();
        inputStream32.mark((int) ' ');
        byte[] byteArray36 = new byte[] { (byte) 0 };
        int int37 = inputStream32.read(byteArray36);
        int int38 = zipArchiveInputStream27.read(byteArray36);
        boolean boolean40 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray36, (int) (short) 100);
        int int43 = zipArchiveInputStream21.read(byteArray36, (int) (short) 0, 10);
        java.io.InputStream inputStream44 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream45 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream44);
        int int46 = zipArchiveInputStream45.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry47 = zipArchiveInputStream45.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry48 = null;
        boolean boolean49 = zipArchiveInputStream45.canReadEntryData(archiveEntry48);
        long long51 = zipArchiveInputStream45.skip((long) (short) 0);
        int int52 = zipArchiveInputStream45.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream55 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream45, "UTF8", false);
        zipArchiveInputStream45.close();
        long long57 = zipArchiveInputStream45.getBytesRead();
        int int58 = zipArchiveInputStream45.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream61 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream45, "UTF8", true);
        boolean boolean62 = zipArchiveInputStream61.markSupported();
        java.io.InputStream inputStream63 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream64 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream63);
        long long65 = zipArchiveInputStream64.getBytesRead();
        boolean boolean66 = zipArchiveInputStream64.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry67 = zipArchiveInputStream64.getNextEntry();
        long long68 = zipArchiveInputStream64.getBytesRead();
        zipArchiveInputStream64.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry71 = zipArchiveInputStream64.getNextZipEntry();
        byte[] byteArray73 = zipArchiveInputStream64.readNBytes((int) (byte) 0);
        byte[] byteArray75 = zipArchiveInputStream64.readNBytes((int) (short) 1);
        int int78 = zipArchiveInputStream61.read(byteArray75, 100, (int) ' ');
        int int81 = zipArchiveInputStream21.read(byteArray75, 10, (int) (byte) 10);
        int int84 = zipArchiveInputStream7.read(byteArray75, 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int87 = zipArchiveInputStream4.readNBytes(byteArray75, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [10, 10 + 10) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(archiveEntry9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(archiveEntry23);
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(archiveEntry29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(inputStream32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(inputStream44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(archiveEntry47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(inputStream63);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(archiveEntry67);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry71);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] {});
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        boolean boolean4 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        byte[] byteArray8 = zipArchiveInputStream1.readAllBytes();
        int int9 = zipArchiveInputStream1.getCount();
        long long10 = zipArchiveInputStream1.getBytesRead();
        long long12 = zipArchiveInputStream1.skip((long) (byte) 100);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream13);
        int int15 = zipArchiveInputStream14.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = zipArchiveInputStream14.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = zipArchiveInputStream14.canReadEntryData(archiveEntry17);
        long long20 = zipArchiveInputStream14.skip((long) (short) 0);
        int int21 = zipArchiveInputStream14.read();
        java.io.InputStream inputStream22 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream22);
        int int24 = zipArchiveInputStream23.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry25 = zipArchiveInputStream23.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry26 = null;
        boolean boolean27 = zipArchiveInputStream23.canReadEntryData(archiveEntry26);
        java.io.InputStream inputStream28 = java.io.InputStream.nullInputStream();
        inputStream28.mark((int) ' ');
        byte[] byteArray32 = new byte[] { (byte) 0 };
        int int33 = inputStream28.read(byteArray32);
        int int34 = zipArchiveInputStream23.read(byteArray32);
        int int37 = zipArchiveInputStream14.read(byteArray32, (int) (short) 100, (int) (byte) 0);
        int int38 = zipArchiveInputStream14.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = zipArchiveInputStream14.getNextZipEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream41 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream14, "UTF8");
        java.io.InputStream inputStream42 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream43 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream42);
        int int44 = zipArchiveInputStream43.read();
        java.io.InputStream inputStream45 = java.io.InputStream.nullInputStream();
        byte[] byteArray47 = new byte[] { (byte) 0 };
        int int48 = inputStream45.read(byteArray47);
        int int51 = zipArchiveInputStream43.read(byteArray47, 0, (int) (short) -1);
        int int54 = zipArchiveInputStream41.read(byteArray47, (int) (byte) 0, (int) (byte) 100);
        byte[] byteArray56 = zipArchiveInputStream41.readNBytes((int) '4');
        int int59 = zipArchiveInputStream1.read(byteArray56, (int) (byte) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass60 = byteArray56.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(archiveEntry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(archiveEntry25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry39);
        org.junit.Assert.assertNotNull(inputStream42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(inputStream45);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        java.lang.String str6 = zipArchiveInputStream1.encoding;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveInputStream1.canReadEntryData(archiveEntry7);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveInputStream1.canReadEntryData(archiveEntry9);
        byte[] byteArray11 = zipArchiveInputStream1.readAllBytes();
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = zipArchiveInputStream1.transferTo(outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        boolean boolean4 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        byte[] byteArray8 = zipArchiveInputStream1.readAllBytes();
        long long10 = zipArchiveInputStream1.skip((long) 'a');
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false, true);
        long long16 = zipArchiveInputStream1.skip((long) 10);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream17);
        long long19 = zipArchiveInputStream18.getBytesRead();
        int int20 = zipArchiveInputStream18.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = zipArchiveInputStream18.getNextZipEntry();
        byte[] byteArray23 = zipArchiveInputStream18.readNBytes((int) (short) 100);
        int int24 = zipArchiveInputStream1.read(byteArray23);
        java.io.InputStream inputStream25 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream25);
        int int27 = zipArchiveInputStream26.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = zipArchiveInputStream26.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry29 = null;
        boolean boolean30 = zipArchiveInputStream26.canReadEntryData(archiveEntry29);
        long long32 = zipArchiveInputStream26.skip((long) (short) 0);
        int int33 = zipArchiveInputStream26.read();
        java.io.InputStream inputStream34 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream35 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream34);
        int int36 = zipArchiveInputStream35.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry37 = zipArchiveInputStream35.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry38 = null;
        boolean boolean39 = zipArchiveInputStream35.canReadEntryData(archiveEntry38);
        java.io.InputStream inputStream40 = java.io.InputStream.nullInputStream();
        inputStream40.mark((int) ' ');
        byte[] byteArray44 = new byte[] { (byte) 0 };
        int int45 = inputStream40.read(byteArray44);
        int int46 = zipArchiveInputStream35.read(byteArray44);
        int int49 = zipArchiveInputStream26.read(byteArray44, (int) (short) 100, (int) (byte) 0);
        java.io.InputStream inputStream50 = java.io.InputStream.nullInputStream();
        byte[] byteArray52 = inputStream50.readNBytes(100);
        int int55 = zipArchiveInputStream26.read(byteArray52, (int) (short) -1, (-1));
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry56 = null;
        boolean boolean57 = zipArchiveInputStream26.canReadEntryData(archiveEntry56);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream58 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream26);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry59 = zipArchiveInputStream26.getNextZipEntry();
        byte[] byteArray60 = zipArchiveInputStream26.readAllBytes();
        java.io.InputStream inputStream61 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream62 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream61);
        int int63 = zipArchiveInputStream62.read();
        java.io.InputStream inputStream64 = java.io.InputStream.nullInputStream();
        byte[] byteArray66 = new byte[] { (byte) 0 };
        int int67 = inputStream64.read(byteArray66);
        int int70 = zipArchiveInputStream62.read(byteArray66, 0, (int) (short) -1);
        byte[] byteArray72 = zipArchiveInputStream62.readNBytes((int) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream74 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream62, "UTF8");
        java.io.InputStream inputStream75 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream76 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream75);
        int int77 = zipArchiveInputStream76.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry78 = zipArchiveInputStream76.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry79 = null;
        boolean boolean80 = zipArchiveInputStream76.canReadEntryData(archiveEntry79);
        java.lang.String str81 = zipArchiveInputStream76.encoding;
        zipArchiveInputStream76.mark((int) (short) 10);
        byte[] byteArray84 = zipArchiveInputStream76.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry85 = zipArchiveInputStream76.getNextZipEntry();
        boolean boolean86 = zipArchiveInputStream76.markSupported();
        byte[] byteArray88 = zipArchiveInputStream76.readNBytes((int) ' ');
        int int89 = zipArchiveInputStream74.read(byteArray88);
        int int92 = zipArchiveInputStream26.read(byteArray88, 10, (-1));
        int int95 = zipArchiveInputStream1.read(byteArray88, 1, (-1));
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(zipArchiveEntry21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(archiveEntry28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(archiveEntry37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(inputStream40);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(inputStream50);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] {});
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(zipArchiveEntry59);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(inputStream64);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream75);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNull(archiveEntry78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "UTF8" + "'", str81, "UTF8");
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] {});
        org.junit.Assert.assertNull(zipArchiveEntry85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] {});
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = zipArchiveInputStream1.getNextZipEntry();
        long long5 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8");
        java.lang.String str9 = zipArchiveInputStream1.encoding;
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertNull(zipArchiveEntry4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        inputStream6.mark((int) ' ');
        byte[] byteArray10 = new byte[] { (byte) 0 };
        int int11 = inputStream6.read(byteArray10);
        int int12 = zipArchiveInputStream1.read(byteArray10);
        long long13 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.close();
        zipArchiveInputStream1.mark((int) (short) -1);
        int int17 = zipArchiveInputStream1.available();
        zipArchiveInputStream1.mark(1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = zipArchiveInputStream1.canReadEntryData(archiveEntry20);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = zipArchiveInputStream1.getNextZipEntry();
        long long5 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8");
        byte[] byteArray10 = zipArchiveInputStream8.readNBytes((int) (short) 0);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertNull(zipArchiveEntry4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = zipArchiveInputStream1.getNextEntry();
        long long5 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.mark((int) (short) -1);
        java.lang.String str8 = zipArchiveInputStream1.encoding;
        zipArchiveInputStream1.mark(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        zipArchiveInputStream11.mark((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream11);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(archiveEntry4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.available();
        int int9 = zipArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveInputStream1.canReadEntryData(archiveEntry10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8");
        int int14 = zipArchiveInputStream13.getCount();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", true);
        byte[] byteArray7 = zipArchiveInputStream5.readNBytes(0);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        long long10 = zipArchiveInputStream9.getBytesRead();
        boolean boolean11 = zipArchiveInputStream9.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream9.getNextEntry();
        long long13 = zipArchiveInputStream9.getBytesRead();
        zipArchiveInputStream9.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = zipArchiveInputStream9.getNextZipEntry();
        byte[] byteArray18 = zipArchiveInputStream9.readNBytes((int) (byte) 0);
        byte[] byteArray20 = zipArchiveInputStream9.readNBytes((int) (short) 1);
        int int23 = zipArchiveInputStream5.read(byteArray20, (int) (short) 10, (int) 'a');
        int int24 = zipArchiveInputStream5.getCount();
        int int25 = zipArchiveInputStream5.getCount();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.getCount();
        java.lang.String str9 = zipArchiveInputStream1.encoding;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream1.getNextEntry();
        int int13 = zipArchiveInputStream1.getCount();
        zipArchiveInputStream1.close();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
        org.junit.Assert.assertNull(archiveEntry10);
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        inputStream0.mark((int) ' ');
        boolean boolean3 = inputStream0.markSupported();
        int int4 = inputStream0.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveInputStream5.canReadEntryData(archiveEntry6);
        long long8 = zipArchiveInputStream5.getBytesRead();
        int int9 = zipArchiveInputStream5.available();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = zipArchiveInputStream5.readNBytes((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: len < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        int int3 = zipArchiveInputStream1.getCount();
        long long5 = zipArchiveInputStream1.skip(1L);
        java.lang.String str6 = zipArchiveInputStream1.encoding;
        int int7 = zipArchiveInputStream1.getCount();
        byte[] byteArray8 = zipArchiveInputStream1.readAllBytes();
        zipArchiveInputStream1.mark((int) (short) 10);
        int int11 = zipArchiveInputStream1.getCount();
        long long13 = zipArchiveInputStream1.skip((long) (short) 0);
        long long15 = zipArchiveInputStream1.skip((long) (short) 10);
        zipArchiveInputStream1.close();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        int int3 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        int int9 = zipArchiveInputStream8.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = zipArchiveInputStream8.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = zipArchiveInputStream8.canReadEntryData(archiveEntry11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        inputStream13.mark((int) ' ');
        byte[] byteArray17 = new byte[] { (byte) 0 };
        int int18 = inputStream13.read(byteArray17);
        int int19 = zipArchiveInputStream8.read(byteArray17);
        boolean boolean21 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray17, (int) (short) 100);
        int int22 = zipArchiveInputStream6.read(byteArray17);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream6, "UTF8", true);
        java.lang.String str27 = zipArchiveInputStream26.encoding;
        long long28 = zipArchiveInputStream26.getBytesRead();
        java.io.InputStream inputStream29 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream29);
        int int31 = zipArchiveInputStream30.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = zipArchiveInputStream30.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry33 = null;
        boolean boolean34 = zipArchiveInputStream30.canReadEntryData(archiveEntry33);
        long long36 = zipArchiveInputStream30.skip((long) (short) 0);
        int int37 = zipArchiveInputStream30.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream40 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream30, "UTF8", false);
        zipArchiveInputStream30.close();
        long long42 = zipArchiveInputStream30.getBytesRead();
        int int43 = zipArchiveInputStream30.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream46 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream30, "UTF8", true);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream47 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream46);
        zipArchiveInputStream46.mark((int) (byte) 1);
        java.io.InputStream inputStream50 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream51 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream50);
        long long52 = zipArchiveInputStream51.getBytesRead();
        boolean boolean53 = zipArchiveInputStream51.markSupported();
        int int54 = zipArchiveInputStream51.read();
        long long56 = zipArchiveInputStream51.skip((long) 0);
        java.io.InputStream inputStream57 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream58 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream57);
        long long59 = zipArchiveInputStream58.getBytesRead();
        boolean boolean60 = zipArchiveInputStream58.markSupported();
        boolean boolean61 = zipArchiveInputStream58.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream64 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream58, "UTF8", false);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream66 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream64, "UTF8");
        zipArchiveInputStream64.mark(1);
        java.io.InputStream inputStream69 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream70 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream69);
        long long71 = zipArchiveInputStream70.getBytesRead();
        boolean boolean72 = zipArchiveInputStream70.markSupported();
        boolean boolean73 = zipArchiveInputStream70.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream76 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream70, "UTF8", false);
        java.io.InputStream inputStream77 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream78 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream77);
        int int79 = zipArchiveInputStream78.read();
        java.io.InputStream inputStream80 = java.io.InputStream.nullInputStream();
        byte[] byteArray82 = new byte[] { (byte) 0 };
        int int83 = inputStream80.read(byteArray82);
        int int86 = zipArchiveInputStream78.read(byteArray82, 0, (int) (short) -1);
        int int89 = zipArchiveInputStream70.read(byteArray82, (int) (byte) 100, (int) 'a');
        int int92 = zipArchiveInputStream64.read(byteArray82, (int) (byte) 100, (int) (byte) 0);
        int int95 = zipArchiveInputStream51.read(byteArray82, (int) (byte) 1, (int) (byte) 1);
        int int96 = zipArchiveInputStream46.read(byteArray82);
        int int97 = zipArchiveInputStream26.read(byteArray82);
        int int98 = zipArchiveInputStream26.read();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(archiveEntry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTF8" + "'", str27, "UTF8");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(inputStream29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(archiveEntry32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(inputStream50);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(inputStream57);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(inputStream69);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(inputStream77);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(inputStream80);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = zipArchiveInputStream1.getNextEntry();
        long long5 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.mark((int) (short) -1);
        byte[] byteArray9 = zipArchiveInputStream1.readNBytes((int) (short) 0);
        java.io.InputStream inputStream10 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream10);
        int int12 = zipArchiveInputStream11.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = zipArchiveInputStream11.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = zipArchiveInputStream11.canReadEntryData(archiveEntry14);
        java.lang.String str16 = zipArchiveInputStream11.encoding;
        zipArchiveInputStream11.mark((int) (short) 1);
        java.lang.String str19 = zipArchiveInputStream11.encoding;
        int int20 = zipArchiveInputStream11.available();
        zipArchiveInputStream11.mark((int) (byte) 1);
        byte[] byteArray24 = zipArchiveInputStream11.readNBytes((int) ' ');
        int int25 = zipArchiveInputStream1.read(byteArray24);
        zipArchiveInputStream1.mark((-1));
        zipArchiveInputStream1.close();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(archiveEntry4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(archiveEntry13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTF8" + "'", str16, "UTF8");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTF8" + "'", str19, "UTF8");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        boolean boolean4 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        byte[] byteArray8 = zipArchiveInputStream1.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        long long10 = zipArchiveInputStream9.getBytesRead();
        long long12 = zipArchiveInputStream9.skip((long) 100);
        int int13 = zipArchiveInputStream9.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream9, "UTF8");
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream16);
        int int18 = zipArchiveInputStream17.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream17, "UTF8", true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = zipArchiveInputStream17.getNextEntry();
        int int23 = zipArchiveInputStream17.available();
        zipArchiveInputStream17.mark((int) (byte) 100);
        java.io.InputStream inputStream26 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream26);
        int int28 = zipArchiveInputStream27.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry29 = zipArchiveInputStream27.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = null;
        boolean boolean31 = zipArchiveInputStream27.canReadEntryData(archiveEntry30);
        long long33 = zipArchiveInputStream27.skip((long) (short) 0);
        int int34 = zipArchiveInputStream27.read();
        java.io.InputStream inputStream35 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream36 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream35);
        int int37 = zipArchiveInputStream36.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry38 = zipArchiveInputStream36.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry39 = null;
        boolean boolean40 = zipArchiveInputStream36.canReadEntryData(archiveEntry39);
        java.io.InputStream inputStream41 = java.io.InputStream.nullInputStream();
        inputStream41.mark((int) ' ');
        byte[] byteArray45 = new byte[] { (byte) 0 };
        int int46 = inputStream41.read(byteArray45);
        int int47 = zipArchiveInputStream36.read(byteArray45);
        int int50 = zipArchiveInputStream27.read(byteArray45, (int) (short) 100, (int) (byte) 0);
        int int51 = zipArchiveInputStream27.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry52 = zipArchiveInputStream27.getNextZipEntry();
        boolean boolean53 = zipArchiveInputStream27.markSupported();
        byte[] byteArray55 = zipArchiveInputStream27.readNBytes((int) (short) 1);
        int int56 = zipArchiveInputStream17.read(byteArray55);
        int int59 = zipArchiveInputStream9.read(byteArray55, (int) '4', (int) (byte) 10);
        java.io.OutputStream outputStream60 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long61 = zipArchiveInputStream9.transferTo(outputStream60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(archiveEntry22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(archiveEntry29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(inputStream35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(archiveEntry38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(inputStream41);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        boolean boolean4 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        int int10 = zipArchiveInputStream9.read();
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        byte[] byteArray13 = new byte[] { (byte) 0 };
        int int14 = inputStream11.read(byteArray13);
        int int17 = zipArchiveInputStream9.read(byteArray13, 0, (int) (short) -1);
        int int20 = zipArchiveInputStream1.read(byteArray13, (int) (byte) 100, (int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = null;
        boolean boolean22 = zipArchiveInputStream1.canReadEntryData(archiveEntry21);
        int int23 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", true);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream26, "UTF8", true);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        inputStream6.mark((int) ' ');
        byte[] byteArray10 = new byte[] { (byte) 0 };
        int int11 = inputStream6.read(byteArray10);
        int int12 = zipArchiveInputStream1.read(byteArray10);
        java.lang.String str13 = zipArchiveInputStream1.encoding;
        zipArchiveInputStream1.close();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = zipArchiveInputStream1.canReadEntryData(archiveEntry15);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        zipArchiveInputStream18.mark((-1));
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTF8" + "'", str13, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(archiveEntry17);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        int int11 = zipArchiveInputStream10.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream10.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream10.canReadEntryData(archiveEntry13);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        inputStream15.mark((int) ' ');
        byte[] byteArray19 = new byte[] { (byte) 0 };
        int int20 = inputStream15.read(byteArray19);
        int int21 = zipArchiveInputStream10.read(byteArray19);
        int int24 = zipArchiveInputStream1.read(byteArray19, (int) (short) 100, (int) (byte) 0);
        java.io.InputStream inputStream25 = java.io.InputStream.nullInputStream();
        byte[] byteArray27 = inputStream25.readNBytes(100);
        int int30 = zipArchiveInputStream1.read(byteArray27, (int) (short) -1, (-1));
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry31 = null;
        boolean boolean32 = zipArchiveInputStream1.canReadEntryData(archiveEntry31);
        boolean boolean33 = zipArchiveInputStream1.markSupported();
        byte[] byteArray35 = zipArchiveInputStream1.readNBytes((int) (short) 0);
        java.io.InputStream inputStream36 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream37 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream36);
        long long38 = zipArchiveInputStream37.getBytesRead();
        boolean boolean39 = zipArchiveInputStream37.markSupported();
        boolean boolean40 = zipArchiveInputStream37.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream43 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream37, "UTF8", false);
        java.io.InputStream inputStream44 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream45 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream44);
        int int46 = zipArchiveInputStream45.read();
        java.io.InputStream inputStream47 = java.io.InputStream.nullInputStream();
        byte[] byteArray49 = new byte[] { (byte) 0 };
        int int50 = inputStream47.read(byteArray49);
        int int53 = zipArchiveInputStream45.read(byteArray49, 0, (int) (short) -1);
        int int56 = zipArchiveInputStream37.read(byteArray49, (int) (byte) 100, (int) 'a');
        int int57 = zipArchiveInputStream1.read(byteArray49);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream58 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream60 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry61 = zipArchiveInputStream60.getNextZipEntry();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(inputStream44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(inputStream47);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry61);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = zipArchiveInputStream1.getNextZipEntry();
        int int5 = zipArchiveInputStream1.getCount();
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        byte[] byteArray8 = inputStream6.readNBytes(100);
        int int11 = zipArchiveInputStream1.read(byteArray8, (int) (short) 10, (int) ' ');
        boolean boolean12 = zipArchiveInputStream1.markSupported();
        long long14 = zipArchiveInputStream1.skip((long) 'a');
        java.lang.String str15 = zipArchiveInputStream1.encoding;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8");
        java.io.OutputStream outputStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = zipArchiveInputStream17.transferTo(outputStream18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertNull(zipArchiveEntry4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF8" + "'", str15, "UTF8");
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        inputStream6.mark((int) ' ');
        byte[] byteArray10 = new byte[] { (byte) 0 };
        int int11 = inputStream6.read(byteArray10);
        int int12 = zipArchiveInputStream1.read(byteArray10);
        long long13 = zipArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        boolean boolean15 = zipArchiveInputStream1.markSupported();
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream16);
        int int18 = zipArchiveInputStream17.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = zipArchiveInputStream17.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = zipArchiveInputStream17.canReadEntryData(archiveEntry20);
        java.io.InputStream inputStream22 = java.io.InputStream.nullInputStream();
        inputStream22.mark((int) ' ');
        byte[] byteArray26 = new byte[] { (byte) 0 };
        int int27 = inputStream22.read(byteArray26);
        int int28 = zipArchiveInputStream17.read(byteArray26);
        byte[] byteArray29 = zipArchiveInputStream17.readAllBytes();
        int int30 = zipArchiveInputStream1.read(byteArray29);
        java.io.InputStream inputStream31 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream31);
        int int33 = zipArchiveInputStream32.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry34 = zipArchiveInputStream32.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry35 = null;
        boolean boolean36 = zipArchiveInputStream32.canReadEntryData(archiveEntry35);
        long long38 = zipArchiveInputStream32.skip((long) (short) 0);
        int int39 = zipArchiveInputStream32.read();
        java.io.InputStream inputStream40 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream41 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream40);
        int int42 = zipArchiveInputStream41.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry43 = zipArchiveInputStream41.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry44 = null;
        boolean boolean45 = zipArchiveInputStream41.canReadEntryData(archiveEntry44);
        java.io.InputStream inputStream46 = java.io.InputStream.nullInputStream();
        inputStream46.mark((int) ' ');
        byte[] byteArray50 = new byte[] { (byte) 0 };
        int int51 = inputStream46.read(byteArray50);
        int int52 = zipArchiveInputStream41.read(byteArray50);
        int int55 = zipArchiveInputStream32.read(byteArray50, (int) (short) 100, (int) (byte) 0);
        int int56 = zipArchiveInputStream32.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry57 = zipArchiveInputStream32.getNextZipEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream59 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream32, "UTF8");
        java.io.InputStream inputStream60 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream61 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream60);
        int int62 = zipArchiveInputStream61.read();
        java.io.InputStream inputStream63 = java.io.InputStream.nullInputStream();
        byte[] byteArray65 = new byte[] { (byte) 0 };
        int int66 = inputStream63.read(byteArray65);
        int int69 = zipArchiveInputStream61.read(byteArray65, 0, (int) (short) -1);
        int int72 = zipArchiveInputStream59.read(byteArray65, (int) (byte) 0, (int) (byte) 100);
        int int75 = zipArchiveInputStream1.read(byteArray65, 100, 100);
        int int76 = zipArchiveInputStream1.read();
        long long77 = zipArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream78 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(archiveEntry19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(inputStream31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(archiveEntry34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(inputStream40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(archiveEntry43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(inputStream46);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry57);
        org.junit.Assert.assertNotNull(inputStream60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(inputStream63);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        int int4 = zipArchiveInputStream1.read();
        long long6 = zipArchiveInputStream1.skip((long) 0);
        zipArchiveInputStream1.mark((int) (short) 0);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        int int11 = zipArchiveInputStream10.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream10.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream10.canReadEntryData(archiveEntry13);
        long long16 = zipArchiveInputStream10.skip((long) (short) 0);
        int int17 = zipArchiveInputStream10.getCount();
        java.io.InputStream inputStream18 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream18);
        int int20 = zipArchiveInputStream19.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = zipArchiveInputStream19.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = null;
        boolean boolean23 = zipArchiveInputStream19.canReadEntryData(archiveEntry22);
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        inputStream24.mark((int) ' ');
        byte[] byteArray28 = new byte[] { (byte) 0 };
        int int29 = inputStream24.read(byteArray28);
        int int30 = zipArchiveInputStream19.read(byteArray28);
        int int33 = zipArchiveInputStream10.read(byteArray28, (int) 'a', (int) (byte) 10);
        byte[] byteArray34 = zipArchiveInputStream10.readAllBytes();
        int int37 = zipArchiveInputStream1.read(byteArray34, (int) ' ', (int) (short) 10);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry38 = null;
        boolean boolean39 = zipArchiveInputStream1.canReadEntryData(archiveEntry38);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream43 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false, true);
        zipArchiveInputStream43.mark(1);
        int int46 = zipArchiveInputStream43.available();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(archiveEntry21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        int int4 = zipArchiveInputStream1.read();
        long long6 = zipArchiveInputStream1.skip((long) 0);
        byte[] byteArray8 = zipArchiveInputStream1.readNBytes((int) ' ');
        long long10 = zipArchiveInputStream1.skip((long) 0);
        zipArchiveInputStream1.mark((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        int int11 = zipArchiveInputStream10.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream10.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream10.canReadEntryData(archiveEntry13);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        inputStream15.mark((int) ' ');
        byte[] byteArray19 = new byte[] { (byte) 0 };
        int int20 = inputStream15.read(byteArray19);
        int int21 = zipArchiveInputStream10.read(byteArray19);
        int int24 = zipArchiveInputStream1.read(byteArray19, (int) (short) 100, (int) (byte) 0);
        java.io.InputStream inputStream25 = java.io.InputStream.nullInputStream();
        byte[] byteArray27 = inputStream25.readNBytes(100);
        int int30 = zipArchiveInputStream1.read(byteArray27, (int) (short) -1, (-1));
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry31 = null;
        boolean boolean32 = zipArchiveInputStream1.canReadEntryData(archiveEntry31);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        zipArchiveInputStream1.mark((int) (short) -1);
        long long36 = zipArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream38 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8");
        int int39 = zipArchiveInputStream38.read();
        byte[] byteArray41 = zipArchiveInputStream38.readNBytes(0);
        java.io.InputStream inputStream42 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream43 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream42);
        long long44 = zipArchiveInputStream43.getBytesRead();
        boolean boolean45 = zipArchiveInputStream43.markSupported();
        boolean boolean46 = zipArchiveInputStream43.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream49 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream43, "UTF8", false);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream51 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream49, "UTF8");
        zipArchiveInputStream49.mark(1);
        java.io.InputStream inputStream54 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream55 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream54);
        long long56 = zipArchiveInputStream55.getBytesRead();
        boolean boolean57 = zipArchiveInputStream55.markSupported();
        boolean boolean58 = zipArchiveInputStream55.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream61 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream55, "UTF8", false);
        java.io.InputStream inputStream62 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream63 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream62);
        int int64 = zipArchiveInputStream63.read();
        java.io.InputStream inputStream65 = java.io.InputStream.nullInputStream();
        byte[] byteArray67 = new byte[] { (byte) 0 };
        int int68 = inputStream65.read(byteArray67);
        int int71 = zipArchiveInputStream63.read(byteArray67, 0, (int) (short) -1);
        int int74 = zipArchiveInputStream55.read(byteArray67, (int) (byte) 100, (int) 'a');
        int int77 = zipArchiveInputStream49.read(byteArray67, (int) (byte) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int80 = zipArchiveInputStream38.readNBytes(byteArray67, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [0, 0 + -1) out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(inputStream54);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(inputStream62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(inputStream65);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        int int4 = zipArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = zipArchiveInputStream1.getNextEntry();
        int int6 = zipArchiveInputStream1.read();
        long long8 = zipArchiveInputStream1.skip((long) 10);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        int int11 = zipArchiveInputStream10.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream10.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream10.canReadEntryData(archiveEntry13);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        inputStream15.mark((int) ' ');
        byte[] byteArray19 = new byte[] { (byte) 0 };
        int int20 = inputStream15.read(byteArray19);
        int int21 = zipArchiveInputStream10.read(byteArray19);
        byte[] byteArray22 = zipArchiveInputStream10.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        int int24 = zipArchiveInputStream10.available();
        java.lang.String str25 = zipArchiveInputStream10.encoding;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10, "UTF8", true);
        java.io.InputStream inputStream29 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream29);
        int int31 = zipArchiveInputStream30.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = zipArchiveInputStream30.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry33 = zipArchiveInputStream30.getNextZipEntry();
        int int34 = zipArchiveInputStream30.getCount();
        boolean boolean35 = zipArchiveInputStream30.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry36 = null;
        boolean boolean37 = zipArchiveInputStream30.canReadEntryData(archiveEntry36);
        int int38 = zipArchiveInputStream30.available();
        byte[] byteArray40 = zipArchiveInputStream30.readNBytes(0);
        int int41 = zipArchiveInputStream28.read(byteArray40);
        int int44 = zipArchiveInputStream1.read(byteArray40, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream47 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(archiveEntry5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTF8" + "'", str25, "UTF8");
        org.junit.Assert.assertNotNull(inputStream29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(archiveEntry32);
        org.junit.Assert.assertNull(zipArchiveEntry33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray2 = inputStream0.readNBytes(100);
        boolean boolean3 = inputStream0.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int5 = zipArchiveInputStream4.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = zipArchiveInputStream4.getNextZipEntry();
        zipArchiveInputStream4.close();
        java.lang.String str8 = zipArchiveInputStream4.encoding;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream4);
        long long11 = zipArchiveInputStream9.skip((long) 100);
        int int12 = zipArchiveInputStream9.available();
        byte[] byteArray13 = zipArchiveInputStream9.readAllBytes();
        int int14 = zipArchiveInputStream9.getCount();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(zipArchiveEntry6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = zipArchiveInputStream11.getNextZipEntry();
        boolean boolean13 = zipArchiveInputStream11.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream11);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveInputStream14.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        boolean boolean4 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        byte[] byteArray8 = zipArchiveInputStream1.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int10 = zipArchiveInputStream9.available();
        byte[] byteArray11 = zipArchiveInputStream9.readAllBytes();
        zipArchiveInputStream9.mark((int) ' ');
        java.lang.String str14 = zipArchiveInputStream9.encoding;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF8" + "'", str14, "UTF8");
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        int int11 = zipArchiveInputStream10.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream10.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream10.canReadEntryData(archiveEntry13);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        inputStream15.mark((int) ' ');
        byte[] byteArray19 = new byte[] { (byte) 0 };
        int int20 = inputStream15.read(byteArray19);
        int int21 = zipArchiveInputStream10.read(byteArray19);
        int int24 = zipArchiveInputStream1.read(byteArray19, (int) (short) 100, (int) (byte) 0);
        int int25 = zipArchiveInputStream1.read();
        zipArchiveInputStream1.mark(10);
        long long28 = zipArchiveInputStream1.getBytesRead();
        long long29 = zipArchiveInputStream1.getBytesRead();
        int int30 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream31 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream34 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream31, "UTF8", true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry35 = zipArchiveInputStream34.getNextEntry();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(archiveEntry35);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        int int11 = zipArchiveInputStream10.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream10.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream10.canReadEntryData(archiveEntry13);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        inputStream15.mark((int) ' ');
        byte[] byteArray19 = new byte[] { (byte) 0 };
        int int20 = inputStream15.read(byteArray19);
        int int21 = zipArchiveInputStream10.read(byteArray19);
        int int24 = zipArchiveInputStream1.read(byteArray19, (int) (short) 100, (int) (byte) 0);
        java.io.InputStream inputStream25 = java.io.InputStream.nullInputStream();
        byte[] byteArray27 = inputStream25.readNBytes(100);
        int int30 = zipArchiveInputStream1.read(byteArray27, (int) (short) -1, (-1));
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry31 = null;
        boolean boolean32 = zipArchiveInputStream1.canReadEntryData(archiveEntry31);
        boolean boolean33 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream34 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int35 = zipArchiveInputStream34.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = zipArchiveInputStream34.getNextZipEntry();
        zipArchiveInputStream34.close();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry36);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        int int11 = zipArchiveInputStream10.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream10.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream10.canReadEntryData(archiveEntry13);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        inputStream15.mark((int) ' ');
        byte[] byteArray19 = new byte[] { (byte) 0 };
        int int20 = inputStream15.read(byteArray19);
        int int21 = zipArchiveInputStream10.read(byteArray19);
        int int24 = zipArchiveInputStream1.read(byteArray19, (int) (short) 100, (int) (byte) 0);
        int int25 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = zipArchiveInputStream1.getNextZipEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = zipArchiveInputStream1.getNextZipEntry();
        java.lang.String str30 = zipArchiveInputStream1.encoding;
        java.io.InputStream inputStream31 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream31);
        int int33 = zipArchiveInputStream32.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry34 = zipArchiveInputStream32.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry35 = null;
        boolean boolean36 = zipArchiveInputStream32.canReadEntryData(archiveEntry35);
        long long38 = zipArchiveInputStream32.skip((long) (short) 0);
        int int39 = zipArchiveInputStream32.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream42 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream32, "UTF8", false);
        zipArchiveInputStream42.mark((int) (short) 0);
        int int45 = zipArchiveInputStream42.getCount();
        byte[] byteArray46 = zipArchiveInputStream42.readAllBytes();
        int int47 = zipArchiveInputStream42.read();
        java.io.InputStream inputStream48 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream49 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream48);
        int int50 = zipArchiveInputStream49.read();
        java.io.InputStream inputStream51 = java.io.InputStream.nullInputStream();
        byte[] byteArray53 = new byte[] { (byte) 0 };
        int int54 = inputStream51.read(byteArray53);
        int int57 = zipArchiveInputStream49.read(byteArray53, 0, (int) (short) -1);
        boolean boolean59 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray53, (int) (short) 100);
        int int62 = zipArchiveInputStream42.readNBytes(byteArray53, 0, (int) (short) 0);
        int int65 = zipArchiveInputStream1.read(byteArray53, 100, (int) (short) 0);
        java.io.OutputStream outputStream66 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long67 = zipArchiveInputStream1.transferTo(outputStream66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry26);
        org.junit.Assert.assertNull(zipArchiveEntry29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTF8" + "'", str30, "UTF8");
        org.junit.Assert.assertNotNull(inputStream31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(archiveEntry34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(inputStream48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(inputStream51);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        int int11 = zipArchiveInputStream10.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream10.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream10.canReadEntryData(archiveEntry13);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        inputStream15.mark((int) ' ');
        byte[] byteArray19 = new byte[] { (byte) 0 };
        int int20 = inputStream15.read(byteArray19);
        int int21 = zipArchiveInputStream10.read(byteArray19);
        int int24 = zipArchiveInputStream1.read(byteArray19, (int) (short) 100, (int) (byte) 0);
        int int25 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = zipArchiveInputStream1.getNextZipEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8");
        java.io.InputStream inputStream29 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream29);
        int int31 = zipArchiveInputStream30.read();
        java.io.InputStream inputStream32 = java.io.InputStream.nullInputStream();
        byte[] byteArray34 = new byte[] { (byte) 0 };
        int int35 = inputStream32.read(byteArray34);
        int int38 = zipArchiveInputStream30.read(byteArray34, 0, (int) (short) -1);
        int int41 = zipArchiveInputStream28.read(byteArray34, (int) (byte) 0, (int) (byte) 100);
        boolean boolean43 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray34, (int) (short) 10);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry26);
        org.junit.Assert.assertNotNull(inputStream29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(inputStream32);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        int int4 = zipArchiveInputStream1.read();
        long long6 = zipArchiveInputStream1.skip((long) 0);
        zipArchiveInputStream1.mark((int) (short) 0);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        int int11 = zipArchiveInputStream10.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream10.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream10.canReadEntryData(archiveEntry13);
        long long16 = zipArchiveInputStream10.skip((long) (short) 0);
        int int17 = zipArchiveInputStream10.getCount();
        java.io.InputStream inputStream18 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream18);
        int int20 = zipArchiveInputStream19.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = zipArchiveInputStream19.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = null;
        boolean boolean23 = zipArchiveInputStream19.canReadEntryData(archiveEntry22);
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        inputStream24.mark((int) ' ');
        byte[] byteArray28 = new byte[] { (byte) 0 };
        int int29 = inputStream24.read(byteArray28);
        int int30 = zipArchiveInputStream19.read(byteArray28);
        int int33 = zipArchiveInputStream10.read(byteArray28, (int) 'a', (int) (byte) 10);
        byte[] byteArray34 = zipArchiveInputStream10.readAllBytes();
        int int37 = zipArchiveInputStream1.read(byteArray34, (int) ' ', (int) (short) 10);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry38 = null;
        boolean boolean39 = zipArchiveInputStream1.canReadEntryData(archiveEntry38);
        java.io.InputStream inputStream40 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream41 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream40);
        int int42 = zipArchiveInputStream41.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry43 = zipArchiveInputStream41.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry44 = null;
        boolean boolean45 = zipArchiveInputStream41.canReadEntryData(archiveEntry44);
        java.io.InputStream inputStream46 = java.io.InputStream.nullInputStream();
        inputStream46.mark((int) ' ');
        byte[] byteArray50 = new byte[] { (byte) 0 };
        int int51 = inputStream46.read(byteArray50);
        int int52 = zipArchiveInputStream41.read(byteArray50);
        long long53 = zipArchiveInputStream41.getBytesRead();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream54 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream41);
        int int55 = zipArchiveInputStream41.available();
        zipArchiveInputStream41.mark(1);
        byte[] byteArray58 = zipArchiveInputStream41.readAllBytes();
        int int61 = zipArchiveInputStream1.read(byteArray58, 100, 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry62 = zipArchiveInputStream1.getNextZipEntry();
        long long64 = zipArchiveInputStream1.skip((long) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream67 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", true);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(archiveEntry21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(inputStream40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(archiveEntry43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(inputStream46);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] {});
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry62);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = zipArchiveInputStream1.getNextEntry();
        long long5 = zipArchiveInputStream1.getBytesRead();
        boolean boolean6 = zipArchiveInputStream1.markSupported();
        int int7 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = zipArchiveInputStream1.getNextEntry();
        int int9 = zipArchiveInputStream1.read();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(archiveEntry4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(archiveEntry8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray2 = inputStream0.readNBytes(100);
        boolean boolean3 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 0);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        int int3 = zipArchiveInputStream1.getCount();
        long long5 = zipArchiveInputStream1.skip(1L);
        java.lang.String str6 = zipArchiveInputStream1.encoding;
        int int7 = zipArchiveInputStream1.getCount();
        byte[] byteArray8 = zipArchiveInputStream1.readAllBytes();
        int int9 = zipArchiveInputStream1.read();
        java.lang.Class<?> wildcardClass10 = zipArchiveInputStream1.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", true);
        byte[] byteArray7 = zipArchiveInputStream5.readNBytes(0);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        long long10 = zipArchiveInputStream9.getBytesRead();
        boolean boolean11 = zipArchiveInputStream9.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream9.getNextEntry();
        long long13 = zipArchiveInputStream9.getBytesRead();
        zipArchiveInputStream9.mark((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = zipArchiveInputStream9.getNextZipEntry();
        byte[] byteArray18 = zipArchiveInputStream9.readNBytes((int) (byte) 0);
        byte[] byteArray20 = zipArchiveInputStream9.readNBytes((int) (short) 1);
        int int23 = zipArchiveInputStream5.read(byteArray20, (int) (short) 10, (int) 'a');
        int int24 = zipArchiveInputStream5.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = zipArchiveInputStream5.getNextZipEntry();
        zipArchiveInputStream5.close();
        int int27 = zipArchiveInputStream5.getCount();
        zipArchiveInputStream5.close();
        zipArchiveInputStream5.mark((int) (byte) 1);
        java.lang.Class<?> wildcardClass31 = zipArchiveInputStream5.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(zipArchiveEntry25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = zipArchiveInputStream1.getNextEntry();
        long long5 = zipArchiveInputStream1.getBytesRead();
        zipArchiveInputStream1.mark((int) (short) -1);
        int int8 = zipArchiveInputStream1.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream9);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(archiveEntry4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        boolean boolean4 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7, "UTF8");
        byte[] byteArray10 = zipArchiveInputStream9.readAllBytes();
        boolean boolean11 = zipArchiveInputStream9.markSupported();
        int int12 = zipArchiveInputStream9.getCount();
        java.lang.String str13 = zipArchiveInputStream9.encoding;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream9, "UTF8", false);
        boolean boolean17 = zipArchiveInputStream16.markSupported();
        long long18 = zipArchiveInputStream16.getBytesRead();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTF8" + "'", str13, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        boolean boolean4 = zipArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        byte[] byteArray8 = zipArchiveInputStream1.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        long long10 = zipArchiveInputStream9.getBytesRead();
        long long12 = zipArchiveInputStream9.skip((long) 100);
        int int13 = zipArchiveInputStream9.getCount();
        byte[] byteArray15 = zipArchiveInputStream9.readNBytes((int) (short) 10);
        long long16 = zipArchiveInputStream9.getBytesRead();
        java.lang.String str17 = zipArchiveInputStream9.encoding;
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTF8" + "'", str17, "UTF8");
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        byte[] byteArray13 = zipArchiveInputStream1.readNBytes((int) '#');
        boolean boolean15 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray13, 1);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        int int3 = zipArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        byte[] byteArray7 = zipArchiveInputStream1.readAllBytes();
        int int8 = zipArchiveInputStream1.read();
        byte[] byteArray9 = zipArchiveInputStream1.readAllBytes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = zipArchiveInputStream1.getNextZipEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = zipArchiveInputStream1.getNextZipEntry();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNull(zipArchiveEntry10);
        org.junit.Assert.assertNull(zipArchiveEntry11);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        inputStream6.mark((int) ' ');
        byte[] byteArray10 = new byte[] { (byte) 0 };
        int int11 = inputStream6.read(byteArray10);
        int int12 = zipArchiveInputStream1.read(byteArray10);
        long long13 = zipArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int15 = zipArchiveInputStream1.available();
        int int16 = zipArchiveInputStream1.read();
        long long17 = zipArchiveInputStream1.getBytesRead();
        java.io.InputStream inputStream18 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream18);
        long long20 = zipArchiveInputStream19.getBytesRead();
        boolean boolean21 = zipArchiveInputStream19.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = zipArchiveInputStream19.getNextEntry();
        int int23 = zipArchiveInputStream19.read();
        byte[] byteArray24 = zipArchiveInputStream19.readAllBytes();
        int int25 = zipArchiveInputStream1.read(byteArray24);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(archiveEntry22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        int int11 = zipArchiveInputStream10.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream10.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveInputStream10.canReadEntryData(archiveEntry13);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        inputStream15.mark((int) ' ');
        byte[] byteArray19 = new byte[] { (byte) 0 };
        int int20 = inputStream15.read(byteArray19);
        int int21 = zipArchiveInputStream10.read(byteArray19);
        int int24 = zipArchiveInputStream1.read(byteArray19, (int) (short) 100, (int) (byte) 0);
        java.io.InputStream inputStream25 = java.io.InputStream.nullInputStream();
        byte[] byteArray27 = inputStream25.readNBytes(100);
        int int30 = zipArchiveInputStream1.read(byteArray27, (int) (short) -1, (-1));
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry31 = null;
        boolean boolean32 = zipArchiveInputStream1.canReadEntryData(archiveEntry31);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        zipArchiveInputStream1.mark((int) (short) -1);
        long long36 = zipArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream38 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8");
        int int39 = zipArchiveInputStream38.read();
        byte[] byteArray41 = zipArchiveInputStream38.readNBytes(0);
        byte[] byteArray42 = zipArchiveInputStream38.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        long long2 = zipArchiveInputStream1.getBytesRead();
        boolean boolean3 = zipArchiveInputStream1.markSupported();
        java.lang.String str4 = zipArchiveInputStream1.encoding;
        int int5 = zipArchiveInputStream1.available();
        int int6 = zipArchiveInputStream1.read();
        long long7 = zipArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveInputStream1.canReadEntryData(archiveEntry8);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        int int2 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveInputStream1.canReadEntryData(archiveEntry4);
        long long7 = zipArchiveInputStream1.skip((long) (short) 0);
        int int8 = zipArchiveInputStream1.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "UTF8", false);
        zipArchiveInputStream11.mark((int) (short) 0);
        long long15 = zipArchiveInputStream11.skip((long) 0);
        int int16 = zipArchiveInputStream11.getCount();
        long long18 = zipArchiveInputStream11.skip((long) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = zipArchiveInputStream11.getNextZipEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = zipArchiveInputStream11.canReadEntryData(archiveEntry20);
        java.lang.String str22 = zipArchiveInputStream11.encoding;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = null;
        boolean boolean24 = zipArchiveInputStream11.canReadEntryData(archiveEntry23);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry25 = zipArchiveInputStream11.getNextEntry();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTF8" + "'", str22, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(archiveEntry25);
    }
}

