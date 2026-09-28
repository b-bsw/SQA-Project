package org.apache.commons.compress.archivers.zip;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
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
            zipArchiveOutputStream4.setEncoding("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = null;
        java.io.InputStream inputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry10, inputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
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
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setMethod((int) '#');
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray8, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
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
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray18, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.String str10 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry11);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy13 = null;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy13);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream16.putArchiveEntry(archiveEntry17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.destroy();
        java.lang.String str9 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setMethod((int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = null;
        java.io.InputStream inputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry13, inputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
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
        int int14 = zipArchiveOutputStream1.getCount();
        boolean boolean15 = zipArchiveOutputStream1.finished;
        java.io.File file16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = zipArchiveOutputStream1.createArchiveEntry(file16, "always");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
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
        java.lang.String str14 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deflater8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF8" + "'", str14, "UTF8");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode8 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode8);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray13, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        zipArchiveOutputStream1.close();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream4);
        zipArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        zipArchiveOutputStream5.setComment("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        zipArchiveOutputStream5.setEncoding("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy13);
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy13);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeCentralFileHeader(zipArchiveEntry16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy13);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode8 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode8);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode13 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode13);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = null;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        java.nio.channels.SeekableByteChannel seekableByteChannel5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel5);
        long long7 = zipArchiveOutputStream6.getBytesWritten();
        zipArchiveOutputStream6.finished = true;
        zipArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream12);
        zipArchiveOutputStream13.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = zipArchiveOutputStream13.canWriteEntryData(archiveEntry15);
        java.io.OutputStream outputStream17 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream17);
        zipArchiveOutputStream18.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy20 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream18.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy20);
        java.lang.String str22 = unicodeExtraFieldPolicy20.toString();
        zipArchiveOutputStream13.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy20);
        zipArchiveOutputStream11.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy20);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy20);
        byte[] byteArray26 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray26, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "always" + "'", str22, "always");
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
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
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        long long8 = zipArchiveOutputStream1.getBytesWritten();
        java.util.zip.Deflater deflater9 = zipArchiveOutputStream1.def;
        boolean boolean10 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray13, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(deflater9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        java.util.zip.Deflater deflater3 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.finished = false;
        java.nio.channels.SeekableByteChannel seekableByteChannel6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel6);
        int int8 = zipArchiveOutputStream7.getCount();
        zipArchiveOutputStream7.setFallbackToUTF8(true);
        zipArchiveOutputStream7.finished = true;
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream13);
        zipArchiveOutputStream14.finished = true;
        zipArchiveOutputStream14.deflate();
        java.io.OutputStream outputStream18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream18);
        zipArchiveOutputStream19.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy21 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream19.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        java.lang.String str23 = unicodeExtraFieldPolicy21.toString();
        zipArchiveOutputStream14.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        boolean boolean27 = zipArchiveOutputStream1.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(deflater3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "always" + "'", str23, "always");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
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
        zipArchiveOutputStream1.setComment("always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "always" + "'", str18, "always");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "always" + "'", str20, "always");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream9.write((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deflater6);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.finished = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long7 = zipArchiveOutputStream6.getBytesWritten();
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream8);
        zipArchiveOutputStream9.finished = true;
        zipArchiveOutputStream9.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str15 = unicodeExtraFieldPolicy14.toString();
        zipArchiveOutputStream9.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy14);
        zipArchiveOutputStream9.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode19 = null;
        zipArchiveOutputStream9.setUseZip64(zip64Mode19);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy21 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream9.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        zipArchiveOutputStream6.deflate();
        zipArchiveOutputStream6.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "always" + "'", str15, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy21);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode11 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode11);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.destroy();
        java.io.File file12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = zipArchiveOutputStream1.createArchiveEntry(file12, "not encodeable");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
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
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setComment("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
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
        boolean boolean14 = zipArchiveOutputStream1.isSeekable();
        boolean boolean15 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = null;
        java.io.InputStream inputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry16, inputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
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
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setComment("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
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
        java.lang.String str30 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setEncoding("always");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTF8" + "'", str30, "UTF8");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.destroy();
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray13, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 1, (byte) -1, (byte) 100 });
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
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
        java.io.File file14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = zipArchiveOutputStream12.createArchiveEntry(file14, "UTF8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setComment("not encodeable");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean11 = zipArchiveOutputStream1.isSeekable();
        long long12 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.flush();
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.setMethod(100);
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream2.setUseZip64(zip64Mode5);
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray7, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
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
        zipArchiveOutputStream1.setEncoding("always");
        java.lang.Class<?> wildcardClass15 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
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
        java.lang.String str38 = unicodeExtraFieldPolicy31.toString();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "always" + "'", str38, "always");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.destroy();
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
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
        boolean boolean16 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.destroy();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "always" + "'", str14, "always");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        boolean boolean4 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        java.lang.String str7 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
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
        zipArchiveOutputStream29.deflate();
        zipArchiveOutputStream29.setFallbackToUTF8(true);
        zipArchiveOutputStream29.setMethod((int) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry35 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream29.writeLocalFileHeader(zipArchiveEntry35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream6);
        zipArchiveOutputStream7.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveOutputStream7.canWriteEntryData(archiveEntry10);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode12 = null;
        zipArchiveOutputStream7.setUseZip64(zip64Mode12);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode14 = null;
        zipArchiveOutputStream7.setUseZip64(zip64Mode14);
        zipArchiveOutputStream7.flush();
        java.nio.channels.SeekableByteChannel seekableByteChannel17 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel17);
        int int19 = zipArchiveOutputStream18.getCount();
        zipArchiveOutputStream18.setFallbackToUTF8(true);
        java.lang.String str22 = zipArchiveOutputStream18.getEncoding();
        zipArchiveOutputStream18.deflate();
        long long24 = zipArchiveOutputStream18.getBytesWritten();
        zipArchiveOutputStream18.flush();
        zipArchiveOutputStream18.setMethod((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy28 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str29 = unicodeExtraFieldPolicy28.toString();
        zipArchiveOutputStream18.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy28);
        java.lang.String str31 = unicodeExtraFieldPolicy28.toString();
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy28);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy28);
        byte[] byteArray37 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray37, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTF8" + "'", str22, "UTF8");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "always" + "'", str29, "always");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "always" + "'", str31, "always");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) -1, (byte) -1, (byte) 1 });
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean6 = zipArchiveOutputStream1.finished;
        int int7 = zipArchiveOutputStream1.getCount();
        byte[] byteArray9 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray9, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0 });
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setMethod((int) (byte) 100);
        zipArchiveOutputStream1.deflate();
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream9.write(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray10, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        int int7 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setMethod(0);
        zipArchiveOutputStream1.setEncoding("always");
        zipArchiveOutputStream1.setComment("not encodeable");
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray14, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.destroy();
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = zipArchiveOutputStream1.createArchiveEntry(file8, "not encodeable");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        long long6 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setComment("never");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
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
        zipArchiveOutputStream12.flush();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "never" + "'", str15, "never");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
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
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = zipArchiveOutputStream1.createArchiveEntry(file15, "always");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.finished = false;
        java.lang.Class<?> wildcardClass7 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry13);
        boolean boolean15 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = null;
        java.io.InputStream inputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry16, inputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream1.finished;
        long long10 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setComment("always");
        zipArchiveOutputStream1.finished = false;
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        java.util.zip.Deflater deflater8 = zipArchiveOutputStream1.def;
        boolean boolean9 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = zipArchiveOutputStream1.createArchiveEntry(file11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(deflater8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        boolean boolean6 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry7);
        zipArchiveOutputStream1.setEncoding("always");
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        java.lang.String str6 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
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
        long long24 = zipArchiveOutputStream1.getBytesWritten();
        byte[] byteArray25 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray25, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
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
        java.lang.String str30 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setEncoding("always");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry33 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTF8" + "'", str30, "UTF8");
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertNotNull(deflater12);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
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
        java.lang.Class<?> wildcardClass32 = unicodeExtraFieldPolicy24.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deflater6);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "always" + "'", str26, "always");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "always" + "'", str28, "always");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "always" + "'", str30, "always");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        byte[] byteArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray7, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        java.util.zip.Deflater deflater8 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertNotNull(deflater8);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setLevel((int) (short) 1);
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
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.flush();
        boolean boolean11 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        boolean boolean10 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertNotNull(deflater12);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy4 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy4);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy4);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long7 = zipArchiveOutputStream6.getBytesWritten();
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream8);
        zipArchiveOutputStream9.finished = true;
        zipArchiveOutputStream9.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str15 = unicodeExtraFieldPolicy14.toString();
        zipArchiveOutputStream9.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy14);
        zipArchiveOutputStream9.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode19 = null;
        zipArchiveOutputStream9.setUseZip64(zip64Mode19);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy21 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream9.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        zipArchiveOutputStream6.deflate();
        zipArchiveOutputStream6.flush();
        zipArchiveOutputStream6.flush();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "always" + "'", str15, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy21);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        java.lang.String str6 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.destroy();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy7 = null;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        boolean boolean9 = zipArchiveOutputStream2.finished;
        zipArchiveOutputStream2.setEncoding("never");
        java.lang.Class<?> wildcardClass12 = zipArchiveOutputStream2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.junit.Assert.assertNotNull(deflater4);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
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
        int int15 = zipArchiveOutputStream12.getCount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
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
        zipArchiveOutputStream1.flush();
        long long14 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
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
        boolean boolean15 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
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
        zipArchiveOutputStream1.setMethod((int) (short) -1);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
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
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.destroy();
        java.util.zip.Deflater deflater9 = zipArchiveOutputStream1.def;
        boolean boolean10 = zipArchiveOutputStream1.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(deflater9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setMethod(0);
        zipArchiveOutputStream1.setLevel(8);
        zipArchiveOutputStream1.setComment("always");
        java.lang.Class<?> wildcardClass8 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.finished = true;
        boolean boolean5 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.setMethod((int) '4');
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray16, (int) (byte) -1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
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
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        boolean boolean7 = zipArchiveOutputStream2.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream8);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream9.setEncoding("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        java.util.zip.Deflater deflater3 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(deflater3);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.String str11 = zipArchiveOutputStream10.getEncoding();
        zipArchiveOutputStream10.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
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
        java.util.zip.Deflater deflater18 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(deflater18);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        int int7 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setMethod((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = null;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream7.write(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setComment("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setEncoding("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        java.io.OutputStream outputStream11 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream11);
        zipArchiveOutputStream12.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = zipArchiveOutputStream12.canWriteEntryData(archiveEntry14);
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream16);
        zipArchiveOutputStream17.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy19 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream17.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy19);
        java.lang.String str21 = unicodeExtraFieldPolicy19.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy19);
        java.lang.String str23 = unicodeExtraFieldPolicy19.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy19);
        int int25 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "always" + "'", str21, "always");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "always" + "'", str23, "always");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long7 = zipArchiveOutputStream6.getBytesWritten();
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream8);
        zipArchiveOutputStream9.finished = true;
        zipArchiveOutputStream9.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str15 = unicodeExtraFieldPolicy14.toString();
        zipArchiveOutputStream9.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy14);
        zipArchiveOutputStream9.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode19 = null;
        zipArchiveOutputStream9.setUseZip64(zip64Mode19);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy21 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream9.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        byte[] byteArray24 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.write(byteArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "always" + "'", str15, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.finished = false;
        int int11 = zipArchiveOutputStream1.getCount();
        java.io.File file12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = zipArchiveOutputStream1.createArchiveEntry(file12, "not encodeable");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.deflate();
        java.util.zip.Deflater deflater10 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(deflater10);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        java.io.OutputStream outputStream4 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream4.write(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray5, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(outputStream4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        boolean boolean7 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode8 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode8);
        zipArchiveOutputStream1.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
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
        int int13 = zipArchiveOutputStream12.getCount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setComment("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int5 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
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
        zipArchiveOutputStream1.deflate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setLevel(8);
        boolean boolean6 = zipArchiveOutputStream1.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean4 = zipArchiveOutputStream1.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        boolean boolean11 = zipArchiveOutputStream1.isSeekable();
        long long12 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setMethod((int) (short) 0);
        java.lang.Class<?> wildcardClass10 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.flush();
        int int9 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        int int5 = zipArchiveOutputStream1.getCount();
        java.lang.Class<?> wildcardClass6 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.setComment("hi!");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode15 = null;
        zipArchiveOutputStream14.setUseZip64(zip64Mode15);
        java.lang.Class<?> wildcardClass17 = zipArchiveOutputStream14.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.util.zip.Deflater deflater8 = zipArchiveOutputStream7.def;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream7.destroy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deflater8);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.finished = true;
        boolean boolean5 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
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
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.setLevel((-1));
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.flush();
        boolean boolean7 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.flush();
        int int11 = zipArchiveOutputStream1.getCount();
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream12);
        zipArchiveOutputStream13.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream13.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        java.lang.String str17 = unicodeExtraFieldPolicy15.toString();
        java.lang.String str18 = unicodeExtraFieldPolicy15.toString();
        java.lang.String str19 = unicodeExtraFieldPolicy15.toString();
        java.lang.String str20 = unicodeExtraFieldPolicy15.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        java.lang.Class<?> wildcardClass22 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "always" + "'", str18, "always");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "always" + "'", str19, "always");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "always" + "'", str20, "always");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
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
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.Class<?> wildcardClass4 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        boolean boolean14 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        java.io.InputStream inputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry11, inputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry7);
        long long9 = zipArchiveOutputStream2.getBytesWritten();
        java.lang.Class<?> wildcardClass10 = zipArchiveOutputStream2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
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
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray18, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "always" + "'", str12, "always");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setEncoding("always");
        java.lang.String str7 = zipArchiveOutputStream1.getEncoding();
        java.io.OutputStream outputStream8 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream8.write(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray9, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertNotNull(outputStream8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream1.finished;
        long long10 = zipArchiveOutputStream1.getBytesWritten();
        boolean boolean11 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setLevel(1);
        java.lang.String str9 = zipArchiveOutputStream1.getEncoding();
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream10);
        zipArchiveOutputStream11.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = zipArchiveOutputStream11.canWriteEntryData(archiveEntry14);
        zipArchiveOutputStream11.setEncoding("UTF8");
        zipArchiveOutputStream11.setFallbackToUTF8(false);
        zipArchiveOutputStream11.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream11);
        zipArchiveOutputStream22.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy24 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str25 = unicodeExtraFieldPolicy24.toString();
        zipArchiveOutputStream22.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy24);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy24);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "never" + "'", str25, "never");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
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
        java.nio.channels.SeekableByteChannel seekableByteChannel15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel15);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream16);
        boolean boolean18 = zipArchiveOutputStream17.isSeekable();
        java.io.OutputStream outputStream19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream19);
        zipArchiveOutputStream20.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream20);
        zipArchiveOutputStream20.setComment("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream20);
        zipArchiveOutputStream20.setEncoding("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy28 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream20.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy28);
        zipArchiveOutputStream17.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy28);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy28);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode32 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode32);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "always" + "'", str10, "always");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy28);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream12.setMethod((int) 'a');
        int int15 = zipArchiveOutputStream12.getCount();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "always" + "'", str10, "always");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.util.zip.Deflater deflater8 = zipArchiveOutputStream7.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream7.writeLocalFileHeader(zipArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deflater8);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setMethod((int) (byte) 100);
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.flush();
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.deflate();
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream6);
        zipArchiveOutputStream7.destroy();
        zipArchiveOutputStream7.destroy();
        zipArchiveOutputStream7.setEncoding("never");
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream12);
        zipArchiveOutputStream13.finished = true;
        zipArchiveOutputStream13.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str19 = unicodeExtraFieldPolicy18.toString();
        zipArchiveOutputStream13.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        zipArchiveOutputStream13.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode23 = null;
        zipArchiveOutputStream13.setUseZip64(zip64Mode23);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy25 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream13.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy25);
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy25);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy25);
        boolean boolean29 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = null;
        boolean boolean31 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry30);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "always" + "'", str19, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
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
        java.lang.String str11 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setMethod((int) (byte) 100);
        zipArchiveOutputStream1.deflate();
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        int int6 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode7 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode7);
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = zipArchiveOutputStream1.createArchiveEntry(file9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry13);
        boolean boolean15 = zipArchiveOutputStream1.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setLevel((int) (byte) 0);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setMethod(0);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
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
        zipArchiveOutputStream1.setComment("not encodeable");
        int int31 = zipArchiveOutputStream1.getCount();
        boolean boolean32 = zipArchiveOutputStream1.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream1.def;
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        int int8 = zipArchiveOutputStream1.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(deflater6);
        org.junit.Assert.assertNotNull(deflater7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        boolean boolean4 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        java.lang.String str7 = zipArchiveOutputStream1.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
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
        java.io.File file14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = zipArchiveOutputStream1.createArchiveEntry(file14, "UTF8");
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
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
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
        zipArchiveOutputStream12.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = null;
        boolean boolean17 = zipArchiveOutputStream12.canWriteEntryData(archiveEntry16);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream12);
        zipArchiveOutputStream12.setLevel((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
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
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray18, 8, 512);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy13);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream4.setFallbackToUTF8(false);
        zipArchiveOutputStream4.setComment("always");
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream4.write(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        java.util.zip.Deflater deflater3 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.deflate();
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        int int6 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.finished = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(deflater3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setMethod((int) (short) 100);
        zipArchiveOutputStream1.setLevel((int) (short) -1);
        boolean boolean12 = zipArchiveOutputStream1.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        zipArchiveOutputStream1.flush();
        java.io.File file12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = zipArchiveOutputStream1.createArchiveEntry(file12, "UTF8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeDataDescriptor(zipArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
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
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        java.lang.Class<?> wildcardClass19 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
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
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.close();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertNotNull(deflater13);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.deflate();
        boolean boolean10 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
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
        boolean boolean14 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "always" + "'", str10, "always");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
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
        zipArchiveOutputStream1.finished = false;
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
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
        zipArchiveOutputStream12.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = null;
        boolean boolean17 = zipArchiveOutputStream12.canWriteEntryData(archiveEntry16);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream12);
        byte[] byteArray19 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream18.writeOut(byteArray19, 100, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry7);
        zipArchiveOutputStream1.deflate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setMethod((int) (short) 10);
        boolean boolean6 = zipArchiveOutputStream1.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
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
        zipArchiveOutputStream10.setMethod((int) 'a');
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.write(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 10 });
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        boolean boolean4 = zipArchiveOutputStream2.finished;
        boolean boolean5 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.deflate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        long long8 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str9 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setMethod(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode4 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode4);
        int int6 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setComment("not encodeable");
        zipArchiveOutputStream1.destroy();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archive has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy13);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.destroy();
        boolean boolean11 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        java.util.zip.Deflater deflater3 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(deflater3);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        java.lang.String str12 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode15 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode15);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "always" + "'", str11, "always");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "always" + "'", str12, "always");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.String str11 = zipArchiveOutputStream10.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
        zipArchiveOutputStream2.setMethod(512);
        zipArchiveOutputStream2.finished = false;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "never" + "'", str8, "never");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "never" + "'", str9, "never");
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode11 = null;
        zipArchiveOutputStream10.setUseZip64(zip64Mode11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("not encodeable");
        boolean boolean10 = zipArchiveOutputStream1.finished;
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = zipArchiveOutputStream1.createArchiveEntry(file11, "");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
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
        zipArchiveOutputStream1.deflate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
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
        zipArchiveOutputStream1.setMethod(8);
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray14, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setMethod((-1));
        boolean boolean8 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setComment("not encodeable");
        boolean boolean11 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
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
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        int int14 = zipArchiveOutputStream1.getCount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        zipArchiveOutputStream2.setMethod((int) (byte) 0);
        zipArchiveOutputStream2.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream11.write(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        boolean boolean7 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setLevel(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream14.writeLocalFileHeader(zipArchiveEntry15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.flush();
        boolean boolean11 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
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
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode12 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "always" + "'", str9, "always");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.String str6 = zipArchiveOutputStream1.getEncoding();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.io.OutputStream outputStream6 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream6.write(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream2);
        zipArchiveOutputStream3.finished = true;
        zipArchiveOutputStream3.setLevel(1);
        zipArchiveOutputStream3.setMethod(100);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream10);
        zipArchiveOutputStream11.finished = true;
        zipArchiveOutputStream11.deflate();
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream15);
        zipArchiveOutputStream16.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream16.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        java.lang.String str20 = unicodeExtraFieldPolicy18.toString();
        zipArchiveOutputStream11.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        java.lang.String str22 = unicodeExtraFieldPolicy18.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        java.lang.String str24 = unicodeExtraFieldPolicy18.toString();
        java.lang.String str25 = unicodeExtraFieldPolicy18.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        zipArchiveOutputStream1.deflate();
        byte[] byteArray28 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray28, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "always" + "'", str20, "always");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "always" + "'", str22, "always");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "always" + "'", str24, "always");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("");
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode7 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode7);
        zipArchiveOutputStream1.setMethod((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setEncoding("always");
        java.lang.String str7 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setEncoding("UTF8");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.flush();
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = zipArchiveOutputStream1.createArchiveEntry(file8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
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
        java.lang.Class<?> wildcardClass13 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
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
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        boolean boolean7 = zipArchiveOutputStream2.finished;
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        zipArchiveOutputStream2.setFallbackToUTF8(true);
        boolean boolean12 = zipArchiveOutputStream2.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setComment("never");
        byte[] byteArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
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
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setMethod(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode4 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode4);
        java.lang.String str6 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode7 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode7);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archive has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
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
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean12 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = null;
        java.io.InputStream inputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry13, inputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
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
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream9.write(byteArray14, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deflater11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.flush();
        java.lang.Class<?> wildcardClass4 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean13 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "always" + "'", str24, "always");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "always" + "'", str26, "always");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "always" + "'", str28, "always");
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.String str10 = zipArchiveOutputStream1.getEncoding();
        java.lang.String str11 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream2.finished = true;
        zipArchiveOutputStream2.deflate();
        zipArchiveOutputStream2.writeZip64CentralDirectory();
        java.lang.Class<?> wildcardClass9 = zipArchiveOutputStream2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.util.zip.Deflater deflater5 = zipArchiveOutputStream3.def;
        zipArchiveOutputStream3.flush();
        zipArchiveOutputStream3.setEncoding("always");
        org.junit.Assert.assertNotNull(deflater5);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        long long4 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setMethod((-1));
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setLevel(0);
        boolean boolean10 = zipArchiveOutputStream1.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream19.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        zipArchiveOutputStream1.finished = false;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("not encodeable");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: not encodeable");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("not encodeable");
        boolean boolean10 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.flush();
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
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
        java.lang.Class<?> wildcardClass28 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "always" + "'", str13, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy19);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        long long8 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream7.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.flush();
        int int9 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.deflate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        boolean boolean5 = zipArchiveOutputStream1.finished;
        java.lang.String str6 = zipArchiveOutputStream1.getEncoding();
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(deflater7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean6 = zipArchiveOutputStream1.finished;
        int int7 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(512);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
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
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "never" + "'", str13, "never");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setMethod(0);
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setMethod((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
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
        boolean boolean15 = zipArchiveOutputStream1.isSeekable();
        int int16 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setLevel((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.destroy();
        boolean boolean6 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.deflate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        boolean boolean4 = zipArchiveOutputStream2.finished;
        zipArchiveOutputStream2.finished = false;
        boolean boolean7 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.putArchiveEntry(archiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
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
        java.io.OutputStream outputStream17 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream17.write(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy13);
        org.junit.Assert.assertNotNull(outputStream17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
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
        java.lang.String str22 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.io.OutputStream outputStream24 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray25 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream24.write(byteArray25);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "always" + "'", str13, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "never" + "'", str22, "never");
        org.junit.Assert.assertNotNull(outputStream24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
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
        zipArchiveOutputStream29.deflate();
        zipArchiveOutputStream29.setEncoding("never");
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
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        java.io.InputStream inputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry11, inputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream6.canWriteEntryData(archiveEntry7);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode4 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode4);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("not encodeable");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: not encodeable");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        long long8 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str9 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray11, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = null;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        int int7 = zipArchiveOutputStream1.getCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
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
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream2.setUseZip64(zip64Mode5);
        java.lang.String str7 = zipArchiveOutputStream2.getEncoding();
        int int8 = zipArchiveOutputStream2.getCount();
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
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
        boolean boolean16 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "always" + "'", str14, "always");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "always" + "'", str10, "always");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.deflate();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.finished = false;
        int int9 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.finished = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.setEncoding("always");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
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
        java.lang.String str33 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry34 = null;
        boolean boolean35 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "always" + "'", str24, "always");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "always" + "'", str26, "always");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTF8" + "'", str32, "UTF8");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTF8" + "'", str33, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        zipArchiveOutputStream1.flush();
        boolean boolean6 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        int int12 = zipArchiveOutputStream1.getCount();
        java.io.File file13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = zipArchiveOutputStream1.createArchiveEntry(file13, "not encodeable");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        boolean boolean6 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.nio.channels.SeekableByteChannel seekableByteChannel9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel9);
        boolean boolean11 = zipArchiveOutputStream10.isSeekable();
        boolean boolean12 = zipArchiveOutputStream10.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveOutputStream10.canWriteEntryData(archiveEntry13);
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream15);
        zipArchiveOutputStream16.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream16.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        zipArchiveOutputStream10.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        java.lang.String str21 = unicodeExtraFieldPolicy18.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        zipArchiveOutputStream1.close();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "always" + "'", str21, "always");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.deflate();
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream7);
        zipArchiveOutputStream8.destroy();
        zipArchiveOutputStream8.setMethod((int) (byte) 10);
        long long12 = zipArchiveOutputStream8.getBytesWritten();
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream13);
        zipArchiveOutputStream14.finished = true;
        zipArchiveOutputStream14.setLevel(1);
        zipArchiveOutputStream14.setMethod(100);
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
        java.lang.String str33 = unicodeExtraFieldPolicy29.toString();
        zipArchiveOutputStream14.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        java.lang.String str35 = unicodeExtraFieldPolicy29.toString();
        zipArchiveOutputStream8.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry38 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "always" + "'", str31, "always");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "always" + "'", str33, "always");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "always" + "'", str35, "always");
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.finished = false;
        java.io.OutputStream outputStream11 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream11.write(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray12, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(outputStream11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int10 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = null;
        boolean boolean17 = zipArchiveOutputStream10.canWriteEntryData(archiveEntry16);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream10);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean7 = zipArchiveOutputStream6.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.writeOut(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.setMethod((int) ' ');
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.flush();
        long long10 = zipArchiveOutputStream1.getBytesWritten();
        int int11 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        java.io.InputStream inputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry12, inputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream12);
        zipArchiveOutputStream12.setComment("hi!");
        zipArchiveOutputStream12.finished = true;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        boolean boolean11 = zipArchiveOutputStream1.isSeekable();
        long long12 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.destroy();
        boolean boolean14 = zipArchiveOutputStream1.isSeekable();
        boolean boolean15 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.flush();
        boolean boolean11 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        boolean boolean5 = zipArchiveOutputStream1.finished;
        java.lang.String str6 = zipArchiveOutputStream1.getEncoding();
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = zipArchiveOutputStream1.createArchiveEntry(file8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(deflater7);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.io.File file12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = zipArchiveOutputStream1.createArchiveEntry(file12, "not encodeable");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
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
        long long16 = zipArchiveOutputStream1.getBytesWritten();
        long long17 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
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
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream14);
        zipArchiveOutputStream15.finished = true;
        zipArchiveOutputStream15.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy20 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str21 = unicodeExtraFieldPolicy20.toString();
        zipArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy20);
        zipArchiveOutputStream15.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode25 = null;
        zipArchiveOutputStream15.setUseZip64(zip64Mode25);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy27 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy27);
        java.lang.String str29 = unicodeExtraFieldPolicy27.toString();
        zipArchiveOutputStream9.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy27);
        zipArchiveOutputStream9.flush();
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream9.write(byteArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deflater11);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "always" + "'", str21, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "always" + "'", str29, "always");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) -1, (byte) 10, (byte) -1 });
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        boolean boolean11 = zipArchiveOutputStream1.isSeekable();
        long long12 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.finished = true;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.flush();
        int int8 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry12);
        long long14 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setEncoding("UTF8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        java.util.zip.Deflater deflater3 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy4 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str5 = unicodeExtraFieldPolicy4.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream7.writeOut(byteArray8, 2048, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(deflater3);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "not encodeable" + "'", str5, "not encodeable");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        zipArchiveOutputStream2.setMethod((int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setLevel((int) (short) 0);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int5 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.deflate();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater4);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.finished = false;
        int int11 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream2.setMethod((int) (byte) 10);
        boolean boolean9 = zipArchiveOutputStream2.isSeekable();
        boolean boolean10 = zipArchiveOutputStream2.isSeekable();
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray14, 8, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 1, (byte) 100 });
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
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
        byte[] byteArray14 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream9.writeOut(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deflater11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1 });
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long7 = zipArchiveOutputStream6.getBytesWritten();
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream8);
        zipArchiveOutputStream9.finished = true;
        zipArchiveOutputStream9.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str15 = unicodeExtraFieldPolicy14.toString();
        zipArchiveOutputStream9.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy14);
        zipArchiveOutputStream9.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode19 = null;
        zipArchiveOutputStream9.setUseZip64(zip64Mode19);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy21 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream9.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        zipArchiveOutputStream6.deflate();
        zipArchiveOutputStream6.flush();
        byte[] byteArray26 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.writeOut(byteArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "always" + "'", str15, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy21);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
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
        java.util.zip.Deflater deflater12 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deflater8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(deflater12);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setMethod((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.writeCentralFileHeader(zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream2.finished = true;
        zipArchiveOutputStream2.flush();
        zipArchiveOutputStream2.setComment("not encodeable");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry7);
        zipArchiveOutputStream2.finished = false;
        java.lang.String str11 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.setEncoding("UTF8");
        java.io.OutputStream outputStream14 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream14.write(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeOut(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertNotNull(outputStream14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        zipArchiveOutputStream1.flush();
        boolean boolean6 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        int int12 = zipArchiveOutputStream1.getCount();
        java.io.OutputStream outputStream13 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream13.write(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(outputStream13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.setComment("hi!");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setComment("UTF8");
        int int17 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
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
        boolean boolean13 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
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
        zipArchiveOutputStream12.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.writeLocalFileHeader(zipArchiveEntry15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
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
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        java.lang.Class<?> wildcardClass16 = zipArchiveOutputStream2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
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
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setEncoding("never");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = false;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.write((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setComment("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream6.setEncoding("always");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        int int9 = zipArchiveOutputStream1.getCount();
        int int10 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry11);
        zipArchiveOutputStream1.finished = false;
        boolean boolean15 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
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
        long long14 = zipArchiveOutputStream10.getBytesWritten();
        zipArchiveOutputStream10.setFallbackToUTF8(false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.destroy();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long7 = zipArchiveOutputStream6.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.writeLocalFileHeader(zipArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("not encodeable");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.finished = true;
        boolean boolean5 = zipArchiveOutputStream1.isSeekable();
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
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        zipArchiveOutputStream1.setMethod((int) ' ');
        zipArchiveOutputStream1.close();
        java.util.zip.Deflater deflater22 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode23 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode23);
        java.lang.String str25 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertNotNull(deflater22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTF8" + "'", str25, "UTF8");
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.util.zip.Deflater deflater13 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setComment("UTF8");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(deflater13);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setEncoding("UTF8");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = null;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray7, (int) (short) 10, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        java.util.zip.Deflater deflater3 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(deflater3);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("UTF8");
        java.util.zip.Deflater deflater8 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.deflate();
        java.lang.Class<?> wildcardClass10 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int3 = zipArchiveOutputStream2.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        java.nio.channels.SeekableByteChannel seekableByteChannel5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel5);
        int int7 = zipArchiveOutputStream6.getCount();
        zipArchiveOutputStream6.setFallbackToUTF8(true);
        java.lang.String str10 = zipArchiveOutputStream6.getEncoding();
        zipArchiveOutputStream6.setFallbackToUTF8(false);
        zipArchiveOutputStream6.setEncoding("always");
        boolean boolean15 = zipArchiveOutputStream6.finished;
        zipArchiveOutputStream6.setEncoding("always");
        int int18 = zipArchiveOutputStream6.getCount();
        java.nio.channels.SeekableByteChannel seekableByteChannel19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel19);
        int int21 = zipArchiveOutputStream20.getCount();
        zipArchiveOutputStream20.setFallbackToUTF8(true);
        zipArchiveOutputStream20.finished = true;
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
        zipArchiveOutputStream20.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy34);
        java.lang.String str39 = unicodeExtraFieldPolicy34.toString();
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy34);
        java.lang.String str41 = unicodeExtraFieldPolicy34.toString();
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "always" + "'", str36, "always");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "always" + "'", str39, "always");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "always" + "'", str41, "always");
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setLevel((int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray12, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode8 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode8);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        java.nio.channels.SeekableByteChannel seekableByteChannel6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel6);
        long long8 = zipArchiveOutputStream7.getBytesWritten();
        zipArchiveOutputStream7.deflate();
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
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy17);
        java.io.OutputStream outputStream22 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream22);
        zipArchiveOutputStream23.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy25 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream23.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy25);
        java.lang.String str27 = unicodeExtraFieldPolicy25.toString();
        java.lang.String str28 = unicodeExtraFieldPolicy25.toString();
        java.lang.String str29 = unicodeExtraFieldPolicy25.toString();
        java.lang.String str30 = unicodeExtraFieldPolicy25.toString();
        java.lang.String str31 = unicodeExtraFieldPolicy25.toString();
        java.lang.String str32 = unicodeExtraFieldPolicy25.toString();
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy25);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy25);
        java.lang.String str35 = unicodeExtraFieldPolicy25.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "always" + "'", str20, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "always" + "'", str27, "always");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "always" + "'", str28, "always");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "always" + "'", str29, "always");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "always" + "'", str30, "always");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "always" + "'", str31, "always");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "always" + "'", str32, "always");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "always" + "'", str35, "always");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
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
        java.lang.Class<?> wildcardClass11 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "always" + "'", str9, "always");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
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
        java.io.OutputStream outputStream64 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray65 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream64.write(byteArray65);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray65, 8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertNotNull(outputStream64);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        boolean boolean6 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry11);
        long long13 = zipArchiveOutputStream1.getBytesWritten();
        java.io.OutputStream outputStream14 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream14.write(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(outputStream14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        java.lang.String str12 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "always" + "'", str11, "always");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "always" + "'", str12, "always");
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
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
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream9.writeOut(byteArray19, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deflater11);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.finished = true;
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
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
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
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
        org.junit.Assert.assertNotNull(deflater8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setComment("hi!");
        zipArchiveOutputStream2.setLevel(0);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
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
        zipArchiveOutputStream14.writeZip64CentralDirectory();
        zipArchiveOutputStream14.setMethod((int) 'a');
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        boolean boolean6 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy7 = null;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        java.util.zip.Deflater deflater9 = zipArchiveOutputStream2.def;
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeOut(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertNotNull(deflater9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
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
        byte[] byteArray20 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "always" + "'", str15, "always");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 100 });
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
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
        zipArchiveOutputStream1.deflate();
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
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.flush();
        java.nio.channels.SeekableByteChannel seekableByteChannel11 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel11);
        boolean boolean13 = zipArchiveOutputStream12.isSeekable();
        boolean boolean14 = zipArchiveOutputStream12.isSeekable();
        zipArchiveOutputStream12.setComment("");
        java.lang.String str17 = zipArchiveOutputStream12.getEncoding();
        zipArchiveOutputStream12.finished = true;
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream20);
        zipArchiveOutputStream21.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = null;
        boolean boolean24 = zipArchiveOutputStream21.canWriteEntryData(archiveEntry23);
        zipArchiveOutputStream21.finished = true;
        java.io.OutputStream outputStream27 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream27);
        zipArchiveOutputStream28.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy30 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream28.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy30);
        java.lang.String str32 = unicodeExtraFieldPolicy30.toString();
        java.lang.String str33 = unicodeExtraFieldPolicy30.toString();
        java.lang.String str34 = unicodeExtraFieldPolicy30.toString();
        java.lang.String str35 = unicodeExtraFieldPolicy30.toString();
        zipArchiveOutputStream21.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy30);
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy30);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTF8" + "'", str17, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "always" + "'", str32, "always");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "always" + "'", str33, "always");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "always" + "'", str34, "always");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "always" + "'", str35, "always");
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.deflate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
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
        boolean boolean13 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
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
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode12 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode12);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "always" + "'", str9, "always");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
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
        boolean boolean14 = zipArchiveOutputStream1.isSeekable();
        java.util.zip.Deflater deflater15 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setMethod(2048);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(deflater15);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.flush();
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
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
        boolean boolean12 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.finished = false;
        int int9 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = null;
        java.io.InputStream inputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry13, inputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode8 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode8);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        java.lang.String str12 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        zipArchiveOutputStream1.destroy();
        java.io.File file15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = zipArchiveOutputStream1.createArchiveEntry(file15, "always");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "always" + "'", str11, "always");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "always" + "'", str12, "always");
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
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
        java.io.File file31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry33 = zipArchiveOutputStream1.createArchiveEntry(file31, "not encodeable");
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
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.finished = true;
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray12, 512, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 10, (byte) 1 });
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry7);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        java.io.InputStream inputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry9, inputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setMethod((int) (byte) 100);
        int int8 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setComment("never");
        java.util.zip.Deflater deflater11 = zipArchiveOutputStream1.def;
        java.lang.Class<?> wildcardClass12 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(deflater11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode8 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode8);
        java.io.OutputStream outputStream10 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream10.write(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray11, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("always");
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        long long15 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setMethod((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
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
        java.lang.String str15 = zipArchiveOutputStream1.getEncoding();
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream16);
        zipArchiveOutputStream17.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = zipArchiveOutputStream17.canWriteEntryData(archiveEntry20);
        zipArchiveOutputStream17.setEncoding("UTF8");
        zipArchiveOutputStream17.setFallbackToUTF8(false);
        zipArchiveOutputStream17.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream17);
        zipArchiveOutputStream28.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy30 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str31 = unicodeExtraFieldPolicy30.toString();
        zipArchiveOutputStream28.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy30);
        java.lang.String str33 = unicodeExtraFieldPolicy30.toString();
        java.lang.String str34 = unicodeExtraFieldPolicy30.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy30);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTF8" + "'", str13, "UTF8");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF8" + "'", str15, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "never" + "'", str31, "never");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "never" + "'", str33, "never");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "never" + "'", str34, "never");
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode7 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode7);
        zipArchiveOutputStream1.setEncoding("UTF8");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("");
        boolean boolean7 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.finished = true;
        boolean boolean5 = zipArchiveOutputStream1.isSeekable();
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
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        zipArchiveOutputStream1.setMethod((int) ' ');
        zipArchiveOutputStream1.close();
        java.util.zip.Deflater deflater22 = zipArchiveOutputStream1.def;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertNotNull(deflater22);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        zipArchiveOutputStream1.destroy();
        byte[] byteArray7 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray7, 10, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10 });
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.setMethod((int) (short) 10);
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.flush();
        boolean boolean14 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode15 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
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
        byte[] byteArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray16);
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
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.writeCentralFileHeader(zipArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
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
        java.nio.channels.SeekableByteChannel seekableByteChannel20 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel20);
        long long22 = zipArchiveOutputStream21.getBytesWritten();
        zipArchiveOutputStream21.deflate();
        java.io.OutputStream outputStream24 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream24);
        int int26 = zipArchiveOutputStream25.getCount();
        boolean boolean27 = zipArchiveOutputStream25.finished;
        java.nio.channels.SeekableByteChannel seekableByteChannel28 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel28);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream29);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy31 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream29.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy31);
        zipArchiveOutputStream25.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy31);
        java.lang.String str34 = unicodeExtraFieldPolicy31.toString();
        zipArchiveOutputStream21.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy31);
        java.lang.String str36 = unicodeExtraFieldPolicy31.toString();
        java.lang.String str37 = unicodeExtraFieldPolicy31.toString();
        java.lang.String str38 = unicodeExtraFieldPolicy31.toString();
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy31);
        java.io.OutputStream outputStream40 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray41 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream40.write(byteArray41);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.writeOut(byteArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "always" + "'", str34, "always");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "always" + "'", str36, "always");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "always" + "'", str37, "always");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "always" + "'", str38, "always");
        org.junit.Assert.assertNotNull(outputStream40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
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
        java.lang.String str22 = unicodeExtraFieldPolicy16.toString();
        java.lang.String str23 = unicodeExtraFieldPolicy16.toString();
        java.lang.String str24 = unicodeExtraFieldPolicy16.toString();
        java.lang.Class<?> wildcardClass25 = unicodeExtraFieldPolicy16.getClass();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "always" + "'", str18, "always");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "always" + "'", str20, "always");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "always" + "'", str22, "always");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "always" + "'", str23, "always");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "always" + "'", str24, "always");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
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
        java.lang.String str20 = zipArchiveOutputStream6.getEncoding();
        zipArchiveOutputStream6.writeZip64CentralDirectory();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTF8" + "'", str20, "UTF8");
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
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
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeOut(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str9 = unicodeExtraFieldPolicy8.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
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
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "never" + "'", str9, "never");
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        boolean boolean7 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        zipArchiveOutputStream1.finished = true;
        boolean boolean12 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setLevel((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry13);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setMethod(100);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        java.io.OutputStream outputStream8 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream8.write(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(outputStream8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setLevel(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream12.setLevel((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.destroy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
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
        zipArchiveOutputStream1.flush();
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
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream9.writeDataDescriptor(zipArchiveEntry16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deflater11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF8" + "'", str14, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream6.setMethod((int) '4');
        zipArchiveOutputStream6.deflate();
        zipArchiveOutputStream6.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.writeCentralFileHeader(zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
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
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
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
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.String str10 = zipArchiveOutputStream9.getEncoding();
        java.util.zip.Deflater deflater11 = zipArchiveOutputStream9.def;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode12 = null;
        zipArchiveOutputStream9.setUseZip64(zip64Mode12);
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
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream9);
        zipArchiveOutputStream14.writeZip64CentralDirectory();
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream14.write(byteArray16, 0, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setLevel(0);
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
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
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
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
        boolean boolean14 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setMethod((int) (short) 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry17);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
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
        java.io.OutputStream outputStream14 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream14.write(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(outputStream14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setMethod(100);
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray13, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel(512);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 512");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean4 = zipArchiveOutputStream1.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
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
        zipArchiveOutputStream1.setLevel((int) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "always" + "'", str12, "always");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "always" + "'", str13, "always");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "always" + "'", str14, "always");
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.deflate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
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
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream8.setComment("");
        int int11 = zipArchiveOutputStream8.getCount();
        zipArchiveOutputStream8.deflate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        java.lang.String str12 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode15 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode15);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "always" + "'", str11, "always");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "always" + "'", str12, "always");
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.flush();
        boolean boolean9 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry10);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry12);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        int int7 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setMethod(0);
        zipArchiveOutputStream1.setEncoding("always");
        byte[] byteArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        java.lang.String str7 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.flush();
        zipArchiveOutputStream2.finished = false;
        zipArchiveOutputStream2.finished = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.deflate();
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream6);
        zipArchiveOutputStream7.destroy();
        zipArchiveOutputStream7.destroy();
        zipArchiveOutputStream7.setEncoding("never");
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream12);
        zipArchiveOutputStream13.finished = true;
        zipArchiveOutputStream13.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str19 = unicodeExtraFieldPolicy18.toString();
        zipArchiveOutputStream13.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        zipArchiveOutputStream13.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode23 = null;
        zipArchiveOutputStream13.setUseZip64(zip64Mode23);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy25 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream13.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy25);
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy25);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy25);
        java.lang.String str29 = unicodeExtraFieldPolicy25.toString();
        java.lang.String str30 = unicodeExtraFieldPolicy25.toString();
        java.lang.String str31 = unicodeExtraFieldPolicy25.toString();
        java.lang.String str32 = unicodeExtraFieldPolicy25.toString();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "always" + "'", str19, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "always" + "'", str29, "always");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "always" + "'", str30, "always");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "always" + "'", str31, "always");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "always" + "'", str32, "always");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("never");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.flush();
        java.lang.String str9 = zipArchiveOutputStream1.getEncoding();
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray10, (int) '#', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = null;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater7);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
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
        int int13 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.Class<?> wildcardClass11 = zipArchiveOutputStream10.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
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
        long long16 = zipArchiveOutputStream1.getBytesWritten();
        long long17 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        boolean boolean7 = zipArchiveOutputStream2.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        boolean boolean9 = zipArchiveOutputStream2.finished;
        zipArchiveOutputStream2.setComment("never");
        zipArchiveOutputStream2.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = null;
        java.io.InputStream inputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.addRawArchiveEntry(zipArchiveEntry14, inputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.flush();
        java.nio.channels.SeekableByteChannel seekableByteChannel11 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel11);
        long long13 = zipArchiveOutputStream12.getBytesWritten();
        int int14 = zipArchiveOutputStream12.getCount();
        zipArchiveOutputStream12.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream12.setComment("UTF8");
        zipArchiveOutputStream12.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy21 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str22 = unicodeExtraFieldPolicy21.toString();
        java.lang.String str23 = unicodeExtraFieldPolicy21.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        int int26 = zipArchiveOutputStream1.getCount();
        byte[] byteArray27 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "always" + "'", str22, "always");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "always" + "'", str23, "always");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
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
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream16.write(byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream15.write(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(outputStream16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setLevel((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray12, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
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
        zipArchiveOutputStream1.setComment("not encodeable");
        java.util.zip.Deflater deflater18 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "always" + "'", str12, "always");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "always" + "'", str13, "always");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "always" + "'", str14, "always");
        org.junit.Assert.assertNotNull(deflater18);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry15);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
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
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long25 = zipArchiveOutputStream24.getBytesWritten();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "always" + "'", str18, "always");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "always" + "'", str19, "always");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.flush();
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry7);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream2.setComment("not encodeable");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry12);
        zipArchiveOutputStream1.finished = true;
        java.lang.Class<?> wildcardClass16 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        boolean boolean6 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean6 = zipArchiveOutputStream1.finished;
        int int7 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.String str9 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("UTF8");
        java.util.zip.Deflater deflater8 = zipArchiveOutputStream1.def;
        int int9 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream10.setUseLanguageEncodingFlag(true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
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
        boolean boolean13 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.String str10 = zipArchiveOutputStream9.getEncoding();
        java.util.zip.Deflater deflater11 = zipArchiveOutputStream9.def;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode12 = null;
        zipArchiveOutputStream9.setUseZip64(zip64Mode12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
        org.junit.Assert.assertNotNull(deflater11);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream8);
        zipArchiveOutputStream9.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = zipArchiveOutputStream9.canWriteEntryData(archiveEntry11);
        zipArchiveOutputStream9.finished = true;
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream15);
        zipArchiveOutputStream16.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream16.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        java.lang.String str20 = unicodeExtraFieldPolicy18.toString();
        java.lang.String str21 = unicodeExtraFieldPolicy18.toString();
        java.lang.String str22 = unicodeExtraFieldPolicy18.toString();
        java.lang.String str23 = unicodeExtraFieldPolicy18.toString();
        zipArchiveOutputStream9.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        java.lang.String str25 = unicodeExtraFieldPolicy18.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        java.lang.Class<?> wildcardClass27 = unicodeExtraFieldPolicy18.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "always" + "'", str20, "always");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "always" + "'", str21, "always");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "always" + "'", str22, "always");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "always" + "'", str23, "always");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
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
        zipArchiveOutputStream1.flush();
        boolean boolean14 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setEncoding("UTF8");
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archive has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.flush();
        boolean boolean6 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream7.setComment("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream13.destroy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.flush();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.setComment("hi!");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setComment("UTF8");
        java.nio.channels.SeekableByteChannel seekableByteChannel17 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel17);
        boolean boolean19 = zipArchiveOutputStream18.isSeekable();
        java.util.zip.Deflater deflater20 = zipArchiveOutputStream18.def;
        zipArchiveOutputStream18.finished = false;
        java.nio.channels.SeekableByteChannel seekableByteChannel23 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel23);
        int int25 = zipArchiveOutputStream24.getCount();
        zipArchiveOutputStream24.setFallbackToUTF8(true);
        zipArchiveOutputStream24.finished = true;
        java.io.OutputStream outputStream30 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream31 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream30);
        zipArchiveOutputStream31.finished = true;
        zipArchiveOutputStream31.deflate();
        java.io.OutputStream outputStream35 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream36 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream35);
        zipArchiveOutputStream36.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy38 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream36.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy38);
        java.lang.String str40 = unicodeExtraFieldPolicy38.toString();
        zipArchiveOutputStream31.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy38);
        zipArchiveOutputStream24.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy38);
        zipArchiveOutputStream18.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy38);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy38);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(deflater20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "always" + "'", str40, "always");
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
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
        java.lang.String str11 = zipArchiveOutputStream1.getEncoding();
        java.lang.Class<?> wildcardClass12 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode11 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode11);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = null;
        java.io.InputStream inputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry10, inputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setComment("hi!");
        java.util.zip.Deflater deflater5 = zipArchiveOutputStream2.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.putArchiveEntry(archiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deflater5);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.String str11 = zipArchiveOutputStream10.getEncoding();
        int int12 = zipArchiveOutputStream10.getCount();
        zipArchiveOutputStream10.setComment("not encodeable");
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.writeOut(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.destroy();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.flush();
        java.lang.String str10 = zipArchiveOutputStream1.getEncoding();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray11, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(deflater11);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.writeCentralFileHeader(zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setComment("never");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        boolean boolean11 = zipArchiveOutputStream1.isSeekable();
        long long12 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
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
        zipArchiveOutputStream9.setComment("hi!");
        java.util.zip.Deflater deflater15 = zipArchiveOutputStream9.def;
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream9.write(byteArray16, 0, 512);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deflater15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
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
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setLevel((int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray12, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
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
        java.io.File file18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = zipArchiveOutputStream1.createArchiveEntry(file18, "UTF8");
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
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        long long4 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setComment("not encodeable");
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel(512);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 512");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.flush();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("not encodeable");
        boolean boolean10 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        boolean boolean7 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        boolean boolean6 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry7);
        boolean boolean9 = zipArchiveOutputStream1.isSeekable();
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveOutputStream1.createArchiveEntry(file10, "not encodeable");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode11 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode11);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode13 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode13);
        java.util.zip.Deflater deflater15 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(deflater15);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream1.finished;
        long long10 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setMethod(1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = zipArchiveOutputStream6.canWriteEntryData(archiveEntry20);
        zipArchiveOutputStream6.destroy();
        java.lang.Class<?> wildcardClass23 = zipArchiveOutputStream6.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = zipArchiveOutputStream7.createArchiveEntry(file8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archive has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setComment("hi!");
        java.util.zip.Deflater deflater5 = zipArchiveOutputStream2.def;
        zipArchiveOutputStream2.setComment("always");
        zipArchiveOutputStream2.flush();
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeOut(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deflater5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setComment("always");
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
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.util.zip.Deflater deflater5 = zipArchiveOutputStream3.def;
        zipArchiveOutputStream3.setComment("not encodeable");
        org.junit.Assert.assertNotNull(deflater5);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
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
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.destroy();
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream9);
        zipArchiveOutputStream10.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream10);
        zipArchiveOutputStream10.setComment("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream10);
        zipArchiveOutputStream10.setEncoding("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream10.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy18);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        long long10 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        long long8 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.setMethod(100);
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
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
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
        java.util.zip.Deflater deflater13 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertNotNull(deflater13);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setMethod(0);
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.flush();
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray12, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 10 });
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        boolean boolean10 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.deflate();
        java.io.File file12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = zipArchiveOutputStream1.createArchiveEntry(file12, "not encodeable");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
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
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setMethod((int) (byte) 100);
        zipArchiveOutputStream1.setComment("not encodeable");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel(512);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 512");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean4 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long7 = zipArchiveOutputStream6.getBytesWritten();
        zipArchiveOutputStream6.setComment("UTF8");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.write(512);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        int int9 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((-1));
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream4.writeZip64CentralDirectory();
        zipArchiveOutputStream4.flush();
        zipArchiveOutputStream4.setMethod(2048);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.setComment("hi!");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode15 = null;
        zipArchiveOutputStream14.setUseZip64(zip64Mode15);
        zipArchiveOutputStream14.setMethod(512);
        java.nio.channels.SeekableByteChannel seekableByteChannel19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel19);
        boolean boolean21 = zipArchiveOutputStream20.isSeekable();
        zipArchiveOutputStream20.flush();
        java.io.OutputStream outputStream23 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream23);
        zipArchiveOutputStream24.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy26 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream24.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy26);
        zipArchiveOutputStream20.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy26);
        zipArchiveOutputStream14.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy26);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream14.setEncoding("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy26);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        java.util.zip.Deflater deflater3 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(deflater3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean4 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("UTF8");
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        java.util.zip.Deflater deflater11 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(deflater11);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = null;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
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
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "never" + "'", str8, "never");
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
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
        java.lang.String str16 = zipArchiveOutputStream1.getEncoding();
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray17, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "always" + "'", str12, "always");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "always" + "'", str13, "always");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "always" + "'", str14, "always");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTF8" + "'", str16, "UTF8");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.setComment("hi!");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.finished = false;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream6.setMethod((int) '4');
        boolean boolean9 = zipArchiveOutputStream6.isSeekable();
        zipArchiveOutputStream6.setComment("UTF8");
        java.nio.channels.SeekableByteChannel seekableByteChannel12 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel12);
        boolean boolean14 = zipArchiveOutputStream13.isSeekable();
        java.util.zip.Deflater deflater15 = zipArchiveOutputStream13.def;
        zipArchiveOutputStream13.finished = false;
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
        zipArchiveOutputStream13.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy33);
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy33);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.destroy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(deflater15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "always" + "'", str35, "always");
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        boolean boolean7 = zipArchiveOutputStream2.finished;
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        boolean boolean10 = zipArchiveOutputStream2.finished;
        java.lang.Class<?> wildcardClass11 = zipArchiveOutputStream2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.lang.String str9 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setLevel((int) (byte) 0);
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setComment("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.setComment("UTF8");
        java.lang.String str11 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "never" + "'", str11, "never");
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setMethod((int) (byte) 100);
        int int8 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setMethod((-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
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
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry17);
        byte[] byteArray19 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setLevel(1);
        java.util.zip.Deflater deflater10 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream11.writeZip64CentralDirectory();
        java.lang.Class<?> wildcardClass13 = zipArchiveOutputStream11.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(deflater10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
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
        java.io.OutputStream outputStream30 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray31 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream30.write(byteArray31);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "always" + "'", str24, "always");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "always" + "'", str26, "always");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "always" + "'", str28, "always");
        org.junit.Assert.assertNotNull(outputStream30);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setLevel(1);
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(deflater7);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setLevel((int) (byte) -1);
        zipArchiveOutputStream1.setEncoding("always");
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setMethod((int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int9 = zipArchiveOutputStream8.getCount();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream8.setEncoding("not encodeable");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: not encodeable");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
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
        zipArchiveOutputStream2.setMethod(512);
        zipArchiveOutputStream2.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "never" + "'", str8, "never");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "never" + "'", str9, "never");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        boolean boolean7 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode8 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode8);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry10);
        zipArchiveOutputStream1.setLevel(1);
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray14, (int) ' ', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.flush();
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 0, (byte) 1 });
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("UTF8");
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.finished = false;
        boolean boolean11 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
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
        java.io.OutputStream outputStream25 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray26 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream25.write(byteArray26);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream24.write(byteArray26);
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
        org.junit.Assert.assertNotNull(outputStream25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }
}

