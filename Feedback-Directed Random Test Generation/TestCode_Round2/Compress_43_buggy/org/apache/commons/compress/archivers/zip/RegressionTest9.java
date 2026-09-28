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
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream4.writeZip64CentralDirectory();
        zipArchiveOutputStream4.deflate();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode7 = null;
        zipArchiveOutputStream4.setUseZip64(zip64Mode7);
        java.lang.String str9 = zipArchiveOutputStream4.getEncoding();
        zipArchiveOutputStream4.setFallbackToUTF8(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        java.lang.String str10 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.destroy();
        boolean boolean12 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        java.lang.String str6 = zipArchiveOutputStream1.getEncoding();
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(deflater7);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        long long4 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = false;
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setLevel(1);
        java.util.zip.Deflater deflater10 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream11.setComment("not encodeable");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(deflater10);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream6);
        zipArchiveOutputStream7.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream7.canWriteEntryData(archiveEntry9);
        zipArchiveOutputStream7.finished = true;
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream13);
        zipArchiveOutputStream14.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy16 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream14.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        java.lang.String str18 = unicodeExtraFieldPolicy16.toString();
        java.lang.String str19 = unicodeExtraFieldPolicy16.toString();
        java.lang.String str20 = unicodeExtraFieldPolicy16.toString();
        java.lang.String str21 = unicodeExtraFieldPolicy16.toString();
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        byte[] byteArray25 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream24.writeOut(byteArray25, (int) (short) 1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "always" + "'", str18, "always");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "always" + "'", str19, "always");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "always" + "'", str20, "always");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "always" + "'", str21, "always");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("not encodeable");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry14);
        zipArchiveOutputStream1.finished = false;
        java.lang.String str18 = zipArchiveOutputStream1.getEncoding();
        java.io.OutputStream outputStream19 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray20 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream19.write(byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray20, 512, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTF8" + "'", str18, "UTF8");
        org.junit.Assert.assertNotNull(outputStream19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        boolean boolean8 = zipArchiveOutputStream1.finished;
        int int9 = zipArchiveOutputStream1.getCount();
        long long10 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.setComment("never");
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        boolean boolean9 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.flush();
        java.util.zip.Deflater deflater16 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(deflater16);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.destroy();
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream10);
        zipArchiveOutputStream11.flush();
        zipArchiveOutputStream11.destroy();
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream14);
        zipArchiveOutputStream15.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = zipArchiveOutputStream15.canWriteEntryData(archiveEntry18);
        zipArchiveOutputStream15.setEncoding("UTF8");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy22 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str23 = unicodeExtraFieldPolicy22.toString();
        zipArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        zipArchiveOutputStream11.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        zipArchiveOutputStream11.setFallbackToUTF8(false);
        java.io.OutputStream outputStream28 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream28);
        zipArchiveOutputStream29.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy31 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream29.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy31);
        java.lang.String str33 = unicodeExtraFieldPolicy31.toString();
        java.lang.String str34 = unicodeExtraFieldPolicy31.toString();
        zipArchiveOutputStream11.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy31);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy31);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "never" + "'", str23, "never");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "always" + "'", str33, "always");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "always" + "'", str34, "always");
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        java.nio.channels.SeekableByteChannel seekableByteChannel4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        java.lang.String str9 = unicodeExtraFieldPolicy7.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        boolean boolean11 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "always" + "'", str9, "always");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.finished = false;
        int int8 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.destroy();
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream10);
        zipArchiveOutputStream11.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveOutputStream11.canWriteEntryData(archiveEntry13);
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream15);
        zipArchiveOutputStream16.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream16.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        java.lang.String str20 = unicodeExtraFieldPolicy18.toString();
        zipArchiveOutputStream11.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        java.lang.String str22 = unicodeExtraFieldPolicy18.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "always" + "'", str20, "always");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "always" + "'", str22, "always");
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.finished = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setComment("UTF8");
        int int7 = zipArchiveOutputStream1.getCount();
        boolean boolean8 = zipArchiveOutputStream1.finished;
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setComment("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream6.setEncoding("always");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream6.canWriteEntryData(archiveEntry9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        zipArchiveOutputStream2.finished = true;
        zipArchiveOutputStream2.deflate();
        java.lang.String str11 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.putArchiveEntry(archiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "never" + "'", str11, "never");
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream5.def;
        zipArchiveOutputStream5.setMethod((int) '4');
        zipArchiveOutputStream5.setEncoding("always");
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertNotNull(deflater6);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        java.lang.String str7 = zipArchiveOutputStream1.getEncoding();
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setComment("");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.String str11 = zipArchiveOutputStream10.getEncoding();
        java.lang.String str12 = zipArchiveOutputStream10.getEncoding();
        zipArchiveOutputStream10.flush();
        zipArchiveOutputStream10.setUseLanguageEncodingFlag(true);
        boolean boolean16 = zipArchiveOutputStream10.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.setLevel((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.writeLocalFileHeader(zipArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        java.lang.String str9 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "never" + "'", str9, "never");
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int10 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setComment("hi!");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        long long8 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setComment("not encodeable");
        java.util.zip.Deflater deflater11 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setLevel((-1));
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(deflater11);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.String str10 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setComment("not encodeable");
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setComment("never");
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream6);
        int int8 = zipArchiveOutputStream7.getCount();
        boolean boolean9 = zipArchiveOutputStream7.finished;
        java.nio.channels.SeekableByteChannel seekableByteChannel10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel10);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream11);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream11.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy13);
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy13);
        java.lang.String str16 = unicodeExtraFieldPolicy13.toString();
        java.lang.String str17 = unicodeExtraFieldPolicy13.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy13);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "always" + "'", str16, "always");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        boolean boolean9 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.finished = false;
        byte[] byteArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray13, 0, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream12.flush();
        long long14 = zipArchiveOutputStream12.getBytesWritten();
        long long15 = zipArchiveOutputStream12.getBytesWritten();
        zipArchiveOutputStream12.flush();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry5, inputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        java.util.zip.Deflater deflater10 = zipArchiveOutputStream1.def;
        java.lang.String str11 = zipArchiveOutputStream1.getEncoding();
        java.lang.String str12 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(deflater10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str12 = unicodeExtraFieldPolicy11.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy11);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.deflate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "always" + "'", str12, "always");
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream8.setComment("");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = zipArchiveOutputStream8.canWriteEntryData(archiveEntry11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("UTF8");
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str12 = unicodeExtraFieldPolicy11.toString();
        java.lang.String str13 = unicodeExtraFieldPolicy11.toString();
        java.lang.String str14 = unicodeExtraFieldPolicy11.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy11);
        java.lang.Class<?> wildcardClass16 = unicodeExtraFieldPolicy11.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "always" + "'", str12, "always");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "always" + "'", str13, "always");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "always" + "'", str14, "always");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setMethod(100);
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        zipArchiveOutputStream2.finished = true;
        zipArchiveOutputStream2.deflate();
        boolean boolean11 = zipArchiveOutputStream2.finished;
        zipArchiveOutputStream2.deflate();
        zipArchiveOutputStream2.setComment("UTF8");
        java.util.zip.Deflater deflater15 = zipArchiveOutputStream2.def;
        java.util.zip.Deflater deflater16 = zipArchiveOutputStream2.def;
        zipArchiveOutputStream2.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(deflater15);
        org.junit.Assert.assertNotNull(deflater16);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        boolean boolean10 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setEncoding("always");
        zipArchiveOutputStream1.setMethod((int) (short) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = null;
        java.io.InputStream inputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry20, inputStream21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setEncoding("UTF8");
        java.lang.String str13 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTF8" + "'", str13, "UTF8");
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.io.OutputStream outputStream10 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream10.write(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray11, (int) ' ', 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.flush();
        java.io.File file12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = zipArchiveOutputStream1.createArchiveEntry(file12, "not encodeable");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream6);
        zipArchiveOutputStream7.finished = true;
        zipArchiveOutputStream7.setLevel(1);
        zipArchiveOutputStream7.setMethod(100);
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream14);
        zipArchiveOutputStream15.finished = true;
        zipArchiveOutputStream15.deflate();
        java.io.OutputStream outputStream19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream19);
        zipArchiveOutputStream20.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy22 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream20.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        java.lang.String str24 = unicodeExtraFieldPolicy22.toString();
        zipArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        java.lang.String str26 = unicodeExtraFieldPolicy22.toString();
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        java.lang.String str28 = unicodeExtraFieldPolicy22.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        boolean boolean30 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream32.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "always" + "'", str24, "always");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "always" + "'", str26, "always");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "always" + "'", str28, "always");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        boolean boolean10 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setMethod((int) (short) -1);
        boolean boolean17 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.flush();
        boolean boolean9 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setMethod(1);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry14);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.setMethod(0);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean11 = zipArchiveOutputStream10.isSeekable();
        zipArchiveOutputStream10.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream10);
        java.lang.String str15 = zipArchiveOutputStream14.getEncoding();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF8" + "'", str15, "UTF8");
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream2.finished = true;
        zipArchiveOutputStream2.deflate();
        zipArchiveOutputStream2.writeZip64CentralDirectory();
        zipArchiveOutputStream2.writeZip64CentralDirectory();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        int int5 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str9 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry10);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        java.util.zip.Deflater deflater9 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(deflater9);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = null;
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.addRawArchiveEntry(zipArchiveEntry7, inputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        boolean boolean7 = zipArchiveOutputStream2.isSeekable();
        boolean boolean8 = zipArchiveOutputStream2.finished;
        zipArchiveOutputStream2.setMethod((int) (short) -1);
        java.lang.String str11 = zipArchiveOutputStream2.getEncoding();
        boolean boolean12 = zipArchiveOutputStream2.isSeekable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream8);
        zipArchiveOutputStream9.finished = true;
        zipArchiveOutputStream9.setLevel(1);
        zipArchiveOutputStream9.setMethod(100);
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream16);
        zipArchiveOutputStream17.finished = true;
        zipArchiveOutputStream17.deflate();
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream21);
        zipArchiveOutputStream22.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy24 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream22.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy24);
        java.lang.String str26 = unicodeExtraFieldPolicy24.toString();
        zipArchiveOutputStream17.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy24);
        java.lang.String str28 = unicodeExtraFieldPolicy24.toString();
        zipArchiveOutputStream9.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy24);
        java.lang.String str30 = unicodeExtraFieldPolicy24.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy24);
        java.io.OutputStream outputStream32 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray33 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream32.write(byteArray33);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray33, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deflater6);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "always" + "'", str26, "always");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "always" + "'", str28, "always");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "always" + "'", str30, "always");
        org.junit.Assert.assertNotNull(outputStream32);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int10 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.io.OutputStream outputStream16 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream16.write(byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream15.writeOut(byteArray17, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(outputStream16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.setMethod((int) (short) 10);
        zipArchiveOutputStream1.setMethod(8);
        java.util.zip.Deflater deflater13 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(deflater13);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        boolean boolean4 = zipArchiveOutputStream2.finished;
        java.lang.String str5 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str8 = unicodeExtraFieldPolicy7.toString();
        java.lang.String str9 = unicodeExtraFieldPolicy7.toString();
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        zipArchiveOutputStream2.setComment("hi!");
        zipArchiveOutputStream2.deflate();
        zipArchiveOutputStream2.deflate();
        long long15 = zipArchiveOutputStream2.getBytesWritten();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "never" + "'", str8, "never");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "never" + "'", str9, "never");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setMethod((int) '4');
        int int8 = zipArchiveOutputStream1.getCount();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("always");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode15 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode15);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.flush();
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        boolean boolean8 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream4.writeZip64CentralDirectory();
        zipArchiveOutputStream4.deflate();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode7 = null;
        zipArchiveOutputStream4.setUseZip64(zip64Mode7);
        boolean boolean9 = zipArchiveOutputStream4.isSeekable();
        long long10 = zipArchiveOutputStream4.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream4.destroy();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.flush();
        int int11 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry12);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.setComment("always");
        java.nio.channels.SeekableByteChannel seekableByteChannel10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel10);
        int int12 = zipArchiveOutputStream11.getCount();
        zipArchiveOutputStream11.setFallbackToUTF8(true);
        java.lang.String str15 = zipArchiveOutputStream11.getEncoding();
        zipArchiveOutputStream11.setFallbackToUTF8(true);
        int int18 = zipArchiveOutputStream11.getCount();
        long long19 = zipArchiveOutputStream11.getBytesWritten();
        boolean boolean20 = zipArchiveOutputStream11.finished;
        zipArchiveOutputStream11.setFallbackToUTF8(true);
        zipArchiveOutputStream11.finished = true;
        zipArchiveOutputStream11.flush();
        zipArchiveOutputStream11.destroy();
        boolean boolean27 = zipArchiveOutputStream11.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy28 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str29 = unicodeExtraFieldPolicy28.toString();
        java.lang.String str30 = unicodeExtraFieldPolicy28.toString();
        zipArchiveOutputStream11.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy28);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF8" + "'", str15, "UTF8");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "never" + "'", str29, "never");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "never" + "'", str30, "never");
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setLevel((int) (byte) 0);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setMethod(0);
        zipArchiveOutputStream1.deflate();
        java.lang.String str14 = zipArchiveOutputStream1.getEncoding();
        long long15 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF8" + "'", str14, "UTF8");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setLevel((int) (byte) 0);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setMethod(0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setMethod(100);
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream8);
        zipArchiveOutputStream9.finished = true;
        zipArchiveOutputStream9.deflate();
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream13);
        zipArchiveOutputStream14.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy16 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream14.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        java.lang.String str18 = unicodeExtraFieldPolicy16.toString();
        zipArchiveOutputStream9.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        java.lang.String str20 = unicodeExtraFieldPolicy16.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        java.nio.channels.SeekableByteChannel seekableByteChannel22 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel22);
        long long24 = zipArchiveOutputStream23.getBytesWritten();
        zipArchiveOutputStream23.deflate();
        java.io.OutputStream outputStream26 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream26);
        int int28 = zipArchiveOutputStream27.getCount();
        boolean boolean29 = zipArchiveOutputStream27.finished;
        java.nio.channels.SeekableByteChannel seekableByteChannel30 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream31 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel30);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream31);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy33 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream31.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy33);
        zipArchiveOutputStream27.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy33);
        java.lang.String str36 = unicodeExtraFieldPolicy33.toString();
        zipArchiveOutputStream23.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy33);
        java.lang.String str38 = unicodeExtraFieldPolicy33.toString();
        java.lang.String str39 = unicodeExtraFieldPolicy33.toString();
        java.lang.String str40 = unicodeExtraFieldPolicy33.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy33);
        java.lang.String str42 = zipArchiveOutputStream1.getEncoding();
        boolean boolean43 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archive has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "always" + "'", str18, "always");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "always" + "'", str20, "always");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "always" + "'", str36, "always");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "always" + "'", str38, "always");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "always" + "'", str39, "always");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "always" + "'", str40, "always");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTF8" + "'", str42, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.destroy();
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        boolean boolean12 = zipArchiveOutputStream1.finished;
        java.io.File file13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = zipArchiveOutputStream1.createArchiveEntry(file13, "always");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream2.setMethod((int) (byte) 10);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.writeZip64CentralDirectory();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setMethod((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode13 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode13);
        long long15 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.flush();
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.destroy();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.destroy();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        java.nio.channels.SeekableByteChannel seekableByteChannel4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        zipArchiveOutputStream1.setLevel((int) (byte) 0);
        zipArchiveOutputStream1.deflate();
        boolean boolean13 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode14 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.flush();
        int int11 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry14);
        boolean boolean16 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long10 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.util.zip.Deflater deflater8 = zipArchiveOutputStream1.def;
        boolean boolean9 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        java.lang.String str12 = zipArchiveOutputStream1.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deflater8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int3 = zipArchiveOutputStream2.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        java.io.OutputStream outputStream5 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream5.write(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeOut(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(outputStream5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream12.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str15 = unicodeExtraFieldPolicy14.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy14);
        zipArchiveOutputStream12.setMethod(1);
        long long19 = zipArchiveOutputStream12.getBytesWritten();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "never" + "'", str15, "never");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream1.def;
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        long long8 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode9 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(deflater6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.deflate();
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.deflate();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream4);
        int int6 = zipArchiveOutputStream5.getCount();
        boolean boolean7 = zipArchiveOutputStream5.finished;
        java.nio.channels.SeekableByteChannel seekableByteChannel8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel8);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream9);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream9.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy11);
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy11);
        java.lang.String str14 = unicodeExtraFieldPolicy11.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy11);
        zipArchiveOutputStream1.setMethod((int) (short) 0);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "always" + "'", str14, "always");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setMethod((int) (byte) -1);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream7);
        zipArchiveOutputStream8.finished = true;
        zipArchiveOutputStream8.setLevel(1);
        zipArchiveOutputStream8.setMethod(100);
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream15);
        zipArchiveOutputStream16.finished = true;
        zipArchiveOutputStream16.deflate();
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream20);
        zipArchiveOutputStream21.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy23 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream21.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy23);
        java.lang.String str25 = unicodeExtraFieldPolicy23.toString();
        zipArchiveOutputStream16.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy23);
        java.lang.String str27 = unicodeExtraFieldPolicy23.toString();
        zipArchiveOutputStream8.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy23);
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy23);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "always" + "'", str27, "always");
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry7);
        int int9 = zipArchiveOutputStream1.getCount();
        boolean boolean10 = zipArchiveOutputStream1.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream5);
        zipArchiveOutputStream6.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        java.lang.String str10 = unicodeExtraFieldPolicy8.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry12);
        boolean boolean14 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode15 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode15);
        zipArchiveOutputStream1.finished = false;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "always" + "'", str10, "always");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        boolean boolean14 = zipArchiveOutputStream1.finished;
        boolean boolean15 = zipArchiveOutputStream1.finished;
        boolean boolean16 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        java.nio.channels.SeekableByteChannel seekableByteChannel6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel6);
        boolean boolean8 = zipArchiveOutputStream7.isSeekable();
        int int9 = zipArchiveOutputStream7.getCount();
        zipArchiveOutputStream7.flush();
        zipArchiveOutputStream7.setLevel((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream7);
        java.nio.channels.SeekableByteChannel seekableByteChannel14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel14);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream15);
        boolean boolean17 = zipArchiveOutputStream16.isSeekable();
        boolean boolean18 = zipArchiveOutputStream16.finished;
        java.lang.String str19 = zipArchiveOutputStream16.getEncoding();
        zipArchiveOutputStream16.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy21 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str22 = unicodeExtraFieldPolicy21.toString();
        java.lang.String str23 = unicodeExtraFieldPolicy21.toString();
        zipArchiveOutputStream16.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTF8" + "'", str19, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "never" + "'", str22, "never");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "never" + "'", str23, "never");
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        zipArchiveOutputStream1.setMethod((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        boolean boolean11 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setLevel((-1));
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode11 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode11);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy13);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        java.nio.channels.SeekableByteChannel seekableByteChannel19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel19);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream20);
        zipArchiveOutputStream20.finished = true;
        boolean boolean24 = zipArchiveOutputStream20.isSeekable();
        java.nio.channels.SeekableByteChannel seekableByteChannel25 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel25);
        boolean boolean27 = zipArchiveOutputStream26.isSeekable();
        boolean boolean28 = zipArchiveOutputStream26.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry29 = null;
        boolean boolean30 = zipArchiveOutputStream26.canWriteEntryData(archiveEntry29);
        java.io.OutputStream outputStream31 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream31);
        zipArchiveOutputStream32.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy34 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream32.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy34);
        zipArchiveOutputStream26.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy34);
        zipArchiveOutputStream20.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy34);
        java.lang.String str38 = unicodeExtraFieldPolicy34.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy34);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy13);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "always" + "'", str38, "always");
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setLevel(0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry12);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.deflate();
        long long16 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = null;
        java.io.InputStream inputStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry17, inputStream18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setMethod(100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        zipArchiveOutputStream1.finished = true;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.flush();
        boolean boolean9 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setMethod(1);
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.finished = true;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        java.lang.String str12 = zipArchiveOutputStream1.getEncoding();
        java.io.OutputStream outputStream13 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream13.write(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray14, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertNotNull(outputStream13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.String str13 = zipArchiveOutputStream1.getEncoding();
        java.util.zip.Deflater deflater14 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTF8" + "'", str13, "UTF8");
        org.junit.Assert.assertNotNull(deflater14);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setMethod((int) (short) 1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.flush();
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream12);
        zipArchiveOutputStream13.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream13.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        java.lang.String str17 = unicodeExtraFieldPolicy15.toString();
        java.lang.String str18 = unicodeExtraFieldPolicy15.toString();
        java.lang.String str19 = unicodeExtraFieldPolicy15.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        zipArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setComment("");
        java.lang.Class<?> wildcardClass25 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "always" + "'", str18, "always");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "always" + "'", str19, "always");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        int int5 = zipArchiveOutputStream4.getCount();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream4.setUseZip64(zip64Mode6);
        zipArchiveOutputStream4.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        java.io.InputStream inputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream4.addRawArchiveEntry(zipArchiveEntry9, inputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.util.zip.Deflater deflater8 = zipArchiveOutputStream1.def;
        boolean boolean9 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        java.lang.String str12 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deflater8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        java.nio.channels.SeekableByteChannel seekableByteChannel3 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel3);
        boolean boolean5 = zipArchiveOutputStream4.isSeekable();
        boolean boolean6 = zipArchiveOutputStream4.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream4.canWriteEntryData(archiveEntry7);
        zipArchiveOutputStream4.destroy();
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream10);
        int int12 = zipArchiveOutputStream11.getCount();
        boolean boolean13 = zipArchiveOutputStream11.finished;
        java.nio.channels.SeekableByteChannel seekableByteChannel14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel14);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream15);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy17 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy17);
        zipArchiveOutputStream11.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy17);
        java.lang.String str20 = unicodeExtraFieldPolicy17.toString();
        java.lang.String str21 = unicodeExtraFieldPolicy17.toString();
        zipArchiveOutputStream4.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy17);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy17);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "always" + "'", str20, "always");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "always" + "'", str21, "always");
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream2.setUseZip64(zip64Mode5);
        zipArchiveOutputStream2.setLevel((int) (byte) 1);
        boolean boolean9 = zipArchiveOutputStream2.isSeekable();
        java.nio.channels.SeekableByteChannel seekableByteChannel10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel10);
        long long12 = zipArchiveOutputStream11.getBytesWritten();
        zipArchiveOutputStream11.deflate();
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream14);
        int int16 = zipArchiveOutputStream15.getCount();
        boolean boolean17 = zipArchiveOutputStream15.finished;
        java.nio.channels.SeekableByteChannel seekableByteChannel18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel18);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream19);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy21 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream19.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        zipArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        java.lang.String str24 = unicodeExtraFieldPolicy21.toString();
        zipArchiveOutputStream11.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        java.io.OutputStream outputStream26 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream26);
        zipArchiveOutputStream27.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy29 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream27.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        java.lang.String str31 = unicodeExtraFieldPolicy29.toString();
        java.lang.String str32 = unicodeExtraFieldPolicy29.toString();
        java.lang.String str33 = unicodeExtraFieldPolicy29.toString();
        java.lang.String str34 = unicodeExtraFieldPolicy29.toString();
        java.lang.String str35 = unicodeExtraFieldPolicy29.toString();
        java.lang.String str36 = unicodeExtraFieldPolicy29.toString();
        zipArchiveOutputStream11.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "always" + "'", str24, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "always" + "'", str31, "always");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "always" + "'", str32, "always");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "always" + "'", str33, "always");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "always" + "'", str34, "always");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "always" + "'", str35, "always");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "always" + "'", str36, "always");
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream6);
        zipArchiveOutputStream7.finished = true;
        zipArchiveOutputStream7.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str13 = unicodeExtraFieldPolicy12.toString();
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy12);
        zipArchiveOutputStream7.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode17 = null;
        zipArchiveOutputStream7.setUseZip64(zip64Mode17);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy19 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy19);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy19);
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.setMethod((int) (short) 10);
        zipArchiveOutputStream1.setMethod((int) (byte) 1);
        zipArchiveOutputStream1.finished = false;
        java.lang.String str30 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "always" + "'", str13, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy19);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "never" + "'", str30, "never");
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        boolean boolean12 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream5.setFallbackToUTF8(true);
        org.junit.Assert.assertNotNull(deflater4);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setMethod((int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int9 = zipArchiveOutputStream8.getCount();
        zipArchiveOutputStream8.setFallbackToUTF8(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("");
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode7 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        boolean boolean10 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray15, 512, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setLevel((int) (short) -1);
        java.util.zip.Deflater deflater9 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertNotNull(deflater9);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setLevel((int) (byte) 0);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setMethod(0);
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("always");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        boolean boolean10 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode11 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode11);
        boolean boolean13 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode16 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        int int5 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setMethod((int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.String str9 = zipArchiveOutputStream1.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream6);
        zipArchiveOutputStream7.finished = true;
        zipArchiveOutputStream7.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str13 = unicodeExtraFieldPolicy12.toString();
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy12);
        zipArchiveOutputStream7.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode17 = null;
        zipArchiveOutputStream7.setUseZip64(zip64Mode17);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy19 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy19);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy19);
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.setMethod((int) (short) 10);
        zipArchiveOutputStream1.setMethod((int) (byte) 1);
        zipArchiveOutputStream1.finished = false;
        java.lang.String str30 = zipArchiveOutputStream1.getEncoding();
        byte[] byteArray32 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray32, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "always" + "'", str13, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy19);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "never" + "'", str30, "never");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10 });
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setMethod(100);
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.close();
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        boolean boolean7 = zipArchiveOutputStream1.finished;
        java.nio.channels.SeekableByteChannel seekableByteChannel8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel8);
        int int10 = zipArchiveOutputStream9.getCount();
        zipArchiveOutputStream9.setFallbackToUTF8(true);
        zipArchiveOutputStream9.finished = true;
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream15);
        zipArchiveOutputStream16.finished = true;
        zipArchiveOutputStream16.deflate();
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream20);
        zipArchiveOutputStream21.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy23 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream21.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy23);
        java.lang.String str25 = unicodeExtraFieldPolicy23.toString();
        zipArchiveOutputStream16.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy23);
        zipArchiveOutputStream9.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy23);
        java.lang.String str28 = unicodeExtraFieldPolicy23.toString();
        java.lang.String str29 = unicodeExtraFieldPolicy23.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy23);
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = null;
        java.io.InputStream inputStream33 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry32, inputStream33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "always" + "'", str28, "always");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "always" + "'", str29, "always");
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("not encodeable");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry14);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.deflate();
        boolean boolean18 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        java.util.zip.Deflater deflater21 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(deflater21);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setMethod((int) '4');
        zipArchiveOutputStream1.setComment("UTF8");
        java.lang.String str10 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream2.setUseZip64(zip64Mode5);
        java.lang.String str7 = zipArchiveOutputStream2.getEncoding();
        int int8 = zipArchiveOutputStream2.getCount();
        zipArchiveOutputStream2.setComment("not encodeable");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry7);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("hi!");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry13);
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setComment("hi!");
        java.util.zip.Deflater deflater5 = zipArchiveOutputStream2.def;
        zipArchiveOutputStream2.setComment("always");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deflater5);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setEncoding("always");
        java.lang.String str14 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "always" + "'", str14, "always");
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setEncoding("always");
        boolean boolean10 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setEncoding("always");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        java.lang.Class<?> wildcardClass6 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode11 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode11);
        int int13 = zipArchiveOutputStream1.getCount();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream8.setLevel((int) (short) 0);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode11 = null;
        zipArchiveOutputStream8.setUseZip64(zip64Mode11);
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream8.writeOut(byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 0, (byte) -1 });
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry11);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = null;
        java.io.InputStream inputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry13, inputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long10 = zipArchiveOutputStream9.getBytesWritten();
        java.util.zip.Deflater deflater11 = zipArchiveOutputStream9.def;
        zipArchiveOutputStream9.deflate();
        zipArchiveOutputStream9.finished = true;
        zipArchiveOutputStream9.finished = false;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream9.writeLocalFileHeader(zipArchiveEntry17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deflater11);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.deflate();
        java.nio.channels.SeekableByteChannel seekableByteChannel14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel14);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream15);
        boolean boolean17 = zipArchiveOutputStream16.isSeekable();
        zipArchiveOutputStream16.setEncoding("never");
        zipArchiveOutputStream16.setFallbackToUTF8(false);
        zipArchiveOutputStream16.finished = true;
        zipArchiveOutputStream16.deflate();
        boolean boolean25 = zipArchiveOutputStream16.finished;
        zipArchiveOutputStream16.deflate();
        zipArchiveOutputStream16.deflate();
        java.io.OutputStream outputStream28 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream28);
        int int30 = zipArchiveOutputStream29.getCount();
        boolean boolean31 = zipArchiveOutputStream29.finished;
        java.nio.channels.SeekableByteChannel seekableByteChannel32 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel32);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream34 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream33);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy35 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream33.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy35);
        zipArchiveOutputStream29.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy35);
        zipArchiveOutputStream16.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy35);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy35);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode8 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode8);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode7 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode7);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.flush();
        boolean boolean4 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream4.writeZip64CentralDirectory();
        zipArchiveOutputStream4.deflate();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode7 = null;
        zipArchiveOutputStream4.setUseZip64(zip64Mode7);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream4.write((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream2.setUseZip64(zip64Mode5);
        java.lang.String str7 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeCentralFileHeader(zipArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        boolean boolean7 = zipArchiveOutputStream2.finished;
        zipArchiveOutputStream2.setFallbackToUTF8(true);
        long long10 = zipArchiveOutputStream2.getBytesWritten();
        zipArchiveOutputStream2.setLevel(0);
        java.util.zip.Deflater deflater13 = zipArchiveOutputStream2.def;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deflater13);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setLevel((-1));
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setMethod((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deflater4);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        boolean boolean7 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        java.lang.String str14 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF8" + "'", str14, "UTF8");
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        long long6 = zipArchiveOutputStream1.getBytesWritten();
        java.nio.channels.SeekableByteChannel seekableByteChannel7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel7);
        int int9 = zipArchiveOutputStream8.getCount();
        zipArchiveOutputStream8.setFallbackToUTF8(true);
        zipArchiveOutputStream8.finished = true;
        zipArchiveOutputStream8.setLevel(0);
        zipArchiveOutputStream8.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream8.flush();
        java.io.OutputStream outputStream19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream19);
        zipArchiveOutputStream20.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy22 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream20.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        java.lang.String str24 = unicodeExtraFieldPolicy22.toString();
        java.lang.String str25 = unicodeExtraFieldPolicy22.toString();
        java.lang.String str26 = unicodeExtraFieldPolicy22.toString();
        zipArchiveOutputStream8.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode31 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode31);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "always" + "'", str24, "always");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "always" + "'", str26, "always");
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        boolean boolean8 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.setEncoding("UTF8");
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray16, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        java.lang.String str10 = zipArchiveOutputStream1.getEncoding();
        int int11 = zipArchiveOutputStream1.getCount();
        boolean boolean12 = zipArchiveOutputStream1.finished;
        java.io.File file13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = zipArchiveOutputStream1.createArchiveEntry(file13, "never");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode8 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode8);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean13 = zipArchiveOutputStream1.isSeekable();
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream14);
        zipArchiveOutputStream15.flush();
        zipArchiveOutputStream15.destroy();
        java.io.OutputStream outputStream18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream18);
        zipArchiveOutputStream19.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = null;
        boolean boolean23 = zipArchiveOutputStream19.canWriteEntryData(archiveEntry22);
        zipArchiveOutputStream19.setEncoding("UTF8");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy26 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str27 = unicodeExtraFieldPolicy26.toString();
        zipArchiveOutputStream19.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy26);
        zipArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy26);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy26);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "never" + "'", str27, "never");
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.deflate();
        boolean boolean9 = zipArchiveOutputStream1.finished;
        boolean boolean10 = zipArchiveOutputStream1.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        boolean boolean4 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.destroy();
        java.lang.String str6 = zipArchiveOutputStream1.getEncoding();
        java.lang.String str7 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setMethod((int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.setMethod((int) (short) 10);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str13 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.util.zip.Deflater deflater17 = zipArchiveOutputStream1.def;
        boolean boolean18 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTF8" + "'", str13, "UTF8");
        org.junit.Assert.assertNotNull(deflater17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream6.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.write((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int10 = zipArchiveOutputStream1.getCount();
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean13 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean17 = zipArchiveOutputStream16.isSeekable();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream1.def;
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.finished = false;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deflater6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.flush();
        boolean boolean7 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.close();
        boolean boolean12 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream9.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.destroy();
        java.lang.String str10 = zipArchiveOutputStream1.getEncoding();
        java.nio.channels.SeekableByteChannel seekableByteChannel11 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel11);
        long long13 = zipArchiveOutputStream12.getBytesWritten();
        zipArchiveOutputStream12.deflate();
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream15);
        int int17 = zipArchiveOutputStream16.getCount();
        boolean boolean18 = zipArchiveOutputStream16.finished;
        java.nio.channels.SeekableByteChannel seekableByteChannel19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel19);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream20);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy22 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream20.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        zipArchiveOutputStream16.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        java.lang.String str25 = unicodeExtraFieldPolicy22.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        java.lang.String str27 = unicodeExtraFieldPolicy22.toString();
        java.lang.String str28 = unicodeExtraFieldPolicy22.toString();
        java.lang.String str29 = unicodeExtraFieldPolicy22.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "always" + "'", str27, "always");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "always" + "'", str28, "always");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "always" + "'", str29, "always");
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        zipArchiveOutputStream2.finished = true;
        zipArchiveOutputStream2.deflate();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode11 = null;
        zipArchiveOutputStream2.setUseZip64(zip64Mode11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("UTF8");
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        boolean boolean9 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry10);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.String str13 = zipArchiveOutputStream12.getEncoding();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode14 = null;
        zipArchiveOutputStream12.setUseZip64(zip64Mode14);
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.write(byteArray16, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTF8" + "'", str13, "UTF8");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setMethod(100);
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream8);
        zipArchiveOutputStream9.finished = true;
        zipArchiveOutputStream9.deflate();
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream13);
        zipArchiveOutputStream14.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy16 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream14.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        java.lang.String str18 = unicodeExtraFieldPolicy16.toString();
        zipArchiveOutputStream9.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        java.lang.String str20 = unicodeExtraFieldPolicy16.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.finished = false;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "always" + "'", str18, "always");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "always" + "'", str20, "always");
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        int int6 = zipArchiveOutputStream1.getCount();
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setMethod(2048);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(deflater7);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream10.writeZip64CentralDirectory();
        java.util.zip.Deflater deflater12 = zipArchiveOutputStream10.def;
        zipArchiveOutputStream10.finished = false;
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertNotNull(deflater12);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.destroy();
        long long4 = zipArchiveOutputStream1.getBytesWritten();
        boolean boolean5 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        java.lang.Class<?> wildcardClass8 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode7 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode7);
        zipArchiveOutputStream1.deflate();
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setComment("");
        zipArchiveOutputStream2.setComment("hi!");
        java.lang.String str7 = zipArchiveOutputStream2.getEncoding();
        boolean boolean8 = zipArchiveOutputStream2.isSeekable();
        int int9 = zipArchiveOutputStream2.getCount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setLevel((int) (byte) 0);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        java.lang.String str11 = zipArchiveOutputStream1.getEncoding();
        java.util.zip.Deflater deflater12 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.io.File file14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = zipArchiveOutputStream1.createArchiveEntry(file14, "always");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertNotNull(deflater12);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setLevel((int) (byte) 0);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setMethod(0);
        zipArchiveOutputStream1.deflate();
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray14, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setLevel(0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry12);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.deflate();
        long long16 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = false;
        byte[] byteArray19 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray19, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.util.zip.Deflater deflater8 = zipArchiveOutputStream1.def;
        boolean boolean9 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean14 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deflater8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.setEncoding("never");
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream13);
        int int15 = zipArchiveOutputStream14.getCount();
        boolean boolean16 = zipArchiveOutputStream14.finished;
        boolean boolean17 = zipArchiveOutputStream14.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream14);
        zipArchiveOutputStream14.setEncoding("UTF8");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy21 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str22 = unicodeExtraFieldPolicy21.toString();
        zipArchiveOutputStream14.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        boolean boolean25 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.deflate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "not encodeable" + "'", str22, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setEncoding("never");
        int int8 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = null;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        boolean boolean11 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.destroy();
        boolean boolean8 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setComment("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        boolean boolean14 = zipArchiveOutputStream1.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean13 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode14 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode14);
        zipArchiveOutputStream1.setLevel((int) (byte) 1);
        zipArchiveOutputStream1.setMethod(512);
        int int20 = zipArchiveOutputStream1.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.flush();
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream12);
        zipArchiveOutputStream13.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream13.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        java.lang.String str17 = unicodeExtraFieldPolicy15.toString();
        java.lang.String str18 = unicodeExtraFieldPolicy15.toString();
        java.lang.String str19 = unicodeExtraFieldPolicy15.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        java.lang.String str21 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = null;
        java.io.InputStream inputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry22, inputStream23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "always" + "'", str18, "always");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "always" + "'", str19, "always");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTF8" + "'", str21, "UTF8");
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setComment("not encodeable");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.finished = false;
        java.util.zip.Deflater deflater13 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertNotNull(deflater13);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setComment("never");
        boolean boolean6 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.deflate();
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = zipArchiveOutputStream1.createArchiveEntry(file8, "always");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int10 = zipArchiveOutputStream1.getCount();
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean13 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = false;
        boolean boolean18 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setComment("not encodeable");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean11 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("UTF8");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = null;
        java.io.InputStream inputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry14, inputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode11 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode11);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy13);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.destroy();
        int int18 = zipArchiveOutputStream1.getCount();
        java.io.OutputStream outputStream19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream19);
        zipArchiveOutputStream20.finished = true;
        zipArchiveOutputStream20.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy25 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str26 = unicodeExtraFieldPolicy25.toString();
        zipArchiveOutputStream20.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy25);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy25);
        int int29 = zipArchiveOutputStream1.getCount();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "always" + "'", str26, "always");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("UTF8");
        java.util.zip.Deflater deflater8 = zipArchiveOutputStream1.def;
        int int9 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (short) 100);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setComment("not encodeable");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        int int9 = zipArchiveOutputStream1.getCount();
        int int10 = zipArchiveOutputStream1.getCount();
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        long long12 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("UTF8");
        java.util.zip.Deflater deflater8 = zipArchiveOutputStream1.def;
        int int9 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.finished = true;
        java.util.zip.Deflater deflater13 = zipArchiveOutputStream1.def;
        java.lang.String str14 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(deflater13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF8" + "'", str14, "UTF8");
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setMethod(100);
        java.lang.String str13 = zipArchiveOutputStream1.getEncoding();
        java.lang.Class<?> wildcardClass14 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTF8" + "'", str13, "UTF8");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        zipArchiveOutputStream1.flush();
        boolean boolean6 = zipArchiveOutputStream1.finished;
        int int7 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        java.lang.String str12 = unicodeExtraFieldPolicy10.toString();
        java.lang.String str13 = unicodeExtraFieldPolicy10.toString();
        java.lang.String str14 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "always" + "'", str11, "always");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "always" + "'", str12, "always");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "always" + "'", str13, "always");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "always" + "'", str14, "always");
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode8 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode8);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.flush();
        java.lang.String str12 = zipArchiveOutputStream1.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream2.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry10);
        java.nio.channels.SeekableByteChannel seekableByteChannel12 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel12);
        int int14 = zipArchiveOutputStream13.getCount();
        zipArchiveOutputStream13.setFallbackToUTF8(true);
        zipArchiveOutputStream13.finished = true;
        zipArchiveOutputStream13.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream13);
        long long22 = zipArchiveOutputStream21.getBytesWritten();
        java.util.zip.Deflater deflater23 = zipArchiveOutputStream21.def;
        zipArchiveOutputStream21.deflate();
        zipArchiveOutputStream21.destroy();
        java.io.OutputStream outputStream26 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream26);
        zipArchiveOutputStream27.finished = true;
        zipArchiveOutputStream27.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy32 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str33 = unicodeExtraFieldPolicy32.toString();
        zipArchiveOutputStream27.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy32);
        zipArchiveOutputStream27.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode37 = null;
        zipArchiveOutputStream27.setUseZip64(zip64Mode37);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy39 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream27.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy39);
        java.lang.String str41 = unicodeExtraFieldPolicy39.toString();
        zipArchiveOutputStream21.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy39);
        java.lang.String str43 = unicodeExtraFieldPolicy39.toString();
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy39);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(deflater23);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "always" + "'", str33, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "always" + "'", str41, "always");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "always" + "'", str43, "always");
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        int int9 = zipArchiveOutputStream1.getCount();
        int int10 = zipArchiveOutputStream1.getCount();
        boolean boolean11 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.destroy();
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry8, inputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        boolean boolean8 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("not encodeable");
        zipArchiveOutputStream1.setMethod(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setComment("never");
        boolean boolean6 = zipArchiveOutputStream2.finished;
        zipArchiveOutputStream2.setLevel((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        java.util.zip.Deflater deflater9 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = null;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        boolean boolean14 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertNotNull(deflater9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        boolean boolean7 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setMethod((int) (byte) 10);
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveOutputStream2.createArchiveEntry(file10, "UTF8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.flush();
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray8, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        boolean boolean10 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setEncoding("always");
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.writeDataDescriptor(zipArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setEncoding("always");
        boolean boolean10 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode13 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode13);
        java.nio.channels.SeekableByteChannel seekableByteChannel15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel15);
        boolean boolean17 = zipArchiveOutputStream16.isSeekable();
        boolean boolean18 = zipArchiveOutputStream16.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        boolean boolean20 = zipArchiveOutputStream16.canWriteEntryData(archiveEntry19);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream16);
        long long22 = zipArchiveOutputStream21.getBytesWritten();
        java.io.OutputStream outputStream23 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream23);
        zipArchiveOutputStream24.finished = true;
        zipArchiveOutputStream24.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy29 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str30 = unicodeExtraFieldPolicy29.toString();
        zipArchiveOutputStream24.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        zipArchiveOutputStream24.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode34 = null;
        zipArchiveOutputStream24.setUseZip64(zip64Mode34);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy36 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream24.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy36);
        zipArchiveOutputStream21.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy36);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "always" + "'", str30, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy36);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        boolean boolean10 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setEncoding("always");
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.nio.channels.SeekableByteChannel seekableByteChannel20 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel20);
        long long22 = zipArchiveOutputStream21.getBytesWritten();
        zipArchiveOutputStream21.finished = true;
        zipArchiveOutputStream21.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream21);
        java.io.OutputStream outputStream27 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream27);
        zipArchiveOutputStream28.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = null;
        boolean boolean31 = zipArchiveOutputStream28.canWriteEntryData(archiveEntry30);
        java.io.OutputStream outputStream32 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream32);
        zipArchiveOutputStream33.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy35 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream33.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy35);
        java.lang.String str37 = unicodeExtraFieldPolicy35.toString();
        zipArchiveOutputStream28.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy35);
        zipArchiveOutputStream26.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy35);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy35);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry41 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry41);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "always" + "'", str37, "always");
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.lang.String str6 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        zipArchiveOutputStream1.setEncoding("always");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream14.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long10 = zipArchiveOutputStream9.getBytesWritten();
        java.util.zip.Deflater deflater11 = zipArchiveOutputStream9.def;
        zipArchiveOutputStream9.deflate();
        zipArchiveOutputStream9.destroy();
        java.lang.String str14 = zipArchiveOutputStream9.getEncoding();
        boolean boolean15 = zipArchiveOutputStream9.isSeekable();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode16 = null;
        zipArchiveOutputStream9.setUseZip64(zip64Mode16);
        zipArchiveOutputStream9.setMethod((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deflater11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF8" + "'", str14, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        boolean boolean10 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.deflate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        java.util.zip.Deflater deflater3 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy4 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str5 = unicodeExtraFieldPolicy4.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int8 = zipArchiveOutputStream1.getCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(deflater3);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "not encodeable" + "'", str5, "not encodeable");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.destroy();
        int int7 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.close();
        boolean boolean13 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setMethod((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.util.zip.Deflater deflater8 = zipArchiveOutputStream1.def;
        boolean boolean9 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        java.lang.String str12 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode13 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode13);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        boolean boolean17 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deflater8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.io.OutputStream outputStream11 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream11);
        zipArchiveOutputStream12.finished = true;
        zipArchiveOutputStream12.setFallbackToUTF8(true);
        java.io.OutputStream outputStream17 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream17);
        zipArchiveOutputStream18.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = null;
        boolean boolean22 = zipArchiveOutputStream18.canWriteEntryData(archiveEntry21);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode23 = null;
        zipArchiveOutputStream18.setUseZip64(zip64Mode23);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode25 = null;
        zipArchiveOutputStream18.setUseZip64(zip64Mode25);
        zipArchiveOutputStream18.flush();
        java.nio.channels.SeekableByteChannel seekableByteChannel28 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel28);
        int int30 = zipArchiveOutputStream29.getCount();
        zipArchiveOutputStream29.setFallbackToUTF8(true);
        java.lang.String str33 = zipArchiveOutputStream29.getEncoding();
        zipArchiveOutputStream29.deflate();
        long long35 = zipArchiveOutputStream29.getBytesWritten();
        zipArchiveOutputStream29.flush();
        zipArchiveOutputStream29.setMethod((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy39 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str40 = unicodeExtraFieldPolicy39.toString();
        zipArchiveOutputStream29.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy39);
        java.lang.String str42 = unicodeExtraFieldPolicy39.toString();
        zipArchiveOutputStream18.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy39);
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy39);
        zipArchiveOutputStream10.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy39);
        java.lang.String str46 = zipArchiveOutputStream10.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry47 = null;
        boolean boolean48 = zipArchiveOutputStream10.canWriteEntryData(archiveEntry47);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry49 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.writeLocalFileHeader(zipArchiveEntry49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTF8" + "'", str33, "UTF8");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "always" + "'", str40, "always");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "always" + "'", str42, "always");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "UTF8" + "'", str46, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode13 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode13);
        long long15 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.flush();
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.setMethod(2048);
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream6);
        zipArchiveOutputStream7.finished = true;
        zipArchiveOutputStream7.setLevel(1);
        zipArchiveOutputStream7.setMethod(100);
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream14);
        zipArchiveOutputStream15.finished = true;
        zipArchiveOutputStream15.deflate();
        java.io.OutputStream outputStream19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream19);
        zipArchiveOutputStream20.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy22 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream20.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        java.lang.String str24 = unicodeExtraFieldPolicy22.toString();
        zipArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        java.lang.String str26 = unicodeExtraFieldPolicy22.toString();
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        java.lang.String str28 = unicodeExtraFieldPolicy22.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.flush();
        java.util.zip.Deflater deflater33 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = null;
        java.io.InputStream inputStream35 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry34, inputStream35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "always" + "'", str24, "always");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "always" + "'", str26, "always");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "always" + "'", str28, "always");
        org.junit.Assert.assertNotNull(deflater33);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream6);
        zipArchiveOutputStream7.finished = true;
        zipArchiveOutputStream7.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str13 = unicodeExtraFieldPolicy12.toString();
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy12);
        zipArchiveOutputStream7.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode17 = null;
        zipArchiveOutputStream7.setUseZip64(zip64Mode17);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy19 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy19);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy19);
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.setMethod((int) (short) 10);
        zipArchiveOutputStream1.setMethod((int) (byte) 1);
        zipArchiveOutputStream1.finished = false;
        java.lang.String str30 = zipArchiveOutputStream1.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "always" + "'", str13, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy19);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "never" + "'", str30, "never");
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        boolean boolean8 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setComment("not encodeable");
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setMethod(100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("not encodeable");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.flush();
        java.lang.String str13 = zipArchiveOutputStream1.getEncoding();
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray14, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "never" + "'", str13, "never");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("UTF8");
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        boolean boolean9 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean13 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.setMethod((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream7);
        zipArchiveOutputStream8.finished = true;
        zipArchiveOutputStream8.deflate();
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream12);
        zipArchiveOutputStream13.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream13.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        java.lang.String str17 = unicodeExtraFieldPolicy15.toString();
        zipArchiveOutputStream8.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode20 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode20);
        int int22 = zipArchiveOutputStream1.getCount();
        int int23 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setEncoding("never");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode11 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode11);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode14 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode14);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.util.zip.Deflater deflater18 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertNotNull(deflater18);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setComment("always");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setComment("hi!");
        java.util.zip.Deflater deflater5 = zipArchiveOutputStream2.def;
        zipArchiveOutputStream2.setComment("always");
        zipArchiveOutputStream2.setLevel((-1));
        zipArchiveOutputStream2.deflate();
        org.junit.Assert.assertNotNull(deflater5);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        long long8 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setComment("not encodeable");
        java.util.zip.Deflater deflater11 = zipArchiveOutputStream1.def;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(deflater11);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.destroy();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setMethod((int) ' ');
        zipArchiveOutputStream1.setLevel(0);
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray14, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        java.nio.channels.SeekableByteChannel seekableByteChannel4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        zipArchiveOutputStream1.setLevel((int) (byte) 0);
        java.lang.String str12 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setComment("");
        long long15 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        java.util.zip.Deflater deflater18 = zipArchiveOutputStream1.def;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(deflater18);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.flush();
        boolean boolean9 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        zipArchiveOutputStream2.finished = true;
        zipArchiveOutputStream2.deflate();
        boolean boolean11 = zipArchiveOutputStream2.finished;
        zipArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry13);
        java.io.OutputStream outputStream15 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream15.write(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray16, (int) 'a', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(outputStream15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry15);
        zipArchiveOutputStream1.setLevel((int) (short) 0);
        boolean boolean19 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.deflate();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream4);
        int int6 = zipArchiveOutputStream5.getCount();
        boolean boolean7 = zipArchiveOutputStream5.finished;
        java.nio.channels.SeekableByteChannel seekableByteChannel8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel8);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream9);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream9.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy11);
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy11);
        java.lang.String str14 = unicodeExtraFieldPolicy11.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy11);
        zipArchiveOutputStream1.setMethod((int) (short) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "always" + "'", str14, "always");
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setComment("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.setMethod((int) '#');
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str6 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        java.lang.String str12 = zipArchiveOutputStream1.getEncoding();
        java.util.zip.Deflater deflater13 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.deflate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertNotNull(deflater13);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.destroy();
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode8 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode8);
        zipArchiveOutputStream1.setEncoding("never");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("UTF8");
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str12 = unicodeExtraFieldPolicy11.toString();
        java.lang.String str13 = unicodeExtraFieldPolicy11.toString();
        java.lang.String str14 = unicodeExtraFieldPolicy11.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy11);
        java.lang.String str16 = unicodeExtraFieldPolicy11.toString();
        java.lang.String str17 = unicodeExtraFieldPolicy11.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "always" + "'", str12, "always");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "always" + "'", str13, "always");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "always" + "'", str14, "always");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "always" + "'", str16, "always");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("UTF8");
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        boolean boolean9 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setComment("");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = null;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setComment("");
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = zipArchiveOutputStream1.createArchiveEntry(file7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        int int5 = zipArchiveOutputStream1.getCount();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream5);
        zipArchiveOutputStream6.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        java.lang.String str10 = unicodeExtraFieldPolicy8.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        boolean boolean12 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "always" + "'", str10, "always");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long10 = zipArchiveOutputStream9.getBytesWritten();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode11 = null;
        zipArchiveOutputStream9.setUseZip64(zip64Mode11);
        zipArchiveOutputStream9.deflate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream9.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setLevel((int) (byte) 0);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setMethod(0);
        zipArchiveOutputStream1.deflate();
        boolean boolean14 = zipArchiveOutputStream1.finished;
        java.io.File file15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = zipArchiveOutputStream1.createArchiveEntry(file15, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode8 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode8);
        java.nio.channels.SeekableByteChannel seekableByteChannel10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel10);
        int int12 = zipArchiveOutputStream11.getCount();
        zipArchiveOutputStream11.setFallbackToUTF8(true);
        zipArchiveOutputStream11.finished = true;
        zipArchiveOutputStream11.flush();
        java.nio.channels.SeekableByteChannel seekableByteChannel18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel18);
        int int20 = zipArchiveOutputStream19.getCount();
        zipArchiveOutputStream19.setFallbackToUTF8(true);
        zipArchiveOutputStream19.finished = true;
        java.io.OutputStream outputStream25 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream25);
        zipArchiveOutputStream26.finished = true;
        zipArchiveOutputStream26.deflate();
        java.io.OutputStream outputStream30 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream31 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream30);
        zipArchiveOutputStream31.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy33 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream31.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy33);
        java.lang.String str35 = unicodeExtraFieldPolicy33.toString();
        zipArchiveOutputStream26.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy33);
        zipArchiveOutputStream19.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy33);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode38 = null;
        zipArchiveOutputStream19.setUseZip64(zip64Mode38);
        int int40 = zipArchiveOutputStream19.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream41 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream19);
        long long42 = zipArchiveOutputStream41.getBytesWritten();
        java.io.OutputStream outputStream43 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream44 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream43);
        zipArchiveOutputStream44.finished = true;
        zipArchiveOutputStream44.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy49 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str50 = unicodeExtraFieldPolicy49.toString();
        zipArchiveOutputStream44.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy49);
        zipArchiveOutputStream44.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode54 = null;
        zipArchiveOutputStream44.setUseZip64(zip64Mode54);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy56 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream44.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy56);
        java.lang.String str58 = unicodeExtraFieldPolicy56.toString();
        zipArchiveOutputStream41.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy56);
        zipArchiveOutputStream11.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy56);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy56);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int64 = zipArchiveOutputStream1.getCount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "always" + "'", str35, "always");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "always" + "'", str50, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "always" + "'", str58, "always");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str8 = unicodeExtraFieldPolicy7.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry10);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.destroy();
        boolean boolean16 = zipArchiveOutputStream1.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "never" + "'", str8, "never");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode11 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode11);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode14 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode14);
        zipArchiveOutputStream1.setMethod(0);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        java.util.zip.Deflater deflater3 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setMethod((int) 'a');
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(deflater3);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.nio.channels.SeekableByteChannel seekableByteChannel6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel6);
        boolean boolean8 = zipArchiveOutputStream7.isSeekable();
        boolean boolean9 = zipArchiveOutputStream7.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveOutputStream7.canWriteEntryData(archiveEntry10);
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream12);
        zipArchiveOutputStream13.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream13.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        zipArchiveOutputStream5.destroy();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode20 = null;
        zipArchiveOutputStream5.setUseZip64(zip64Mode20);
        zipArchiveOutputStream5.destroy();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        java.io.InputStream inputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry9, inputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setLevel((int) (short) -1);
        zipArchiveOutputStream1.setComment("always");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.util.zip.Deflater deflater14 = zipArchiveOutputStream13.def;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(deflater14);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        java.util.zip.Deflater deflater3 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy4 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str5 = unicodeExtraFieldPolicy4.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream7.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(deflater3);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "not encodeable" + "'", str5, "not encodeable");
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.finished = false;
        java.lang.Class<?> wildcardClass7 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("UTF8");
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        boolean boolean9 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry10);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream12.deflate();
        zipArchiveOutputStream12.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = zipArchiveOutputStream12.canWriteEntryData(archiveEntry15);
        int int17 = zipArchiveOutputStream12.getCount();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream2.setUseZip64(zip64Mode5);
        zipArchiveOutputStream2.setLevel((int) (byte) 1);
        zipArchiveOutputStream2.writeZip64CentralDirectory();
        zipArchiveOutputStream2.deflate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str12 = unicodeExtraFieldPolicy11.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy11);
        zipArchiveOutputStream1.setLevel((int) (short) 0);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode16 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode16);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "always" + "'", str12, "always");
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        int int6 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean10 = zipArchiveOutputStream1.isSeekable();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray11, (int) (byte) 0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        boolean boolean7 = zipArchiveOutputStream2.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream8);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.String str11 = zipArchiveOutputStream10.getEncoding();
        java.lang.String str12 = zipArchiveOutputStream10.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveOutputStream10.canWriteEntryData(archiveEntry13);
        zipArchiveOutputStream10.setUseLanguageEncodingFlag(false);
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.writeOut(byteArray17, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.flush();
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.setMethod(100);
        zipArchiveOutputStream1.flush();
        boolean boolean13 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        zipArchiveOutputStream1.flush();
        boolean boolean6 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode8 = null;
        zipArchiveOutputStream7.setUseZip64(zip64Mode8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str9 = unicodeExtraFieldPolicy8.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "never" + "'", str9, "never");
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        boolean boolean15 = zipArchiveOutputStream1.finished;
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray18, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 0, (byte) 1 });
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setComment("never");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.lang.String str9 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.destroy();
        int int11 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream2.setUseZip64(zip64Mode5);
        zipArchiveOutputStream2.setLevel((int) (byte) 1);
        zipArchiveOutputStream2.writeZip64CentralDirectory();
        java.lang.String str10 = zipArchiveOutputStream2.getEncoding();
        java.lang.String str11 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.flush();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("not encodeable");
        java.lang.String str10 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry11);
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "never" + "'", str10, "never");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.String str11 = zipArchiveOutputStream10.getEncoding();
        java.lang.String str12 = zipArchiveOutputStream10.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveOutputStream10.canWriteEntryData(archiveEntry13);
        boolean boolean15 = zipArchiveOutputStream10.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode13 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode13);
        long long15 = zipArchiveOutputStream1.getBytesWritten();
        long long16 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream6);
        zipArchiveOutputStream7.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.destroy();
        java.util.zip.Deflater deflater15 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertNotNull(deflater15);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream2.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        java.nio.channels.SeekableByteChannel seekableByteChannel4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry10);
        zipArchiveOutputStream1.destroy();
        java.lang.String str13 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setComment("");
        long long16 = zipArchiveOutputStream1.getBytesWritten();
        int int17 = zipArchiveOutputStream1.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTF8" + "'", str13, "UTF8");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        zipArchiveOutputStream1.setMethod((int) 'a');
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int10 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.destroy();
        boolean boolean12 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode13 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode13);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode9 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode9);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("not encodeable");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: not encodeable");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.deflate();
        boolean boolean9 = zipArchiveOutputStream1.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.deflate();
        boolean boolean8 = zipArchiveOutputStream1.finished;
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = zipArchiveOutputStream1.createArchiveEntry(file9, "UTF8");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        zipArchiveOutputStream2.finished = true;
        zipArchiveOutputStream2.deflate();
        boolean boolean11 = zipArchiveOutputStream2.finished;
        boolean boolean12 = zipArchiveOutputStream2.isSeekable();
        int int13 = zipArchiveOutputStream2.getCount();
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream2.setLevel((-1));
        zipArchiveOutputStream2.writeZip64CentralDirectory();
        java.io.OutputStream outputStream19 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray20 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream19.write(byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(outputStream19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        long long6 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        zipArchiveOutputStream1.setComment("always");
        zipArchiveOutputStream1.setMethod((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.util.zip.Deflater deflater5 = zipArchiveOutputStream3.def;
        zipArchiveOutputStream3.flush();
        zipArchiveOutputStream3.setLevel((int) (short) 0);
        org.junit.Assert.assertNotNull(deflater5);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        int int13 = zipArchiveOutputStream1.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        java.lang.String str7 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.flush();
        zipArchiveOutputStream2.setMethod((-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream6);
        zipArchiveOutputStream7.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode12 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode12);
        long long14 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        boolean boolean7 = zipArchiveOutputStream2.finished;
        boolean boolean8 = zipArchiveOutputStream2.finished;
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        java.nio.channels.SeekableByteChannel seekableByteChannel11 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel11);
        int int13 = zipArchiveOutputStream12.getCount();
        zipArchiveOutputStream12.setFallbackToUTF8(true);
        java.lang.String str16 = zipArchiveOutputStream12.getEncoding();
        zipArchiveOutputStream12.setFallbackToUTF8(true);
        int int19 = zipArchiveOutputStream12.getCount();
        long long20 = zipArchiveOutputStream12.getBytesWritten();
        boolean boolean21 = zipArchiveOutputStream12.finished;
        zipArchiveOutputStream12.setFallbackToUTF8(true);
        zipArchiveOutputStream12.finished = true;
        zipArchiveOutputStream12.setMethod((int) (short) -1);
        java.io.OutputStream outputStream28 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream28);
        zipArchiveOutputStream29.finished = true;
        zipArchiveOutputStream29.deflate();
        java.io.OutputStream outputStream33 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream34 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream33);
        zipArchiveOutputStream34.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy36 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream34.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy36);
        java.lang.String str38 = unicodeExtraFieldPolicy36.toString();
        zipArchiveOutputStream29.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy36);
        java.lang.String str40 = unicodeExtraFieldPolicy36.toString();
        java.lang.String str41 = unicodeExtraFieldPolicy36.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy36);
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy36);
        java.io.OutputStream outputStream44 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray45 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream44.write(byteArray45);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray45, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTF8" + "'", str16, "UTF8");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "always" + "'", str38, "always");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "always" + "'", str40, "always");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "always" + "'", str41, "always");
        org.junit.Assert.assertNotNull(outputStream44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("always");
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry8, inputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        boolean boolean9 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.finished = true;
        boolean boolean14 = zipArchiveOutputStream1.finished;
        java.lang.String str15 = zipArchiveOutputStream1.getEncoding();
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray16, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF8" + "'", str15, "UTF8");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        java.nio.channels.SeekableByteChannel seekableByteChannel4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        zipArchiveOutputStream1.setLevel((int) (byte) 0);
        java.lang.String str12 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setComment("");
        long long15 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = false;
        java.util.zip.Deflater deflater18 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(deflater18);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        boolean boolean8 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.lang.String str12 = zipArchiveOutputStream1.getEncoding();
        boolean boolean13 = zipArchiveOutputStream1.finished;
        java.io.File file14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = zipArchiveOutputStream1.createArchiveEntry(file14, "always");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry11);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.finished = false;
        int int9 = zipArchiveOutputStream1.getCount();
        int int10 = zipArchiveOutputStream1.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        long long6 = zipArchiveOutputStream1.getBytesWritten();
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = zipArchiveOutputStream1.createArchiveEntry(file7, "always");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream11.writeOut(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setMethod((int) ' ');
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        boolean boolean8 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        zipArchiveOutputStream1.flush();
        boolean boolean12 = zipArchiveOutputStream1.isSeekable();
        java.lang.String str13 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setMethod((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTF8" + "'", str13, "UTF8");
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        java.util.zip.Deflater deflater3 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        java.io.OutputStream outputStream8 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream8.write(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray9, (int) (short) -1, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(deflater3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputStream8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.destroy();
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        boolean boolean12 = zipArchiveOutputStream1.finished;
        boolean boolean13 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = null;
        java.io.InputStream inputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry15, inputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream6);
        zipArchiveOutputStream7.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int10 = zipArchiveOutputStream1.getCount();
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        byte[] byteArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray12, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.flush();
        boolean boolean9 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("hi!");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setEncoding("always");
        java.lang.String str7 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("never");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        java.lang.String str10 = zipArchiveOutputStream1.getEncoding();
        int int11 = zipArchiveOutputStream1.getCount();
        java.lang.String str12 = zipArchiveOutputStream1.getEncoding();
        java.lang.Class<?> wildcardClass13 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode7 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode7);
        java.lang.String str9 = zipArchiveOutputStream1.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        boolean boolean6 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setMethod((int) (short) -1);
        java.lang.String str9 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        boolean boolean10 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.nio.channels.SeekableByteChannel seekableByteChannel19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel19);
        boolean boolean21 = zipArchiveOutputStream20.isSeekable();
        boolean boolean22 = zipArchiveOutputStream20.isSeekable();
        zipArchiveOutputStream20.setComment("");
        java.lang.String str25 = zipArchiveOutputStream20.getEncoding();
        zipArchiveOutputStream20.finished = true;
        java.io.OutputStream outputStream28 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream28);
        zipArchiveOutputStream29.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry31 = null;
        boolean boolean32 = zipArchiveOutputStream29.canWriteEntryData(archiveEntry31);
        zipArchiveOutputStream29.finished = true;
        java.io.OutputStream outputStream35 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream36 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream35);
        zipArchiveOutputStream36.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy38 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream36.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy38);
        java.lang.String str40 = unicodeExtraFieldPolicy38.toString();
        java.lang.String str41 = unicodeExtraFieldPolicy38.toString();
        java.lang.String str42 = unicodeExtraFieldPolicy38.toString();
        java.lang.String str43 = unicodeExtraFieldPolicy38.toString();
        zipArchiveOutputStream29.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy38);
        zipArchiveOutputStream20.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy38);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy38);
        zipArchiveOutputStream1.close();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTF8" + "'", str25, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "always" + "'", str40, "always");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "always" + "'", str41, "always");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "always" + "'", str42, "always");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "always" + "'", str43, "always");
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.finished = false;
        java.lang.Class<?> wildcardClass11 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry11);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("not encodeable");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry14);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long18 = zipArchiveOutputStream17.getBytesWritten();
        boolean boolean19 = zipArchiveOutputStream17.isSeekable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.flush();
        boolean boolean9 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setMethod((int) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int13 = zipArchiveOutputStream12.getCount();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("UTF8");
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        boolean boolean9 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry10);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int13 = zipArchiveOutputStream12.getCount();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.write((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream12);
        zipArchiveOutputStream13.setEncoding("never");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream7);
        zipArchiveOutputStream8.finished = true;
        zipArchiveOutputStream8.deflate();
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream12);
        zipArchiveOutputStream13.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream13.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        java.lang.String str17 = unicodeExtraFieldPolicy15.toString();
        zipArchiveOutputStream8.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode20 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode20);
        int int22 = zipArchiveOutputStream1.getCount();
        int int23 = zipArchiveOutputStream1.getCount();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream2.setMethod((int) (byte) 10);
        boolean boolean9 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setLevel((int) (short) -1);
        zipArchiveOutputStream2.setMethod(2048);
        zipArchiveOutputStream2.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.putArchiveEntry(archiveEntry16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        java.util.zip.Deflater deflater8 = zipArchiveOutputStream1.def;
        boolean boolean9 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry11);
        zipArchiveOutputStream1.deflate();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(deflater8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setLevel((int) (byte) 0);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setMethod(0);
        zipArchiveOutputStream1.deflate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.util.zip.Deflater deflater8 = zipArchiveOutputStream1.def;
        boolean boolean9 = zipArchiveOutputStream1.finished;
        boolean boolean10 = zipArchiveOutputStream1.isSeekable();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deflater8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        boolean boolean6 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.finished = true;
        boolean boolean9 = zipArchiveOutputStream1.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.util.zip.Deflater deflater10 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.finished = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deflater6);
        org.junit.Assert.assertNotNull(deflater10);
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        zipArchiveOutputStream2.finished = true;
        zipArchiveOutputStream2.deflate();
        boolean boolean11 = zipArchiveOutputStream2.finished;
        zipArchiveOutputStream2.deflate();
        zipArchiveOutputStream2.deflate();
        zipArchiveOutputStream2.setMethod(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.close();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        zipArchiveOutputStream2.finished = true;
        zipArchiveOutputStream2.deflate();
        boolean boolean11 = zipArchiveOutputStream2.finished;
        zipArchiveOutputStream2.deflate();
        zipArchiveOutputStream2.deflate();
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream14);
        int int16 = zipArchiveOutputStream15.getCount();
        boolean boolean17 = zipArchiveOutputStream15.finished;
        java.nio.channels.SeekableByteChannel seekableByteChannel18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel18);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream19);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy21 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream19.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        zipArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        java.util.zip.Deflater deflater25 = zipArchiveOutputStream2.def;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy21);
        org.junit.Assert.assertNotNull(deflater25);
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setMethod(100);
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream8);
        zipArchiveOutputStream9.finished = true;
        zipArchiveOutputStream9.deflate();
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream13);
        zipArchiveOutputStream14.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy16 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream14.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        java.lang.String str18 = unicodeExtraFieldPolicy16.toString();
        zipArchiveOutputStream9.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        java.lang.String str20 = unicodeExtraFieldPolicy16.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.deflate();
        long long25 = zipArchiveOutputStream1.getBytesWritten();
        byte[] byteArray26 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "always" + "'", str18, "always");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "always" + "'", str20, "always");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        long long12 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry10);
        zipArchiveOutputStream1.setLevel((int) (byte) 1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry14);
        java.lang.String str16 = zipArchiveOutputStream1.getEncoding();
        java.io.OutputStream outputStream17 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream17.write(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray18, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTF8" + "'", str16, "UTF8");
        org.junit.Assert.assertNotNull(outputStream17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream6.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.writeDataDescriptor(zipArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.setMethod((int) (short) 10);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str13 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.io.File file21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = zipArchiveOutputStream1.createArchiveEntry(file21, "never");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTF8" + "'", str13, "UTF8");
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode13 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode13);
        zipArchiveOutputStream1.setMethod((int) (short) 0);
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray17, 8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("UTF8");
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        int int10 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setComment("never");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str8 = unicodeExtraFieldPolicy7.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry10);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.deflate();
        java.lang.Class<?> wildcardClass15 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "never" + "'", str8, "never");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        java.util.zip.Deflater deflater3 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy4 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str5 = unicodeExtraFieldPolicy4.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long8 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(deflater3);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "not encodeable" + "'", str5, "not encodeable");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode11 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode11);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long16 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("not encodeable");
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.util.zip.Deflater deflater5 = zipArchiveOutputStream1.def;
        java.nio.channels.SeekableByteChannel seekableByteChannel6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel6);
        long long8 = zipArchiveOutputStream7.getBytesWritten();
        int int9 = zipArchiveOutputStream7.getCount();
        zipArchiveOutputStream7.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream7.destroy();
        zipArchiveOutputStream7.destroy();
        boolean boolean14 = zipArchiveOutputStream7.isSeekable();
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream15);
        int int17 = zipArchiveOutputStream16.getCount();
        boolean boolean18 = zipArchiveOutputStream16.finished;
        java.nio.channels.SeekableByteChannel seekableByteChannel19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel19);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream20);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy22 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream20.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        zipArchiveOutputStream16.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        java.lang.String str25 = unicodeExtraFieldPolicy22.toString();
        java.lang.String str26 = unicodeExtraFieldPolicy22.toString();
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        boolean boolean29 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deflater5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "always" + "'", str26, "always");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setMethod(100);
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream8);
        zipArchiveOutputStream9.finished = true;
        zipArchiveOutputStream9.deflate();
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream13);
        zipArchiveOutputStream14.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy16 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream14.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        java.lang.String str18 = unicodeExtraFieldPolicy16.toString();
        zipArchiveOutputStream9.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        java.lang.String str20 = unicodeExtraFieldPolicy16.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        java.nio.channels.SeekableByteChannel seekableByteChannel22 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel22);
        long long24 = zipArchiveOutputStream23.getBytesWritten();
        zipArchiveOutputStream23.deflate();
        java.io.OutputStream outputStream26 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream26);
        int int28 = zipArchiveOutputStream27.getCount();
        boolean boolean29 = zipArchiveOutputStream27.finished;
        java.nio.channels.SeekableByteChannel seekableByteChannel30 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream31 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel30);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream31);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy33 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream31.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy33);
        zipArchiveOutputStream27.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy33);
        java.lang.String str36 = unicodeExtraFieldPolicy33.toString();
        zipArchiveOutputStream23.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy33);
        java.lang.String str38 = unicodeExtraFieldPolicy33.toString();
        java.lang.String str39 = unicodeExtraFieldPolicy33.toString();
        java.lang.String str40 = unicodeExtraFieldPolicy33.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy33);
        java.lang.String str42 = zipArchiveOutputStream1.getEncoding();
        boolean boolean43 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.flush();
        byte[] byteArray46 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray46, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "always" + "'", str18, "always");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "always" + "'", str20, "always");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "always" + "'", str36, "always");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "always" + "'", str38, "always");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "always" + "'", str39, "always");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "always" + "'", str40, "always");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTF8" + "'", str42, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        java.nio.channels.SeekableByteChannel seekableByteChannel4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        java.lang.String str9 = unicodeExtraFieldPolicy7.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        java.lang.String str11 = unicodeExtraFieldPolicy7.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "always" + "'", str9, "always");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "always" + "'", str11, "always");
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long10 = zipArchiveOutputStream9.getBytesWritten();
        java.util.zip.Deflater deflater11 = zipArchiveOutputStream9.def;
        zipArchiveOutputStream9.deflate();
        zipArchiveOutputStream9.destroy();
        java.lang.String str14 = zipArchiveOutputStream9.getEncoding();
        boolean boolean15 = zipArchiveOutputStream9.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream9.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deflater11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF8" + "'", str14, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        int int6 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode9 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode9);
        java.lang.Class<?> wildcardClass11 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        boolean boolean7 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setLevel(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream11.setEncoding("UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream7.writeZip64CentralDirectory();
        java.util.zip.Deflater deflater9 = zipArchiveOutputStream7.def;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(deflater9);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        boolean boolean7 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode8 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode8);
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.nio.channels.SeekableByteChannel seekableByteChannel12 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream13);
        boolean boolean15 = zipArchiveOutputStream14.isSeekable();
        zipArchiveOutputStream14.setEncoding("never");
        zipArchiveOutputStream14.setFallbackToUTF8(false);
        zipArchiveOutputStream14.setMethod((int) (byte) 0);
        java.io.OutputStream outputStream22 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream22);
        zipArchiveOutputStream23.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy25 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream23.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy25);
        java.lang.String str27 = unicodeExtraFieldPolicy25.toString();
        zipArchiveOutputStream14.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy25);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy25);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "always" + "'", str27, "always");
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        zipArchiveOutputStream1.finished = true;
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream7);
        zipArchiveOutputStream8.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream8.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        java.lang.String str12 = unicodeExtraFieldPolicy10.toString();
        java.lang.String str13 = unicodeExtraFieldPolicy10.toString();
        java.lang.String str14 = unicodeExtraFieldPolicy10.toString();
        java.lang.String str15 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        java.util.zip.Deflater deflater17 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "always" + "'", str12, "always");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "always" + "'", str13, "always");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "always" + "'", str14, "always");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "always" + "'", str15, "always");
        org.junit.Assert.assertNotNull(deflater17);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        boolean boolean7 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        java.util.zip.Deflater deflater8 = zipArchiveOutputStream1.def;
        java.nio.channels.SeekableByteChannel seekableByteChannel9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel9);
        int int11 = zipArchiveOutputStream10.getCount();
        zipArchiveOutputStream10.setFallbackToUTF8(true);
        java.lang.String str14 = zipArchiveOutputStream10.getEncoding();
        zipArchiveOutputStream10.setFallbackToUTF8(true);
        int int17 = zipArchiveOutputStream10.getCount();
        long long18 = zipArchiveOutputStream10.getBytesWritten();
        boolean boolean19 = zipArchiveOutputStream10.finished;
        zipArchiveOutputStream10.setFallbackToUTF8(true);
        zipArchiveOutputStream10.finished = true;
        zipArchiveOutputStream10.setMethod((int) (short) -1);
        java.io.OutputStream outputStream26 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream26);
        zipArchiveOutputStream27.finished = true;
        zipArchiveOutputStream27.deflate();
        java.io.OutputStream outputStream31 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream31);
        zipArchiveOutputStream32.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy34 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream32.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy34);
        java.lang.String str36 = unicodeExtraFieldPolicy34.toString();
        zipArchiveOutputStream27.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy34);
        java.lang.String str38 = unicodeExtraFieldPolicy34.toString();
        java.lang.String str39 = unicodeExtraFieldPolicy34.toString();
        zipArchiveOutputStream10.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy34);
        java.lang.String str41 = unicodeExtraFieldPolicy34.toString();
        java.lang.String str42 = unicodeExtraFieldPolicy34.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(deflater8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF8" + "'", str14, "UTF8");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "always" + "'", str36, "always");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "always" + "'", str38, "always");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "always" + "'", str39, "always");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "always" + "'", str41, "always");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "always" + "'", str42, "always");
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        long long6 = zipArchiveOutputStream1.getBytesWritten();
        java.nio.channels.SeekableByteChannel seekableByteChannel7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel7);
        int int9 = zipArchiveOutputStream8.getCount();
        zipArchiveOutputStream8.setFallbackToUTF8(true);
        zipArchiveOutputStream8.finished = true;
        zipArchiveOutputStream8.setLevel(0);
        zipArchiveOutputStream8.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream8.flush();
        java.io.OutputStream outputStream19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream19);
        zipArchiveOutputStream20.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy22 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream20.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        java.lang.String str24 = unicodeExtraFieldPolicy22.toString();
        java.lang.String str25 = unicodeExtraFieldPolicy22.toString();
        java.lang.String str26 = unicodeExtraFieldPolicy22.toString();
        zipArchiveOutputStream8.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        java.lang.String str32 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode33 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode33);
        java.io.File file35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry37 = zipArchiveOutputStream1.createArchiveEntry(file35, "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "always" + "'", str24, "always");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "always" + "'", str26, "always");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTF8" + "'", str32, "UTF8");
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.finished = false;
        int int11 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = null;
        java.io.InputStream inputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry14, inputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.setComment("not encodeable");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("not encodeable");
        java.lang.String str10 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode12 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode12);
        boolean boolean14 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "never" + "'", str10, "never");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setComment("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setEncoding("never");
        java.lang.String str9 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray12, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "never" + "'", str9, "never");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("never");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode9 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode9);
        java.nio.channels.SeekableByteChannel seekableByteChannel11 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel11);
        int int13 = zipArchiveOutputStream12.getCount();
        zipArchiveOutputStream12.setFallbackToUTF8(true);
        zipArchiveOutputStream12.finished = true;
        zipArchiveOutputStream12.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream12);
        long long21 = zipArchiveOutputStream20.getBytesWritten();
        java.util.zip.Deflater deflater22 = zipArchiveOutputStream20.def;
        zipArchiveOutputStream20.flush();
        zipArchiveOutputStream20.setComment("always");
        java.nio.channels.SeekableByteChannel seekableByteChannel26 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel26);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream27);
        boolean boolean29 = zipArchiveOutputStream28.isSeekable();
        boolean boolean30 = zipArchiveOutputStream28.finished;
        java.lang.String str31 = zipArchiveOutputStream28.getEncoding();
        zipArchiveOutputStream28.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy33 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str34 = unicodeExtraFieldPolicy33.toString();
        java.lang.String str35 = unicodeExtraFieldPolicy33.toString();
        zipArchiveOutputStream28.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy33);
        zipArchiveOutputStream20.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy33);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy33);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(deflater22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTF8" + "'", str31, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "never" + "'", str34, "never");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "never" + "'", str35, "never");
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        boolean boolean15 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = null;
        boolean boolean17 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry16);
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.destroy();
        java.lang.String str11 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.io.OutputStream outputStream14 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream14.write(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray15, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertNotNull(outputStream14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry5, inputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int10 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.destroy();
        boolean boolean12 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.close();
        int int15 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.deflate();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.deflate();
        java.nio.channels.SeekableByteChannel seekableByteChannel10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel10);
        boolean boolean12 = zipArchiveOutputStream11.isSeekable();
        zipArchiveOutputStream11.flush();
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream14);
        zipArchiveOutputStream15.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy17 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy17);
        zipArchiveOutputStream11.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy17);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy17);
        java.util.zip.Deflater deflater21 = zipArchiveOutputStream1.def;
        byte[] byteArray22 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray22, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy17);
        org.junit.Assert.assertNotNull(deflater21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.deflate();
        java.io.OutputStream outputStream4 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream4.write(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.deflate();
        java.lang.String str6 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.finished = false;
        java.util.zip.Deflater deflater9 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(deflater9);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int5 = zipArchiveOutputStream1.getCount();
        int int6 = zipArchiveOutputStream1.getCount();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("UTF8");
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        zipArchiveOutputStream1.destroy();
        long long12 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        java.nio.channels.SeekableByteChannel seekableByteChannel4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        zipArchiveOutputStream1.setLevel((int) (byte) 0);
        zipArchiveOutputStream1.deflate();
        boolean boolean13 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setLevel((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        zipArchiveOutputStream1.setMethod((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        boolean boolean11 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        int int7 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.deflate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str8 = unicodeExtraFieldPolicy7.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        boolean boolean10 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setLevel((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "never" + "'", str8, "never");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream6);
        zipArchiveOutputStream7.finished = true;
        zipArchiveOutputStream7.setLevel(1);
        zipArchiveOutputStream7.setMethod(100);
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream14);
        zipArchiveOutputStream15.finished = true;
        zipArchiveOutputStream15.deflate();
        java.io.OutputStream outputStream19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream19);
        zipArchiveOutputStream20.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy22 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream20.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        java.lang.String str24 = unicodeExtraFieldPolicy22.toString();
        zipArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        java.lang.String str26 = unicodeExtraFieldPolicy22.toString();
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        java.lang.String str28 = unicodeExtraFieldPolicy22.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry35 = null;
        boolean boolean36 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry35);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "always" + "'", str24, "always");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "always" + "'", str26, "always");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "always" + "'", str28, "always");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.util.zip.Deflater deflater12 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertNotNull(deflater12);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.String str10 = zipArchiveOutputStream9.getEncoding();
        java.util.zip.Deflater deflater11 = zipArchiveOutputStream9.def;
        zipArchiveOutputStream9.setEncoding("UTF8");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream9.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
        org.junit.Assert.assertNotNull(deflater11);
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        long long6 = zipArchiveOutputStream1.getBytesWritten();
        java.nio.channels.SeekableByteChannel seekableByteChannel7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel7);
        int int9 = zipArchiveOutputStream8.getCount();
        zipArchiveOutputStream8.setFallbackToUTF8(true);
        zipArchiveOutputStream8.finished = true;
        zipArchiveOutputStream8.setLevel(0);
        zipArchiveOutputStream8.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream8.flush();
        java.io.OutputStream outputStream19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream19);
        zipArchiveOutputStream20.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy22 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream20.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        java.lang.String str24 = unicodeExtraFieldPolicy22.toString();
        java.lang.String str25 = unicodeExtraFieldPolicy22.toString();
        java.lang.String str26 = unicodeExtraFieldPolicy22.toString();
        zipArchiveOutputStream8.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        java.lang.String str32 = zipArchiveOutputStream1.getEncoding();
        boolean boolean33 = zipArchiveOutputStream1.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archive has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "always" + "'", str24, "always");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "always" + "'", str26, "always");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTF8" + "'", str32, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean9 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.setEncoding("always");
        java.lang.String str14 = zipArchiveOutputStream1.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "always" + "'", str14, "always");
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream6);
        zipArchiveOutputStream7.finished = true;
        zipArchiveOutputStream7.setLevel(1);
        zipArchiveOutputStream7.setMethod(100);
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream14);
        zipArchiveOutputStream15.finished = true;
        zipArchiveOutputStream15.deflate();
        java.io.OutputStream outputStream19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream19);
        zipArchiveOutputStream20.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy22 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream20.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        java.lang.String str24 = unicodeExtraFieldPolicy22.toString();
        zipArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        java.lang.String str26 = unicodeExtraFieldPolicy22.toString();
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        java.lang.String str28 = unicodeExtraFieldPolicy22.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.deflate();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "always" + "'", str24, "always");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "always" + "'", str26, "always");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "always" + "'", str28, "always");
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setLevel(0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry12);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.deflate();
        long long16 = zipArchiveOutputStream1.getBytesWritten();
        boolean boolean17 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry7);
        zipArchiveOutputStream1.setEncoding("always");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deflater6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setLevel((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.setMethod((int) (short) 10);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str13 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.flush();
        java.lang.String str20 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTF8" + "'", str13, "UTF8");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "never" + "'", str20, "never");
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setComment("never");
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        boolean boolean12 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setEncoding("never");
        int int8 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = null;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        boolean boolean14 = zipArchiveOutputStream1.finished;
        boolean boolean15 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.destroy();
        java.lang.String str10 = zipArchiveOutputStream1.getEncoding();
        int int11 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.destroy();
        byte[] byteArray13 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray13, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setComment("UTF8");
        boolean boolean7 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setEncoding("UTF8");
        java.io.OutputStream outputStream10 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream10.write(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setMethod(0);
        zipArchiveOutputStream1.setLevel(8);
        zipArchiveOutputStream1.setComment("not encodeable");
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream8);
        zipArchiveOutputStream9.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = zipArchiveOutputStream9.canWriteEntryData(archiveEntry11);
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream13);
        zipArchiveOutputStream14.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy16 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream14.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        java.lang.String str18 = unicodeExtraFieldPolicy16.toString();
        zipArchiveOutputStream9.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "always" + "'", str18, "always");
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long10 = zipArchiveOutputStream9.getBytesWritten();
        java.util.zip.Deflater deflater11 = zipArchiveOutputStream9.def;
        long long12 = zipArchiveOutputStream9.getBytesWritten();
        long long13 = zipArchiveOutputStream9.getBytesWritten();
        java.lang.String str14 = zipArchiveOutputStream9.getEncoding();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deflater11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF8" + "'", str14, "UTF8");
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.deflate();
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray12, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setEncoding("always");
        boolean boolean10 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode13 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode13);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode4 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(deflater6);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setLevel((int) (byte) 1);
        int int12 = zipArchiveOutputStream1.getCount();
        java.util.zip.Deflater deflater13 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(deflater13);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.flush();
        long long10 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long10 = zipArchiveOutputStream9.getBytesWritten();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode11 = null;
        zipArchiveOutputStream9.setUseZip64(zip64Mode11);
        zipArchiveOutputStream9.deflate();
        zipArchiveOutputStream9.setFallbackToUTF8(true);
        zipArchiveOutputStream9.flush();
        int int17 = zipArchiveOutputStream9.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream9.writeDataDescriptor(zipArchiveEntry18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long10 = zipArchiveOutputStream9.getBytesWritten();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode11 = null;
        zipArchiveOutputStream9.setUseZip64(zip64Mode11);
        zipArchiveOutputStream9.deflate();
        zipArchiveOutputStream9.setFallbackToUTF8(true);
        zipArchiveOutputStream9.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream9.setLevel((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setMethod(100);
        zipArchiveOutputStream1.setComment("not encodeable");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        boolean boolean10 = zipArchiveOutputStream1.isSeekable();
        java.lang.String str11 = zipArchiveOutputStream1.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean5 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.flush();
        boolean boolean11 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("not encodeable");
        zipArchiveOutputStream1.finished = false;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        zipArchiveOutputStream2.finished = true;
        zipArchiveOutputStream2.setLevel((int) (byte) 0);
        zipArchiveOutputStream2.deflate();
        long long13 = zipArchiveOutputStream2.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeLocalFileHeader(zipArchiveEntry15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode13 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode13);
        zipArchiveOutputStream1.setMethod((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setMethod((int) '4');
        int int8 = zipArchiveOutputStream1.getCount();
        java.nio.channels.SeekableByteChannel seekableByteChannel9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel9);
        int int11 = zipArchiveOutputStream10.getCount();
        zipArchiveOutputStream10.setFallbackToUTF8(true);
        zipArchiveOutputStream10.finished = true;
        zipArchiveOutputStream10.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream10);
        long long19 = zipArchiveOutputStream18.getBytesWritten();
        java.util.zip.Deflater deflater20 = zipArchiveOutputStream18.def;
        zipArchiveOutputStream18.flush();
        zipArchiveOutputStream18.setComment("always");
        java.nio.channels.SeekableByteChannel seekableByteChannel24 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel24);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream25);
        boolean boolean27 = zipArchiveOutputStream26.isSeekable();
        boolean boolean28 = zipArchiveOutputStream26.finished;
        java.lang.String str29 = zipArchiveOutputStream26.getEncoding();
        zipArchiveOutputStream26.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy31 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str32 = unicodeExtraFieldPolicy31.toString();
        java.lang.String str33 = unicodeExtraFieldPolicy31.toString();
        zipArchiveOutputStream26.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy31);
        zipArchiveOutputStream18.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy31);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(deflater20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTF8" + "'", str29, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "never" + "'", str32, "never");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "never" + "'", str33, "never");
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        zipArchiveOutputStream2.setMethod((int) (byte) 0);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream10);
        zipArchiveOutputStream11.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream11.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy13);
        java.lang.String str15 = unicodeExtraFieldPolicy13.toString();
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy13);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.setComment("hi!");
        boolean boolean21 = zipArchiveOutputStream2.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "always" + "'", str15, "always");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.setEncoding("never");
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream13);
        int int15 = zipArchiveOutputStream14.getCount();
        boolean boolean16 = zipArchiveOutputStream14.finished;
        boolean boolean17 = zipArchiveOutputStream14.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream14);
        zipArchiveOutputStream14.setEncoding("UTF8");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy21 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str22 = unicodeExtraFieldPolicy21.toString();
        zipArchiveOutputStream14.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "not encodeable" + "'", str22, "not encodeable");
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setMethod(0);
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        boolean boolean5 = zipArchiveOutputStream1.isSeekable();
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream6);
        zipArchiveOutputStream7.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        java.lang.String str11 = unicodeExtraFieldPolicy9.toString();
        java.lang.String str12 = unicodeExtraFieldPolicy9.toString();
        java.lang.String str13 = unicodeExtraFieldPolicy9.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        zipArchiveOutputStream1.setEncoding("never");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "always" + "'", str11, "always");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "always" + "'", str12, "always");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "always" + "'", str13, "always");
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("UTF8");
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        boolean boolean9 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry10);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.String str13 = zipArchiveOutputStream12.getEncoding();
        zipArchiveOutputStream12.flush();
        zipArchiveOutputStream12.setMethod((int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTF8" + "'", str13, "UTF8");
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream5);
        zipArchiveOutputStream6.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        java.lang.String str10 = unicodeExtraFieldPolicy8.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry12);
        zipArchiveOutputStream1.destroy();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "always" + "'", str10, "always");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.finished = false;
        int int9 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        int int12 = zipArchiveOutputStream1.getCount();
        boolean boolean13 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        java.nio.channels.SeekableByteChannel seekableByteChannel4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        zipArchiveOutputStream1.setLevel((int) (byte) 0);
        zipArchiveOutputStream1.deflate();
        boolean boolean13 = zipArchiveOutputStream1.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setLevel((int) (byte) 0);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        java.lang.String str11 = zipArchiveOutputStream1.getEncoding();
        java.util.zip.Deflater deflater12 = zipArchiveOutputStream1.def;
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray13, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertNotNull(deflater12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode7 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode7);
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry10);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.lang.String str6 = zipArchiveOutputStream1.getEncoding();
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = zipArchiveOutputStream1.createArchiveEntry(file7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream13.writeOut(byteArray14, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream9);
        zipArchiveOutputStream10.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveOutputStream10.canWriteEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode15 = null;
        zipArchiveOutputStream10.setUseZip64(zip64Mode15);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode17 = null;
        zipArchiveOutputStream10.setUseZip64(zip64Mode17);
        zipArchiveOutputStream10.flush();
        java.nio.channels.SeekableByteChannel seekableByteChannel20 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel20);
        int int22 = zipArchiveOutputStream21.getCount();
        zipArchiveOutputStream21.setFallbackToUTF8(true);
        java.lang.String str25 = zipArchiveOutputStream21.getEncoding();
        zipArchiveOutputStream21.deflate();
        long long27 = zipArchiveOutputStream21.getBytesWritten();
        zipArchiveOutputStream21.flush();
        zipArchiveOutputStream21.setMethod((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy31 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str32 = unicodeExtraFieldPolicy31.toString();
        zipArchiveOutputStream21.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy31);
        java.lang.String str34 = unicodeExtraFieldPolicy31.toString();
        zipArchiveOutputStream10.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy31);
        java.lang.String str36 = unicodeExtraFieldPolicy31.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy31);
        java.nio.channels.SeekableByteChannel seekableByteChannel38 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream39 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel38);
        int int40 = zipArchiveOutputStream39.getCount();
        zipArchiveOutputStream39.setFallbackToUTF8(true);
        java.lang.String str43 = zipArchiveOutputStream39.getEncoding();
        zipArchiveOutputStream39.deflate();
        long long45 = zipArchiveOutputStream39.getBytesWritten();
        zipArchiveOutputStream39.flush();
        zipArchiveOutputStream39.setMethod((int) (short) 10);
        java.nio.channels.SeekableByteChannel seekableByteChannel49 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream50 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel49);
        boolean boolean51 = zipArchiveOutputStream50.isSeekable();
        boolean boolean52 = zipArchiveOutputStream50.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry53 = null;
        boolean boolean54 = zipArchiveOutputStream50.canWriteEntryData(archiveEntry53);
        java.io.OutputStream outputStream55 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream56 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream55);
        zipArchiveOutputStream56.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy58 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream56.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy58);
        zipArchiveOutputStream50.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy58);
        java.lang.String str61 = unicodeExtraFieldPolicy58.toString();
        zipArchiveOutputStream39.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy58);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy58);
        zipArchiveOutputStream1.deflate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTF8" + "'", str25, "UTF8");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "always" + "'", str32, "always");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "always" + "'", str34, "always");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "always" + "'", str36, "always");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "UTF8" + "'", str43, "UTF8");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "always" + "'", str61, "always");
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        long long6 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setLevel((int) (short) -1);
        zipArchiveOutputStream1.setComment("always");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream5);
        zipArchiveOutputStream6.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        java.lang.String str10 = unicodeExtraFieldPolicy8.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        int int16 = zipArchiveOutputStream1.getCount();
        java.lang.Class<?> wildcardClass17 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "always" + "'", str10, "always");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.destroy();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream4);
        zipArchiveOutputStream5.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream5.canWriteEntryData(archiveEntry8);
        zipArchiveOutputStream5.setEncoding("UTF8");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str13 = unicodeExtraFieldPolicy12.toString();
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy12);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy12);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "never" + "'", str13, "never");
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        boolean boolean4 = zipArchiveOutputStream2.finished;
        zipArchiveOutputStream2.finished = false;
        zipArchiveOutputStream2.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream2.def;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deflater4);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        java.nio.channels.SeekableByteChannel seekableByteChannel4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry10);
        zipArchiveOutputStream1.destroy();
        long long13 = zipArchiveOutputStream1.getBytesWritten();
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.destroy();
        int int9 = zipArchiveOutputStream1.getCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.destroy();
        int int15 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry7);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deflater6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setEncoding("always");
        zipArchiveOutputStream1.setEncoding("always");
        zipArchiveOutputStream1.deflate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setMethod((int) (byte) 100);
        int int8 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setComment("never");
        java.util.zip.Deflater deflater11 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setMethod((int) 'a');
        java.nio.channels.SeekableByteChannel seekableByteChannel14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel14);
        int int16 = zipArchiveOutputStream15.getCount();
        zipArchiveOutputStream15.setFallbackToUTF8(true);
        zipArchiveOutputStream15.finished = true;
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream21);
        zipArchiveOutputStream22.finished = true;
        zipArchiveOutputStream22.deflate();
        java.io.OutputStream outputStream26 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream26);
        zipArchiveOutputStream27.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy29 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream27.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        java.lang.String str31 = unicodeExtraFieldPolicy29.toString();
        zipArchiveOutputStream22.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        zipArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        java.lang.String str34 = unicodeExtraFieldPolicy29.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(deflater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "always" + "'", str31, "always");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "always" + "'", str34, "always");
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        int int8 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = null;
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry7, inputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean9 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long7 = zipArchiveOutputStream6.getBytesWritten();
        zipArchiveOutputStream6.setComment("UTF8");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveOutputStream6.canWriteEntryData(archiveEntry10);
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.writeOut(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        boolean boolean4 = zipArchiveOutputStream2.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        long long6 = zipArchiveOutputStream1.getBytesWritten();
        java.nio.channels.SeekableByteChannel seekableByteChannel7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel7);
        int int9 = zipArchiveOutputStream8.getCount();
        zipArchiveOutputStream8.setFallbackToUTF8(true);
        zipArchiveOutputStream8.finished = true;
        zipArchiveOutputStream8.setLevel(0);
        zipArchiveOutputStream8.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream8.flush();
        java.io.OutputStream outputStream19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream19);
        zipArchiveOutputStream20.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy22 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream20.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        java.lang.String str24 = unicodeExtraFieldPolicy22.toString();
        java.lang.String str25 = unicodeExtraFieldPolicy22.toString();
        java.lang.String str26 = unicodeExtraFieldPolicy22.toString();
        zipArchiveOutputStream8.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream29.setEncoding("always");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "always" + "'", str24, "always");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "always" + "'", str26, "always");
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        boolean boolean8 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        zipArchiveOutputStream1.setComment("not encodeable");
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        boolean boolean15 = zipArchiveOutputStream1.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        int int5 = zipArchiveOutputStream4.getCount();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream4.setUseZip64(zip64Mode6);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream4.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setEncoding("always");
        boolean boolean10 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setEncoding("always");
        int int13 = zipArchiveOutputStream1.getCount();
        java.nio.channels.SeekableByteChannel seekableByteChannel14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel14);
        int int16 = zipArchiveOutputStream15.getCount();
        zipArchiveOutputStream15.setFallbackToUTF8(true);
        zipArchiveOutputStream15.finished = true;
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream21);
        zipArchiveOutputStream22.finished = true;
        zipArchiveOutputStream22.deflate();
        java.io.OutputStream outputStream26 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream26);
        zipArchiveOutputStream27.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy29 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream27.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        java.lang.String str31 = unicodeExtraFieldPolicy29.toString();
        zipArchiveOutputStream22.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        zipArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        java.lang.String str34 = unicodeExtraFieldPolicy29.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        int int36 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode37 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode37);
        int int39 = zipArchiveOutputStream1.getCount();
        byte[] byteArray40 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray40, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "always" + "'", str31, "always");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "always" + "'", str34, "always");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream7);
        zipArchiveOutputStream8.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveOutputStream8.canWriteEntryData(archiveEntry10);
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream12);
        zipArchiveOutputStream13.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream13.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        java.lang.String str17 = unicodeExtraFieldPolicy15.toString();
        zipArchiveOutputStream8.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        java.lang.String str20 = unicodeExtraFieldPolicy15.toString();
        java.lang.String str21 = unicodeExtraFieldPolicy15.toString();
        java.lang.String str22 = unicodeExtraFieldPolicy15.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "always" + "'", str20, "always");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "always" + "'", str21, "always");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "always" + "'", str22, "always");
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        int int9 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode8 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode8);
        boolean boolean10 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        java.io.InputStream inputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry11, inputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.close();
        boolean boolean6 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.util.zip.Deflater deflater9 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(deflater9);
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setComment("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.flush();
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream5);
        zipArchiveOutputStream6.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        java.lang.String str10 = unicodeExtraFieldPolicy8.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        zipArchiveOutputStream1.finished = true;
        int int14 = zipArchiveOutputStream1.getCount();
        java.lang.String str15 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "always" + "'", str10, "always");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF8" + "'", str15, "UTF8");
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        boolean boolean9 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.putArchiveEntry(archiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream12.flush();
        zipArchiveOutputStream12.deflate();
        zipArchiveOutputStream12.setFallbackToUTF8(true);
        java.nio.channels.SeekableByteChannel seekableByteChannel17 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel17);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream18);
        zipArchiveOutputStream19.setMethod((int) 'a');
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode22 = null;
        zipArchiveOutputStream19.setUseZip64(zip64Mode22);
        zipArchiveOutputStream19.setLevel((int) (byte) 1);
        zipArchiveOutputStream19.writeZip64CentralDirectory();
        zipArchiveOutputStream19.finished = false;
        java.nio.channels.SeekableByteChannel seekableByteChannel29 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel29);
        long long31 = zipArchiveOutputStream30.getBytesWritten();
        int int32 = zipArchiveOutputStream30.getCount();
        zipArchiveOutputStream30.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream30.setComment("UTF8");
        zipArchiveOutputStream30.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy39 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str40 = unicodeExtraFieldPolicy39.toString();
        java.lang.String str41 = unicodeExtraFieldPolicy39.toString();
        zipArchiveOutputStream30.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy39);
        zipArchiveOutputStream19.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy39);
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy39);
        java.lang.String str45 = unicodeExtraFieldPolicy39.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "always" + "'", str40, "always");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "always" + "'", str41, "always");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "always" + "'", str45, "always");
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setEncoding("always");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(deflater6);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        java.lang.String str6 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.finished = true;
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream9);
        zipArchiveOutputStream10.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveOutputStream10.canWriteEntryData(archiveEntry12);
        zipArchiveOutputStream10.finished = true;
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream16);
        zipArchiveOutputStream17.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy19 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream17.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy19);
        java.lang.String str21 = unicodeExtraFieldPolicy19.toString();
        java.lang.String str22 = unicodeExtraFieldPolicy19.toString();
        java.lang.String str23 = unicodeExtraFieldPolicy19.toString();
        java.lang.String str24 = unicodeExtraFieldPolicy19.toString();
        zipArchiveOutputStream10.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy19);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy19);
        java.lang.String str27 = unicodeExtraFieldPolicy19.toString();
        java.lang.String str28 = unicodeExtraFieldPolicy19.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "always" + "'", str21, "always");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "always" + "'", str22, "always");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "always" + "'", str23, "always");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "always" + "'", str24, "always");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "always" + "'", str27, "always");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "always" + "'", str28, "always");
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        java.nio.channels.SeekableByteChannel seekableByteChannel7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel7);
        int int9 = zipArchiveOutputStream8.getCount();
        zipArchiveOutputStream8.setFallbackToUTF8(true);
        zipArchiveOutputStream8.finished = true;
        zipArchiveOutputStream8.setLevel(0);
        zipArchiveOutputStream8.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream8.flush();
        java.io.OutputStream outputStream19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream19);
        zipArchiveOutputStream20.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy22 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream20.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        java.lang.String str24 = unicodeExtraFieldPolicy22.toString();
        java.lang.String str25 = unicodeExtraFieldPolicy22.toString();
        java.lang.String str26 = unicodeExtraFieldPolicy22.toString();
        zipArchiveOutputStream8.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        java.lang.String str28 = unicodeExtraFieldPolicy22.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        java.util.zip.Deflater deflater30 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "always" + "'", str24, "always");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "always" + "'", str26, "always");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "always" + "'", str28, "always");
        org.junit.Assert.assertNotNull(deflater30);
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream5);
        zipArchiveOutputStream6.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        java.lang.String str10 = unicodeExtraFieldPolicy8.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        java.io.InputStream inputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry12, inputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "always" + "'", str10, "always");
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int10 = zipArchiveOutputStream1.getCount();
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.io.OutputStream outputStream13 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream13.write(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray14, 512, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(outputStream13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.flush();
        int int10 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setLevel((int) (byte) 1);
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream14.setLevel((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setComment("hi!");
        zipArchiveOutputStream2.setLevel(0);
        zipArchiveOutputStream2.writeZip64CentralDirectory();
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.String str11 = zipArchiveOutputStream10.getEncoding();
        java.lang.String str12 = zipArchiveOutputStream10.getEncoding();
        zipArchiveOutputStream10.flush();
        boolean boolean14 = zipArchiveOutputStream10.finished;
        int int15 = zipArchiveOutputStream10.getCount();
        int int16 = zipArchiveOutputStream10.getCount();
        zipArchiveOutputStream10.setMethod(0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.String str10 = zipArchiveOutputStream9.getEncoding();
        java.lang.String str11 = zipArchiveOutputStream9.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream9.writeDataDescriptor(zipArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setMethod((int) (byte) -1);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int10 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.destroy();
        boolean boolean12 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode13 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode13);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = null;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        java.lang.String str17 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTF8" + "'", str17, "UTF8");
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setLevel((int) (short) -1);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str14 = unicodeExtraFieldPolicy13.toString();
        java.lang.String str15 = unicodeExtraFieldPolicy13.toString();
        java.lang.String str16 = unicodeExtraFieldPolicy13.toString();
        java.lang.String str17 = unicodeExtraFieldPolicy13.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "always" + "'", str14, "always");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "always" + "'", str15, "always");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "always" + "'", str16, "always");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.lang.String str10 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setEncoding("UTF8");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.deflate();
        boolean boolean11 = zipArchiveOutputStream1.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.flush();
        boolean boolean7 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.flush();
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = zipArchiveOutputStream1.createArchiveEntry(file11, "");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.util.zip.Deflater deflater9 = zipArchiveOutputStream1.def;
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray13, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertNotNull(deflater9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0, (byte) -1, (byte) 1 });
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream4.setFallbackToUTF8(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream4.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        boolean boolean5 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode13 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode13);
        zipArchiveOutputStream1.setEncoding("UTF8");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        zipArchiveOutputStream1.setMethod((int) 'a');
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.finished = true;
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        java.io.OutputStream outputStream12 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream12.write(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray13, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(outputStream12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        java.io.InputStream inputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry12, inputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        zipArchiveOutputStream1.finished = true;
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream7);
        zipArchiveOutputStream8.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream8.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        java.lang.String str12 = unicodeExtraFieldPolicy10.toString();
        java.lang.String str13 = unicodeExtraFieldPolicy10.toString();
        java.lang.String str14 = unicodeExtraFieldPolicy10.toString();
        java.lang.String str15 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "always" + "'", str12, "always");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "always" + "'", str13, "always");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "always" + "'", str14, "always");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "always" + "'", str15, "always");
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream2.setUseZip64(zip64Mode5);
        zipArchiveOutputStream2.setLevel((int) (byte) 1);
        zipArchiveOutputStream2.deflate();
        zipArchiveOutputStream2.setLevel((-1));
        zipArchiveOutputStream2.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeDataDescriptor(zipArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long7 = zipArchiveOutputStream6.getBytesWritten();
        zipArchiveOutputStream6.setComment("UTF8");
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.write(byteArray10, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream7.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream6.finished = false;
        zipArchiveOutputStream6.setComment("UTF8");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("UTF8");
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.finished = false;
        boolean boolean11 = zipArchiveOutputStream1.finished;
        byte[] byteArray12 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray12, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setEncoding("never");
        int int8 = zipArchiveOutputStream1.getCount();
        java.util.zip.Deflater deflater9 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray12, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(deflater9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        boolean boolean10 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setMethod((int) (byte) 100);
        int int8 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setComment("never");
        java.util.zip.Deflater deflater11 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setMethod((int) 'a');
        long long14 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(deflater11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.util.zip.Deflater deflater8 = zipArchiveOutputStream1.def;
        boolean boolean9 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        java.lang.String str12 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode13 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode13);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deflater8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int10 = zipArchiveOutputStream1.getCount();
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        long long12 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream2.setUseZip64(zip64Mode5);
        zipArchiveOutputStream2.setLevel((int) (byte) 1);
        zipArchiveOutputStream2.writeZip64CentralDirectory();
        zipArchiveOutputStream2.deflate();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode11 = null;
        zipArchiveOutputStream2.setUseZip64(zip64Mode11);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.setLevel((int) (short) -1);
        java.nio.channels.SeekableByteChannel seekableByteChannel9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel9);
        int int11 = zipArchiveOutputStream10.getCount();
        zipArchiveOutputStream10.setFallbackToUTF8(true);
        java.lang.String str14 = zipArchiveOutputStream10.getEncoding();
        zipArchiveOutputStream10.deflate();
        long long16 = zipArchiveOutputStream10.getBytesWritten();
        zipArchiveOutputStream10.flush();
        zipArchiveOutputStream10.setMethod((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy20 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str21 = unicodeExtraFieldPolicy20.toString();
        zipArchiveOutputStream10.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy20);
        zipArchiveOutputStream10.setLevel((int) (short) 0);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode25 = null;
        zipArchiveOutputStream10.setUseZip64(zip64Mode25);
        zipArchiveOutputStream10.writeZip64CentralDirectory();
        java.io.OutputStream outputStream28 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream28);
        zipArchiveOutputStream29.finished = true;
        zipArchiveOutputStream29.deflate();
        zipArchiveOutputStream29.setComment("never");
        zipArchiveOutputStream29.deflate();
        zipArchiveOutputStream29.close();
        zipArchiveOutputStream29.setUseLanguageEncodingFlag(true);
        java.io.OutputStream outputStream39 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream40 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream39);
        zipArchiveOutputStream40.finished = true;
        zipArchiveOutputStream40.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy45 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str46 = unicodeExtraFieldPolicy45.toString();
        zipArchiveOutputStream40.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy45);
        zipArchiveOutputStream40.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode50 = null;
        zipArchiveOutputStream40.setUseZip64(zip64Mode50);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy52 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream40.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy52);
        zipArchiveOutputStream29.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy52);
        java.lang.String str55 = unicodeExtraFieldPolicy52.toString();
        java.lang.String str56 = unicodeExtraFieldPolicy52.toString();
        zipArchiveOutputStream10.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy52);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy52);
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF8" + "'", str14, "UTF8");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "always" + "'", str21, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "always" + "'", str46, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "always" + "'", str55, "always");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "always" + "'", str56, "always");
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode13 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode13);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.flush();
        boolean boolean9 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.setMethod((int) (byte) -1);
        java.util.zip.Deflater deflater14 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(deflater14);
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.finished = true;
        long long8 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }
}

