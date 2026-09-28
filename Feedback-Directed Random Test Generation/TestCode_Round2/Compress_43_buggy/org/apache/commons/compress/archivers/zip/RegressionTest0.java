package org.apache.commons.compress.archivers.zip;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.String str0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DEFAULT_ENCODING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "UTF8" + "'", str0, "UTF8");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray4, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        int int0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EFS_FLAG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2048 + "'", int0 == 2048);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        byte[] byteArray3 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        int int0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.BUFFER_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 512 + "'", int0 == 512);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray3, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
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
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        java.util.zip.Deflater deflater3 = zipArchiveOutputStream1.def;
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray4, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(deflater3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        int int0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.STORED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray6, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) 10 });
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray8, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 });
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
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
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = zipArchiveOutputStream1.createArchiveEntry(file9, "UTF8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry2 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray6, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        java.util.zip.Deflater deflater3 = zipArchiveOutputStream1.def;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(deflater3);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.lang.String str3 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray9, 2048, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 10 });
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        java.io.File file4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = zipArchiveOutputStream1.createArchiveEntry(file4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deflater6);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.finished = false;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        java.lang.Class<?> wildcardClass5 = zipArchiveOutputStream2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 10 });
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray5, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
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
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeDataDescriptor(zipArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
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
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry2 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        int int0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DEFAULT_COMPRESSION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.lang.String str3 = zipArchiveOutputStream1.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        int int0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DEFLATED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray3, (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = zipArchiveOutputStream1.createArchiveEntry(file5, "always");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.lang.String str3 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = null;
        java.io.InputStream inputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry4, inputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        long long4 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
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
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.deflate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.deflate();
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray5, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
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
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = zipArchiveOutputStream1.createArchiveEntry(file3, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray6, 2048, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = null;
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry7, inputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
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
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray5, 512, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
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
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        long long4 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archive has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray7, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, (byte) 1 });
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = zipArchiveOutputStream1.createArchiveEntry(file6, "always");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.Class<?> wildcardClass3 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry5, inputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.io.File file4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = zipArchiveOutputStream3.createArchiveEntry(file4, "UTF8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.putArchiveEntry(archiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        boolean boolean5 = zipArchiveOutputStream1.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.writeOut(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        java.util.zip.Deflater deflater3 = zipArchiveOutputStream1.def;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(deflater3);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
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
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
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
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream1.def;
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
        org.junit.Assert.assertNotNull(deflater6);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.deflate();
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
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
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = zipArchiveOutputStream1.createArchiveEntry(file5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
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
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
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
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
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
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        java.io.File file4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = zipArchiveOutputStream1.createArchiveEntry(file4, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean5 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = null;
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry6, inputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        java.lang.Class<?> wildcardClass4 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        java.lang.Class<?> wildcardClass8 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = zipArchiveOutputStream2.createArchiveEntry(file5, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.lang.String str3 = zipArchiveOutputStream1.getEncoding();
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray4, (int) (short) 1, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.lang.String str3 = zipArchiveOutputStream1.getEncoding();
        java.io.File file4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = zipArchiveOutputStream1.createArchiveEntry(file4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.deflate();
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
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.flush();
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
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray9, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeLocalFileHeader(zipArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setComment("never");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeOut(byteArray5, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.writeLocalFileHeader(zipArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
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
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
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
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        boolean boolean6 = zipArchiveOutputStream1.finished;
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = zipArchiveOutputStream1.createArchiveEntry(file7, "never");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = null;
        java.io.InputStream inputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry4, inputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        boolean boolean4 = zipArchiveOutputStream2.finished;
        boolean boolean5 = zipArchiveOutputStream2.isSeekable();
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.flush();
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry8, inputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        boolean boolean8 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel(512);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 512");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
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
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.lang.String str3 = zipArchiveOutputStream1.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(1);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray6, (int) ' ', 512);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean5 = zipArchiveOutputStream1.isSeekable();
        byte[] byteArray7 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100 });
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray8, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray5, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        int int3 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setMethod(0);
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray9, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) -1, (byte) 0 });
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
            zipArchiveOutputStream1.setLevel((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
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
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry2 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry5, inputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
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
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray6, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray7, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode4 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode4);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.finished = true;
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray5, (int) (short) 10, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.deflate();
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        zipArchiveOutputStream1.flush();
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("never");
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
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
            zipArchiveOutputStream9.writeDataDescriptor(zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.deflate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
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
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeDataDescriptor(zipArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        int int3 = zipArchiveOutputStream1.getCount();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        long long4 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.Class<?> wildcardClass5 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setComment("never");
        java.lang.Class<?> wildcardClass6 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.Class<?> wildcardClass4 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("hi!");
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveOutputStream1.createArchiveEntry(file10, "UTF8");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setComment("");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.String str10 = zipArchiveOutputStream1.getEncoding();
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = zipArchiveOutputStream1.createArchiveEntry(file11, "always");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long10 = zipArchiveOutputStream9.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream9.write(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray5, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deflater4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.finished = false;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setComment("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = zipArchiveOutputStream1.createArchiveEntry(file5, "");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        java.lang.Class<?> wildcardClass9 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
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
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean9 = zipArchiveOutputStream1.finished;
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveOutputStream1.createArchiveEntry(file10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        boolean boolean6 = zipArchiveOutputStream1.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archive has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.writeOut(byteArray5, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeOut(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray10, 512, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 100 });
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
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
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream2.setUseZip64(zip64Mode5);
        zipArchiveOutputStream2.setLevel((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.deflate();
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.putArchiveEntry(archiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.putArchiveEntry(archiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setLevel(1);
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveOutputStream1.createArchiveEntry(file10, "not encodeable");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.lang.Class<?> wildcardClass5 = zipArchiveOutputStream3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        boolean boolean4 = zipArchiveOutputStream2.finished;
        boolean boolean5 = zipArchiveOutputStream2.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("not encodeable");
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray14, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("hi!");
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveOutputStream1.createArchiveEntry(file10, "never");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
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
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.util.zip.Deflater deflater8 = zipArchiveOutputStream1.def;
        java.lang.Class<?> wildcardClass9 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deflater8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream2.setUseZip64(zip64Mode5);
        java.lang.String str7 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.putArchiveEntry(archiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.destroy();
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
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        boolean boolean8 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setLevel((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
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
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        java.lang.Class<?> wildcardClass7 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        long long4 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
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
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setLevel(1);
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray9, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = zipArchiveOutputStream1.createArchiveEntry(file11, "UTF8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        int int4 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray11, (int) (byte) 100, 512);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = null;
        java.io.InputStream inputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry4, inputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean9 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.util.zip.Deflater deflater7 = zipArchiveOutputStream1.def;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater7);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archive has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "always" + "'", str10, "always");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        int int3 = zipArchiveOutputStream1.getCount();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray16, 512, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) -1, (byte) 10 });
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean9 = zipArchiveOutputStream1.finished;
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.writeOut(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.deflate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = null;
        java.io.InputStream inputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry4, inputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = null;
        java.io.InputStream inputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry4, inputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (short) 0);
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
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
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
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
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
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
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
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.deflate();
        java.lang.Class<?> wildcardClass3 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
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
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "always" + "'", str10, "always");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setEncoding("always");
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray10, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.flush();
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
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = zipArchiveOutputStream1.createArchiveEntry(file3, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        java.io.OutputStream outputStream12 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream12.write(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(outputStream12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream4.setMethod(10);
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = zipArchiveOutputStream4.createArchiveEntry(file7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        java.lang.Class<?> wildcardClass4 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray8, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy12);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 10, (byte) 0, (byte) 100 });
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.Class<?> wildcardClass6 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean4 = zipArchiveOutputStream3.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
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
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = null;
        java.io.InputStream inputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry4, inputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
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
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.deflate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry5, inputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setComment("never");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream4.setFallbackToUTF8(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream4.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
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
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        boolean boolean4 = zipArchiveOutputStream2.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.addRawArchiveEntry(zipArchiveEntry5, inputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 0 });
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        boolean boolean8 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        zipArchiveOutputStream1.setComment("not encodeable");
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
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
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
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean9 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
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
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream2.setFallbackToUTF8(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.destroy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.deflate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.deflate();
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
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean9 = zipArchiveOutputStream1.finished;
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveOutputStream1.createArchiveEntry(file10, "UTF8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        zipArchiveOutputStream1.flush();
        boolean boolean6 = zipArchiveOutputStream1.finished;
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
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
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        long long5 = zipArchiveOutputStream2.getBytesWritten();
        java.lang.Class<?> wildcardClass6 = zipArchiveOutputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.flush();
        java.lang.Class<?> wildcardClass8 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
            zipArchiveOutputStream1.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream2.setUseZip64(zip64Mode5);
        zipArchiveOutputStream2.setLevel((int) (byte) 1);
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = zipArchiveOutputStream2.createArchiveEntry(file9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray13, 512, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        boolean boolean7 = zipArchiveOutputStream2.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray7, 8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) -1, (byte) 100 });
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
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
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean9 = zipArchiveOutputStream1.finished;
        long long10 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.deflate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
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
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        boolean boolean4 = zipArchiveOutputStream1.finished;
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = zipArchiveOutputStream1.createArchiveEntry(file5, "always");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray7, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long7 = zipArchiveOutputStream6.getBytesWritten();
        zipArchiveOutputStream6.writeZip64CentralDirectory();
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.write(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        java.util.zip.Deflater deflater13 = zipArchiveOutputStream1.def;
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertNotNull(deflater13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        long long8 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str9 = zipArchiveOutputStream1.getEncoding();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.destroy();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode9 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode9);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        java.io.InputStream inputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry11, inputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        zipArchiveOutputStream2.setEncoding("never");
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeLocalFileHeader(zipArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
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
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry18);
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
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("not encodeable");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: not encodeable");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.deflate();
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setEncoding("never");
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setComment("not encodeable");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
            zipArchiveOutputStream12.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setComment("hi!");
        zipArchiveOutputStream1.flush();
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray11, (int) (byte) 1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(outputStream14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        boolean boolean8 = zipArchiveOutputStream1.isSeekable();
        java.lang.Class<?> wildcardClass9 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream2.setUseZip64(zip64Mode5);
        zipArchiveOutputStream2.setLevel((int) (byte) 1);
        zipArchiveOutputStream2.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.putArchiveEntry(archiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = zipArchiveOutputStream1.createArchiveEntry(file11, "not encodeable");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean13 = zipArchiveOutputStream12.finished;
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.writeOut(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry2 = null;
        java.io.InputStream inputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry2, inputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.finished = false;
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
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.finished = false;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel(512);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 512");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        long long9 = zipArchiveOutputStream1.getBytesWritten();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        java.io.OutputStream outputStream12 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream12.write(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(outputStream12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setMethod((int) (byte) 10);
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str6 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream4.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode8 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode8);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setComment("never");
        zipArchiveOutputStream1.setLevel(1);
        zipArchiveOutputStream1.setComment("never");
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
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
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
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        java.util.zip.Deflater deflater6 = zipArchiveOutputStream1.def;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deflater6);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray8, 512, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.String str10 = zipArchiveOutputStream1.getEncoding();
        java.io.OutputStream outputStream11 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream11.write(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
        org.junit.Assert.assertNotNull(outputStream11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("not encodeable");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: not encodeable");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode4 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode4);
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
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.finished;
        int int3 = zipArchiveOutputStream1.getCount();
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
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        long long5 = zipArchiveOutputStream2.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = null;
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.addRawArchiveEntry(zipArchiveEntry6, inputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        org.junit.Assert.assertNotNull(deflater8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
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
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        boolean boolean6 = zipArchiveOutputStream1.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
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
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream6.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.writeCentralFileHeader(zipArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        boolean boolean6 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setMethod((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        java.util.zip.Deflater deflater13 = zipArchiveOutputStream1.def;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertNotNull(deflater13);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray16, 2048, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 100 });
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream4.setFallbackToUTF8(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream4.destroy();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.Class<?> wildcardClass10 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry5, inputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray9, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream4.writeOut(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10 });
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("");
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
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.finished = true;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel(2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 2048");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        int int7 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.deflate();
        java.lang.Class<?> wildcardClass11 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        boolean boolean6 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream7.writeOut(byteArray8, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.util.zip.Deflater deflater5 = zipArchiveOutputStream1.def;
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deflater5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean5 = zipArchiveOutputStream1.isSeekable();
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
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.flush();
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
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        boolean boolean6 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setMethod((int) (short) -1);
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray9, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        boolean boolean9 = zipArchiveOutputStream1.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archive has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        int int7 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.deflate();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("not encodeable");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: not encodeable");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.destroy();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = null;
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry7, inputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        byte[] byteArray0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        java.lang.Class<?> wildcardClass1 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean4 = zipArchiveOutputStream1.finished;
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
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry8, inputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray8, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream9.write(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray10, 8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.finished;
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setComment("hi!");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.deflate();
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray5, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        int int8 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setLevel(0);
        java.lang.Class<?> wildcardClass12 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        java.lang.Class<?> wildcardClass7 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.destroy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
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
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
            zipArchiveOutputStream1.write((int) (short) 10);
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
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        boolean boolean4 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setLevel(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        int int9 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.io.OutputStream outputStream3 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream3.write(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray4, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("never");
        java.lang.Class<?> wildcardClass6 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.deflate();
        zipArchiveOutputStream1.flush();
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray7, 8, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
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
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream1.flush();
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
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        long long4 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setMethod((-1));
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = zipArchiveOutputStream1.createArchiveEntry(file7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream17.write(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray18, 100, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy13);
        org.junit.Assert.assertNotNull(outputStream17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        byte[] byteArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray12, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.close();
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
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setLevel(1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "always" + "'", str10, "always");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        java.io.InputStream inputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry13, inputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream2.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeCentralFileHeader(zipArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        int int7 = zipArchiveOutputStream1.getCount();
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
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.flush();
        java.lang.Class<?> wildcardClass7 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        byte[] byteArray22 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray22, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.flush();
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry5, inputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        int int2 = zipArchiveOutputStream1.getCount();
        boolean boolean3 = zipArchiveOutputStream1.finished;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode6 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode6);
        long long8 = zipArchiveOutputStream1.getBytesWritten();
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray9, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setComment("never");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        byte[] byteArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        boolean boolean8 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setLevel((int) (short) 1);
        zipArchiveOutputStream1.setComment("not encodeable");
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream29.close();
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
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.finished = false;
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream2.setUseZip64(zip64Mode5);
        java.lang.String str7 = zipArchiveOutputStream2.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int10 = zipArchiveOutputStream1.getCount();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralDirectoryEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        zipArchiveOutputStream1.setComment("");
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
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.finished = false;
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 7 });
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.destroy();
        zipArchiveOutputStream1.destroy();
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray8, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.util.zip.Deflater deflater5 = zipArchiveOutputStream3.def;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deflater5);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("");
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.lang.String str8 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
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
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.finished = true;
        int int9 = zipArchiveOutputStream1.getCount();
        int int10 = zipArchiveOutputStream1.getCount();
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream10.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        java.lang.Class<?> wildcardClass7 = zipArchiveOutputStream2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry13);
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
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray5, 512, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = zipArchiveOutputStream5.createArchiveEntry(file6, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream2.finished = true;
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
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.flush();
        long long6 = zipArchiveOutputStream1.getBytesWritten();
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 80, (byte) 75, (byte) 3, (byte) 4 });
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        zipArchiveOutputStream1.setLevel((-1));
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = null;
        java.io.InputStream inputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry10, inputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setComment("hi!");
        java.util.zip.Deflater deflater5 = zipArchiveOutputStream2.def;
        java.io.OutputStream outputStream6 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream6.write(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeOut(byteArray7, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deflater5);
        org.junit.Assert.assertNotNull(outputStream6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        java.lang.String str4 = zipArchiveOutputStream2.getEncoding();
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream2.setMethod((int) (byte) 10);
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.writeOut(byteArray9, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.destroy();
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream7);
        int int9 = zipArchiveOutputStream8.getCount();
        boolean boolean10 = zipArchiveOutputStream8.finished;
        java.nio.channels.SeekableByteChannel seekableByteChannel11 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel11);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy14);
        zipArchiveOutputStream8.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy14);
        java.lang.String str17 = unicodeExtraFieldPolicy14.toString();
        java.lang.String str18 = unicodeExtraFieldPolicy14.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy14);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "always" + "'", str18, "always");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = zipArchiveOutputStream1.createArchiveEntry(file5, "UTF8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.flush();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        java.io.File file16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = zipArchiveOutputStream1.createArchiveEntry(file16, "UTF8");
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
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setComment("never");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setComment("hi!");
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = zipArchiveOutputStream2.createArchiveEntry(file5, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry12);
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
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray21, (int) (short) 10, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "always" + "'", str18, "always");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "always" + "'", str19, "always");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray14, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeLocalFileHeader(zipArchiveEntry12);
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
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean3 = zipArchiveOutputStream2.isSeekable();
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray9, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100 });
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        java.util.zip.Deflater deflater3 = zipArchiveOutputStream1.def;
        java.lang.Class<?> wildcardClass4 = zipArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(deflater3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        zipArchiveOutputStream1.setComment("never");
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray6, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 80, (byte) 75, (byte) 1, (byte) 2 });
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = false;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        zipArchiveOutputStream1.setEncoding("UTF8");
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        boolean boolean9 = zipArchiveOutputStream1.finished;
        long long10 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeDataDescriptor(zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeCentralFileHeader(zipArchiveEntry3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
        java.io.OutputStream outputStream12 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG;
        outputStream12.write(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertNotNull(outputStream12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 80, (byte) 75, (byte) 5, (byte) 6 });
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setComment("");
        zipArchiveOutputStream2.setComment("hi!");
        boolean boolean7 = zipArchiveOutputStream2.finished;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.putArchiveEntry(archiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        long long4 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("not encodeable");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: not encodeable");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        int int3 = zipArchiveOutputStream1.getCount();
        java.util.zip.Deflater deflater4 = zipArchiveOutputStream1.def;
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = zipArchiveOutputStream1.createArchiveEntry(file5, "UTF8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(deflater4);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream2.setMethod((int) 'a');
        long long5 = zipArchiveOutputStream2.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setMethod((int) (byte) 100);
        java.io.OutputStream outputStream4 = java.io.OutputStream.nullOutputStream();
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        outputStream4.write(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray5, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int10 = zipArchiveOutputStream1.getCount();
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = zipArchiveOutputStream1.createArchiveEntry(file11, "not encodeable");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry5, inputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        boolean boolean6 = zipArchiveOutputStream1.finished;
        zipArchiveOutputStream1.setMethod((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream9.putArchiveEntry(archiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "always" + "'", str7, "always");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = null;
        java.io.InputStream inputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry4, inputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.writeZip64CentralDirectory();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 80, (byte) 75, (byte) 7, (byte) 8 });
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.finished = true;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.deflate();
        int int4 = zipArchiveOutputStream1.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.finished = true;
        int int4 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writeOut(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 80, (byte) 75, (byte) 6, (byte) 6 });
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.setEncoding("not encodeable");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: not encodeable");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        boolean boolean7 = zipArchiveOutputStream6.finished;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.writeCentralDirectoryEnd();
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
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.deflate();
        long long7 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode8 = null;
        zipArchiveOutputStream1.setUseZip64(zip64Mode8);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }
}

