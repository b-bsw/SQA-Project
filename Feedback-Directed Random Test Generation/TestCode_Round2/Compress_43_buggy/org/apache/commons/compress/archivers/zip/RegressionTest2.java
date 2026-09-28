package org.apache.commons.compress.archivers.zip;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setLevel((int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
        zipArchiveOutputStream1.setEncoding("UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray14, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        boolean boolean7 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setComment("never");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean4 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("not encodeable");
        java.io.File file14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = zipArchiveOutputStream1.createArchiveEntry(file14, "");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean15 = zipArchiveOutputStream1.finished;
        java.io.File file16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = zipArchiveOutputStream1.createArchiveEntry(file16, "not encodeable");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy7 = null;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        boolean boolean9 = zipArchiveOutputStream2.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        int int7 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setMethod(0);
        zipArchiveOutputStream1.setComment("always");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("never");
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream9.write((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deflater11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean9 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream15.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.destroy();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.setComment("UTF8");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        boolean boolean4 = zipArchiveOutputStream2.finished;
        boolean boolean5 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeCentralFileHeader(zipArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        java.lang.String str6 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.finished = true;
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.flush();
        boolean boolean9 = zipArchiveOutputStream1.isSeekable();
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveOutputStream1.createArchiveEntry(file10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        long long8 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = false;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry7);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeDataDescriptor(zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.destroy();
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setMethod((int) (byte) 1);
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray9, (int) (byte) 0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long7 = zipArchiveOutputStream6.getBytesWritten();
        zipArchiveOutputStream6.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.writeLocalFileHeader(zipArchiveEntry9);
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
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
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
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setComment("");
        zipArchiveOutputStream2.setComment("hi!");
        java.lang.String str7 = zipArchiveOutputStream2.getEncoding();
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        long long4 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        boolean boolean6 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("never");
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        boolean boolean12 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream6.flush();
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.writeOut(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        zipArchiveOutputStream1.setMethod((int) 'a');
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = zipArchiveOutputStream1.createArchiveEntry(file9, "always");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
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
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry3);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.destroy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "always" + "'", str15, "always");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("never");
        boolean boolean11 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.deflate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        int int7 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(512);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "always" + "'", str12, "always");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.flush();
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = zipArchiveOutputStream1.createArchiveEntry(file7, "always");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel(512);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 512");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.setMethod((int) (short) 10);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        long long4 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setMethod((-1));
        boolean boolean7 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = zipArchiveOutputStream1.createArchiveEntry(file6, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy13);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.deflate();
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveOutputStream1.createArchiveEntry(file10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        long long6 = zipArchiveOutputStream1.getBytesWritten();
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setMethod((int) '#');
        boolean boolean9 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("not encodeable");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: not encodeable");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setMethod(10);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
            zipArchiveOutputStream2.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.destroy();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setComment("not encodeable");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode9 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode9);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray11, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setMethod(0);
        zipArchiveOutputStream1.setLevel(8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = null;
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry6, inputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.setEncoding("not encodeable");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: not encodeable");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        boolean boolean7 = zipArchiveOutputStream2.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = zipArchiveOutputStream3.createArchiveEntry(file5, "never");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        zipArchiveOutputStream1.flush();
        boolean boolean6 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.setMethod((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream2.setMethod((int) (byte) 10);
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeCentralFileHeader(zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(8);
        java.io.OutputStream outputStream6 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream6.write(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream2.setUseZip64(zip64Mode5);
        zipArchiveOutputStream2.setLevel((int) (byte) 1);
        zipArchiveOutputStream2.writeZip64CentralDirectory();
        zipArchiveOutputStream2.deflate();
        zipArchiveOutputStream2.flush();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeOut(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.finished = false;
        int int9 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        boolean boolean22 = zipArchiveOutputStream6.finished;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setComment("");
        zipArchiveOutputStream2.setComment("hi!");
        boolean boolean7 = zipArchiveOutputStream2.finished;
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = zipArchiveOutputStream2.createArchiveEntry(file8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setComment("UTF8");
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray8, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.flush();
        int int12 = zipArchiveOutputStream1.getCount();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        int int7 = zipArchiveOutputStream1.getCount();
        java.lang.Class<?> wildcardClass8 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        boolean boolean8 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = zipArchiveOutputStream1.createArchiveEntry(file5, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream15.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream4.setFallbackToUTF8(false);
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream4.write(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
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
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry7);
        zipArchiveOutputStream2.flush();
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = null;
        java.io.InputStream inputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.addRawArchiveEntry(zipArchiveEntry18, inputStream19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
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
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.writeCentralFileHeader(zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        boolean boolean6 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        boolean boolean9 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setEncoding("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = null;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.finished = true;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.close();
        boolean boolean6 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.destroy();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        boolean boolean4 = zipArchiveOutputStream2.finished;
        java.lang.String str5 = zipArchiveOutputStream2.getEncoding();
        java.io.OutputStream outputStream6 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream6.write(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertNotNull(outputStream6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archive has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        java.io.InputStream inputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry9, inputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.deflate();
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = zipArchiveOutputStream1.createArchiveEntry(file9, "always");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry7);
        zipArchiveOutputStream2.finished = false;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        java.lang.Class<?> wildcardClass13 = zipArchiveOutputStream2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.destroy();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setMethod((int) (byte) 100);
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray17, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        int int6 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.setLevel(0);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        java.lang.Class<?> wildcardClass26 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "always" + "'", str13, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy19);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.finished = true;
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
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
        zipArchiveOutputStream1.destroy();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 1, (byte) 0, (byte) 0 });
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.flush();
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deflater4);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        zipArchiveOutputStream1.destroy();
        java.io.File file16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = zipArchiveOutputStream1.createArchiveEntry(file16, "not encodeable");
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
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray21, (int) (byte) 0, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        java.util.zip.Deflater deflater3 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy4 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str5 = unicodeExtraFieldPolicy4.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy4);
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(deflater3);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "not encodeable" + "'", str5, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.destroy();
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertNotNull(deflater7);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.destroy();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray6, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setMethod(10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = null;
        java.io.InputStream inputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry15, inputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "always" + "'", str19, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy25);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.nio.channels.SeekableByteChannel seekableByteChannel8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel8);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream9);
        boolean boolean11 = zipArchiveOutputStream10.isSeekable();
        boolean boolean12 = zipArchiveOutputStream10.finished;
        java.lang.String str13 = zipArchiveOutputStream10.getEncoding();
        zipArchiveOutputStream10.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str16 = unicodeExtraFieldPolicy15.toString();
        java.lang.String str17 = unicodeExtraFieldPolicy15.toString();
        zipArchiveOutputStream10.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream20);
        zipArchiveOutputStream21.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy23 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream21.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy23);
        java.lang.String str25 = unicodeExtraFieldPolicy23.toString();
        java.lang.String str26 = unicodeExtraFieldPolicy23.toString();
        java.lang.String str27 = unicodeExtraFieldPolicy23.toString();
        java.lang.String str28 = unicodeExtraFieldPolicy23.toString();
        java.lang.String str29 = unicodeExtraFieldPolicy23.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy23);
        zipArchiveOutputStream1.deflate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTF8" + "'", str13, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "never" + "'", str16, "never");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "never" + "'", str17, "never");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "always" + "'", str26, "always");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "always" + "'", str27, "always");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "always" + "'", str28, "always");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "always" + "'", str29, "always");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "always" + "'", str18, "always");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "always" + "'", str19, "always");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTF8" + "'", str13, "UTF8");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        zipArchiveOutputStream1.setLevel((int) (byte) -1);
        java.lang.String str24 = zipArchiveOutputStream1.getEncoding();
        byte[] byteArray25 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray25, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "always" + "'", str18, "always");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "always" + "'", str20, "always");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTF8" + "'", str24, "UTF8");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        boolean boolean6 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream7.write(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode4 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode4);
        long long6 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("UTF8");
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        zipArchiveOutputStream2.setMethod((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean15 = zipArchiveOutputStream1.finished;
        byte[] byteArray16 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertNotNull(deflater13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long10 = zipArchiveOutputStream9.getBytesWritten();
        java.util.zip.Deflater deflater11 = zipArchiveOutputStream9.def;
        zipArchiveOutputStream9.setUseLanguageEncodingFlag(true);
        java.io.File file14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = zipArchiveOutputStream9.createArchiveEntry(file14, "not encodeable");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deflater11);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream4.writeZip64CentralDirectory();
        zipArchiveOutputStream4.setFallbackToUTF8(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        byte[] byteArray24 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.finished = false;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry7);
        long long9 = zipArchiveOutputStream2.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        int int7 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setMethod(0);
        zipArchiveOutputStream1.setComment("always");
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
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
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.finished = true;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        java.lang.Class<?> wildcardClass14 = unicodeExtraFieldPolicy11.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "always" + "'", str12, "always");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.deflate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode4 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode4);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archive has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream4.setFallbackToUTF8(false);
        zipArchiveOutputStream4.deflate();
        zipArchiveOutputStream4.setFallbackToUTF8(false);
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveOutputStream4.createArchiveEntry(file10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "always" + "'", str12, "always");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        boolean boolean5 = zipArchiveOutputStream1.isSeekable();
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.writeCentralFileHeader(zipArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream4.setFallbackToUTF8(false);
        zipArchiveOutputStream4.deflate();
        zipArchiveOutputStream4.setFallbackToUTF8(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream4.setEncoding("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("never");
        java.lang.String str6 = zipArchiveOutputStream1.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream4.canWriteEntryData(archiveEntry5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        boolean boolean4 = zipArchiveOutputStream2.finished;
        boolean boolean5 = zipArchiveOutputStream2.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream2.setUseZip64(zip64Mode5);
        java.lang.String str7 = zipArchiveOutputStream2.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.destroy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        byte[] byteArray31 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "always" + "'", str27, "always");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1 });
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.close();
        java.lang.Class<?> wildcardClass7 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream14.write(512);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
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
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.setComment("UTF8");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archive has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        byte[] byteArray20 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.writeOut(byteArray20, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode8 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode8);
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("UTF8");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.setEncoding("not encodeable");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: not encodeable");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        zipArchiveOutputStream10.finished = false;
        zipArchiveOutputStream10.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.writeLocalFileHeader(zipArchiveEntry15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setComment("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.close();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry18);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.destroy();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long10 = zipArchiveOutputStream9.getBytesWritten();
        java.util.zip.Deflater deflater11 = zipArchiveOutputStream9.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream9);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream9.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deflater11);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.flush();
        boolean boolean7 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream2.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.putArchiveEntry(archiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        zipArchiveOutputStream1.setComment("UTF8");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = null;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        long long8 = zipArchiveOutputStream1.getBytesWritten();
        java.util.zip.Deflater deflater9 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = null;
        java.io.InputStream inputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry10, inputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(deflater9);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = zipArchiveOutputStream2.createArchiveEntry(file7, "always");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean7 = zipArchiveOutputStream6.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream8.putArchiveEntry(archiveEntry9);
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
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.flush();
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setMethod((int) '#');
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deflater4);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.setEncoding("never");
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray11, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setMethod((int) (byte) 100);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode4 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode4);
        java.io.OutputStream outputStream6 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream6.write(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        java.lang.String str22 = zipArchiveOutputStream1.getEncoding();
        java.lang.Class<?> wildcardClass23 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTF8" + "'", str22, "UTF8");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "always" + "'", str20, "always");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "always" + "'", str21, "always");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 0, (byte) 100 });
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode9 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode9);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray11, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        zipArchiveOutputStream1.setMethod(0);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.deflate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("not encodeable");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: not encodeable");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater4);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.setMethod((int) (short) 10);
        zipArchiveOutputStream1.finished = false;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        long long6 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream11.writeOut(byteArray12, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        boolean boolean4 = zipArchiveOutputStream2.finished;
        java.lang.String str5 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeDataDescriptor(zipArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.write((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy17);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        boolean boolean7 = zipArchiveOutputStream1.finished;
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream9.write(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray3, 2048, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        boolean boolean4 = zipArchiveOutputStream2.finished;
        java.lang.String str5 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.writeZip64CentralDirectory();
        byte[] byteArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeOut(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        java.io.OutputStream outputStream15 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream15.write(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(outputStream15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode14 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode14);
        zipArchiveOutputStream1.deflate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        zipArchiveOutputStream1.deflate();
        long long21 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.writeOut(byteArray14, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.setMethod((int) (short) 10);
        zipArchiveOutputStream1.finished = false;
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray13, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.Class<?> wildcardClass15 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertNotNull(deflater13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.setLevel(0);
        java.lang.Class<?> wildcardClass14 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        java.io.OutputStream outputStream11 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream11.write(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray12, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(outputStream11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long10 = zipArchiveOutputStream9.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream9.writeCentralFileHeader(zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
        java.lang.String str11 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setMethod(100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean15 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream16.setEncoding("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertNotNull(deflater13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.flush();
        boolean boolean12 = zipArchiveOutputStream1.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "always" + "'", str14, "always");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(outputStream17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        int int4 = zipArchiveOutputStream1.getCount();
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray5, (int) (short) 1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        int int9 = zipArchiveOutputStream1.getCount();
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream10);
        zipArchiveOutputStream11.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveOutputStream11.canWriteEntryData(archiveEntry13);
        zipArchiveOutputStream11.finished = true;
        java.io.OutputStream outputStream17 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream17);
        zipArchiveOutputStream18.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy20 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream18.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy20);
        java.lang.String str22 = unicodeExtraFieldPolicy20.toString();
        java.lang.String str23 = unicodeExtraFieldPolicy20.toString();
        java.lang.String str24 = unicodeExtraFieldPolicy20.toString();
        java.lang.String str25 = unicodeExtraFieldPolicy20.toString();
        zipArchiveOutputStream11.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy20);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy20);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archive has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "always" + "'", str22, "always");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "always" + "'", str23, "always");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "always" + "'", str24, "always");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.util.zip.Deflater deflater5 = zipArchiveOutputStream1.def;
        long long6 = zipArchiveOutputStream1.getBytesWritten();
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream7.write(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deflater5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("not encodeable");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: not encodeable");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        zipArchiveOutputStream1.setEncoding("UTF8");
        java.util.zip.Deflater deflater32 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "always" + "'", str24, "always");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "always" + "'", str26, "always");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "always" + "'", str28, "always");
        org.junit.Assert.assertNotNull(deflater32);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.setLevel(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream14.deflate();
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.flush();
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
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        zipArchiveOutputStream2.finished = true;
        zipArchiveOutputStream2.deflate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setComment("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        boolean boolean7 = zipArchiveOutputStream1.finished;
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = zipArchiveOutputStream1.createArchiveEntry(file8, "always");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setLevel((int) (byte) 1);
        java.io.OutputStream outputStream12 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream12.write(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray13, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(outputStream12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream13.destroy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deflater8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.putArchiveEntry(archiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        zipArchiveOutputStream1.flush();
        java.lang.Class<?> wildcardClass6 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setEncoding("UTF8");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setComment("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode8 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode8);
        zipArchiveOutputStream1.finished = false;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setMethod((-1));
        java.io.OutputStream outputStream8 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream8.write(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(outputStream8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        int int7 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry10);
        zipArchiveOutputStream1.destroy();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        boolean boolean16 = zipArchiveOutputStream2.isSeekable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(deflater15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setComment("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.Class<?> wildcardClass7 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry7);
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(deflater6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        boolean boolean7 = zipArchiveOutputStream2.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream8);
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveOutputStream9.createArchiveEntry(file10, "always");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.deflate();
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray10, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        java.lang.String str14 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF8" + "'", str14, "UTF8");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry7);
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray9, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream4.setMethod(10);
        zipArchiveOutputStream4.deflate();
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream4.write(byteArray8, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream16);
        zipArchiveOutputStream17.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy19 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream17.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy19);
        java.lang.String str21 = unicodeExtraFieldPolicy19.toString();
        java.lang.String str22 = unicodeExtraFieldPolicy19.toString();
        java.lang.String str23 = unicodeExtraFieldPolicy19.toString();
        java.lang.String str24 = unicodeExtraFieldPolicy19.toString();
        java.lang.String str25 = unicodeExtraFieldPolicy19.toString();
        java.lang.String str26 = unicodeExtraFieldPolicy19.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy19);
        java.util.zip.Deflater deflater28 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "always" + "'", str14, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "always" + "'", str21, "always");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "always" + "'", str22, "always");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "always" + "'", str23, "always");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "always" + "'", str24, "always");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "always" + "'", str26, "always");
        org.junit.Assert.assertNotNull(deflater28);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
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
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long7 = zipArchiveOutputStream6.getBytesWritten();
        zipArchiveOutputStream6.writeZip64CentralDirectory();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setComment("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.setComment("UTF8");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setLevel((int) (short) -1);
        java.io.OutputStream outputStream11 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream11.write(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray12, (int) (byte) 100, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(outputStream11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setLevel((int) (byte) 0);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        java.util.zip.Deflater deflater8 = zipArchiveOutputStream1.def;
        java.util.zip.Deflater deflater9 = zipArchiveOutputStream1.def;
        java.io.OutputStream outputStream10 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream10.write(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(deflater8);
        org.junit.Assert.assertNotNull(deflater9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        boolean boolean4 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        boolean boolean7 = zipArchiveOutputStream2.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream8);
        zipArchiveOutputStream8.writeZip64CentralDirectory();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream8.setLevel((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.destroy();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray11, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode4 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode4);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = zipArchiveOutputStream1.createArchiveEntry(file7, "never");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setComment("always");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream2.setMethod((int) (byte) 10);
        boolean boolean9 = zipArchiveOutputStream2.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.destroy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean4 = zipArchiveOutputStream3.isSeekable();
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write(byteArray5, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        java.util.zip.Deflater deflater13 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(deflater13);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archive has already been finished");
        } catch (java.io.IOException e) {
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
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = null;
        java.io.InputStream inputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry14, inputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setMethod(0);
        zipArchiveOutputStream1.setLevel(8);
        java.io.OutputStream outputStream6 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream6.write(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long7 = zipArchiveOutputStream6.getBytesWritten();
        zipArchiveOutputStream6.setComment("UTF8");
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveOutputStream6.createArchiveEntry(file10, "");
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
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream1.def;
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deflater6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.flush();
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = null;
        java.io.InputStream inputStream30 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry29, inputStream30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "always" + "'", str19, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy25);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = zipArchiveOutputStream1.createArchiveEntry(file11, "not encodeable");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(deflater9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setEncoding("always");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.finished = false;
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setMethod((int) (byte) 100);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode4 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode4);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream4.writeZip64CentralDirectory();
        zipArchiveOutputStream4.deflate();
        int int7 = zipArchiveOutputStream4.getCount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream2.setUseZip64(zip64Mode5);
        zipArchiveOutputStream2.setLevel((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        long long10 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
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
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        boolean boolean6 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = null;
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry7, inputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        zipArchiveOutputStream2.finished = true;
        long long10 = zipArchiveOutputStream2.getBytesWritten();
        byte[] byteArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeOut(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("always");
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        java.lang.Class<?> wildcardClass8 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(deflater7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.setComment("UTF8");
        java.nio.channels.SeekableByteChannel seekableByteChannel14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel14);
        boolean boolean16 = zipArchiveOutputStream15.isSeekable();
        java.util.zip.Deflater deflater17 = zipArchiveOutputStream15.def;
        zipArchiveOutputStream15.finished = false;
        java.nio.channels.SeekableByteChannel seekableByteChannel20 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel20);
        int int22 = zipArchiveOutputStream21.getCount();
        zipArchiveOutputStream21.setFallbackToUTF8(true);
        zipArchiveOutputStream21.finished = true;
        java.io.OutputStream outputStream27 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream27);
        zipArchiveOutputStream28.finished = true;
        zipArchiveOutputStream28.deflate();
        java.io.OutputStream outputStream32 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream32);
        zipArchiveOutputStream33.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy35 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream33.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy35);
        java.lang.String str37 = unicodeExtraFieldPolicy35.toString();
        zipArchiveOutputStream28.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy35);
        zipArchiveOutputStream21.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy35);
        zipArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy35);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy35);
        java.io.OutputStream outputStream42 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray43 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream42.write(byteArray43);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray43, 512, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(deflater17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "always" + "'", str37, "always");
        org.junit.Assert.assertNotNull(outputStream42);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        long long8 = zipArchiveOutputStream1.getBytesWritten();
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry13);
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
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode25 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode25);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "always" + "'", str21, "always");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "always" + "'", str23, "always");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "always" + "'", str12, "always");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        zipArchiveOutputStream1.flush();
        boolean boolean6 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int8 = zipArchiveOutputStream7.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream7.writeCentralFileHeader(zipArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        zipArchiveOutputStream1.flush();
        boolean boolean6 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int8 = zipArchiveOutputStream7.getCount();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream7.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
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
        byte[] byteArray33 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray33);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        long long10 = zipArchiveOutputStream1.getBytesWritten();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.io.File file4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = zipArchiveOutputStream1.createArchiveEntry(file4, "always");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        int int7 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.deflate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
        java.io.InputStream inputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry16, inputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        java.util.zip.Deflater deflater3 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.deflate();
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        long long6 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(deflater3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.setLevel(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream14.putArchiveEntry(archiveEntry15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream5);
        int int7 = zipArchiveOutputStream6.getCount();
        boolean boolean8 = zipArchiveOutputStream6.finished;
        java.nio.channels.SeekableByteChannel seekableByteChannel9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel9);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream10);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream10.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy12);
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy12);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy12);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy12);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setMethod(100);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        java.io.InputStream inputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry12, inputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "always" + "'", str10, "always");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean4 = zipArchiveOutputStream3.isSeekable();
        zipArchiveOutputStream3.setFallbackToUTF8(true);
        zipArchiveOutputStream3.setComment("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.setLevel(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream6.def;
        zipArchiveOutputStream6.flush();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(deflater7);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.deflate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        zipArchiveOutputStream1.finished = true;
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream7.write(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        boolean boolean7 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setMethod(10);
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode4 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode4);
        zipArchiveOutputStream1.setLevel((int) (byte) -1);
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archive has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
        java.util.zip.Deflater deflater30 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode31 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode31);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry33 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry33);
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
        org.junit.Assert.assertNotNull(deflater30);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setMethod((int) (byte) 100);
        zipArchiveOutputStream1.setComment("not encodeable");
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
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        java.util.zip.Deflater deflater3 = zipArchiveOutputStream1.def;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(deflater3);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
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
        java.lang.Class<?> wildcardClass26 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "always" + "'", str22, "always");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.finished = false;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setMethod((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream11.putArchiveEntry(archiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        int int7 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.finished = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.close();
        boolean boolean6 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setLevel(1);
        java.lang.String str9 = zipArchiveOutputStream1.getEncoding();
        java.lang.Class<?> wildcardClass10 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode8 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "always" + "'", str12, "always");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream13.write(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray14, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(outputStream13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean7 = zipArchiveOutputStream6.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream8.write(byteArray14, 512, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        int int8 = zipArchiveOutputStream1.getCount();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray7, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
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
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray13, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream2.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream9.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setMethod(100);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
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
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        int int6 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater7);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean9 = zipArchiveOutputStream1.finished;
        long long10 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.Class<?> wildcardClass11 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        boolean boolean6 = zipArchiveOutputStream1.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        boolean boolean11 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.destroy();
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = zipArchiveOutputStream1.createArchiveEntry(file7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode8 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode8);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        boolean boolean4 = zipArchiveOutputStream2.finished;
        java.lang.String str5 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.writeZip64CentralDirectory();
        long long7 = zipArchiveOutputStream2.getBytesWritten();
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray8, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream14.putArchiveEntry(archiveEntry15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray4, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "always" + "'", str22, "always");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean4 = zipArchiveOutputStream3.isSeekable();
        zipArchiveOutputStream3.flush();
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream3.def;
        zipArchiveOutputStream3.deflate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deflater6);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        boolean boolean7 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream1.def;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deflater6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 0, (byte) 1 });
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        boolean boolean8 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        zipArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
            zipArchiveOutputStream1.setLevel(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.util.zip.Deflater deflater5 = zipArchiveOutputStream3.def;
        zipArchiveOutputStream3.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.destroy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deflater5);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        boolean boolean7 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        zipArchiveOutputStream1.finished = true;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
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
        zipArchiveOutputStream10.setUseLanguageEncodingFlag(true);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setComment("never");
        boolean boolean14 = zipArchiveOutputStream1.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.deflate();
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertNotNull(deflater7);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        long long6 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray8, 2048, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        zipArchiveOutputStream2.finished = true;
        zipArchiveOutputStream2.deflate();
        boolean boolean11 = zipArchiveOutputStream2.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry12);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setComment("never");
        boolean boolean14 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        int int7 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = true;
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        int int9 = zipArchiveOutputStream1.getCount();
        int int10 = zipArchiveOutputStream1.getCount();
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.setMethod((int) ' ');
        boolean boolean9 = zipArchiveOutputStream1.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.flush();
        java.lang.String str6 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
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
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.deflate();
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream2.setMethod((int) (byte) 10);
        boolean boolean9 = zipArchiveOutputStream2.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        boolean boolean7 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.deflate();
        java.lang.Class<?> wildcardClass12 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.destroy();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
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
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.writeOut(byteArray14, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream2.setUseZip64(zip64Mode5);
        zipArchiveOutputStream2.setLevel((int) (byte) 1);
        zipArchiveOutputStream2.writeZip64CentralDirectory();
        zipArchiveOutputStream2.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeLocalFileHeader(zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setComment("");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        int int4 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        java.lang.Class<?> wildcardClass30 = unicodeExtraFieldPolicy23.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "always" + "'", str27, "always");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
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
        java.io.File file18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = zipArchiveOutputStream1.createArchiveEntry(file18, "never");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy13);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        java.lang.String str10 = unicodeExtraFieldPolicy7.toString();
        java.lang.String str11 = unicodeExtraFieldPolicy7.toString();
        java.lang.String str12 = unicodeExtraFieldPolicy7.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "never" + "'", str8, "never");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "never" + "'", str10, "never");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "never" + "'", str11, "never");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "never" + "'", str12, "never");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
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
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setComment("UTF8");
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = zipArchiveOutputStream1.createArchiveEntry(file7, "always");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deflater4);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream15.putArchiveEntry(archiveEntry16);
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
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode9 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode9);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setComment("hi!");
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.flush();
        int int9 = zipArchiveOutputStream1.getCount();
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray10, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.flush();
        java.lang.Class<?> wildcardClass12 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.setLevel((int) (short) -1);
        byte[] byteArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deflater4);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        boolean boolean4 = zipArchiveOutputStream2.finished;
        java.lang.String str5 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.writeZip64CentralDirectory();
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream7.write(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray8, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setComment("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.setComment("UTF8");
        java.io.OutputStream outputStream11 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream11.write(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        zipArchiveOutputStream10.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = null;
        java.io.InputStream inputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.addRawArchiveEntry(zipArchiveEntry18, inputStream19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str1 = unicodeExtraFieldPolicy0.toString();
        java.lang.String str2 = unicodeExtraFieldPolicy0.toString();
        java.lang.String str3 = unicodeExtraFieldPolicy0.toString();
        java.lang.String str4 = unicodeExtraFieldPolicy0.toString();
        java.lang.String str5 = unicodeExtraFieldPolicy0.toString();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "always" + "'", str1, "always");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "always" + "'", str2, "always");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "always" + "'", str3, "always");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "always" + "'", str4, "always");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "always" + "'", str5, "always");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = null;
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry3, inputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode3 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode3);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        zipArchiveOutputStream2.setFallbackToUTF8(false);
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
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy23);
        byte[] byteArray30 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray30, 2048, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "always" + "'", str28, "always");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        int int9 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setMethod(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = zipArchiveOutputStream1.createArchiveEntry(file7, "always");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        int int9 = zipArchiveOutputStream1.getCount();
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream10);
        zipArchiveOutputStream11.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveOutputStream11.canWriteEntryData(archiveEntry13);
        zipArchiveOutputStream11.finished = true;
        java.io.OutputStream outputStream17 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream17);
        zipArchiveOutputStream18.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy20 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream18.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy20);
        java.lang.String str22 = unicodeExtraFieldPolicy20.toString();
        java.lang.String str23 = unicodeExtraFieldPolicy20.toString();
        java.lang.String str24 = unicodeExtraFieldPolicy20.toString();
        java.lang.String str25 = unicodeExtraFieldPolicy20.toString();
        zipArchiveOutputStream11.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy20);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy20);
        int int28 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = null;
        java.io.InputStream inputStream30 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry29, inputStream30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "always" + "'", str22, "always");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "always" + "'", str23, "always");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "always" + "'", str24, "always");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setEncoding("UTF8");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
        zipArchiveOutputStream1.destroy();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream9.writeLocalFileHeader(zipArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deflater11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
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
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "always" + "'", str18, "always");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "always" + "'", str20, "always");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = null;
        java.io.InputStream inputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry14, inputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        boolean boolean16 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = zipArchiveOutputStream2.createArchiveEntry(file6, "UTF8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.setMethod((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setComment("hi!");
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 1 });
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream2.setMethod((int) (byte) 10);
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        java.io.OutputStream outputStream11 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream11.write(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeOut(byteArray12, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertNotNull(outputStream11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean6 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode7 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry7);
        long long9 = zipArchiveOutputStream2.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.setLevel(2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 2048");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(deflater3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "always" + "'", str23, "always");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
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
        java.io.OutputStream outputStream14 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream14.write(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.writeOut(byteArray15, 0, (int) (byte) 1);
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
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode8 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode8);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.destroy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy21);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.setEncoding("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        java.io.InputStream inputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry11, inputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.flush();
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
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        boolean boolean7 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setFallbackToUTF8(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.destroy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray35);
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
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 1, (byte) 1 });
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
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
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry19);
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
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        boolean boolean7 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream10.destroy();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archive has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = zipArchiveOutputStream1.createArchiveEntry(file11, "not encodeable");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.writeLocalFileHeader(zipArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = null;
        java.io.InputStream inputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry14, inputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        int int9 = zipArchiveOutputStream1.getCount();
        boolean boolean10 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setMethod((int) (short) 10);
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveOutputStream1.createArchiveEntry(file10, "never");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater7);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
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
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
        zipArchiveOutputStream12.setMethod(1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setLevel((int) (byte) 0);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        java.lang.String str11 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.writeCentralFileHeader(zipArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray4, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
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
        zipArchiveOutputStream9.setMethod(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deflater11);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        boolean boolean4 = zipArchiveOutputStream2.finished;
        java.lang.String str5 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.writeZip64CentralDirectory();
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 1 });
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setComment("hi!");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.destroy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        boolean boolean9 = zipArchiveOutputStream1.isSeekable();
        java.io.OutputStream outputStream10 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream10.write(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray11, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
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
        java.lang.Class<?> wildcardClass12 = zipArchiveOutputStream11.getClass();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream7.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        boolean boolean7 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.deflate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        boolean boolean8 = zipArchiveOutputStream1.finished;
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        java.io.OutputStream outputStream12 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream12.write(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray13, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(outputStream12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode7 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode7);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setMethod((int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
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
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("UTF8");
        java.util.zip.Deflater deflater8 = zipArchiveOutputStream1.def;
        java.lang.Class<?> wildcardClass9 = deflater8.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        zipArchiveOutputStream2.finished = true;
        zipArchiveOutputStream2.deflate();
        boolean boolean11 = zipArchiveOutputStream2.finished;
        java.lang.String str12 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.setFallbackToUTF8(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.setLevel((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "never" + "'", str12, "never");
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        long long6 = zipArchiveOutputStream1.getBytesWritten();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray8, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream2.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeLocalFileHeader(zipArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertNotNull(deflater7);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        long long4 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setMethod((-1));
        boolean boolean7 = zipArchiveOutputStream1.finished;
        java.util.zip.Deflater deflater8 = zipArchiveOutputStream1.def;
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream9.write(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray10, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(deflater8);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setEncoding("never");
        int int8 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = null;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        java.nio.channels.SeekableByteChannel seekableByteChannel11 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel11);
        int int13 = zipArchiveOutputStream12.getCount();
        zipArchiveOutputStream12.setFallbackToUTF8(true);
        java.lang.String str16 = zipArchiveOutputStream12.getEncoding();
        zipArchiveOutputStream12.deflate();
        long long18 = zipArchiveOutputStream12.getBytesWritten();
        zipArchiveOutputStream12.flush();
        zipArchiveOutputStream12.setMethod((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy22 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str23 = unicodeExtraFieldPolicy22.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        java.lang.String str25 = unicodeExtraFieldPolicy22.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTF8" + "'", str16, "UTF8");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "always" + "'", str23, "always");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.flush();
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.setMethod(100);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        int int8 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        java.io.InputStream inputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry9, inputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean5 = zipArchiveOutputStream1.isSeekable();
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
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream7.addRawArchiveEntry(zipArchiveEntry8, inputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setComment("never");
        boolean boolean14 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
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
        int int13 = zipArchiveOutputStream2.getCount();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archive has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray3, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setMethod(10);
        zipArchiveOutputStream1.setMethod(100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.setMethod((int) (short) 10);
        byte[] byteArray11 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray11, (int) (byte) -1, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode11 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode11);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray14, 512, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setLevel((int) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
        boolean boolean13 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deflater8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean7 = zipArchiveOutputStream6.finished;
        int int8 = zipArchiveOutputStream6.getCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        int int9 = zipArchiveOutputStream1.getCount();
        int int10 = zipArchiveOutputStream1.getCount();
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
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
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long10 = zipArchiveOutputStream9.getBytesWritten();
        java.util.zip.Deflater deflater11 = zipArchiveOutputStream9.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream9);
        zipArchiveOutputStream12.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.writeCentralFileHeader(zipArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deflater11);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream6.setMethod((int) '4');
        boolean boolean9 = zipArchiveOutputStream6.isSeekable();
        zipArchiveOutputStream6.setComment("never");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry8, inputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
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
        java.io.File file13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = zipArchiveOutputStream1.createArchiveEntry(file13, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        java.util.zip.Deflater deflater8 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater8);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
        zipArchiveOutputStream1.setLevel(0);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode19 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode19);
        zipArchiveOutputStream1.close();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        zipArchiveOutputStream2.finished = true;
        zipArchiveOutputStream2.deflate();
        boolean boolean11 = zipArchiveOutputStream2.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry12);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.destroy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        java.util.zip.Deflater deflater3 = zipArchiveOutputStream1.def;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(deflater3);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        java.io.File file31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry33 = zipArchiveOutputStream1.createArchiveEntry(file31, "never");
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
}

