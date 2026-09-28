package org.apache.commons.compress.archivers.zip;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        int int8 = zipArchiveOutputStream1.getCount();
        java.lang.String str9 = zipArchiveOutputStream1.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream31 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (byte) 100);
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
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
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
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTF8" + "'", str22, "UTF8");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
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
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.deflate();
        java.io.OutputStream outputStream15 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream15.write(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray16, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(outputStream15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        boolean boolean7 = zipArchiveOutputStream2.isSeekable();
        boolean boolean8 = zipArchiveOutputStream2.finished;
        zipArchiveOutputStream2.finished = true;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray5, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream2.finished = true;
        zipArchiveOutputStream2.flush();
        zipArchiveOutputStream2.deflate();
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream9.write(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeOut(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
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
        java.nio.channels.SeekableByteChannel seekableByteChannel29 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel29);
        long long31 = zipArchiveOutputStream30.getBytesWritten();
        zipArchiveOutputStream30.deflate();
        java.io.OutputStream outputStream33 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream34 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream33);
        int int35 = zipArchiveOutputStream34.getCount();
        boolean boolean36 = zipArchiveOutputStream34.finished;
        java.nio.channels.SeekableByteChannel seekableByteChannel37 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream38 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel37);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream39 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream38);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy40 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream38.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy40);
        zipArchiveOutputStream34.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy40);
        java.lang.String str43 = unicodeExtraFieldPolicy40.toString();
        zipArchiveOutputStream30.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy40);
        java.lang.String str45 = unicodeExtraFieldPolicy40.toString();
        java.lang.String str46 = unicodeExtraFieldPolicy40.toString();
        java.lang.String str47 = unicodeExtraFieldPolicy40.toString();
        zipArchiveOutputStream8.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy40);
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy40);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "always" + "'", str27, "always");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "always" + "'", str43, "always");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "always" + "'", str45, "always");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "always" + "'", str46, "always");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "always" + "'", str47, "always");
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode7 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode7);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
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
        zipArchiveOutputStream1.writeZip64CentralDirectory();
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
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        long long4 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
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
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.flush();
        long long8 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
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
        boolean boolean31 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "always" + "'", str24, "always");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "always" + "'", str26, "always");
        org.junit.Assert.assertNotNull(deflater30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("UTF8");
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.finished = false;
        boolean boolean11 = zipArchiveOutputStream1.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
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
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setComment("not encodeable");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream1.def;
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(deflater6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int10 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode11 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode11);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        int int14 = zipArchiveOutputStream1.getCount();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
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
        java.nio.channels.SeekableByteChannel seekableByteChannel17 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel17);
        int int19 = zipArchiveOutputStream18.getCount();
        zipArchiveOutputStream18.setFallbackToUTF8(true);
        zipArchiveOutputStream18.finished = true;
        zipArchiveOutputStream18.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream18);
        long long27 = zipArchiveOutputStream26.getBytesWritten();
        java.util.zip.Deflater deflater28 = zipArchiveOutputStream26.def;
        zipArchiveOutputStream26.deflate();
        zipArchiveOutputStream26.destroy();
        java.io.OutputStream outputStream31 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream31);
        zipArchiveOutputStream32.finished = true;
        zipArchiveOutputStream32.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy37 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str38 = unicodeExtraFieldPolicy37.toString();
        zipArchiveOutputStream32.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy37);
        zipArchiveOutputStream32.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode42 = null;
        zipArchiveOutputStream32.setUseZip64(zip64Mode42);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy44 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream32.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy44);
        java.lang.String str46 = unicodeExtraFieldPolicy44.toString();
        zipArchiveOutputStream26.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy44);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy44);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "never" + "'", str8, "never");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(deflater28);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "always" + "'", str38, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "always" + "'", str46, "always");
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setEncoding("always");
        boolean boolean10 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setEncoding("always");
        zipArchiveOutputStream1.setMethod(100);
        boolean boolean15 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        zipArchiveOutputStream2.finished = true;
        long long10 = zipArchiveOutputStream2.getBytesWritten();
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        boolean boolean13 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.putArchiveEntry(archiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setLevel((-1));
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.util.zip.Deflater deflater10 = zipArchiveOutputStream1.def;
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray11, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertNotNull(deflater10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
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
        byte[] byteArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.write(byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
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
        java.lang.Class<?> wildcardClass21 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "always" + "'", str14, "always");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        long long6 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setMethod(100);
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.deflate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        long long5 = zipArchiveOutputStream2.getBytesWritten();
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy7 = null;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        boolean boolean9 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setLevel((int) (byte) 0);
        java.lang.String str12 = zipArchiveOutputStream2.getEncoding();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setEncoding("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode9 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode9);
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.finished = false;
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = zipArchiveOutputStream1.createArchiveEntry(file7, "always");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.destroy();
        long long10 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream15.writeLocalFileHeader(zipArchiveEntry16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
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
        java.util.zip.Deflater deflater19 = zipArchiveOutputStream18.def;
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(deflater19);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        boolean boolean7 = zipArchiveOutputStream2.isSeekable();
        byte[] byteArray9 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeOut(byteArray9, 8, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0 });
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean12 = zipArchiveOutputStream1.finished;
        long long13 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str14 = zipArchiveOutputStream1.getEncoding();
        boolean boolean15 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = null;
        boolean boolean17 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF8" + "'", str14, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream1.def;
        boolean boolean7 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deflater6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        zipArchiveOutputStream1.destroy();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel(512);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 512");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.deflate();
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray10, (int) (short) -1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
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
        java.lang.String str42 = unicodeExtraFieldPolicy35.toString();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(deflater17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "always" + "'", str37, "always");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "always" + "'", str42, "always");
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
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
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        byte[] byteArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
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
        zipArchiveOutputStream1.flush();
        java.io.File file31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry33 = zipArchiveOutputStream1.createArchiveEntry(file31, "not encodeable");
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
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setLevel(0);
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
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        boolean boolean9 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setEncoding("never");
        java.io.OutputStream outputStream12 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream12.write(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(outputStream12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode7 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode7);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode7 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode7);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long10 = zipArchiveOutputStream9.getBytesWritten();
        java.lang.String str11 = zipArchiveOutputStream9.getEncoding();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setEncoding("never");
        int int8 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
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
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode39 = null;
        zipArchiveOutputStream2.setUseZip64(zip64Mode39);
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
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
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
        java.util.zip.Deflater deflater12 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(deflater12);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        boolean boolean5 = zipArchiveOutputStream1.finished;
        java.lang.String str6 = zipArchiveOutputStream1.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
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
        boolean boolean13 = zipArchiveOutputStream1.isSeekable();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
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
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "always" + "'", str28, "always");
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
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
            zipArchiveOutputStream5.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        long long4 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setComment("not encodeable");
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.finished = false;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        zipArchiveOutputStream2.setMethod((int) (byte) 0);
        zipArchiveOutputStream2.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream11.setMethod(10);
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream11.writeOut(byteArray14, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
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
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode21 = null;
        zipArchiveOutputStream20.setUseZip64(zip64Mode21);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTF8" + "'", str13, "UTF8");
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long24 = zipArchiveOutputStream23.getBytesWritten();
        java.io.OutputStream outputStream25 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream25);
        zipArchiveOutputStream26.finished = true;
        zipArchiveOutputStream26.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy31 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str32 = unicodeExtraFieldPolicy31.toString();
        zipArchiveOutputStream26.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy31);
        zipArchiveOutputStream26.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode36 = null;
        zipArchiveOutputStream26.setUseZip64(zip64Mode36);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy38 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream26.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy38);
        java.lang.String str40 = unicodeExtraFieldPolicy38.toString();
        zipArchiveOutputStream23.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy38);
        zipArchiveOutputStream23.setLevel((int) (byte) 1);
        zipArchiveOutputStream23.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry45 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream23.writeDataDescriptor(zipArchiveEntry45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "always" + "'", str32, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "always" + "'", str40, "always");
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.lang.String str3 = zipArchiveOutputStream1.getEncoding();
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
        org.junit.Assert.assertNotNull(deflater4);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
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
        zipArchiveOutputStream1.setMethod((-1));
        zipArchiveOutputStream1.setComment("UTF8");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deflater4);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.finished = false;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.flush();
        boolean boolean7 = zipArchiveOutputStream1.finished;
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("never");
        boolean boolean6 = zipArchiveOutputStream1.isSeekable();
        int int7 = zipArchiveOutputStream1.getCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode8 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode8);
        boolean boolean10 = zipArchiveOutputStream1.isSeekable();
        boolean boolean11 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
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
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.String str10 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deflater6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        boolean boolean4 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        boolean boolean4 = zipArchiveOutputStream2.finished;
        java.lang.String str5 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.writeZip64CentralDirectory();
        long long7 = zipArchiveOutputStream2.getBytesWritten();
        zipArchiveOutputStream2.writeZip64CentralDirectory();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.destroy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        boolean boolean6 = zipArchiveOutputStream1.finished;
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(deflater7);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        boolean boolean4 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.destroy();
        java.lang.String str6 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
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
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream13.write(byteArray17, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 100, (byte) 10 });
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream9);
        int int11 = zipArchiveOutputStream10.getCount();
        boolean boolean12 = zipArchiveOutputStream10.finished;
        java.nio.channels.SeekableByteChannel seekableByteChannel13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel13);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream14);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy16 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream14.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        zipArchiveOutputStream10.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        java.lang.String str19 = unicodeExtraFieldPolicy16.toString();
        java.lang.String str20 = unicodeExtraFieldPolicy16.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "always" + "'", str19, "always");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "always" + "'", str20, "always");
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = null;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode7 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode7);
        zipArchiveOutputStream1.setComment("hi!");
        boolean boolean11 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
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
        boolean boolean18 = zipArchiveOutputStream12.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.writeDataDescriptor(zipArchiveEntry19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
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
        java.lang.String str10 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deflater8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
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
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray39);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 10, (byte) 0, (byte) 0 });
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
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
        zipArchiveOutputStream1.setMethod((int) '4');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = null;
        boolean boolean17 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
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
        java.lang.String str19 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setMethod(10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTF8" + "'", str19, "UTF8");
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        java.util.zip.Deflater deflater10 = zipArchiveOutputStream1.def;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(deflater10);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        boolean boolean8 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.setLevel(1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("not encodeable");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: not encodeable");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry14);
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
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        int int13 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setComment("always");
        int int16 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode17 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode17);
        java.lang.String str19 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTF8" + "'", str19, "UTF8");
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
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
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode64 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode64);
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
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry7);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
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
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.util.zip.Deflater deflater5 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.setEncoding("always");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deflater5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setMethod((int) '4');
        java.lang.Class<?> wildcardClass8 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
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
        zipArchiveOutputStream1.finished = true;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "always" + "'", str14, "always");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        java.lang.String str6 = zipArchiveOutputStream1.getEncoding();
        boolean boolean7 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("not encodeable");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: not encodeable");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setComment("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream1.finished = true;
        java.util.zip.Deflater deflater11 = zipArchiveOutputStream1.def;
        java.io.OutputStream outputStream12 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream12.write(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray13, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(deflater11);
        org.junit.Assert.assertNotNull(outputStream12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
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
        java.io.OutputStream outputStream18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream18);
        zipArchiveOutputStream19.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy21 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream19.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        java.lang.String str23 = unicodeExtraFieldPolicy21.toString();
        java.lang.String str24 = unicodeExtraFieldPolicy21.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "never" + "'", str13, "never");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "always" + "'", str23, "always");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "always" + "'", str24, "always");
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setEncoding("always");
        boolean boolean10 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setEncoding("always");
        zipArchiveOutputStream1.finished = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        boolean boolean6 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.setMethod((int) ' ');
        zipArchiveOutputStream1.destroy();
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode4 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode4);
        java.nio.channels.SeekableByteChannel seekableByteChannel6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel6);
        int int8 = zipArchiveOutputStream7.getCount();
        zipArchiveOutputStream7.setFallbackToUTF8(true);
        java.lang.String str11 = zipArchiveOutputStream7.getEncoding();
        zipArchiveOutputStream7.deflate();
        long long13 = zipArchiveOutputStream7.getBytesWritten();
        zipArchiveOutputStream7.flush();
        zipArchiveOutputStream7.setMethod((int) (short) 10);
        java.nio.channels.SeekableByteChannel seekableByteChannel17 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel17);
        boolean boolean19 = zipArchiveOutputStream18.isSeekable();
        boolean boolean20 = zipArchiveOutputStream18.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = null;
        boolean boolean22 = zipArchiveOutputStream18.canWriteEntryData(archiveEntry21);
        java.io.OutputStream outputStream23 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream23);
        zipArchiveOutputStream24.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy26 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream24.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy26);
        zipArchiveOutputStream18.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy26);
        java.lang.String str29 = unicodeExtraFieldPolicy26.toString();
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy26);
        java.lang.String str31 = unicodeExtraFieldPolicy26.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy26);
        zipArchiveOutputStream1.finished = false;
        java.lang.String str35 = zipArchiveOutputStream1.getEncoding();
        long long36 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "always" + "'", str29, "always");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "always" + "'", str31, "always");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTF8" + "'", str35, "UTF8");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode9 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode9);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
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
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        java.io.File file29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry31 = zipArchiveOutputStream1.createArchiveEntry(file29, "");
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
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("");
        boolean boolean11 = zipArchiveOutputStream1.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archive has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        zipArchiveOutputStream2.finished = true;
        zipArchiveOutputStream2.setLevel((int) (byte) 0);
        zipArchiveOutputStream2.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeLocalFileHeader(zipArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
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
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
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
        java.util.zip.Deflater deflater12 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream13.setComment("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertNotNull(deflater12);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setEncoding("always");
        zipArchiveOutputStream1.setMethod((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
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
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream11.writeOut(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
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
        int int15 = zipArchiveOutputStream2.getCount();
        zipArchiveOutputStream2.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeDataDescriptor(zipArchiveEntry17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
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
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry16);
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
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
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
        int int17 = zipArchiveOutputStream1.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertNotNull(deflater13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        byte[] byteArray7 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.String str10 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode12 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode12);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        boolean boolean7 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        zipArchiveOutputStream1.finished = true;
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 100 });
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        zipArchiveOutputStream2.finished = true;
        long long10 = zipArchiveOutputStream2.getBytesWritten();
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        boolean boolean13 = zipArchiveOutputStream2.finished;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
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
        java.util.zip.Deflater deflater14 = zipArchiveOutputStream1.def;
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(deflater14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.flush();
        boolean boolean9 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.destroy();
        int int11 = zipArchiveOutputStream1.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
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
        java.io.OutputStream outputStream15 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream15.write(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray16, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(outputStream15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
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
        zipArchiveOutputStream1.finished = false;
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
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
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
        zipArchiveOutputStream1.close();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTF8" + "'", str13, "UTF8");
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
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
        zipArchiveOutputStream2.setLevel((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(deflater15);
        org.junit.Assert.assertNotNull(deflater16);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean7 = zipArchiveOutputStream1.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        java.nio.channels.SeekableByteChannel seekableByteChannel6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel6);
        int int8 = zipArchiveOutputStream7.getCount();
        zipArchiveOutputStream7.setFallbackToUTF8(true);
        zipArchiveOutputStream7.finished = true;
        zipArchiveOutputStream7.finished = true;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode15 = null;
        zipArchiveOutputStream7.setUseZip64(zip64Mode15);
        java.io.OutputStream outputStream17 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream17);
        zipArchiveOutputStream18.finished = true;
        zipArchiveOutputStream18.deflate();
        java.io.OutputStream outputStream22 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream22);
        zipArchiveOutputStream23.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy25 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream23.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy25);
        java.lang.String str27 = unicodeExtraFieldPolicy25.toString();
        zipArchiveOutputStream18.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy25);
        java.lang.String str29 = unicodeExtraFieldPolicy25.toString();
        java.lang.String str30 = unicodeExtraFieldPolicy25.toString();
        java.lang.String str31 = unicodeExtraFieldPolicy25.toString();
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy25);
        java.lang.String str33 = unicodeExtraFieldPolicy25.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "always" + "'", str27, "always");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "always" + "'", str29, "always");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "always" + "'", str30, "always");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "always" + "'", str31, "always");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "always" + "'", str33, "always");
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream10.setFallbackToUTF8(true);
        zipArchiveOutputStream10.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.writeLocalFileHeader(zipArchiveEntry16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.destroy();
        java.lang.Class<?> wildcardClass9 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
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
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setMethod(100);
        zipArchiveOutputStream1.deflate();
        boolean boolean14 = zipArchiveOutputStream1.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream6.setComment("not encodeable");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("never");
        boolean boolean11 = zipArchiveOutputStream1.isSeekable();
        boolean boolean12 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry14);
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        boolean boolean7 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        zipArchiveOutputStream1.flush();
        boolean boolean6 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int8 = zipArchiveOutputStream7.getCount();
        zipArchiveOutputStream7.setFallbackToUTF8(false);
        zipArchiveOutputStream7.setLevel(8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.flush();
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
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
        java.lang.Class<?> wildcardClass22 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy17);
        org.junit.Assert.assertNotNull(deflater21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.setLevel((int) (short) -1);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry11);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.close();
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray15, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 10 });
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setLevel((int) (byte) 1);
        zipArchiveOutputStream1.finished = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean11 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        boolean boolean7 = zipArchiveOutputStream2.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream8);
        zipArchiveOutputStream9.setEncoding("UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        boolean boolean6 = zipArchiveOutputStream1.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setLevel((int) (byte) 0);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry11);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setLevel((int) (short) 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deflater11);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean4 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode7 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode7);
        boolean boolean9 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
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
        zipArchiveOutputStream1.setMethod((int) (byte) 100);
        boolean boolean18 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.setComment("");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry7);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deflater6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
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
        zipArchiveOutputStream1.deflate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream14);
        zipArchiveOutputStream15.setFallbackToUTF8(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
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
        zipArchiveOutputStream1.finished = true;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
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
        boolean boolean12 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.deflate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deflater8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean8 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("");
        boolean boolean7 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setComment("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
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
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTF8" + "'", str16, "UTF8");
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
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
        int int14 = zipArchiveOutputStream2.getCount();
        java.lang.Class<?> wildcardClass15 = zipArchiveOutputStream2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        long long8 = zipArchiveOutputStream1.getBytesWritten();
        java.util.zip.Deflater deflater9 = zipArchiveOutputStream1.def;
        java.lang.String str10 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(deflater9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        boolean boolean9 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setMethod((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream7.writeLocalFileHeader(zipArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str9 = unicodeExtraFieldPolicy8.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        java.lang.String str11 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setEncoding("always");
        zipArchiveOutputStream1.setMethod((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "never" + "'", str9, "never");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        long long5 = zipArchiveOutputStream2.getBytesWritten();
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeOut(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
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
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertNotNull(deflater13);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.lang.Class<?> wildcardClass9 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.finished = true;
        java.io.OutputStream outputStream26 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray27 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream26.write(byteArray27);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray27, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(outputStream26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("never");
        java.lang.String str6 = zipArchiveOutputStream1.getEncoding();
        int int7 = zipArchiveOutputStream1.getCount();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
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
        java.io.File file47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry49 = zipArchiveOutputStream10.createArchiveEntry(file47, "always");
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
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        java.util.zip.Deflater deflater3 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy4 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str5 = unicodeExtraFieldPolicy4.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy4);
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(deflater3);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "not encodeable" + "'", str5, "not encodeable");
        org.junit.Assert.assertNotNull(deflater7);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream20.write(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTF8" + "'", str13, "UTF8");
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setComment("hi!");
        java.util.zip.Deflater deflater5 = zipArchiveOutputStream2.def;
        zipArchiveOutputStream2.setComment("always");
        zipArchiveOutputStream2.flush();
        zipArchiveOutputStream2.setComment("");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.putArchiveEntry(archiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deflater5);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setMethod((int) '4');
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setMethod((int) '4');
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.lang.String str11 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.writeCentralFileHeader(zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
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
        java.lang.String str16 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "never" + "'", str8, "never");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTF8" + "'", str16, "UTF8");
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
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
        java.util.zip.Deflater deflater23 = zipArchiveOutputStream22.def;
        zipArchiveOutputStream22.setMethod((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream22.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "always" + "'", str18, "always");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "always" + "'", str19, "always");
        org.junit.Assert.assertNotNull(deflater23);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream9);
        int int11 = zipArchiveOutputStream10.getCount();
        boolean boolean12 = zipArchiveOutputStream10.finished;
        java.nio.channels.SeekableByteChannel seekableByteChannel13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel13);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream14);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy16 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream14.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        zipArchiveOutputStream10.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        java.lang.String str19 = unicodeExtraFieldPolicy16.toString();
        java.lang.String str20 = unicodeExtraFieldPolicy16.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        boolean boolean22 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "always" + "'", str19, "always");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "always" + "'", str20, "always");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
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
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.nio.channels.SeekableByteChannel seekableByteChannel23 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel23);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream24);
        boolean boolean26 = zipArchiveOutputStream25.isSeekable();
        zipArchiveOutputStream25.setEncoding("never");
        zipArchiveOutputStream25.setFallbackToUTF8(false);
        zipArchiveOutputStream25.setMethod((int) (byte) 0);
        java.io.OutputStream outputStream33 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream34 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream33);
        zipArchiveOutputStream34.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy36 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream34.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy36);
        java.lang.String str38 = unicodeExtraFieldPolicy36.toString();
        zipArchiveOutputStream25.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy36);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy36);
        java.lang.String str41 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "always" + "'", str38, "always");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UTF8" + "'", str41, "UTF8");
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream3.setFallbackToUTF8(false);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.writeZip64CentralDirectory();
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        java.util.zip.Deflater deflater9 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray11, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertNotNull(deflater9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
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
        java.lang.Class<?> wildcardClass14 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
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
        java.lang.Class<?> wildcardClass30 = unicodeExtraFieldPolicy23.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "always" + "'", str28, "always");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        boolean boolean11 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream14);
        zipArchiveOutputStream15.finished = true;
        zipArchiveOutputStream15.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy20 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str21 = unicodeExtraFieldPolicy20.toString();
        zipArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy20);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream15);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream15);
        boolean boolean25 = zipArchiveOutputStream24.isSeekable();
        zipArchiveOutputStream24.setMethod((int) '#');
        java.nio.channels.SeekableByteChannel seekableByteChannel28 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel28);
        boolean boolean30 = zipArchiveOutputStream29.isSeekable();
        int int31 = zipArchiveOutputStream29.getCount();
        zipArchiveOutputStream29.flush();
        zipArchiveOutputStream29.setLevel((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream35 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream29);
        java.nio.channels.SeekableByteChannel seekableByteChannel36 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream37 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel36);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream38 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream37);
        boolean boolean39 = zipArchiveOutputStream38.isSeekable();
        boolean boolean40 = zipArchiveOutputStream38.finished;
        java.lang.String str41 = zipArchiveOutputStream38.getEncoding();
        zipArchiveOutputStream38.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy43 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str44 = unicodeExtraFieldPolicy43.toString();
        java.lang.String str45 = unicodeExtraFieldPolicy43.toString();
        zipArchiveOutputStream38.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy43);
        zipArchiveOutputStream29.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy43);
        zipArchiveOutputStream24.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy43);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy43);
        byte[] byteArray50 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "always" + "'", str21, "always");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UTF8" + "'", str41, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "never" + "'", str44, "never");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "never" + "'", str45, "never");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
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
        java.lang.String str19 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setMethod(10);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTF8" + "'", str19, "UTF8");
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setMethod(10);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        boolean boolean11 = zipArchiveOutputStream1.finished;
        boolean boolean12 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
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
        zipArchiveOutputStream1.setComment("always");
        boolean boolean14 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "always" + "'", str9, "always");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("never");
        boolean boolean6 = zipArchiveOutputStream1.isSeekable();
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
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
        long long15 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setMethod((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "always" + "'", str10, "always");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        boolean boolean8 = zipArchiveOutputStream1.finished;
        int int9 = zipArchiveOutputStream1.getCount();
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray10, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream9);
        int int11 = zipArchiveOutputStream10.getCount();
        boolean boolean12 = zipArchiveOutputStream10.finished;
        java.nio.channels.SeekableByteChannel seekableByteChannel13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel13);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream14);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy16 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream14.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        zipArchiveOutputStream10.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        java.lang.String str19 = unicodeExtraFieldPolicy16.toString();
        java.lang.String str20 = unicodeExtraFieldPolicy16.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        java.lang.Class<?> wildcardClass22 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "always" + "'", str19, "always");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "always" + "'", str20, "always");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
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
        java.lang.String str19 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setMethod(10);
        zipArchiveOutputStream1.setComment("");
        byte[] byteArray24 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray24, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTF8" + "'", str19, "UTF8");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setMethod((int) (byte) 100);
        java.lang.String str7 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.finished = true;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setLevel((-1));
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
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
            zipArchiveOutputStream1.setLevel((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream6.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode8 = null;
        zipArchiveOutputStream6.setUseZip64(zip64Mode8);
        java.util.zip.Deflater deflater10 = zipArchiveOutputStream6.def;
        zipArchiveOutputStream6.flush();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(deflater10);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setComment("hi!");
        java.util.zip.Deflater deflater5 = zipArchiveOutputStream2.def;
        zipArchiveOutputStream2.setComment("always");
        java.lang.Class<?> wildcardClass8 = zipArchiveOutputStream2.getClass();
        org.junit.Assert.assertNotNull(deflater5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long7 = zipArchiveOutputStream6.getBytesWritten();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.write(byteArray10, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 0 });
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
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
        java.io.OutputStream outputStream13 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream13.write(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.write(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(outputStream13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        int int6 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
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
        java.io.File file15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = zipArchiveOutputStream10.createArchiveEntry(file15, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setMethod((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater7);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setMethod((int) (byte) 100);
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream2.setMethod((int) (byte) 10);
        zipArchiveOutputStream2.setMethod((int) 'a');
        int int11 = zipArchiveOutputStream2.getCount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setMethod(10);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        boolean boolean11 = zipArchiveOutputStream1.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
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
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "always" + "'", str13, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy19);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy7 = null;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        boolean boolean9 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setLevel((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.flush();
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        boolean boolean8 = zipArchiveOutputStream1.finished;
        java.lang.String str9 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        long long14 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream6.setUseLanguageEncodingFlag(true);
        boolean boolean9 = zipArchiveOutputStream6.finished;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        java.util.zip.Deflater deflater9 = zipArchiveOutputStream1.def;
        java.lang.String str10 = zipArchiveOutputStream1.getEncoding();
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = zipArchiveOutputStream1.createArchiveEntry(file11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertNotNull(deflater9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream4.writeZip64CentralDirectory();
        zipArchiveOutputStream4.deflate();
        zipArchiveOutputStream4.flush();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        long long8 = zipArchiveOutputStream1.getBytesWritten();
        java.util.zip.Deflater deflater9 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(deflater9);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.flush();
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        java.lang.String str7 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry14);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream4);
        zipArchiveOutputStream5.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        java.lang.String str10 = unicodeExtraFieldPolicy7.toString();
        java.lang.String str11 = unicodeExtraFieldPolicy7.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "always" + "'", str10, "always");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "always" + "'", str11, "always");
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
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
        zipArchiveOutputStream10.flush();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
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
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deflater6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.flush();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.setLevel(2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 2048");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        boolean boolean6 = zipArchiveOutputStream1.finished;
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("");
        java.lang.Class<?> wildcardClass12 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry7);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        byte[] byteArray12 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeOut(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0 });
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        int int7 = zipArchiveOutputStream1.getCount();
        int int8 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.close();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
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
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setEncoding("never");
        int int8 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = null;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        zipArchiveOutputStream1.flush();
        boolean boolean6 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        long long4 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setMethod((-1));
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setLevel(0);
        boolean boolean10 = zipArchiveOutputStream1.finished;
        int int11 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
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
        java.io.OutputStream outputStream10 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream10.write(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray11, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
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
        java.io.File file35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry37 = zipArchiveOutputStream1.createArchiveEntry(file35, "");
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
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
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
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archive has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.destroy();
        boolean boolean8 = zipArchiveOutputStream1.finished;
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setEncoding("never");
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray9, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deflater6);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
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
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.destroy();
        java.util.zip.Deflater deflater9 = zipArchiveOutputStream1.def;
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveOutputStream1.createArchiveEntry(file10, "always");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(deflater9);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode8 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode8);
        boolean boolean10 = zipArchiveOutputStream1.isSeekable();
        boolean boolean11 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
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
        java.lang.String str22 = unicodeExtraFieldPolicy19.toString();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "always" + "'", str13, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "always" + "'", str22, "always");
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("never");
        java.lang.String str6 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        int int9 = zipArchiveOutputStream1.getCount();
        java.lang.String str10 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
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
        int int15 = zipArchiveOutputStream9.getCount();
        zipArchiveOutputStream9.setMethod((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream9.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deflater11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF8" + "'", str14, "UTF8");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry3);
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
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
        java.lang.String str17 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "never" + "'", str17, "never");
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream1.def;
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deflater6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.finished = true;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.writeZip64CentralDirectory();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        int int13 = zipArchiveOutputStream1.getCount();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.deflate();
        boolean boolean8 = zipArchiveOutputStream1.finished;
        java.lang.String str9 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
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
        java.lang.String str28 = unicodeExtraFieldPolicy19.toString();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "always" + "'", str28, "always");
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
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
        java.util.zip.Deflater deflater12 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long14 = zipArchiveOutputStream13.getBytesWritten();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertNotNull(deflater12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.flush();
        int int6 = zipArchiveOutputStream1.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.destroy();
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry13);
        java.util.zip.Deflater deflater15 = zipArchiveOutputStream1.def;
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(deflater15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        java.io.OutputStream outputStream11 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream11);
        zipArchiveOutputStream12.finished = true;
        zipArchiveOutputStream12.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy17 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str18 = unicodeExtraFieldPolicy17.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy17);
        zipArchiveOutputStream12.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode22 = null;
        zipArchiveOutputStream12.setUseZip64(zip64Mode22);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy24 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy24);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy24);
        java.lang.String str27 = unicodeExtraFieldPolicy24.toString();
        java.lang.String str28 = unicodeExtraFieldPolicy24.toString();
        java.lang.String str29 = unicodeExtraFieldPolicy24.toString();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "always" + "'", str18, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "always" + "'", str27, "always");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "always" + "'", str28, "always");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "always" + "'", str29, "always");
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        boolean boolean11 = zipArchiveOutputStream1.isSeekable();
        boolean boolean12 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
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
        java.util.zip.Deflater deflater30 = zipArchiveOutputStream1.def;
        int int31 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
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
        org.junit.Assert.assertNotNull(deflater30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
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
            zipArchiveOutputStream12.setEncoding("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = zipArchiveOutputStream1.createArchiveEntry(file5, "not encodeable");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.lang.String str3 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
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
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "always" + "'", str19, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.finished = false;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
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
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archive has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode7 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode7);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
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
        long long14 = zipArchiveOutputStream1.getBytesWritten();
        java.nio.channels.SeekableByteChannel seekableByteChannel15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel15);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream16);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream16.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        zipArchiveOutputStream16.deflate();
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream21);
        zipArchiveOutputStream22.destroy();
        zipArchiveOutputStream22.destroy();
        zipArchiveOutputStream22.setEncoding("never");
        java.io.OutputStream outputStream27 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream27);
        zipArchiveOutputStream28.finished = true;
        zipArchiveOutputStream28.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy33 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str34 = unicodeExtraFieldPolicy33.toString();
        zipArchiveOutputStream28.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy33);
        zipArchiveOutputStream28.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode38 = null;
        zipArchiveOutputStream28.setUseZip64(zip64Mode38);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy40 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream28.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy40);
        zipArchiveOutputStream22.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy40);
        zipArchiveOutputStream16.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy40);
        java.lang.String str44 = unicodeExtraFieldPolicy40.toString();
        java.lang.String str45 = unicodeExtraFieldPolicy40.toString();
        java.lang.String str46 = unicodeExtraFieldPolicy40.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy40);
        java.lang.String str48 = unicodeExtraFieldPolicy40.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy18);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "always" + "'", str34, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "always" + "'", str44, "always");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "always" + "'", str45, "always");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "always" + "'", str46, "always");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "always" + "'", str48, "always");
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
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
        boolean boolean23 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("");
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray12, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.util.zip.Deflater deflater8 = zipArchiveOutputStream7.def;
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream7.write(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deflater8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
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
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray12, 0, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        boolean boolean11 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream14);
        zipArchiveOutputStream15.finished = true;
        zipArchiveOutputStream15.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy20 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str21 = unicodeExtraFieldPolicy20.toString();
        zipArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy20);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream15);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream15);
        boolean boolean25 = zipArchiveOutputStream24.isSeekable();
        zipArchiveOutputStream24.setMethod((int) '#');
        java.nio.channels.SeekableByteChannel seekableByteChannel28 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel28);
        boolean boolean30 = zipArchiveOutputStream29.isSeekable();
        int int31 = zipArchiveOutputStream29.getCount();
        zipArchiveOutputStream29.flush();
        zipArchiveOutputStream29.setLevel((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream35 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream29);
        java.nio.channels.SeekableByteChannel seekableByteChannel36 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream37 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel36);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream38 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream37);
        boolean boolean39 = zipArchiveOutputStream38.isSeekable();
        boolean boolean40 = zipArchiveOutputStream38.finished;
        java.lang.String str41 = zipArchiveOutputStream38.getEncoding();
        zipArchiveOutputStream38.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy43 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str44 = unicodeExtraFieldPolicy43.toString();
        java.lang.String str45 = unicodeExtraFieldPolicy43.toString();
        zipArchiveOutputStream38.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy43);
        zipArchiveOutputStream29.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy43);
        zipArchiveOutputStream24.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy43);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy43);
        java.io.OutputStream outputStream50 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray51 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream50.write(byteArray51);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray51, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "always" + "'", str21, "always");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UTF8" + "'", str41, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "never" + "'", str44, "never");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "never" + "'", str45, "never");
        org.junit.Assert.assertNotNull(outputStream50);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
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
        zipArchiveOutputStream2.setComment("not encodeable");
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
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setLevel(1);
        int int9 = zipArchiveOutputStream1.getCount();
        java.lang.String str10 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
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
        zipArchiveOutputStream2.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeCentralFileHeader(zipArchiveEntry17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        long long8 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.flush();
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode8 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode8);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
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
        zipArchiveOutputStream2.deflate();
        int int14 = zipArchiveOutputStream2.getCount();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.flush();
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        boolean boolean8 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
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
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.writeOut(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
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
        boolean boolean13 = zipArchiveOutputStream1.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(deflater9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
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
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setMethod((int) (short) 0);
        long long17 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
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
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        boolean boolean18 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
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
        java.lang.String str15 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF8" + "'", str15, "UTF8");
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
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
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry34);
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
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setMethod((int) (byte) 100);
        zipArchiveOutputStream1.deflate();
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        int int6 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode7 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode7);
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        java.lang.String str7 = zipArchiveOutputStream1.getEncoding();
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
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
        boolean boolean23 = zipArchiveOutputStream1.isSeekable();
        boolean boolean24 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean8 = zipArchiveOutputStream1.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        java.util.zip.Deflater deflater3 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.deflate();
        int int5 = zipArchiveOutputStream1.getCount();
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
        org.junit.Assert.assertNotNull(deflater3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        long long8 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setComment("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = null;
        boolean boolean29 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry28);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream30.setLevel(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "always" + "'", str21, "always");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "always" + "'", str23, "always");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int5 = zipArchiveOutputStream4.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream4.writeLocalFileHeader(zipArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
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
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setComment("not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
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
        java.lang.String str25 = unicodeExtraFieldPolicy19.toString();
        java.lang.String str26 = unicodeExtraFieldPolicy19.toString();
        java.lang.String str27 = unicodeExtraFieldPolicy19.toString();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "always" + "'", str21, "always");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "always" + "'", str23, "always");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "always" + "'", str26, "always");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "always" + "'", str27, "always");
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.setLevel((-1));
        zipArchiveOutputStream1.setComment("not encodeable");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        java.io.InputStream inputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry12, inputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.nio.channels.SeekableByteChannel seekableByteChannel8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel8);
        long long10 = zipArchiveOutputStream9.getBytesWritten();
        int int11 = zipArchiveOutputStream9.getCount();
        zipArchiveOutputStream9.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream9.setComment("UTF8");
        zipArchiveOutputStream9.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str19 = unicodeExtraFieldPolicy18.toString();
        java.lang.String str20 = unicodeExtraFieldPolicy18.toString();
        zipArchiveOutputStream9.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        java.lang.String str23 = unicodeExtraFieldPolicy18.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "always" + "'", str19, "always");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "always" + "'", str20, "always");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "always" + "'", str23, "always");
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
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
        boolean boolean10 = zipArchiveOutputStream8.canWriteEntryData(archiveEntry9);
        boolean boolean11 = zipArchiveOutputStream8.isSeekable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
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
        zipArchiveOutputStream1.finished = false;
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean4 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.flush();
        boolean boolean8 = zipArchiveOutputStream1.finished;
        java.lang.String str9 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setLevel(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
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
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode24 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "always" + "'", str18, "always");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "always" + "'", str19, "always");
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream2.setUseZip64(zip64Mode5);
        zipArchiveOutputStream2.setLevel((int) (byte) 1);
        boolean boolean9 = zipArchiveOutputStream2.isSeekable();
        int int10 = zipArchiveOutputStream2.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.putArchiveEntry(archiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
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
            zipArchiveOutputStream14.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream10);
        zipArchiveOutputStream12.deflate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setMethod((int) (byte) 100);
        zipArchiveOutputStream1.deflate();
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        int int6 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode7 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode7);
        zipArchiveOutputStream1.setLevel((int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        java.io.InputStream inputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry11, inputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setMethod((int) (short) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
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
        int int14 = zipArchiveOutputStream1.getCount();
        java.lang.String str15 = zipArchiveOutputStream1.getEncoding();
        java.io.File file16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = zipArchiveOutputStream1.createArchiveEntry(file16, "");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "never" + "'", str15, "never");
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setComment("never");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
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
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
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
        int int12 = zipArchiveOutputStream2.getCount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.setLevel((int) (short) -1);
        zipArchiveOutputStream1.deflate();
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray14, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        int int8 = zipArchiveOutputStream1.getCount();
        java.lang.Class<?> wildcardClass9 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
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
        boolean boolean13 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = zipArchiveOutputStream1.createArchiveEntry(file7, "always");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
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
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        java.util.zip.Deflater deflater3 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.deflate();
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        int int6 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode9 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(deflater3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        java.lang.String str7 = zipArchiveOutputStream1.getEncoding();
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setMethod((int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        int int13 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setComment("always");
        int int16 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode17 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode17);
        boolean boolean19 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        java.util.zip.Deflater deflater5 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(deflater5);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.deflate();
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
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
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
        zipArchiveOutputStream1.setLevel((int) (short) -1);
        java.lang.String str19 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "always" + "'", str12, "always");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "always" + "'", str13, "always");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "always" + "'", str14, "always");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "always" + "'", str15, "always");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTF8" + "'", str19, "UTF8");
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode4 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode4);
        java.nio.channels.SeekableByteChannel seekableByteChannel6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel6);
        int int8 = zipArchiveOutputStream7.getCount();
        zipArchiveOutputStream7.setFallbackToUTF8(true);
        java.lang.String str11 = zipArchiveOutputStream7.getEncoding();
        zipArchiveOutputStream7.deflate();
        long long13 = zipArchiveOutputStream7.getBytesWritten();
        zipArchiveOutputStream7.flush();
        zipArchiveOutputStream7.setMethod((int) (short) 10);
        java.nio.channels.SeekableByteChannel seekableByteChannel17 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel17);
        boolean boolean19 = zipArchiveOutputStream18.isSeekable();
        boolean boolean20 = zipArchiveOutputStream18.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = null;
        boolean boolean22 = zipArchiveOutputStream18.canWriteEntryData(archiveEntry21);
        java.io.OutputStream outputStream23 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream23);
        zipArchiveOutputStream24.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy26 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream24.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy26);
        zipArchiveOutputStream18.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy26);
        java.lang.String str29 = unicodeExtraFieldPolicy26.toString();
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy26);
        java.lang.String str31 = unicodeExtraFieldPolicy26.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy26);
        zipArchiveOutputStream1.finished = false;
        java.io.File file35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry37 = zipArchiveOutputStream1.createArchiveEntry(file35, "UTF8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "always" + "'", str29, "always");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "always" + "'", str31, "always");
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode8 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode8);
        zipArchiveOutputStream1.flush();
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setMethod((int) ' ');
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
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = null;
        java.io.InputStream inputStream29 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry28, inputStream29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
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
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
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
        int int14 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry15);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
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
        java.lang.Class<?> wildcardClass13 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("never");
        boolean boolean11 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.deflate();
        java.io.OutputStream outputStream13 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream13.write(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray14, 512, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(outputStream13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setComment("UTF8");
        int int7 = zipArchiveOutputStream1.getCount();
        boolean boolean8 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.finished = false;
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
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
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archive has already been finished");
        } catch (java.io.IOException e) {
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
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.deflate();
        boolean boolean11 = zipArchiveOutputStream1.finished;
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("never");
        boolean boolean11 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.deflate();
        boolean boolean13 = zipArchiveOutputStream1.finished;
        java.io.File file14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = zipArchiveOutputStream1.createArchiveEntry(file14, "");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setMethod(0);
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray5, 2048, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
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
        zipArchiveOutputStream29.setMethod(100);
        zipArchiveOutputStream29.setMethod(100);
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
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
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
        long long26 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode27 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode27);
        long long29 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "always" + "'", str18, "always");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "always" + "'", str20, "always");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.finished = false;
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        java.io.InputStream inputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry12, inputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream6.def;
        java.lang.String str8 = zipArchiveOutputStream6.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.destroy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(deflater7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode4 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode4);
        java.nio.channels.SeekableByteChannel seekableByteChannel6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel6);
        int int8 = zipArchiveOutputStream7.getCount();
        zipArchiveOutputStream7.setFallbackToUTF8(true);
        java.lang.String str11 = zipArchiveOutputStream7.getEncoding();
        zipArchiveOutputStream7.deflate();
        long long13 = zipArchiveOutputStream7.getBytesWritten();
        zipArchiveOutputStream7.flush();
        zipArchiveOutputStream7.setMethod((int) (short) 10);
        java.nio.channels.SeekableByteChannel seekableByteChannel17 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel17);
        boolean boolean19 = zipArchiveOutputStream18.isSeekable();
        boolean boolean20 = zipArchiveOutputStream18.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = null;
        boolean boolean22 = zipArchiveOutputStream18.canWriteEntryData(archiveEntry21);
        java.io.OutputStream outputStream23 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream23);
        zipArchiveOutputStream24.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy26 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream24.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy26);
        zipArchiveOutputStream18.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy26);
        java.lang.String str29 = unicodeExtraFieldPolicy26.toString();
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy26);
        java.lang.String str31 = unicodeExtraFieldPolicy26.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy26);
        int int33 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry34 = null;
        boolean boolean35 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "always" + "'", str29, "always");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "always" + "'", str31, "always");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
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
        boolean boolean23 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        long long10 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        boolean boolean4 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.destroy();
        java.lang.String str6 = zipArchiveOutputStream1.getEncoding();
        java.lang.String str7 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setMethod(0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry7);
        zipArchiveOutputStream1.setMethod(100);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.deflate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
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
        boolean boolean13 = zipArchiveOutputStream2.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode14 = null;
        zipArchiveOutputStream2.setUseZip64(zip64Mode14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.finished = false;
        java.util.zip.Deflater deflater5 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deflater5);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setMethod((int) (short) 10);
        java.nio.channels.SeekableByteChannel seekableByteChannel11 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel11);
        boolean boolean13 = zipArchiveOutputStream12.isSeekable();
        boolean boolean14 = zipArchiveOutputStream12.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = zipArchiveOutputStream12.canWriteEntryData(archiveEntry15);
        java.io.OutputStream outputStream17 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream17);
        zipArchiveOutputStream18.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy20 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream18.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy20);
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy20);
        java.lang.String str23 = unicodeExtraFieldPolicy20.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy20);
        zipArchiveOutputStream1.finished = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "always" + "'", str23, "always");
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.writeDataDescriptor(zipArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deflater11);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry7);
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
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
        java.util.zip.Deflater deflater12 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(deflater12);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
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
            zipArchiveOutputStream2.writeLocalFileHeader(zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
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
        java.io.File file43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry45 = zipArchiveOutputStream1.createArchiveEntry(file43, "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
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
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        java.util.zip.Deflater deflater5 = zipArchiveOutputStream1.def;
        boolean boolean6 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setEncoding("always");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deflater5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.flush();
        boolean boolean13 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy34 = null;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy34);
        zipArchiveOutputStream1.deflate();
        java.io.OutputStream outputStream37 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream38 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream37);
        zipArchiveOutputStream38.flush();
        zipArchiveOutputStream38.destroy();
        java.io.OutputStream outputStream41 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream42 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream41);
        zipArchiveOutputStream42.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry45 = null;
        boolean boolean46 = zipArchiveOutputStream42.canWriteEntryData(archiveEntry45);
        zipArchiveOutputStream42.setEncoding("UTF8");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy49 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str50 = unicodeExtraFieldPolicy49.toString();
        zipArchiveOutputStream42.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy49);
        zipArchiveOutputStream38.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy49);
        zipArchiveOutputStream38.setFallbackToUTF8(false);
        java.io.OutputStream outputStream55 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream56 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream55);
        zipArchiveOutputStream56.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy58 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream56.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy58);
        java.lang.String str60 = unicodeExtraFieldPolicy58.toString();
        java.lang.String str61 = unicodeExtraFieldPolicy58.toString();
        zipArchiveOutputStream38.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy58);
        java.lang.String str63 = unicodeExtraFieldPolicy58.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy58);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTF8" + "'", str22, "UTF8");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "always" + "'", str29, "always");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "always" + "'", str31, "always");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "never" + "'", str50, "never");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "always" + "'", str60, "always");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "always" + "'", str61, "always");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "always" + "'", str63, "always");
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.String str10 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setComment("not encodeable");
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray13, 8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry38 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry38);
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
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setLevel((int) (byte) 0);
        zipArchiveOutputStream1.setMethod((int) (short) 10);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream7.writeOut(byteArray8, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream5.def;
        zipArchiveOutputStream5.setMethod((int) '4');
        java.util.zip.Deflater deflater9 = zipArchiveOutputStream5.def;
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertNotNull(deflater6);
        org.junit.Assert.assertNotNull(deflater9);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
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
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray12, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.Class<?> wildcardClass8 = zipArchiveOutputStream7.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean4 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry7);
        zipArchiveOutputStream1.deflate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean7 = zipArchiveOutputStream6.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
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
        java.lang.String str22 = zipArchiveOutputStream1.getEncoding();
        boolean boolean23 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "always" + "'", str18, "always");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "always" + "'", str19, "always");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTF8" + "'", str21, "UTF8");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTF8" + "'", str22, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        zipArchiveOutputStream2.finished = true;
        zipArchiveOutputStream2.setLevel((int) (byte) 0);
        zipArchiveOutputStream2.deflate();
        zipArchiveOutputStream2.setEncoding("always");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.destroy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
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
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray10, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "never" + "'", str8, "never");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        java.util.zip.Deflater deflater3 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy4 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str5 = unicodeExtraFieldPolicy4.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean8 = zipArchiveOutputStream7.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream7.write(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(deflater3);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "not encodeable" + "'", str5, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
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
        java.lang.String str19 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setMethod(10);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        long long23 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTF8" + "'", str19, "UTF8");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
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
        java.util.zip.Deflater deflater12 = zipArchiveOutputStream1.def;
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream13);
        zipArchiveOutputStream14.destroy();
        zipArchiveOutputStream14.setMethod((int) (byte) 10);
        long long18 = zipArchiveOutputStream14.getBytesWritten();
        java.io.OutputStream outputStream19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream19);
        zipArchiveOutputStream20.finished = true;
        zipArchiveOutputStream20.setLevel(1);
        zipArchiveOutputStream20.setMethod(100);
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
        java.lang.String str39 = unicodeExtraFieldPolicy35.toString();
        zipArchiveOutputStream20.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy35);
        java.lang.String str41 = unicodeExtraFieldPolicy35.toString();
        zipArchiveOutputStream14.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy35);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy35);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(deflater12);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "always" + "'", str37, "always");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "always" + "'", str39, "always");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "always" + "'", str41, "always");
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.destroy();
        java.util.zip.Deflater deflater9 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setMethod((int) '4');
        zipArchiveOutputStream1.destroy();
        java.nio.channels.SeekableByteChannel seekableByteChannel13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel13);
        int int15 = zipArchiveOutputStream14.getCount();
        zipArchiveOutputStream14.setFallbackToUTF8(true);
        zipArchiveOutputStream14.finished = true;
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream20);
        zipArchiveOutputStream21.finished = true;
        zipArchiveOutputStream21.deflate();
        java.io.OutputStream outputStream25 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream25);
        zipArchiveOutputStream26.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy28 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream26.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy28);
        java.lang.String str30 = unicodeExtraFieldPolicy28.toString();
        zipArchiveOutputStream21.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy28);
        zipArchiveOutputStream14.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy28);
        java.lang.String str33 = unicodeExtraFieldPolicy28.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy28);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(deflater9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "always" + "'", str30, "always");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "always" + "'", str33, "always");
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setLevel((-1));
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.util.zip.Deflater deflater10 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        java.io.InputStream inputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry11, inputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertNotNull(deflater10);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        zipArchiveOutputStream2.finished = true;
        zipArchiveOutputStream2.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.deflate();
        java.lang.String str9 = zipArchiveOutputStream1.getEncoding();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
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
        zipArchiveOutputStream1.deflate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        int int5 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setMethod((int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream8.writeZip64CentralDirectory();
        zipArchiveOutputStream8.finished = true;
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream8.write(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.setComment("UTF8");
        int int7 = zipArchiveOutputStream1.getCount();
        boolean boolean8 = zipArchiveOutputStream1.finished;
        int int9 = zipArchiveOutputStream1.getCount();
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.finished = false;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
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
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("never");
        java.lang.String str6 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
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
        zipArchiveOutputStream1.setComment("UTF8");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream15.setLevel((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
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
        zipArchiveOutputStream1.setMethod((-1));
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream15);
        zipArchiveOutputStream16.finished = true;
        zipArchiveOutputStream16.setLevel(1);
        zipArchiveOutputStream16.setMethod(100);
        java.io.OutputStream outputStream23 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream23);
        zipArchiveOutputStream24.finished = true;
        zipArchiveOutputStream24.deflate();
        java.io.OutputStream outputStream28 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream28);
        zipArchiveOutputStream29.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy31 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream29.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy31);
        java.lang.String str33 = unicodeExtraFieldPolicy31.toString();
        zipArchiveOutputStream24.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy31);
        java.lang.String str35 = unicodeExtraFieldPolicy31.toString();
        zipArchiveOutputStream16.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy31);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy31);
        java.lang.String str38 = unicodeExtraFieldPolicy31.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "always" + "'", str33, "always");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "always" + "'", str35, "always");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "always" + "'", str38, "always");
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setMethod((int) '4');
        zipArchiveOutputStream1.setComment("UTF8");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
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
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.flush();
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.setMethod(100);
        zipArchiveOutputStream1.setLevel((int) (byte) 0);
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
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        long long6 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setMethod(100);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode9 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode9);
        zipArchiveOutputStream1.setMethod(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setMethod((int) '#');
        java.nio.channels.SeekableByteChannel seekableByteChannel13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel13);
        long long15 = zipArchiveOutputStream14.getBytesWritten();
        int int16 = zipArchiveOutputStream14.getCount();
        zipArchiveOutputStream14.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream14.setComment("UTF8");
        zipArchiveOutputStream14.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy23 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str24 = unicodeExtraFieldPolicy23.toString();
        java.lang.String str25 = unicodeExtraFieldPolicy23.toString();
        zipArchiveOutputStream14.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy23);
        java.lang.String str27 = unicodeExtraFieldPolicy23.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy23);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "always" + "'", str24, "always");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "always" + "'", str25, "always");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "always" + "'", str27, "always");
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
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
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode4 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
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
        zipArchiveOutputStream2.finished = false;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.close();
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
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
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
        zipArchiveOutputStream1.finished = false;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        int int4 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream1.def;
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setEncoding("never");
        boolean boolean10 = zipArchiveOutputStream1.isSeekable();
        int int11 = zipArchiveOutputStream1.getCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deflater6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
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
        java.nio.channels.SeekableByteChannel seekableByteChannel14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel14);
        boolean boolean16 = zipArchiveOutputStream15.isSeekable();
        zipArchiveOutputStream15.flush();
        int int18 = zipArchiveOutputStream15.getCount();
        zipArchiveOutputStream15.flush();
        long long20 = zipArchiveOutputStream15.getBytesWritten();
        java.nio.channels.SeekableByteChannel seekableByteChannel21 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel21);
        int int23 = zipArchiveOutputStream22.getCount();
        zipArchiveOutputStream22.setFallbackToUTF8(true);
        zipArchiveOutputStream22.finished = true;
        zipArchiveOutputStream22.setLevel(0);
        zipArchiveOutputStream22.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream22.flush();
        java.io.OutputStream outputStream33 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream34 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream33);
        zipArchiveOutputStream34.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy36 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream34.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy36);
        java.lang.String str38 = unicodeExtraFieldPolicy36.toString();
        java.lang.String str39 = unicodeExtraFieldPolicy36.toString();
        java.lang.String str40 = unicodeExtraFieldPolicy36.toString();
        zipArchiveOutputStream22.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy36);
        zipArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy36);
        java.lang.String str43 = unicodeExtraFieldPolicy36.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy36);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "always" + "'", str9, "always");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "always" + "'", str38, "always");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "always" + "'", str39, "always");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "always" + "'", str40, "always");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "always" + "'", str43, "always");
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        boolean boolean5 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setMethod((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.close();
        int int9 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        zipArchiveOutputStream1.close();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "never" + "'", str11, "never");
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
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
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setMethod((int) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream7.flush();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setMethod(0);
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream10);
        java.lang.Class<?> wildcardClass13 = zipArchiveOutputStream10.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.flush();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.destroy();
        java.io.OutputStream outputStream11 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream11.write(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(outputStream11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.deflate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
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
        zipArchiveOutputStream1.setLevel((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        zipArchiveOutputStream2.finished = true;
        zipArchiveOutputStream2.setLevel((int) (byte) 0);
        zipArchiveOutputStream2.deflate();
        java.lang.Class<?> wildcardClass13 = zipArchiveOutputStream2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        long long4 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream4.setFallbackToUTF8(false);
        zipArchiveOutputStream4.deflate();
        java.util.zip.Deflater deflater8 = zipArchiveOutputStream4.def;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deflater8);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        int int7 = zipArchiveOutputStream1.getCount();
        long long8 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
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
        java.util.zip.Deflater deflater17 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(deflater17);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.setLevel((-1));
        zipArchiveOutputStream1.setComment("not encodeable");
        zipArchiveOutputStream1.close();
        boolean boolean13 = zipArchiveOutputStream1.isSeekable();
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray14, 512, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        int int5 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = zipArchiveOutputStream1.createArchiveEntry(file8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setComment("hi!");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
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
        java.util.zip.Deflater deflater12 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertNotNull(deflater12);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        java.io.OutputStream outputStream8 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream8.write(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray9, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputStream8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
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
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        java.util.zip.Deflater deflater3 = zipArchiveOutputStream1.def;
        zipArchiveOutputStream1.deflate();
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.Class<?> wildcardClass8 = zipArchiveOutputStream7.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(deflater3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.close();
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
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
        zipArchiveOutputStream1.setMethod((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
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
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode18 = null;
        zipArchiveOutputStream2.setUseZip64(zip64Mode18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
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
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.deflate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "always" + "'", str10, "always");
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry7);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deflater6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        java.util.zip.Deflater deflater5 = zipArchiveOutputStream1.def;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertNotNull(deflater5);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
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
        java.util.zip.Deflater deflater20 = zipArchiveOutputStream19.def;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertNotNull(deflater20);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.flush();
        long long8 = zipArchiveOutputStream1.getBytesWritten();
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray9, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
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
        java.lang.String str29 = zipArchiveOutputStream1.getEncoding();
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTF8" + "'", str29, "UTF8");
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        boolean boolean10 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean8 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
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
        java.io.OutputStream outputStream14 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream14.write(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray15, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(outputStream14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream3.setFallbackToUTF8(false);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        int int8 = zipArchiveOutputStream3.getCount();
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.writeOut(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
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
        long long15 = zipArchiveOutputStream1.getBytesWritten();
        long long16 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.finished = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
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
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.setComment("always");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = null;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream7.writeDataDescriptor(zipArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        java.util.zip.Deflater deflater5 = zipArchiveOutputStream1.def;
        boolean boolean6 = zipArchiveOutputStream1.finished;
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream7.write(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray8, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deflater5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
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
        java.util.zip.Deflater deflater16 = zipArchiveOutputStream15.def;
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertNotNull(deflater16);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setComment("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setEncoding("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        zipArchiveOutputStream1.setComment("not encodeable");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
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
        zipArchiveOutputStream1.finished = false;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "always" + "'", str14, "always");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
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
        java.lang.String str26 = zipArchiveOutputStream1.getEncoding();
        boolean boolean27 = zipArchiveOutputStream1.isSeekable();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "never" + "'", str26, "never");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        java.nio.channels.SeekableByteChannel seekableByteChannel6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel6);
        zipArchiveOutputStream7.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        boolean boolean7 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setComment("never");
        boolean boolean10 = zipArchiveOutputStream1.finished;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
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
        zipArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
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
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setComment("hi!");
        java.util.zip.Deflater deflater5 = zipArchiveOutputStream2.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream2.flush();
        zipArchiveOutputStream2.setComment("hi!");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deflater5);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
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
        java.lang.String str14 = zipArchiveOutputStream9.getEncoding();
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream9.writeOut(byteArray15, (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF8" + "'", str14, "UTF8");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        long long6 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setMethod(100);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode9 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode9);
        java.lang.Class<?> wildcardClass11 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
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
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setLevel((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setMethod((int) (byte) 100);
        int int8 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setComment("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream11.writeOut(byteArray12, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream11.destroy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(deflater10);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream4.writeZip64CentralDirectory();
        zipArchiveOutputStream4.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream4.addRawArchiveEntry(zipArchiveEntry8, inputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.destroy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        zipArchiveOutputStream2.finished = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.finished = true;
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.destroy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry14);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream13.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream2.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream9.setComment("always");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveOutputStream9.canWriteEntryData(archiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
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
        java.nio.channels.SeekableByteChannel seekableByteChannel15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel15);
        boolean boolean17 = zipArchiveOutputStream16.isSeekable();
        zipArchiveOutputStream16.flush();
        java.nio.channels.SeekableByteChannel seekableByteChannel19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel19);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream20);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy22 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream20.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        java.lang.String str24 = unicodeExtraFieldPolicy22.toString();
        zipArchiveOutputStream16.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        java.lang.String str27 = zipArchiveOutputStream12.getEncoding();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "always" + "'", str24, "always");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTF8" + "'", str27, "UTF8");
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream2.setUseZip64(zip64Mode5);
        java.lang.String str7 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
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
        int int14 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = null;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
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
        long long10 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream2.setUseZip64(zip64Mode5);
        zipArchiveOutputStream2.setLevel((int) (byte) 1);
        zipArchiveOutputStream2.writeZip64CentralDirectory();
        zipArchiveOutputStream2.deflate();
        java.io.OutputStream outputStream11 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream11);
        zipArchiveOutputStream12.finished = true;
        zipArchiveOutputStream12.deflate();
        zipArchiveOutputStream12.setComment("never");
        zipArchiveOutputStream12.setLevel(1);
        zipArchiveOutputStream12.setComment("never");
        zipArchiveOutputStream12.close();
        zipArchiveOutputStream12.setComment("UTF8");
        java.nio.channels.SeekableByteChannel seekableByteChannel25 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel25);
        boolean boolean27 = zipArchiveOutputStream26.isSeekable();
        java.util.zip.Deflater deflater28 = zipArchiveOutputStream26.def;
        zipArchiveOutputStream26.finished = false;
        java.nio.channels.SeekableByteChannel seekableByteChannel31 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel31);
        int int33 = zipArchiveOutputStream32.getCount();
        zipArchiveOutputStream32.setFallbackToUTF8(true);
        zipArchiveOutputStream32.finished = true;
        java.io.OutputStream outputStream38 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream39 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream38);
        zipArchiveOutputStream39.finished = true;
        zipArchiveOutputStream39.deflate();
        java.io.OutputStream outputStream43 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream44 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream43);
        zipArchiveOutputStream44.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy46 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream44.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy46);
        java.lang.String str48 = unicodeExtraFieldPolicy46.toString();
        zipArchiveOutputStream39.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy46);
        zipArchiveOutputStream32.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy46);
        zipArchiveOutputStream26.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy46);
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy46);
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy46);
        java.lang.String str54 = unicodeExtraFieldPolicy46.toString();
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(deflater28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "always" + "'", str48, "always");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "always" + "'", str54, "always");
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
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
        zipArchiveOutputStream10.destroy();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.write((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        long long4 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setComment("not encodeable");
        zipArchiveOutputStream1.destroy();
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
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
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        java.util.zip.Deflater deflater17 = zipArchiveOutputStream1.def;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "always" + "'", str12, "always");
        org.junit.Assert.assertNotNull(deflater17);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode4 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode4);
        zipArchiveOutputStream1.flush();
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream1.def;
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        java.lang.Class<?> wildcardClass8 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(deflater6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("never");
        boolean boolean11 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.deflate();
        boolean boolean13 = zipArchiveOutputStream1.finished;
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream14);
        zipArchiveOutputStream15.finished = true;
        zipArchiveOutputStream15.deflate();
        zipArchiveOutputStream15.setComment("never");
        zipArchiveOutputStream15.setLevel(1);
        zipArchiveOutputStream15.setComment("never");
        zipArchiveOutputStream15.close();
        java.nio.channels.SeekableByteChannel seekableByteChannel26 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel26);
        int int28 = zipArchiveOutputStream27.getCount();
        zipArchiveOutputStream27.setFallbackToUTF8(true);
        zipArchiveOutputStream27.finished = true;
        java.io.OutputStream outputStream33 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream34 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream33);
        zipArchiveOutputStream34.finished = true;
        zipArchiveOutputStream34.deflate();
        java.io.OutputStream outputStream38 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream39 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream38);
        zipArchiveOutputStream39.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy41 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream39.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy41);
        java.lang.String str43 = unicodeExtraFieldPolicy41.toString();
        zipArchiveOutputStream34.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy41);
        zipArchiveOutputStream27.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy41);
        java.lang.String str46 = unicodeExtraFieldPolicy41.toString();
        zipArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy41);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy41);
        zipArchiveOutputStream1.setEncoding("never");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "always" + "'", str43, "always");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "always" + "'", str46, "always");
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream2.setUseZip64(zip64Mode5);
        zipArchiveOutputStream2.setLevel((int) (byte) 1);
        zipArchiveOutputStream2.deflate();
        zipArchiveOutputStream2.setLevel((-1));
        java.io.File file12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = zipArchiveOutputStream2.createArchiveEntry(file12, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = null;
        java.io.InputStream inputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry14, inputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        long long4 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream8.flush();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setEncoding("always");
        zipArchiveOutputStream1.setMethod(1);
        java.lang.Class<?> wildcardClass10 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long10 = zipArchiveOutputStream9.getBytesWritten();
        java.util.zip.Deflater deflater11 = zipArchiveOutputStream9.def;
        zipArchiveOutputStream9.flush();
        zipArchiveOutputStream9.setComment("always");
        java.nio.channels.SeekableByteChannel seekableByteChannel15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel15);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream16);
        boolean boolean18 = zipArchiveOutputStream17.isSeekable();
        boolean boolean19 = zipArchiveOutputStream17.finished;
        java.lang.String str20 = zipArchiveOutputStream17.getEncoding();
        zipArchiveOutputStream17.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy22 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str23 = unicodeExtraFieldPolicy22.toString();
        java.lang.String str24 = unicodeExtraFieldPolicy22.toString();
        zipArchiveOutputStream17.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        zipArchiveOutputStream9.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        int int27 = zipArchiveOutputStream9.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deflater11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTF8" + "'", str20, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "never" + "'", str23, "never");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "never" + "'", str24, "never");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
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
        zipArchiveOutputStream1.finished = true;
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }
}

