package org.apache.commons.compress.archivers.tar;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        int int6 = tarArchiveOutputStream3.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream7.write((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 0, (int) 'a');
        tarArchiveOutputStream15.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, (int) (short) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, (int) (short) 10);
        tarArchiveOutputStream23.closeArchiveEntry();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer13);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        byte[] byteArray6 = new byte[] {};
        tarArchiveOutputStream5.write(byteArray6);
        tarArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream5.buffer;
        tarArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer11 = tarArchiveOutputStream5.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12);
        int int14 = tarArchiveOutputStream13.getRecordSize();
        java.io.OutputStream outputStream15 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream15, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream15, 0);
        byte[] byteArray21 = new byte[] {};
        tarArchiveOutputStream20.write(byteArray21);
        tarArchiveOutputStream20.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer24 = tarArchiveOutputStream20.buffer;
        tarArchiveOutputStream20.closeArchiveEntry();
        java.io.OutputStream outputStream26 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream26, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream26, 0);
        byte[] byteArray32 = new byte[] {};
        tarArchiveOutputStream31.write(byteArray32);
        tarArchiveOutputStream31.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer35 = tarArchiveOutputStream31.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream31, 2);
        tarArchiveOutputStream31.closeArchiveEntry();
        java.io.OutputStream outputStream39 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream42 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream39, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream44 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream39, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer45 = tarArchiveOutputStream44.buffer;
        java.io.OutputStream outputStream46 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream49 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream46, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream51 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream46, 0);
        byte[] byteArray52 = new byte[] {};
        outputStream46.write(byteArray52);
        tarArchiveOutputStream44.write(byteArray52);
        tarArchiveOutputStream31.write(byteArray52);
        tarArchiveOutputStream20.write(byteArray52);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream13.write(byteArray52, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '97' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer9);
        org.junit.Assert.assertNotNull(tarBuffer11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(outputStream15);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer24);
        org.junit.Assert.assertNotNull(outputStream26);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer35);
        org.junit.Assert.assertNotNull(outputStream39);
        org.junit.Assert.assertNotNull(tarBuffer45);
        org.junit.Assert.assertNotNull(outputStream46);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] {});
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 0);
        tarArchiveOutputStream15.closeArchiveEntry();
        tarArchiveOutputStream15.setLongFileMode((int) 'a');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer19 = tarArchiveOutputStream15.buffer;
        tarArchiveOutputStream15.closeArchiveEntry();
        tarArchiveOutputStream15.closeArchiveEntry();
        tarArchiveOutputStream15.closeArchiveEntry();
        java.io.File file23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry25 = tarArchiveOutputStream15.createArchiveEntry(file23, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer13);
        org.junit.Assert.assertNotNull(tarBuffer19);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream4.setLongFileMode((int) '#');
        tarArchiveOutputStream4.closeArchiveEntry();
        tarArchiveOutputStream4.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4, 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream4.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '10240' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 1, (int) '#');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer15 = tarArchiveOutputStream6.buffer;
        int int16 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 35 out of bounds for byte[10]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 0);
        tarArchiveOutputStream15.setLongFileMode((int) (byte) 0);
        int int18 = tarArchiveOutputStream15.getRecordSize();
        tarArchiveOutputStream15.setLongFileMode((int) '#');
        int int21 = tarArchiveOutputStream15.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, (int) '#', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream15.close();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 512 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 512 + "'", int21 == 512);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream7.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7, (int) ' ', 512);
        int int12 = tarArchiveOutputStream7.getRecordSize();
        int int13 = tarArchiveOutputStream7.getRecordSize();
        tarArchiveOutputStream7.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7, (int) (short) 0, (int) (short) 1);
        tarArchiveOutputStream7.flush();
        java.io.OutputStream outputStream19 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, 10, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream25, (int) (byte) 1, 512);
        java.io.OutputStream outputStream29 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream29, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream29, 10, (int) '#');
        tarArchiveOutputStream35.flush();
        java.io.OutputStream outputStream37 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream37, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream42 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream37, 0);
        byte[] byteArray43 = new byte[] {};
        tarArchiveOutputStream42.write(byteArray43);
        tarArchiveOutputStream42.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer46 = tarArchiveOutputStream42.buffer;
        tarArchiveOutputStream42.closeArchiveEntry();
        java.io.OutputStream outputStream48 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream51 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream48, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream53 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream48, 0);
        byte[] byteArray54 = new byte[] {};
        tarArchiveOutputStream53.write(byteArray54);
        tarArchiveOutputStream53.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer57 = tarArchiveOutputStream53.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream59 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream53, 2);
        tarArchiveOutputStream53.closeArchiveEntry();
        java.io.OutputStream outputStream61 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream64 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream61, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream66 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream61, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer67 = tarArchiveOutputStream66.buffer;
        java.io.OutputStream outputStream68 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream71 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream68, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream73 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream68, 0);
        byte[] byteArray74 = new byte[] {};
        outputStream68.write(byteArray74);
        tarArchiveOutputStream66.write(byteArray74);
        tarArchiveOutputStream53.write(byteArray74);
        tarArchiveOutputStream42.write(byteArray74);
        tarArchiveOutputStream35.write(byteArray74, (int) (byte) -1, 0);
        tarArchiveOutputStream28.write(byteArray74);
        tarArchiveOutputStream7.write(byteArray74);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry84 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream7.putArchiveEntry(archiveEntry84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertNotNull(outputStream19);
        org.junit.Assert.assertNotNull(outputStream29);
        org.junit.Assert.assertNotNull(outputStream37);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer46);
        org.junit.Assert.assertNotNull(outputStream48);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer57);
        org.junit.Assert.assertNotNull(outputStream61);
        org.junit.Assert.assertNotNull(tarBuffer67);
        org.junit.Assert.assertNotNull(outputStream68);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] {});
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 0, (int) 'a');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream18, (int) (short) 0, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22, 512, (int) (short) 100);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer13);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        int int9 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.setLongFileMode(2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream15.putArchiveEntry(archiveEntry16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        int int6 = tarArchiveOutputStream3.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream7.setLongFileMode((int) ' ');
        tarArchiveOutputStream7.setLongFileMode(2);
        tarArchiveOutputStream7.finish();
        java.io.OutputStream outputStream13 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13, (int) (byte) 0, (int) (byte) 1);
        java.io.OutputStream outputStream22 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream23 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream23, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream23, 0);
        byte[] byteArray29 = new byte[] {};
        outputStream23.write(byteArray29);
        outputStream22.write(byteArray29);
        tarArchiveOutputStream21.write(byteArray29);
        tarArchiveOutputStream21.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21, 2);
        java.io.OutputStream outputStream36 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream39 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream36, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream36, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer42 = tarArchiveOutputStream41.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer43 = tarArchiveOutputStream41.buffer;
        java.io.OutputStream outputStream44 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream47 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream44, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream49 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream44, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream44, (int) (byte) 0, (int) (byte) 1);
        java.io.OutputStream outputStream53 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream54 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream57 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream54, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream59 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream54, 0);
        byte[] byteArray60 = new byte[] {};
        outputStream54.write(byteArray60);
        outputStream53.write(byteArray60);
        tarArchiveOutputStream52.write(byteArray60);
        tarArchiveOutputStream41.write(byteArray60);
        tarArchiveOutputStream35.write(byteArray60);
        tarArchiveOutputStream7.write(byteArray60);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream67 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7);
        tarArchiveOutputStream7.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer69 = tarArchiveOutputStream7.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry70 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream7.putArchiveEntry(archiveEntry70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(outputStream13);
        org.junit.Assert.assertNotNull(outputStream22);
        org.junit.Assert.assertNotNull(outputStream23);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream36);
        org.junit.Assert.assertNotNull(tarBuffer42);
        org.junit.Assert.assertNotNull(tarBuffer43);
        org.junit.Assert.assertNotNull(outputStream44);
        org.junit.Assert.assertNotNull(outputStream53);
        org.junit.Assert.assertNotNull(outputStream54);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer69);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 32, (int) (byte) 100);
        tarArchiveOutputStream8.flush();
        java.io.OutputStream outputStream10 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, 0);
        byte[] byteArray16 = new byte[] {};
        tarArchiveOutputStream15.write(byteArray16);
        java.io.OutputStream outputStream18 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream19 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, 0);
        byte[] byteArray25 = new byte[] {};
        outputStream19.write(byteArray25);
        outputStream18.write(byteArray25);
        tarArchiveOutputStream15.write(byteArray25);
        tarArchiveOutputStream8.write(byteArray25);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, (int) 'a');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer32 = tarArchiveOutputStream8.buffer;
        int int33 = tarArchiveOutputStream8.getRecordSize();
        tarArchiveOutputStream8.closeArchiveEntry();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream18);
        org.junit.Assert.assertNotNull(outputStream19);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.setLongFileMode((int) (byte) 1);
        int int12 = tarArchiveOutputStream6.getRecordSize();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        byte[] byteArray6 = new byte[] {};
        tarArchiveOutputStream5.write(byteArray6);
        java.io.OutputStream outputStream8 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, 0);
        byte[] byteArray15 = new byte[] {};
        outputStream9.write(byteArray15);
        outputStream8.write(byteArray15);
        tarArchiveOutputStream5.write(byteArray15);
        tarArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 2);
        int int22 = tarArchiveOutputStream5.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream8);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 0, (int) 'a');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream18, (int) (short) 0, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21, (int) (short) 0, 100);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer25 = tarArchiveOutputStream24.buffer;
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer13);
        org.junit.Assert.assertNotNull(tarBuffer25);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream7.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7, (int) ' ', 512);
        tarArchiveOutputStream7.closeArchiveEntry();
        tarArchiveOutputStream7.setLongFileMode((int) (short) 10);
        tarArchiveOutputStream7.setLongFileMode((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream7.write(100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        int int6 = tarArchiveOutputStream3.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream3.setLongFileMode((int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream3.setLongFileMode((int) 'a');
        java.io.OutputStream outputStream13 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13, (int) (byte) 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13, (int) '#', 10);
        tarArchiveOutputStream24.close();
        java.io.OutputStream outputStream26 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream26, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream29, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream29, 32, (int) (byte) 100);
        java.io.OutputStream outputStream35 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream35, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream39 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream38);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer40 = tarArchiveOutputStream38.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream38, (int) (byte) 10, 35);
        tarArchiveOutputStream38.closeArchiveEntry();
        tarArchiveOutputStream38.closeArchiveEntry();
        java.io.OutputStream outputStream46 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream49 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream46, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream51 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream46, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer52 = tarArchiveOutputStream51.buffer;
        java.io.OutputStream outputStream53 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream56 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream53, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream58 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream53, 0);
        byte[] byteArray59 = new byte[] {};
        outputStream53.write(byteArray59);
        tarArchiveOutputStream51.write(byteArray59);
        tarArchiveOutputStream38.write(byteArray59);
        tarArchiveOutputStream29.write(byteArray59);
        tarArchiveOutputStream24.write(byteArray59);
        tarArchiveOutputStream3.write(byteArray59);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream66 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(outputStream13);
        org.junit.Assert.assertNotNull(outputStream26);
        org.junit.Assert.assertNotNull(outputStream35);
        org.junit.Assert.assertNotNull(tarBuffer40);
        org.junit.Assert.assertNotNull(outputStream46);
        org.junit.Assert.assertNotNull(tarBuffer52);
        org.junit.Assert.assertNotNull(outputStream53);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] {});
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11, 0, 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream11.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 512 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream12.setLongFileMode(512);
        tarArchiveOutputStream12.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12);
        tarArchiveOutputStream16.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream16);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (byte) 0);
        tarArchiveOutputStream3.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.putArchiveEntry(archiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (byte) 10, 35);
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, 0);
        byte[] byteArray15 = new byte[] {};
        tarArchiveOutputStream14.write(byteArray15);
        java.io.OutputStream outputStream17 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream18 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18, 0);
        byte[] byteArray24 = new byte[] {};
        outputStream18.write(byteArray24);
        outputStream17.write(byteArray24);
        tarArchiveOutputStream14.write(byteArray24);
        tarArchiveOutputStream3.write(byteArray24);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        int int30 = tarArchiveOutputStream3.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (byte) 1, 2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream33);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream34, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream34);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream34);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry39 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream34.putArchiveEntry(archiveEntry39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream17);
        org.junit.Assert.assertNotNull(outputStream18);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        byte[] byteArray6 = new byte[] {};
        tarArchiveOutputStream5.write(byteArray6);
        tarArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream5.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        tarArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14);
        tarArchiveOutputStream14.finish();
        java.io.OutputStream outputStream17 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream17, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream20);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer22 = tarArchiveOutputStream20.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream20, (int) (byte) 10, 35);
        tarArchiveOutputStream20.closeArchiveEntry();
        tarArchiveOutputStream20.closeArchiveEntry();
        java.io.OutputStream outputStream28 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream28, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream28, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer34 = tarArchiveOutputStream33.buffer;
        java.io.OutputStream outputStream35 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream35, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream35, 0);
        byte[] byteArray41 = new byte[] {};
        outputStream35.write(byteArray41);
        tarArchiveOutputStream33.write(byteArray41);
        tarArchiveOutputStream20.write(byteArray41);
        tarArchiveOutputStream14.write(byteArray41);
        tarArchiveOutputStream14.closeArchiveEntry();
        java.io.OutputStream outputStream47 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream50 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream47, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream53 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream47, 10, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream54 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream53);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream55 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream54);
        java.io.OutputStream outputStream56 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream59 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream56, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream62 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream56, 10, (int) '#');
        tarArchiveOutputStream62.flush();
        tarArchiveOutputStream62.setLongFileMode((int) (short) 0);
        int int66 = tarArchiveOutputStream62.getRecordSize();
        tarArchiveOutputStream62.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream70 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream62, 1, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream71 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream62);
        tarArchiveOutputStream71.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream73 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream71);
        java.io.OutputStream outputStream74 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream77 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream74, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream79 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream74, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer80 = tarArchiveOutputStream79.buffer;
        java.io.OutputStream outputStream81 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream84 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream81, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream86 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream81, 0);
        byte[] byteArray87 = new byte[] {};
        outputStream81.write(byteArray87);
        tarArchiveOutputStream79.write(byteArray87);
        tarArchiveOutputStream71.write(byteArray87);
        tarArchiveOutputStream54.write(byteArray87);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream14.write(byteArray87, 32, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '97' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer9);
        org.junit.Assert.assertNotNull(outputStream17);
        org.junit.Assert.assertNotNull(tarBuffer22);
        org.junit.Assert.assertNotNull(outputStream28);
        org.junit.Assert.assertNotNull(tarBuffer34);
        org.junit.Assert.assertNotNull(outputStream35);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream47);
        org.junit.Assert.assertNotNull(outputStream56);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 35 + "'", int66 == 35);
        org.junit.Assert.assertNotNull(outputStream74);
        org.junit.Assert.assertNotNull(tarBuffer80);
        org.junit.Assert.assertNotNull(outputStream81);
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] {});
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (byte) 100, 512);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 0, 52);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        java.io.OutputStream outputStream20 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream20, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream20, 10, (int) '#');
        tarArchiveOutputStream26.flush();
        tarArchiveOutputStream26.setLongFileMode((int) (short) 0);
        int int30 = tarArchiveOutputStream26.getRecordSize();
        tarArchiveOutputStream26.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream26);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer33 = tarArchiveOutputStream26.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream26, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream35, 0, (int) 'a');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream38, (int) (short) 0, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream42 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream41);
        tarArchiveOutputStream42.setLongFileMode((int) ' ');
        java.io.OutputStream outputStream45 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream48 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream45, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream50 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream45, 0);
        byte[] byteArray51 = new byte[] {};
        tarArchiveOutputStream50.write(byteArray51);
        tarArchiveOutputStream42.write(byteArray51);
        tarArchiveOutputStream6.write(byteArray51);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream55 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream55.setLongFileMode(512);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(outputStream20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNotNull(tarBuffer33);
        org.junit.Assert.assertNotNull(outputStream45);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (byte) 10, 35);
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, 0);
        byte[] byteArray15 = new byte[] {};
        tarArchiveOutputStream14.write(byteArray15);
        java.io.OutputStream outputStream17 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream18 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18, 0);
        byte[] byteArray24 = new byte[] {};
        outputStream18.write(byteArray24);
        outputStream17.write(byteArray24);
        tarArchiveOutputStream14.write(byteArray24);
        tarArchiveOutputStream3.write(byteArray24);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer30 = tarArchiveOutputStream29.buffer;
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream17);
        org.junit.Assert.assertNotNull(outputStream18);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer30);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream5.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream5.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream5.buffer;
        tarArchiveOutputStream5.setLongFileMode((int) 'a');
        int int11 = tarArchiveOutputStream5.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.write(97);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        byte[] byteArray6 = new byte[] {};
        tarArchiveOutputStream5.write(byteArray6);
        tarArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream5.buffer;
        tarArchiveOutputStream5.closeArchiveEntry();
        java.io.OutputStream outputStream11 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream11, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream11, 0);
        byte[] byteArray17 = new byte[] {};
        tarArchiveOutputStream16.write(byteArray17);
        tarArchiveOutputStream16.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer20 = tarArchiveOutputStream16.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream16, 2);
        tarArchiveOutputStream16.closeArchiveEntry();
        java.io.OutputStream outputStream24 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream24, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream24, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer30 = tarArchiveOutputStream29.buffer;
        java.io.OutputStream outputStream31 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream31, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream31, 0);
        byte[] byteArray37 = new byte[] {};
        outputStream31.write(byteArray37);
        tarArchiveOutputStream29.write(byteArray37);
        tarArchiveOutputStream16.write(byteArray37);
        tarArchiveOutputStream5.write(byteArray37);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream42 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        int int43 = tarArchiveOutputStream42.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer44 = tarArchiveOutputStream42.buffer;
        tarArchiveOutputStream42.finish();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream46 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream42);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream47 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream42);
        java.io.File file48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry50 = tarArchiveOutputStream47.createArchiveEntry(file48, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer9);
        org.junit.Assert.assertNotNull(outputStream11);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer20);
        org.junit.Assert.assertNotNull(outputStream24);
        org.junit.Assert.assertNotNull(tarBuffer30);
        org.junit.Assert.assertNotNull(outputStream31);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 512 + "'", int43 == 512);
        org.junit.Assert.assertNotNull(tarBuffer44);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        java.io.OutputStream outputStream12 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream12, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream17, (int) (byte) 10, 512);
        tarArchiveOutputStream17.setLongFileMode(52);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream17);
        tarArchiveOutputStream17.closeArchiveEntry();
        java.io.OutputStream outputStream25 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream25, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream25, 10, (int) '#');
        tarArchiveOutputStream31.flush();
        tarArchiveOutputStream31.setLongFileMode((int) (short) 0);
        int int35 = tarArchiveOutputStream31.getRecordSize();
        java.io.OutputStream outputStream36 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream39 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream36, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream36, 0);
        byte[] byteArray42 = new byte[] {};
        tarArchiveOutputStream41.write(byteArray42);
        tarArchiveOutputStream41.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer45 = tarArchiveOutputStream41.buffer;
        tarArchiveOutputStream41.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer47 = tarArchiveOutputStream41.buffer;
        java.io.OutputStream outputStream48 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream51 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream48, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream53 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream48, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream56 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream48, (int) (byte) 0, (int) (byte) 1);
        java.io.OutputStream outputStream57 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream58 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream61 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream58, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream63 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream58, 0);
        byte[] byteArray64 = new byte[] {};
        outputStream58.write(byteArray64);
        outputStream57.write(byteArray64);
        tarArchiveOutputStream56.write(byteArray64);
        tarArchiveOutputStream41.write(byteArray64);
        tarArchiveOutputStream31.write(byteArray64);
        tarArchiveOutputStream17.write(byteArray64);
        tarArchiveOutputStream6.write(byteArray64);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(outputStream12);
        org.junit.Assert.assertNotNull(outputStream25);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertNotNull(outputStream36);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer45);
        org.junit.Assert.assertNotNull(tarBuffer47);
        org.junit.Assert.assertNotNull(outputStream48);
        org.junit.Assert.assertNotNull(outputStream57);
        org.junit.Assert.assertNotNull(outputStream58);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] {});
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        int int6 = tarArchiveOutputStream3.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream8.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.putArchiveEntry(archiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(tarBuffer9);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream4.finish();
        tarArchiveOutputStream4.setLongFileMode((int) '#');
        tarArchiveOutputStream4.flush();
        tarArchiveOutputStream4.finish();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = tarArchiveOutputStream4.buffer;
        tarArchiveOutputStream4.finish();
        tarArchiveOutputStream4.setLongFileMode((int) '4');
        int int14 = tarArchiveOutputStream4.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream17.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '32' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer16 = tarArchiveOutputStream15.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream15.putArchiveEntry(archiveEntry17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer16);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 1, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream15.flush();
        tarArchiveOutputStream15.setLongFileMode((int) 'a');
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 1, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        java.io.OutputStream outputStream16 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream16, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream16, 10, (int) '#');
        tarArchiveOutputStream22.flush();
        tarArchiveOutputStream22.setLongFileMode((int) (short) 0);
        int int26 = tarArchiveOutputStream22.getRecordSize();
        tarArchiveOutputStream22.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22, 1, (int) '#');
        tarArchiveOutputStream22.flush();
        tarArchiveOutputStream22.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream33, 1, (int) (byte) 1);
        java.io.OutputStream outputStream37 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream37, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream37, 10, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream44 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream43);
        tarArchiveOutputStream44.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream48 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream44, (int) ' ', 512);
        int int49 = tarArchiveOutputStream44.getRecordSize();
        int int50 = tarArchiveOutputStream44.getRecordSize();
        tarArchiveOutputStream44.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream54 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream44, (int) (short) 0, (int) (short) 1);
        java.io.OutputStream outputStream55 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream56 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream59 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream56, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream61 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream56, 0);
        byte[] byteArray62 = new byte[] {};
        outputStream56.write(byteArray62);
        outputStream55.write(byteArray62);
        tarArchiveOutputStream54.write(byteArray62);
        tarArchiveOutputStream36.write(byteArray62);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.write(byteArray62, (int) (byte) 100, 512);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '512' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(outputStream16);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertNotNull(outputStream37);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 512 + "'", int49 == 512);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 512 + "'", int50 == 512);
        org.junit.Assert.assertNotNull(outputStream55);
        org.junit.Assert.assertNotNull(outputStream56);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] {});
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 0);
        tarArchiveOutputStream15.closeArchiveEntry();
        tarArchiveOutputStream15.setLongFileMode((int) 'a');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 0);
        java.io.OutputStream outputStream21 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream21, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream21, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream21, (int) (byte) 0, (int) (byte) 1);
        java.io.OutputStream outputStream30 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream31 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream31, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream31, 0);
        byte[] byteArray37 = new byte[] {};
        outputStream31.write(byteArray37);
        outputStream30.write(byteArray37);
        tarArchiveOutputStream29.write(byteArray37);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream29, 0, (int) (byte) 10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer44 = tarArchiveOutputStream29.buffer;
        tarArchiveOutputStream29.setLongFileMode((int) (short) -1);
        java.io.OutputStream outputStream47 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream50 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream47, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream47, 0);
        byte[] byteArray53 = new byte[] {};
        tarArchiveOutputStream52.write(byteArray53);
        tarArchiveOutputStream52.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer56 = tarArchiveOutputStream52.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream58 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream52, 2);
        tarArchiveOutputStream52.closeArchiveEntry();
        java.io.OutputStream outputStream60 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream63 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream60, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream65 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream60, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer66 = tarArchiveOutputStream65.buffer;
        java.io.OutputStream outputStream67 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream70 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream67, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream72 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream67, 0);
        byte[] byteArray73 = new byte[] {};
        outputStream67.write(byteArray73);
        tarArchiveOutputStream65.write(byteArray73);
        tarArchiveOutputStream52.write(byteArray73);
        tarArchiveOutputStream29.write(byteArray73);
        tarArchiveOutputStream15.write(byteArray73);
        tarArchiveOutputStream15.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream80 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer81 = tarArchiveOutputStream15.buffer;
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer13);
        org.junit.Assert.assertNotNull(outputStream21);
        org.junit.Assert.assertNotNull(outputStream30);
        org.junit.Assert.assertNotNull(outputStream31);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer44);
        org.junit.Assert.assertNotNull(outputStream47);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer56);
        org.junit.Assert.assertNotNull(outputStream60);
        org.junit.Assert.assertNotNull(tarBuffer66);
        org.junit.Assert.assertNotNull(outputStream67);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer81);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 32, (int) (byte) 100);
        tarArchiveOutputStream8.flush();
        java.io.OutputStream outputStream10 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, 0);
        byte[] byteArray16 = new byte[] {};
        tarArchiveOutputStream15.write(byteArray16);
        java.io.OutputStream outputStream18 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream19 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, 0);
        byte[] byteArray25 = new byte[] {};
        outputStream19.write(byteArray25);
        outputStream18.write(byteArray25);
        tarArchiveOutputStream15.write(byteArray25);
        tarArchiveOutputStream8.write(byteArray25);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, (int) 'a');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, 32);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '32' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream18);
        org.junit.Assert.assertNotNull(outputStream19);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) ' ');
        tarArchiveOutputStream2.setLongFileMode((int) (short) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 0, (int) (byte) 10);
        tarArchiveOutputStream7.setLongFileMode(0);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        byte[] byteArray6 = new byte[] {};
        tarArchiveOutputStream5.write(byteArray6);
        tarArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream5.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream12.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '10240' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer9);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        int int6 = tarArchiveOutputStream3.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream7.setLongFileMode((int) ' ');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = tarArchiveOutputStream7.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11, (int) (short) 100, 52);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11, (int) (byte) 100, (int) (byte) 10);
        tarArchiveOutputStream11.closeArchiveEntry();
        tarArchiveOutputStream11.closeArchiveEntry();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(tarBuffer10);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 10);
        java.io.OutputStream outputStream11 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream11, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream11, 10, (int) '#');
        tarArchiveOutputStream17.flush();
        tarArchiveOutputStream17.setLongFileMode((int) (short) 0);
        int int21 = tarArchiveOutputStream17.getRecordSize();
        tarArchiveOutputStream17.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream17, 0);
        java.io.OutputStream outputStream25 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream25, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream25, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer31 = tarArchiveOutputStream30.buffer;
        java.io.OutputStream outputStream32 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream32, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream32, 0);
        byte[] byteArray38 = new byte[] {};
        outputStream32.write(byteArray38);
        tarArchiveOutputStream30.write(byteArray38);
        tarArchiveOutputStream17.write(byteArray38);
        tarArchiveOutputStream6.write(byteArray38);
        java.io.File file43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry45 = tarArchiveOutputStream6.createArchiveEntry(file43, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNotNull(outputStream25);
        org.junit.Assert.assertNotNull(tarBuffer31);
        org.junit.Assert.assertNotNull(outputStream32);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, 10, (int) '#');
        tarArchiveOutputStream15.flush();
        tarArchiveOutputStream15.setLongFileMode((int) (short) 0);
        int int19 = tarArchiveOutputStream15.getRecordSize();
        tarArchiveOutputStream15.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 1, (int) '#');
        tarArchiveOutputStream15.flush();
        tarArchiveOutputStream15.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream26, 1, (int) (byte) 1);
        java.io.OutputStream outputStream30 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream30, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream30, 10, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream36);
        tarArchiveOutputStream37.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream37, (int) ' ', 512);
        int int42 = tarArchiveOutputStream37.getRecordSize();
        int int43 = tarArchiveOutputStream37.getRecordSize();
        tarArchiveOutputStream37.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream47 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream37, (int) (short) 0, (int) (short) 1);
        java.io.OutputStream outputStream48 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream49 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream49, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream54 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream49, 0);
        byte[] byteArray55 = new byte[] {};
        outputStream49.write(byteArray55);
        outputStream48.write(byteArray55);
        tarArchiveOutputStream47.write(byteArray55);
        tarArchiveOutputStream29.write(byteArray55);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.write(byteArray55, 1, 32);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '32' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(outputStream30);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 512 + "'", int42 == 512);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 512 + "'", int43 == 512);
        org.junit.Assert.assertNotNull(outputStream48);
        org.junit.Assert.assertNotNull(outputStream49);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream4.setLongFileMode((int) '#');
        tarArchiveOutputStream4.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer11 = tarArchiveOutputStream4.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream4.buffer;
        tarArchiveOutputStream4.setLongFileMode((int) (short) 0);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer11);
        org.junit.Assert.assertNotNull(tarBuffer12);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream5.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream5.buffer;
        tarArchiveOutputStream5.flush();
        tarArchiveOutputStream5.flush();
        java.io.OutputStream outputStream10 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream13, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, (int) (byte) 10, 512);
        java.io.OutputStream outputStream19 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer24 = tarArchiveOutputStream22.buffer;
        java.io.OutputStream outputStream25 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream25, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream28);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer30 = tarArchiveOutputStream28.buffer;
        tarArchiveOutputStream28.closeArchiveEntry();
        int int32 = tarArchiveOutputStream28.getRecordSize();
        int int33 = tarArchiveOutputStream28.getRecordSize();
        java.io.OutputStream outputStream34 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream34, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream39 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream37, (int) (byte) 1);
        int int40 = tarArchiveOutputStream37.getRecordSize();
        java.io.OutputStream outputStream41 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream44 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream41, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream46 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream41, 0);
        byte[] byteArray47 = new byte[] {};
        outputStream41.write(byteArray47);
        tarArchiveOutputStream37.write(byteArray47);
        tarArchiveOutputStream28.write(byteArray47, (int) (byte) 1, (int) (byte) -1);
        tarArchiveOutputStream22.write(byteArray47);
        tarArchiveOutputStream15.write(byteArray47);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.write(byteArray47, 35, 32);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '32' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(outputStream19);
        org.junit.Assert.assertNotNull(tarBuffer24);
        org.junit.Assert.assertNotNull(outputStream25);
        org.junit.Assert.assertNotNull(tarBuffer30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertNotNull(outputStream34);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
        org.junit.Assert.assertNotNull(outputStream41);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        int int9 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.setLongFileMode(2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer14 = tarArchiveOutputStream6.buffer;
        java.io.OutputStream outputStream15 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream15, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream15, 10, (int) '#');
        tarArchiveOutputStream21.flush();
        tarArchiveOutputStream21.setLongFileMode((int) (short) 0);
        int int25 = tarArchiveOutputStream21.getRecordSize();
        tarArchiveOutputStream21.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer28 = tarArchiveOutputStream21.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21);
        int int30 = tarArchiveOutputStream21.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21, (int) (byte) 1, 35);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream33, 100, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream33, (int) '#');
        java.io.OutputStream outputStream39 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream42 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream39, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream44 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream39, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream47 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream39, (int) (byte) 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream50 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream47, (int) ' ', 1);
        tarArchiveOutputStream50.setLongFileMode((int) ' ');
        tarArchiveOutputStream50.finish();
        java.io.OutputStream outputStream54 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream57 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream54, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream58 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream57);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer59 = tarArchiveOutputStream57.buffer;
        int int60 = tarArchiveOutputStream57.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream61 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream57);
        tarArchiveOutputStream61.setLongFileMode((int) ' ');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer64 = tarArchiveOutputStream61.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream65 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream61);
        tarArchiveOutputStream65.finish();
        java.io.OutputStream outputStream67 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream70 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream67, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream72 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream70, (int) (byte) 1);
        int int73 = tarArchiveOutputStream70.getRecordSize();
        java.io.OutputStream outputStream74 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream77 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream74, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream79 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream74, 0);
        byte[] byteArray80 = new byte[] {};
        outputStream74.write(byteArray80);
        tarArchiveOutputStream70.write(byteArray80);
        tarArchiveOutputStream65.write(byteArray80);
        tarArchiveOutputStream50.write(byteArray80, 1, 0);
        tarArchiveOutputStream38.write(byteArray80);
        tarArchiveOutputStream6.write(byteArray80);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream90 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (short) 1);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(tarBuffer14);
        org.junit.Assert.assertNotNull(outputStream15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertNotNull(tarBuffer28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNotNull(outputStream39);
        org.junit.Assert.assertNotNull(outputStream54);
        org.junit.Assert.assertNotNull(tarBuffer59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 32 + "'", int60 == 32);
        org.junit.Assert.assertNotNull(tarBuffer64);
        org.junit.Assert.assertNotNull(outputStream67);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 32 + "'", int73 == 32);
        org.junit.Assert.assertNotNull(outputStream74);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] {});
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 0);
        tarArchiveOutputStream15.setLongFileMode((int) (byte) 0);
        int int18 = tarArchiveOutputStream15.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, (int) (byte) 1);
        int int21 = tarArchiveOutputStream15.getRecordSize();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 512 + "'", int21 == 512);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 0);
        tarArchiveOutputStream15.closeArchiveEntry();
        tarArchiveOutputStream15.setLongFileMode((int) 'a');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer19 = tarArchiveOutputStream15.buffer;
        tarArchiveOutputStream15.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 35, (int) (byte) 1);
        tarArchiveOutputStream15.setLongFileMode(0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer26 = tarArchiveOutputStream15.buffer;
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer13);
        org.junit.Assert.assertNotNull(tarBuffer19);
        org.junit.Assert.assertNotNull(tarBuffer26);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (byte) 10, 35);
        tarArchiveOutputStream3.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream10.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream10.buffer;
        tarArchiveOutputStream10.finish();
        java.io.File file14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = tarArchiveOutputStream10.createArchiveEntry(file14, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertNotNull(tarBuffer12);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        tarArchiveOutputStream3.closeArchiveEntry();
        tarArchiveOutputStream3.closeArchiveEntry();
        tarArchiveOutputStream3.flush();
        tarArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = tarArchiveOutputStream3.buffer;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 32 out of bounds for byte[10]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertNotNull(tarBuffer10);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10);
        tarArchiveOutputStream2.setLongFileMode((-1));
        tarArchiveOutputStream2.setLongFileMode((int) (short) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 1, 52);
        java.io.OutputStream outputStream10 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, (int) (byte) 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, (int) '#', 10);
        int int22 = tarArchiveOutputStream21.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21);
        java.io.OutputStream outputStream24 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream24, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream27, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream27, 32, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream27, 32);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream27);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer36 = tarArchiveOutputStream35.buffer;
        java.io.OutputStream outputStream37 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream37, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream37, 10, (int) '#');
        tarArchiveOutputStream43.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream45 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream43);
        tarArchiveOutputStream43.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream47 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream43);
        java.io.OutputStream outputStream48 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream51 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream48, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream53 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream48, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream56 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream48, (int) (byte) 0, (int) (byte) 1);
        java.io.OutputStream outputStream57 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream58 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream61 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream58, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream63 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream58, 0);
        byte[] byteArray64 = new byte[] {};
        outputStream58.write(byteArray64);
        outputStream57.write(byteArray64);
        tarArchiveOutputStream56.write(byteArray64);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer68 = tarArchiveOutputStream56.buffer;
        java.io.OutputStream outputStream69 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream72 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream69, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream74 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream69, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer75 = tarArchiveOutputStream74.buffer;
        java.io.OutputStream outputStream76 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream79 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream76, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream81 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream76, 0);
        byte[] byteArray82 = new byte[] {};
        outputStream76.write(byteArray82);
        tarArchiveOutputStream74.write(byteArray82);
        tarArchiveOutputStream56.write(byteArray82);
        tarArchiveOutputStream43.write(byteArray82, (int) (short) 0, (int) (short) 0);
        tarArchiveOutputStream35.write(byteArray82);
        tarArchiveOutputStream23.write(byteArray82);
        tarArchiveOutputStream2.write(byteArray82);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(outputStream24);
        org.junit.Assert.assertNotNull(tarBuffer36);
        org.junit.Assert.assertNotNull(outputStream37);
        org.junit.Assert.assertNotNull(outputStream48);
        org.junit.Assert.assertNotNull(outputStream57);
        org.junit.Assert.assertNotNull(outputStream58);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer68);
        org.junit.Assert.assertNotNull(outputStream69);
        org.junit.Assert.assertNotNull(tarBuffer75);
        org.junit.Assert.assertNotNull(outputStream76);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] {});
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream7.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7, (int) (byte) 100, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream7.buffer;
        byte[] byteArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream7.write(byteArray13, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer12);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11, 0, 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14);
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream5.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream5.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream5.buffer;
        tarArchiveOutputStream5.setLongFileMode((int) '#');
        java.io.OutputStream outputStream11 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream11, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream11, 10, (int) '#');
        tarArchiveOutputStream17.flush();
        tarArchiveOutputStream17.setLongFileMode((int) (short) 0);
        int int21 = tarArchiveOutputStream17.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream17, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream17, (int) (byte) 100, 512);
        java.io.OutputStream outputStream27 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream27, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream27, 0);
        byte[] byteArray33 = new byte[] {};
        tarArchiveOutputStream32.write(byteArray33);
        tarArchiveOutputStream32.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer36 = tarArchiveOutputStream32.buffer;
        tarArchiveOutputStream32.closeArchiveEntry();
        java.io.OutputStream outputStream38 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream38, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream38, 0);
        byte[] byteArray44 = new byte[] {};
        tarArchiveOutputStream43.write(byteArray44);
        tarArchiveOutputStream43.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer47 = tarArchiveOutputStream43.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream49 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream43, 2);
        tarArchiveOutputStream43.closeArchiveEntry();
        java.io.OutputStream outputStream51 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream54 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream51, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream56 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream51, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer57 = tarArchiveOutputStream56.buffer;
        java.io.OutputStream outputStream58 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream61 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream58, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream63 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream58, 0);
        byte[] byteArray64 = new byte[] {};
        outputStream58.write(byteArray64);
        tarArchiveOutputStream56.write(byteArray64);
        tarArchiveOutputStream43.write(byteArray64);
        tarArchiveOutputStream32.write(byteArray64);
        tarArchiveOutputStream26.write(byteArray64);
        tarArchiveOutputStream5.write(byteArray64);
        int int71 = tarArchiveOutputStream5.getRecordSize();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertNotNull(outputStream11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNotNull(outputStream27);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer36);
        org.junit.Assert.assertNotNull(outputStream38);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer47);
        org.junit.Assert.assertNotNull(outputStream51);
        org.junit.Assert.assertNotNull(tarBuffer57);
        org.junit.Assert.assertNotNull(outputStream58);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] {});
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 512 + "'", int71 == 512);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        byte[] byteArray6 = new byte[] {};
        tarArchiveOutputStream5.write(byteArray6);
        tarArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream5.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 35);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream13, (int) 'a');
        java.io.File file16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = tarArchiveOutputStream15.createArchiveEntry(file16, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer9);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11, 2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer16 = tarArchiveOutputStream11.buffer;
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer16);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 0);
        int int16 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 512);
        tarArchiveOutputStream6.setLongFileMode((int) (byte) 10);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        byte[] byteArray6 = new byte[] {};
        tarArchiveOutputStream5.write(byteArray6);
        java.io.OutputStream outputStream8 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, 0);
        byte[] byteArray15 = new byte[] {};
        outputStream9.write(byteArray15);
        outputStream8.write(byteArray15);
        tarArchiveOutputStream5.write(byteArray15);
        tarArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        int int21 = tarArchiveOutputStream5.getRecordSize();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream8);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 512 + "'", int21 == 512);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.putArchiveEntry(archiveEntry17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream7.buffer;
        tarArchiveOutputStream7.setLongFileMode(512);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream7.write(35);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer12);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, 2);
        java.io.OutputStream outputStream4 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream4, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream7.buffer;
        int int10 = tarArchiveOutputStream7.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7);
        tarArchiveOutputStream7.setLongFileMode((int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7);
        tarArchiveOutputStream7.setLongFileMode((int) 'a');
        java.io.OutputStream outputStream17 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream17, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream17, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream17, (int) (byte) 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream17, (int) '#', 10);
        tarArchiveOutputStream28.close();
        java.io.OutputStream outputStream30 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream30, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream33, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream33, 32, (int) (byte) 100);
        java.io.OutputStream outputStream39 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream42 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream39, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream42);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer44 = tarArchiveOutputStream42.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream47 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream42, (int) (byte) 10, 35);
        tarArchiveOutputStream42.closeArchiveEntry();
        tarArchiveOutputStream42.closeArchiveEntry();
        java.io.OutputStream outputStream50 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream53 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream50, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream55 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream50, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer56 = tarArchiveOutputStream55.buffer;
        java.io.OutputStream outputStream57 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream60 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream57, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream62 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream57, 0);
        byte[] byteArray63 = new byte[] {};
        outputStream57.write(byteArray63);
        tarArchiveOutputStream55.write(byteArray63);
        tarArchiveOutputStream42.write(byteArray63);
        tarArchiveOutputStream33.write(byteArray63);
        tarArchiveOutputStream28.write(byteArray63);
        tarArchiveOutputStream7.write(byteArray63);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.write(byteArray63, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '10' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream4);
        org.junit.Assert.assertNotNull(tarBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(outputStream17);
        org.junit.Assert.assertNotNull(outputStream30);
        org.junit.Assert.assertNotNull(outputStream39);
        org.junit.Assert.assertNotNull(tarBuffer44);
        org.junit.Assert.assertNotNull(outputStream50);
        org.junit.Assert.assertNotNull(tarBuffer56);
        org.junit.Assert.assertNotNull(outputStream57);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] {});
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 0, (int) 'a');
        java.io.OutputStream outputStream19 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, (int) (byte) 0, (int) (byte) 1);
        java.io.OutputStream outputStream28 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream29 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream29, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream29, 0);
        byte[] byteArray35 = new byte[] {};
        outputStream29.write(byteArray35);
        outputStream28.write(byteArray35);
        tarArchiveOutputStream27.write(byteArray35);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer39 = tarArchiveOutputStream27.buffer;
        java.io.OutputStream outputStream40 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream40, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream45 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream40, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer46 = tarArchiveOutputStream45.buffer;
        java.io.OutputStream outputStream47 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream50 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream47, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream47, 0);
        byte[] byteArray53 = new byte[] {};
        outputStream47.write(byteArray53);
        tarArchiveOutputStream45.write(byteArray53);
        tarArchiveOutputStream27.write(byteArray53);
        tarArchiveOutputStream15.write(byteArray53);
        tarArchiveOutputStream15.setLongFileMode((int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream61 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 35);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer13);
        org.junit.Assert.assertNotNull(outputStream19);
        org.junit.Assert.assertNotNull(outputStream28);
        org.junit.Assert.assertNotNull(outputStream29);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer39);
        org.junit.Assert.assertNotNull(outputStream40);
        org.junit.Assert.assertNotNull(tarBuffer46);
        org.junit.Assert.assertNotNull(outputStream47);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 0, (int) (byte) 1);
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream10 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, 0);
        byte[] byteArray16 = new byte[] {};
        outputStream10.write(byteArray16);
        outputStream9.write(byteArray16);
        tarArchiveOutputStream8.write(byteArray16);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, (int) ' ', 100);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer23 = tarArchiveOutputStream8.buffer;
        tarArchiveOutputStream8.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, (int) 'a', 52);
        java.io.OutputStream outputStream28 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream28, (int) (short) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream28, (int) '#', (int) '#');
        java.io.OutputStream outputStream34 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream34, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream34, 10, (int) '#');
        tarArchiveOutputStream40.flush();
        tarArchiveOutputStream40.setLongFileMode((int) (short) 0);
        int int44 = tarArchiveOutputStream40.getRecordSize();
        tarArchiveOutputStream40.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream46 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream40);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer47 = tarArchiveOutputStream40.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream49 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream40, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream49, 0, (int) 'a');
        java.io.OutputStream outputStream53 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream56 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream53, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream58 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream53, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream61 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream53, (int) (byte) 0, (int) (byte) 1);
        java.io.OutputStream outputStream62 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream63 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream66 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream63, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream68 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream63, 0);
        byte[] byteArray69 = new byte[] {};
        outputStream63.write(byteArray69);
        outputStream62.write(byteArray69);
        tarArchiveOutputStream61.write(byteArray69);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer73 = tarArchiveOutputStream61.buffer;
        java.io.OutputStream outputStream74 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream77 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream74, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream79 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream74, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer80 = tarArchiveOutputStream79.buffer;
        java.io.OutputStream outputStream81 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream84 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream81, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream86 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream81, 0);
        byte[] byteArray87 = new byte[] {};
        outputStream81.write(byteArray87);
        tarArchiveOutputStream79.write(byteArray87);
        tarArchiveOutputStream61.write(byteArray87);
        tarArchiveOutputStream49.write(byteArray87);
        tarArchiveOutputStream33.write(byteArray87, 35, 0);
        tarArchiveOutputStream8.write(byteArray87);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer23);
        org.junit.Assert.assertNotNull(outputStream34);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
        org.junit.Assert.assertNotNull(tarBuffer47);
        org.junit.Assert.assertNotNull(outputStream53);
        org.junit.Assert.assertNotNull(outputStream62);
        org.junit.Assert.assertNotNull(outputStream63);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer73);
        org.junit.Assert.assertNotNull(outputStream74);
        org.junit.Assert.assertNotNull(tarBuffer80);
        org.junit.Assert.assertNotNull(outputStream81);
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] {});
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 0, 2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 10, 2);
        tarArchiveOutputStream6.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 2 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 1, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14, (int) (short) 1, (int) '4');
        tarArchiveOutputStream14.flush();
        java.io.OutputStream outputStream19 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer24 = tarArchiveOutputStream22.buffer;
        int int25 = tarArchiveOutputStream22.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        tarArchiveOutputStream26.setLongFileMode((int) ' ');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer29 = tarArchiveOutputStream26.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream26);
        tarArchiveOutputStream30.finish();
        tarArchiveOutputStream30.setLongFileMode(2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream30);
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) 10 };
        tarArchiveOutputStream30.write(byteArray41, (int) (byte) 1, (int) (short) -1);
        tarArchiveOutputStream14.write(byteArray41, (int) '4', (-1));
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream50 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14, (int) '4', (int) (short) 100);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer51 = tarArchiveOutputStream14.buffer;
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(outputStream19);
        org.junit.Assert.assertNotNull(tarBuffer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNotNull(tarBuffer29);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(tarBuffer51);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 32, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 32);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream11.setLongFileMode(512);
        int int14 = tarArchiveOutputStream11.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer15 = tarArchiveOutputStream11.buffer;
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(tarBuffer15);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 512, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, (int) (byte) 10, 512);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, (int) (short) 1);
        java.lang.Class<?> wildcardClass12 = tarArchiveOutputStream5.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 0, (int) 'a');
        int int19 = tarArchiveOutputStream15.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, (int) 'a', 10);
        tarArchiveOutputStream22.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22, (int) (short) 0);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (byte) 10, 35);
        tarArchiveOutputStream3.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer11 = tarArchiveOutputStream3.buffer;
        java.io.OutputStream outputStream12 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream12, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer17 = tarArchiveOutputStream15.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, (int) (byte) 10, 35);
        tarArchiveOutputStream15.closeArchiveEntry();
        java.io.OutputStream outputStream22 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream22, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream25);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer27 = tarArchiveOutputStream25.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream25, (int) (byte) 10, 35);
        java.io.OutputStream outputStream31 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream31, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream31, 0);
        byte[] byteArray37 = new byte[] {};
        tarArchiveOutputStream36.write(byteArray37);
        java.io.OutputStream outputStream39 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream40 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream40, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream45 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream40, 0);
        byte[] byteArray46 = new byte[] {};
        outputStream40.write(byteArray46);
        outputStream39.write(byteArray46);
        tarArchiveOutputStream36.write(byteArray46);
        tarArchiveOutputStream25.write(byteArray46);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream51 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream25);
        tarArchiveOutputStream51.setLongFileMode((int) (short) 1);
        java.io.OutputStream outputStream54 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream57 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream54, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream59 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream54, 0);
        byte[] byteArray60 = new byte[] {};
        outputStream54.write(byteArray60);
        tarArchiveOutputStream51.write(byteArray60);
        tarArchiveOutputStream15.write(byteArray60);
        tarArchiveOutputStream3.write(byteArray60);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream67 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (short) 1, (int) '4');
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertNotNull(tarBuffer11);
        org.junit.Assert.assertNotNull(outputStream12);
        org.junit.Assert.assertNotNull(tarBuffer17);
        org.junit.Assert.assertNotNull(outputStream22);
        org.junit.Assert.assertNotNull(tarBuffer27);
        org.junit.Assert.assertNotNull(outputStream31);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream39);
        org.junit.Assert.assertNotNull(outputStream40);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream54);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] {});
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (byte) 100, 512);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        int int17 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) '4', (int) ' ');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer21 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (short) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, (int) (short) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, (int) '4', (int) (short) 100);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertNotNull(tarBuffer21);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 1, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14, (int) (short) 1, (int) '4');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14, (int) (short) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream19, (int) (byte) 0, 32);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream22.close();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 32 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream5.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream5.buffer;
        int int8 = tarArchiveOutputStream5.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream5.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream13, 0);
        tarArchiveOutputStream13.setLongFileMode(10);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertNotNull(tarBuffer9);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 32, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 32);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream11.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11, 52, 32);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 0);
        java.io.File file18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = tarArchiveOutputStream15.createArchiveEntry(file18, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer12);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        int int6 = tarArchiveOutputStream3.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream7.setLongFileMode((int) ' ');
        tarArchiveOutputStream7.setLongFileMode(2);
        tarArchiveOutputStream7.finish();
        tarArchiveOutputStream7.finish();
        tarArchiveOutputStream7.flush();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7, 0, 35);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7);
        tarArchiveOutputStream12.finish();
        tarArchiveOutputStream12.finish();
        tarArchiveOutputStream12.closeArchiveEntry();
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (byte) 0, 512);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12);
        int int14 = tarArchiveOutputStream13.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream13, 10, 2);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        byte[] byteArray6 = new byte[] {};
        tarArchiveOutputStream5.write(byteArray6);
        java.io.OutputStream outputStream8 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, 0);
        byte[] byteArray15 = new byte[] {};
        outputStream9.write(byteArray15);
        outputStream8.write(byteArray15);
        tarArchiveOutputStream5.write(byteArray15);
        java.io.OutputStream outputStream19 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer25 = tarArchiveOutputStream24.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer26 = tarArchiveOutputStream24.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer27 = tarArchiveOutputStream24.buffer;
        tarArchiveOutputStream24.flush();
        java.io.OutputStream outputStream29 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream29, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream29, 0);
        byte[] byteArray35 = new byte[] {};
        tarArchiveOutputStream34.write(byteArray35);
        java.io.OutputStream outputStream37 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream38 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream38, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream38, 0);
        byte[] byteArray44 = new byte[] {};
        outputStream38.write(byteArray44);
        outputStream37.write(byteArray44);
        tarArchiveOutputStream34.write(byteArray44);
        tarArchiveOutputStream24.write(byteArray44);
        tarArchiveOutputStream5.write(byteArray44);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 0, (int) 'a');
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream8);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream19);
        org.junit.Assert.assertNotNull(tarBuffer25);
        org.junit.Assert.assertNotNull(tarBuffer26);
        org.junit.Assert.assertNotNull(tarBuffer27);
        org.junit.Assert.assertNotNull(outputStream29);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream37);
        org.junit.Assert.assertNotNull(outputStream38);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 0, (int) (byte) 1);
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream10 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, 0);
        byte[] byteArray16 = new byte[] {};
        outputStream10.write(byteArray16);
        outputStream9.write(byteArray16);
        tarArchiveOutputStream8.write(byteArray16);
        tarArchiveOutputStream8.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, 2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22, 35);
        int int25 = tarArchiveOutputStream22.getRecordSize();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 0);
        tarArchiveOutputStream15.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15);
        java.lang.Class<?> wildcardClass18 = tarArchiveOutputStream17.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream4.setLongFileMode((int) '#');
        tarArchiveOutputStream4.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4, (int) ' ', 52);
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, (int) (byte) 10, 512);
        tarArchiveOutputStream5.setLongFileMode(52);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        tarArchiveOutputStream12.setLongFileMode(2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer15 = tarArchiveOutputStream12.buffer;
        tarArchiveOutputStream12.closeArchiveEntry();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer15);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 0, (int) 'a');
        java.io.OutputStream outputStream19 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, (int) (byte) 0, (int) (byte) 1);
        java.io.OutputStream outputStream28 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream29 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream29, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream29, 0);
        byte[] byteArray35 = new byte[] {};
        outputStream29.write(byteArray35);
        outputStream28.write(byteArray35);
        tarArchiveOutputStream27.write(byteArray35);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer39 = tarArchiveOutputStream27.buffer;
        java.io.OutputStream outputStream40 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream40, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream45 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream40, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer46 = tarArchiveOutputStream45.buffer;
        java.io.OutputStream outputStream47 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream50 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream47, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream47, 0);
        byte[] byteArray53 = new byte[] {};
        outputStream47.write(byteArray53);
        tarArchiveOutputStream45.write(byteArray53);
        tarArchiveOutputStream27.write(byteArray53);
        tarArchiveOutputStream15.write(byteArray53);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream59 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, (int) (byte) 10);
        tarArchiveOutputStream59.flush();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer13);
        org.junit.Assert.assertNotNull(outputStream19);
        org.junit.Assert.assertNotNull(outputStream28);
        org.junit.Assert.assertNotNull(outputStream29);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer39);
        org.junit.Assert.assertNotNull(outputStream40);
        org.junit.Assert.assertNotNull(tarBuffer46);
        org.junit.Assert.assertNotNull(outputStream47);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode(0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer17 = tarArchiveOutputStream6.buffer;
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer17);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (byte) 100);
        tarArchiveOutputStream12.flush();
        tarArchiveOutputStream12.flush();
        tarArchiveOutputStream12.setLongFileMode((int) ' ');
        int int17 = tarArchiveOutputStream12.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12, (int) (byte) 0);
        tarArchiveOutputStream19.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream19, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 1, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15);
        tarArchiveOutputStream16.closeArchiveEntry();
        int int18 = tarArchiveOutputStream16.getRecordSize();
        int int19 = tarArchiveOutputStream16.getRecordSize();
        tarArchiveOutputStream16.finish();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream5.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream5.buffer;
        tarArchiveOutputStream5.flush();
        tarArchiveOutputStream5.closeArchiveEntry();
        tarArchiveOutputStream5.setLongFileMode((int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.close();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 512 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertNotNull(tarBuffer7);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream13.closeArchiveEntry();
        tarArchiveOutputStream13.setLongFileMode(35);
        tarArchiveOutputStream13.closeArchiveEntry();
        tarArchiveOutputStream13.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream13, 512, 512);
        java.io.OutputStream outputStream22 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream22, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream22, 0);
        byte[] byteArray28 = new byte[] {};
        tarArchiveOutputStream27.write(byteArray28);
        tarArchiveOutputStream27.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer31 = tarArchiveOutputStream27.buffer;
        tarArchiveOutputStream27.closeArchiveEntry();
        java.io.OutputStream outputStream33 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream33, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream33, 0);
        byte[] byteArray39 = new byte[] {};
        tarArchiveOutputStream38.write(byteArray39);
        tarArchiveOutputStream38.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer42 = tarArchiveOutputStream38.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream44 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream38, 2);
        tarArchiveOutputStream38.closeArchiveEntry();
        java.io.OutputStream outputStream46 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream49 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream46, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream51 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream46, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer52 = tarArchiveOutputStream51.buffer;
        java.io.OutputStream outputStream53 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream56 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream53, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream58 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream53, 0);
        byte[] byteArray59 = new byte[] {};
        outputStream53.write(byteArray59);
        tarArchiveOutputStream51.write(byteArray59);
        tarArchiveOutputStream38.write(byteArray59);
        tarArchiveOutputStream27.write(byteArray59);
        tarArchiveOutputStream21.write(byteArray59);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(outputStream22);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer31);
        org.junit.Assert.assertNotNull(outputStream33);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer42);
        org.junit.Assert.assertNotNull(outputStream46);
        org.junit.Assert.assertNotNull(tarBuffer52);
        org.junit.Assert.assertNotNull(outputStream53);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] {});
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 35);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer3 = tarArchiveOutputStream2.buffer;
        org.junit.Assert.assertNotNull(tarBuffer3);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 1, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14, (int) (short) 1, (int) '4');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14, (int) (short) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream19, (int) (byte) 0, 32);
        tarArchiveOutputStream19.closeArchiveEntry();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 32, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (short) 10, 512);
        tarArchiveOutputStream3.setLongFileMode((int) ' ');
        tarArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) '4');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream16, (int) (byte) 1);
        tarArchiveOutputStream18.closeArchiveEntry();
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        byte[] byteArray6 = new byte[] {};
        tarArchiveOutputStream5.write(byteArray6);
        tarArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream5.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 0, (int) (byte) 100);
        tarArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        java.io.OutputStream outputStream20 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream20, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, 32, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, 32);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer32 = tarArchiveOutputStream31.buffer;
        java.io.OutputStream outputStream33 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream33, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream39 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream33, 10, (int) '#');
        tarArchiveOutputStream39.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream39);
        tarArchiveOutputStream39.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream39);
        java.io.OutputStream outputStream44 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream47 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream44, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream49 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream44, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream44, (int) (byte) 0, (int) (byte) 1);
        java.io.OutputStream outputStream53 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream54 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream57 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream54, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream59 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream54, 0);
        byte[] byteArray60 = new byte[] {};
        outputStream54.write(byteArray60);
        outputStream53.write(byteArray60);
        tarArchiveOutputStream52.write(byteArray60);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer64 = tarArchiveOutputStream52.buffer;
        java.io.OutputStream outputStream65 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream68 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream65, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream70 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream65, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer71 = tarArchiveOutputStream70.buffer;
        java.io.OutputStream outputStream72 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream75 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream72, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream77 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream72, 0);
        byte[] byteArray78 = new byte[] {};
        outputStream72.write(byteArray78);
        tarArchiveOutputStream70.write(byteArray78);
        tarArchiveOutputStream52.write(byteArray78);
        tarArchiveOutputStream39.write(byteArray78, (int) (short) 0, (int) (short) 0);
        tarArchiveOutputStream31.write(byteArray78);
        tarArchiveOutputStream19.write(byteArray78);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer9);
        org.junit.Assert.assertNotNull(outputStream20);
        org.junit.Assert.assertNotNull(tarBuffer32);
        org.junit.Assert.assertNotNull(outputStream33);
        org.junit.Assert.assertNotNull(outputStream44);
        org.junit.Assert.assertNotNull(outputStream53);
        org.junit.Assert.assertNotNull(outputStream54);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer64);
        org.junit.Assert.assertNotNull(outputStream65);
        org.junit.Assert.assertNotNull(tarBuffer71);
        org.junit.Assert.assertNotNull(outputStream72);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] {});
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream5.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream5.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream5.buffer;
        tarArchiveOutputStream5.setLongFileMode((int) 'a');
        int int11 = tarArchiveOutputStream5.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.write((int) '4');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (byte) 10, 35);
        tarArchiveOutputStream3.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        tarArchiveOutputStream11.setLongFileMode((int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer14 = tarArchiveOutputStream11.buffer;
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertNotNull(tarBuffer14);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (byte) 100);
        tarArchiveOutputStream12.flush();
        tarArchiveOutputStream12.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream12.write((-1));
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        byte[] byteArray6 = new byte[] {};
        tarArchiveOutputStream5.write(byteArray6);
        tarArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream5.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        tarArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream5.buffer;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.write((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer9);
        org.junit.Assert.assertNotNull(tarBuffer12);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 32, (int) (byte) 100);
        tarArchiveOutputStream8.flush();
        java.io.OutputStream outputStream10 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, 0);
        byte[] byteArray16 = new byte[] {};
        tarArchiveOutputStream15.write(byteArray16);
        java.io.OutputStream outputStream18 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream19 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, 0);
        byte[] byteArray25 = new byte[] {};
        outputStream19.write(byteArray25);
        outputStream18.write(byteArray25);
        tarArchiveOutputStream15.write(byteArray25);
        tarArchiveOutputStream8.write(byteArray25);
        tarArchiveOutputStream8.setLongFileMode((int) (short) 1);
        tarArchiveOutputStream8.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer33 = tarArchiveOutputStream8.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry34 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.putArchiveEntry(archiveEntry34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream18);
        org.junit.Assert.assertNotNull(outputStream19);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer33);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream7.closeArchiveEntry();
        int int9 = tarArchiveOutputStream7.getRecordSize();
        int int10 = tarArchiveOutputStream7.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 0, (int) 'a');
        int int19 = tarArchiveOutputStream15.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, (int) ' ');
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 0, 2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        int int8 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 10);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.putArchiveEntry(archiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream12.setLongFileMode((int) (byte) 100);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        byte[] byteArray6 = new byte[] {};
        tarArchiveOutputStream5.write(byteArray6);
        tarArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream5.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        tarArchiveOutputStream10.finish();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, 0);
        tarArchiveOutputStream13.closeArchiveEntry();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer9);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, (int) ' ', 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.putArchiveEntry(archiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 2, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream19, 10, (int) (short) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream19);
        java.io.File file24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry26 = tarArchiveOutputStream19.createArchiveEntry(file24, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 1, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (short) 0, (int) (byte) 10);
        tarArchiveOutputStream6.closeArchiveEntry();
        tarArchiveOutputStream6.flush();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 0, (int) (byte) 1);
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream10 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, 0);
        byte[] byteArray16 = new byte[] {};
        outputStream10.write(byteArray16);
        outputStream9.write(byteArray16);
        tarArchiveOutputStream8.write(byteArray16);
        tarArchiveOutputStream8.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, 32, (int) '#');
        java.lang.Class<?> wildcardClass24 = tarArchiveOutputStream8.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (byte) 100, 512);
        tarArchiveOutputStream6.closeArchiveEntry();
        tarArchiveOutputStream6.flush();
        java.io.OutputStream outputStream18 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18, (int) (byte) 0, (int) (byte) 1);
        java.io.OutputStream outputStream27 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream28 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream28, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream28, 0);
        byte[] byteArray34 = new byte[] {};
        outputStream28.write(byteArray34);
        outputStream27.write(byteArray34);
        tarArchiveOutputStream26.write(byteArray34);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer38 = tarArchiveOutputStream26.buffer;
        java.io.OutputStream outputStream39 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream42 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream39, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream44 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream39, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream47 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream39, (int) (byte) 0, (int) (byte) 1);
        java.io.OutputStream outputStream48 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream49 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream49, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream54 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream49, 0);
        byte[] byteArray55 = new byte[] {};
        outputStream49.write(byteArray55);
        outputStream48.write(byteArray55);
        tarArchiveOutputStream47.write(byteArray55);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer59 = tarArchiveOutputStream47.buffer;
        java.io.OutputStream outputStream60 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream63 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream60, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream65 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream60, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer66 = tarArchiveOutputStream65.buffer;
        java.io.OutputStream outputStream67 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream70 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream67, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream72 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream67, 0);
        byte[] byteArray73 = new byte[] {};
        outputStream67.write(byteArray73);
        tarArchiveOutputStream65.write(byteArray73);
        tarArchiveOutputStream47.write(byteArray73);
        tarArchiveOutputStream26.write(byteArray73);
        tarArchiveOutputStream6.write(byteArray73, 52, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream82 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (short) 10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer83 = tarArchiveOutputStream82.buffer;
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(outputStream18);
        org.junit.Assert.assertNotNull(outputStream27);
        org.junit.Assert.assertNotNull(outputStream28);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer38);
        org.junit.Assert.assertNotNull(outputStream39);
        org.junit.Assert.assertNotNull(outputStream48);
        org.junit.Assert.assertNotNull(outputStream49);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer59);
        org.junit.Assert.assertNotNull(outputStream60);
        org.junit.Assert.assertNotNull(tarBuffer66);
        org.junit.Assert.assertNotNull(outputStream67);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer83);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (byte) 10, 35);
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, 0);
        byte[] byteArray15 = new byte[] {};
        tarArchiveOutputStream14.write(byteArray15);
        java.io.OutputStream outputStream17 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream18 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18, 0);
        byte[] byteArray24 = new byte[] {};
        outputStream18.write(byteArray24);
        outputStream17.write(byteArray24);
        tarArchiveOutputStream14.write(byteArray24);
        tarArchiveOutputStream3.write(byteArray24);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        int int30 = tarArchiveOutputStream3.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (byte) 1, 2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream33);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream34, (int) '#');
        int int37 = tarArchiveOutputStream36.getRecordSize();
        int int38 = tarArchiveOutputStream36.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream39 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream36);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer40 = tarArchiveOutputStream39.buffer;
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream17);
        org.junit.Assert.assertNotNull(outputStream18);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 512 + "'", int37 == 512);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 512 + "'", int38 == 512);
        org.junit.Assert.assertNotNull(tarBuffer40);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        byte[] byteArray6 = new byte[] {};
        tarArchiveOutputStream5.write(byteArray6);
        tarArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream5.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 35);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, (int) ' ');
        tarArchiveOutputStream5.closeArchiveEntry();
        int int15 = tarArchiveOutputStream5.getRecordSize();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 32, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 32);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        int int12 = tarArchiveOutputStream11.getRecordSize();
        java.io.OutputStream outputStream13 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13, 10, (int) '#');
        tarArchiveOutputStream19.flush();
        java.io.OutputStream outputStream21 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream21, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream21, 0);
        byte[] byteArray27 = new byte[] {};
        tarArchiveOutputStream26.write(byteArray27);
        tarArchiveOutputStream26.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer30 = tarArchiveOutputStream26.buffer;
        tarArchiveOutputStream26.closeArchiveEntry();
        java.io.OutputStream outputStream32 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream32, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream32, 0);
        byte[] byteArray38 = new byte[] {};
        tarArchiveOutputStream37.write(byteArray38);
        tarArchiveOutputStream37.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer41 = tarArchiveOutputStream37.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream37, 2);
        tarArchiveOutputStream37.closeArchiveEntry();
        java.io.OutputStream outputStream45 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream48 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream45, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream50 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream45, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer51 = tarArchiveOutputStream50.buffer;
        java.io.OutputStream outputStream52 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream55 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream52, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream57 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream52, 0);
        byte[] byteArray58 = new byte[] {};
        outputStream52.write(byteArray58);
        tarArchiveOutputStream50.write(byteArray58);
        tarArchiveOutputStream37.write(byteArray58);
        tarArchiveOutputStream26.write(byteArray58);
        tarArchiveOutputStream19.write(byteArray58, (int) (byte) -1, 0);
        tarArchiveOutputStream11.write(byteArray58);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry67 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream11.putArchiveEntry(archiveEntry67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertNotNull(outputStream13);
        org.junit.Assert.assertNotNull(outputStream21);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer30);
        org.junit.Assert.assertNotNull(outputStream32);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer41);
        org.junit.Assert.assertNotNull(outputStream45);
        org.junit.Assert.assertNotNull(tarBuffer51);
        org.junit.Assert.assertNotNull(outputStream52);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] {});
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 0, (int) 'a');
        int int19 = tarArchiveOutputStream15.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, (int) ' ');
        int int22 = tarArchiveOutputStream21.getRecordSize();
        int int23 = tarArchiveOutputStream21.getRecordSize();
        tarArchiveOutputStream21.closeArchiveEntry();
        int int25 = tarArchiveOutputStream21.getRecordSize();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (byte) 10, 35);
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, 0);
        byte[] byteArray15 = new byte[] {};
        tarArchiveOutputStream14.write(byteArray15);
        java.io.OutputStream outputStream17 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream18 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18, 0);
        byte[] byteArray24 = new byte[] {};
        outputStream18.write(byteArray24);
        outputStream17.write(byteArray24);
        tarArchiveOutputStream14.write(byteArray24);
        tarArchiveOutputStream3.write(byteArray24);
        tarArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        int int31 = tarArchiveOutputStream3.getRecordSize();
        tarArchiveOutputStream3.setLongFileMode((int) (short) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (short) 10, (int) '#');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry37 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.putArchiveEntry(archiveEntry37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream17);
        org.junit.Assert.assertNotNull(outputStream18);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 0, 2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 10, 2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (short) 1, 2);
        tarArchiveOutputStream9.setLongFileMode(100);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream9.write(32);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 0, (int) 'a');
        java.io.OutputStream outputStream19 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, (int) (byte) 0, (int) (byte) 1);
        java.io.OutputStream outputStream28 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream29 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream29, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream29, 0);
        byte[] byteArray35 = new byte[] {};
        outputStream29.write(byteArray35);
        outputStream28.write(byteArray35);
        tarArchiveOutputStream27.write(byteArray35);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer39 = tarArchiveOutputStream27.buffer;
        java.io.OutputStream outputStream40 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream40, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream45 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream40, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer46 = tarArchiveOutputStream45.buffer;
        java.io.OutputStream outputStream47 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream50 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream47, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream47, 0);
        byte[] byteArray53 = new byte[] {};
        outputStream47.write(byteArray53);
        tarArchiveOutputStream45.write(byteArray53);
        tarArchiveOutputStream27.write(byteArray53);
        tarArchiveOutputStream15.write(byteArray53);
        tarArchiveOutputStream15.closeArchiveEntry();
        tarArchiveOutputStream15.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry60 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream15.putArchiveEntry(archiveEntry60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer13);
        org.junit.Assert.assertNotNull(outputStream19);
        org.junit.Assert.assertNotNull(outputStream28);
        org.junit.Assert.assertNotNull(outputStream29);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer39);
        org.junit.Assert.assertNotNull(outputStream40);
        org.junit.Assert.assertNotNull(tarBuffer46);
        org.junit.Assert.assertNotNull(outputStream47);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15);
        int int17 = tarArchiveOutputStream16.getRecordSize();
        java.io.OutputStream outputStream18 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18, 0);
        byte[] byteArray24 = new byte[] {};
        tarArchiveOutputStream23.write(byteArray24);
        java.io.OutputStream outputStream26 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream27 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream27, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream27, 0);
        byte[] byteArray33 = new byte[] {};
        outputStream27.write(byteArray33);
        outputStream26.write(byteArray33);
        tarArchiveOutputStream23.write(byteArray33);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23);
        tarArchiveOutputStream37.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer39 = tarArchiveOutputStream37.buffer;
        tarArchiveOutputStream37.flush();
        java.io.OutputStream outputStream41 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream44 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream41, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream47 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream41, 10, (int) '#');
        tarArchiveOutputStream47.flush();
        tarArchiveOutputStream47.setLongFileMode((int) (short) 0);
        int int51 = tarArchiveOutputStream47.getRecordSize();
        tarArchiveOutputStream47.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream53 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream47);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer54 = tarArchiveOutputStream47.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream55 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream47);
        java.io.OutputStream outputStream56 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream59 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream56, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream61 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream56, 0);
        byte[] byteArray62 = new byte[] {};
        tarArchiveOutputStream61.write(byteArray62);
        tarArchiveOutputStream61.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer65 = tarArchiveOutputStream61.buffer;
        tarArchiveOutputStream61.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer67 = tarArchiveOutputStream61.buffer;
        java.io.OutputStream outputStream68 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream71 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream68, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream73 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream68, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream76 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream68, (int) (byte) 0, (int) (byte) 1);
        java.io.OutputStream outputStream77 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream78 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream81 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream78, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream83 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream78, 0);
        byte[] byteArray84 = new byte[] {};
        outputStream78.write(byteArray84);
        outputStream77.write(byteArray84);
        tarArchiveOutputStream76.write(byteArray84);
        tarArchiveOutputStream61.write(byteArray84);
        tarArchiveOutputStream47.write(byteArray84, (int) '#', (int) (short) -1);
        tarArchiveOutputStream37.write(byteArray84);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream16.write(byteArray84, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '10' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(outputStream18);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream26);
        org.junit.Assert.assertNotNull(outputStream27);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer39);
        org.junit.Assert.assertNotNull(outputStream41);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 35 + "'", int51 == 35);
        org.junit.Assert.assertNotNull(tarBuffer54);
        org.junit.Assert.assertNotNull(outputStream56);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer65);
        org.junit.Assert.assertNotNull(tarBuffer67);
        org.junit.Assert.assertNotNull(outputStream68);
        org.junit.Assert.assertNotNull(outputStream77);
        org.junit.Assert.assertNotNull(outputStream78);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] {});
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 35, 97);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 0, (int) (byte) 1);
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream10 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, 0);
        byte[] byteArray16 = new byte[] {};
        outputStream10.write(byteArray16);
        outputStream9.write(byteArray16);
        tarArchiveOutputStream8.write(byteArray16);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer20 = tarArchiveOutputStream8.buffer;
        tarArchiveOutputStream8.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer22 = tarArchiveOutputStream8.buffer;
        java.io.OutputStream outputStream23 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream23, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream23, 10, (int) '#');
        tarArchiveOutputStream29.flush();
        tarArchiveOutputStream29.setLongFileMode((int) (short) 0);
        int int33 = tarArchiveOutputStream29.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream29, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream29, (int) (byte) 100, 512);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream29, 0, 52);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream42 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream29);
        java.io.OutputStream outputStream43 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream46 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream43, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream49 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream43, 10, (int) '#');
        tarArchiveOutputStream49.flush();
        tarArchiveOutputStream49.setLongFileMode((int) (short) 0);
        int int53 = tarArchiveOutputStream49.getRecordSize();
        tarArchiveOutputStream49.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream55 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream49);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer56 = tarArchiveOutputStream49.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream58 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream49, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream61 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream58, 0, (int) 'a');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream64 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream61, (int) (short) 0, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream65 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream64);
        tarArchiveOutputStream65.setLongFileMode((int) ' ');
        java.io.OutputStream outputStream68 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream71 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream68, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream73 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream68, 0);
        byte[] byteArray74 = new byte[] {};
        tarArchiveOutputStream73.write(byteArray74);
        tarArchiveOutputStream65.write(byteArray74);
        tarArchiveOutputStream29.write(byteArray74);
        tarArchiveOutputStream8.write(byteArray74);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer79 = tarArchiveOutputStream8.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream80 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        tarArchiveOutputStream8.setLongFileMode(512);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer20);
        org.junit.Assert.assertNotNull(tarBuffer22);
        org.junit.Assert.assertNotNull(outputStream23);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertNotNull(outputStream43);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 35 + "'", int53 == 35);
        org.junit.Assert.assertNotNull(tarBuffer56);
        org.junit.Assert.assertNotNull(outputStream68);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer79);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (byte) 1, 512);
        tarArchiveOutputStream9.flush();
        tarArchiveOutputStream9.closeArchiveEntry();
        tarArchiveOutputStream9.closeArchiveEntry();
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer14 = tarArchiveOutputStream13.buffer;
        tarArchiveOutputStream13.setLongFileMode(32);
        java.lang.Class<?> wildcardClass17 = tarArchiveOutputStream13.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        byte[] byteArray6 = new byte[] {};
        tarArchiveOutputStream5.write(byteArray6);
        java.io.OutputStream outputStream8 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, 0);
        byte[] byteArray15 = new byte[] {};
        outputStream9.write(byteArray15);
        outputStream8.write(byteArray15);
        tarArchiveOutputStream5.write(byteArray15);
        int int19 = tarArchiveOutputStream5.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, (int) (short) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream22.write((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream8);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, (int) ' ', 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        tarArchiveOutputStream11.finish();
        tarArchiveOutputStream11.closeArchiveEntry();
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 0);
        int int16 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer17 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream18);
        java.io.File file20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = tarArchiveOutputStream19.createArchiveEntry(file20, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(tarBuffer17);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 0, (int) 'a');
        tarArchiveOutputStream18.flush();
        tarArchiveOutputStream18.closeArchiveEntry();
        tarArchiveOutputStream18.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream18, 52);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream18, (int) (short) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream18, (int) (short) 10);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer13);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        int int6 = tarArchiveOutputStream3.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream7.setLongFileMode((int) ' ');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = tarArchiveOutputStream7.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11, (int) (short) 100, 52);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, (int) (short) 1);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(tarBuffer10);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) '#');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer15 = tarArchiveOutputStream6.buffer;
        tarArchiveOutputStream6.closeArchiveEntry();
        tarArchiveOutputStream6.setLongFileMode(1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer19 = tarArchiveOutputStream6.buffer;
        java.io.OutputStream outputStream20 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream20, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream20, 10, (int) '#');
        tarArchiveOutputStream26.flush();
        tarArchiveOutputStream26.setLongFileMode((int) (short) 0);
        int int30 = tarArchiveOutputStream26.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream26, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream26, (int) (byte) 100, 512);
        tarArchiveOutputStream26.closeArchiveEntry();
        tarArchiveOutputStream26.flush();
        java.io.OutputStream outputStream38 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream38, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream44 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream38, 10, (int) '#');
        tarArchiveOutputStream44.flush();
        tarArchiveOutputStream44.setLongFileMode((int) (short) 0);
        int int48 = tarArchiveOutputStream44.getRecordSize();
        tarArchiveOutputStream44.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream44, 1, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream55 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream52, (int) (short) 1, (int) '4');
        tarArchiveOutputStream52.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream58 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream52, (int) (short) 10);
        java.io.OutputStream outputStream59 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream62 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream59, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream64 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream59, 0);
        byte[] byteArray65 = new byte[] {};
        tarArchiveOutputStream64.write(byteArray65);
        tarArchiveOutputStream64.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer68 = tarArchiveOutputStream64.buffer;
        tarArchiveOutputStream64.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer70 = tarArchiveOutputStream64.buffer;
        java.io.OutputStream outputStream71 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream74 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream71, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream76 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream71, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream79 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream71, (int) (byte) 0, (int) (byte) 1);
        java.io.OutputStream outputStream80 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream81 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream84 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream81, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream86 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream81, 0);
        byte[] byteArray87 = new byte[] {};
        outputStream81.write(byteArray87);
        outputStream80.write(byteArray87);
        tarArchiveOutputStream79.write(byteArray87);
        tarArchiveOutputStream64.write(byteArray87);
        tarArchiveOutputStream58.write(byteArray87);
        tarArchiveOutputStream26.write(byteArray87, 512, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.write(byteArray87, (int) (byte) 0, 2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer15);
        org.junit.Assert.assertNotNull(tarBuffer19);
        org.junit.Assert.assertNotNull(outputStream20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNotNull(outputStream38);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 35 + "'", int48 == 35);
        org.junit.Assert.assertNotNull(outputStream59);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer68);
        org.junit.Assert.assertNotNull(tarBuffer70);
        org.junit.Assert.assertNotNull(outputStream71);
        org.junit.Assert.assertNotNull(outputStream80);
        org.junit.Assert.assertNotNull(outputStream81);
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] {});
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream4.setLongFileMode((int) '#');
        tarArchiveOutputStream4.setLongFileMode((int) (short) 10);
        tarArchiveOutputStream4.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4, 0, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = tarArchiveOutputStream4.buffer;
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer13);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer14 = tarArchiveOutputStream6.buffer;
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer14);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        int int9 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.setLongFileMode(2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15);
        tarArchiveOutputStream15.finish();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15);
        tarArchiveOutputStream18.setLongFileMode(35);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        int int9 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.setLongFileMode(2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 1);
        java.io.OutputStream outputStream14 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer20 = tarArchiveOutputStream19.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer21 = tarArchiveOutputStream19.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer22 = tarArchiveOutputStream19.buffer;
        tarArchiveOutputStream19.flush();
        java.io.OutputStream outputStream24 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream24, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream24, 0);
        byte[] byteArray30 = new byte[] {};
        tarArchiveOutputStream29.write(byteArray30);
        java.io.OutputStream outputStream32 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream33 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream33, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream33, 0);
        byte[] byteArray39 = new byte[] {};
        outputStream33.write(byteArray39);
        outputStream32.write(byteArray39);
        tarArchiveOutputStream29.write(byteArray39);
        tarArchiveOutputStream19.write(byteArray39);
        tarArchiveOutputStream6.write(byteArray39);
        tarArchiveOutputStream6.setLongFileMode((int) (byte) 1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry47 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.putArchiveEntry(archiveEntry47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(outputStream14);
        org.junit.Assert.assertNotNull(tarBuffer20);
        org.junit.Assert.assertNotNull(tarBuffer21);
        org.junit.Assert.assertNotNull(tarBuffer22);
        org.junit.Assert.assertNotNull(outputStream24);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream32);
        org.junit.Assert.assertNotNull(outputStream33);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream5.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream5.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream5.buffer;
        tarArchiveOutputStream5.flush();
        java.io.OutputStream outputStream10 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, 0);
        byte[] byteArray16 = new byte[] {};
        tarArchiveOutputStream15.write(byteArray16);
        java.io.OutputStream outputStream18 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream19 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, 0);
        byte[] byteArray25 = new byte[] {};
        outputStream19.write(byteArray25);
        outputStream18.write(byteArray25);
        tarArchiveOutputStream15.write(byteArray25);
        tarArchiveOutputStream5.write(byteArray25);
        int int30 = tarArchiveOutputStream5.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 512, (int) '#');
        int int34 = tarArchiveOutputStream33.getRecordSize();
        int int35 = tarArchiveOutputStream33.getRecordSize();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream18);
        org.junit.Assert.assertNotNull(outputStream19);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 512 + "'", int30 == 512);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (byte) 10, 35);
        tarArchiveOutputStream3.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream10.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, (int) ' ');
        int int14 = tarArchiveOutputStream10.getRecordSize();
        java.lang.Class<?> wildcardClass15 = tarArchiveOutputStream10.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        java.io.OutputStream outputStream8 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream8, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream8, (int) 'a');
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        tarArchiveOutputStream13.write(byteArray20, 35, 0);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.write(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '6' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream8);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) 100, (byte) 10 });
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        tarArchiveOutputStream6.setLongFileMode((int) (byte) 0);
        tarArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 32);
        tarArchiveOutputStream6.closeArchiveEntry();
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        byte[] byteArray6 = new byte[] {};
        tarArchiveOutputStream5.write(byteArray6);
        tarArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream5.buffer;
        tarArchiveOutputStream5.closeArchiveEntry();
        java.io.OutputStream outputStream11 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream11, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream11, 0);
        byte[] byteArray17 = new byte[] {};
        tarArchiveOutputStream16.write(byteArray17);
        tarArchiveOutputStream16.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer20 = tarArchiveOutputStream16.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream16, 2);
        tarArchiveOutputStream16.closeArchiveEntry();
        java.io.OutputStream outputStream24 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream24, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream24, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer30 = tarArchiveOutputStream29.buffer;
        java.io.OutputStream outputStream31 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream31, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream31, 0);
        byte[] byteArray37 = new byte[] {};
        outputStream31.write(byteArray37);
        tarArchiveOutputStream29.write(byteArray37);
        tarArchiveOutputStream16.write(byteArray37);
        tarArchiveOutputStream5.write(byteArray37);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream42 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        int int43 = tarArchiveOutputStream42.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer44 = tarArchiveOutputStream42.buffer;
        tarArchiveOutputStream42.finish();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream46 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream42);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream47 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream42);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream47.write(32);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer9);
        org.junit.Assert.assertNotNull(outputStream11);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer20);
        org.junit.Assert.assertNotNull(outputStream24);
        org.junit.Assert.assertNotNull(tarBuffer30);
        org.junit.Assert.assertNotNull(outputStream31);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 512 + "'", int43 == 512);
        org.junit.Assert.assertNotNull(tarBuffer44);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream5.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream5.buffer;
        tarArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertNotNull(tarBuffer7);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        byte[] byteArray6 = new byte[] {};
        tarArchiveOutputStream5.write(byteArray6);
        tarArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream5.buffer;
        int int10 = tarArchiveOutputStream5.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        tarArchiveOutputStream11.finish();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = tarArchiveOutputStream11.buffer;
        tarArchiveOutputStream11.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11, (int) (byte) 10);
        byte[] byteArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream11.write(byteArray17, 35, 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(tarBuffer13);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream5.buffer;
        tarArchiveOutputStream5.flush();
        tarArchiveOutputStream5.setLongFileMode((int) ' ');
        tarArchiveOutputStream5.flush();
        java.io.OutputStream outputStream11 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream11, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream11, 0);
        byte[] byteArray17 = new byte[] {};
        tarArchiveOutputStream16.write(byteArray17);
        tarArchiveOutputStream16.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer20 = tarArchiveOutputStream16.buffer;
        tarArchiveOutputStream16.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer22 = tarArchiveOutputStream16.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream16);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream16, 512, 52);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer27 = tarArchiveOutputStream26.buffer;
        java.io.OutputStream outputStream28 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream28, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream28, 0);
        byte[] byteArray34 = new byte[] {};
        outputStream28.write(byteArray34);
        tarArchiveOutputStream26.write(byteArray34);
        tarArchiveOutputStream5.write(byteArray34, (int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 512 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertNotNull(outputStream11);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer20);
        org.junit.Assert.assertNotNull(tarBuffer22);
        org.junit.Assert.assertNotNull(tarBuffer27);
        org.junit.Assert.assertNotNull(outputStream28);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream7.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7, (int) (byte) 100, (int) ' ');
        tarArchiveOutputStream7.flush();
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        byte[] byteArray6 = new byte[] {};
        tarArchiveOutputStream5.write(byteArray6);
        tarArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream5.buffer;
        tarArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer11 = tarArchiveOutputStream5.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        tarArchiveOutputStream12.finish();
        int int14 = tarArchiveOutputStream12.getRecordSize();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer9);
        org.junit.Assert.assertNotNull(tarBuffer11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 0, 2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream3.buffer;
        tarArchiveOutputStream3.flush();
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer14 = tarArchiveOutputStream12.buffer;
        int int15 = tarArchiveOutputStream12.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12);
        tarArchiveOutputStream16.setLongFileMode((int) ' ');
        java.io.OutputStream outputStream19 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, 10, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream25, (int) (byte) 1, 512);
        java.io.OutputStream outputStream29 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream29, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream29, 10, (int) '#');
        tarArchiveOutputStream35.flush();
        java.io.OutputStream outputStream37 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream37, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream42 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream37, 0);
        byte[] byteArray43 = new byte[] {};
        tarArchiveOutputStream42.write(byteArray43);
        tarArchiveOutputStream42.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer46 = tarArchiveOutputStream42.buffer;
        tarArchiveOutputStream42.closeArchiveEntry();
        java.io.OutputStream outputStream48 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream51 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream48, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream53 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream48, 0);
        byte[] byteArray54 = new byte[] {};
        tarArchiveOutputStream53.write(byteArray54);
        tarArchiveOutputStream53.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer57 = tarArchiveOutputStream53.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream59 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream53, 2);
        tarArchiveOutputStream53.closeArchiveEntry();
        java.io.OutputStream outputStream61 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream64 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream61, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream66 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream61, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer67 = tarArchiveOutputStream66.buffer;
        java.io.OutputStream outputStream68 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream71 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream68, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream73 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream68, 0);
        byte[] byteArray74 = new byte[] {};
        outputStream68.write(byteArray74);
        tarArchiveOutputStream66.write(byteArray74);
        tarArchiveOutputStream53.write(byteArray74);
        tarArchiveOutputStream42.write(byteArray74);
        tarArchiveOutputStream35.write(byteArray74, (int) (byte) -1, 0);
        tarArchiveOutputStream28.write(byteArray74);
        tarArchiveOutputStream16.write(byteArray74);
        tarArchiveOutputStream3.write(byteArray74);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream85 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        java.lang.Class<?> wildcardClass86 = tarArchiveOutputStream85.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(tarBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(outputStream19);
        org.junit.Assert.assertNotNull(outputStream29);
        org.junit.Assert.assertNotNull(outputStream37);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer46);
        org.junit.Assert.assertNotNull(outputStream48);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer57);
        org.junit.Assert.assertNotNull(outputStream61);
        org.junit.Assert.assertNotNull(tarBuffer67);
        org.junit.Assert.assertNotNull(outputStream68);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        tarArchiveOutputStream6.setLongFileMode((int) (byte) 0);
        java.io.OutputStream outputStream12 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream12, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream12, 0);
        byte[] byteArray18 = new byte[] {};
        outputStream12.write(byteArray18);
        tarArchiveOutputStream6.write(byteArray18, (int) (short) 0, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer23 = tarArchiveOutputStream6.buffer;
        tarArchiveOutputStream6.setLongFileMode((int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer26 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer27 = tarArchiveOutputStream6.buffer;
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream12);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer23);
        org.junit.Assert.assertNotNull(tarBuffer26);
        org.junit.Assert.assertNotNull(tarBuffer27);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        byte[] byteArray6 = new byte[] {};
        tarArchiveOutputStream5.write(byteArray6);
        java.io.OutputStream outputStream8 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, 0);
        byte[] byteArray15 = new byte[] {};
        outputStream9.write(byteArray15);
        outputStream8.write(byteArray15);
        tarArchiveOutputStream5.write(byteArray15);
        tarArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 52);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer22 = tarArchiveOutputStream21.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21);
        java.lang.Class<?> wildcardClass25 = tarArchiveOutputStream24.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream8);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream5.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream5.buffer;
        tarArchiveOutputStream5.flush();
        tarArchiveOutputStream5.closeArchiveEntry();
        tarArchiveOutputStream5.setLongFileMode((int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        tarArchiveOutputStream12.setLongFileMode((int) (short) 1);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertNotNull(tarBuffer7);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        int int6 = tarArchiveOutputStream3.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 35);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, (int) (short) 0);
        tarArchiveOutputStream8.flush();
        tarArchiveOutputStream8.closeArchiveEntry();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        byte[] byteArray6 = new byte[] {};
        tarArchiveOutputStream5.write(byteArray6);
        tarArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream5.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, 100, 32);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer14 = tarArchiveOutputStream10.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, (int) 'a');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer17 = tarArchiveOutputStream16.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream16, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream19.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '100' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer9);
        org.junit.Assert.assertNotNull(tarBuffer14);
        org.junit.Assert.assertNotNull(tarBuffer17);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.flush();
        java.io.OutputStream outputStream17 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream17, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream17, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer23 = tarArchiveOutputStream22.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer24 = tarArchiveOutputStream22.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer25 = tarArchiveOutputStream22.buffer;
        java.io.OutputStream outputStream26 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream26, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream26, 0);
        byte[] byteArray32 = new byte[] {};
        tarArchiveOutputStream31.write(byteArray32);
        java.io.OutputStream outputStream34 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream35 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream35, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream35, 0);
        byte[] byteArray41 = new byte[] {};
        outputStream35.write(byteArray41);
        outputStream34.write(byteArray41);
        tarArchiveOutputStream31.write(byteArray41);
        tarArchiveOutputStream22.write(byteArray41, 1, (int) (byte) -1);
        tarArchiveOutputStream6.write(byteArray41);
        int int49 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer50 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry51 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.putArchiveEntry(archiveEntry51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(outputStream17);
        org.junit.Assert.assertNotNull(tarBuffer23);
        org.junit.Assert.assertNotNull(tarBuffer24);
        org.junit.Assert.assertNotNull(tarBuffer25);
        org.junit.Assert.assertNotNull(outputStream26);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream34);
        org.junit.Assert.assertNotNull(outputStream35);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 35 + "'", int49 == 35);
        org.junit.Assert.assertNotNull(tarBuffer50);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 32, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 32);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer11 = tarArchiveOutputStream3.buffer;
        java.lang.Class<?> wildcardClass12 = tarArchiveOutputStream3.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        int int9 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (short) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12, (int) (byte) 100, (int) (short) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12, (int) (byte) 10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer18 = tarArchiveOutputStream17.buffer;
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(tarBuffer18);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        byte[] byteArray6 = new byte[] {};
        tarArchiveOutputStream5.write(byteArray6);
        java.io.OutputStream outputStream8 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, 0);
        byte[] byteArray15 = new byte[] {};
        outputStream9.write(byteArray15);
        outputStream8.write(byteArray15);
        tarArchiveOutputStream5.write(byteArray15);
        tarArchiveOutputStream5.setLongFileMode(32);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.close();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 512 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream8);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (byte) 100, 512);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 0, (int) 'a');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 1);
        tarArchiveOutputStream15.flush();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream7.buffer;
        tarArchiveOutputStream7.setLongFileMode(100);
        tarArchiveOutputStream7.closeArchiveEntry();
        tarArchiveOutputStream7.finish();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7, 512);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer8);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 0, (int) (byte) 1);
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream10 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, 0);
        byte[] byteArray16 = new byte[] {};
        outputStream10.write(byteArray16);
        outputStream9.write(byteArray16);
        tarArchiveOutputStream8.write(byteArray16);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, (int) ' ', 100);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer23 = tarArchiveOutputStream22.buffer;
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer23);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 1, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14, (int) (short) 1, (int) '4');
        tarArchiveOutputStream14.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14, (int) (short) 10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer21 = tarArchiveOutputStream14.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14);
        tarArchiveOutputStream22.finish();
        java.io.File file24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry26 = tarArchiveOutputStream22.createArchiveEntry(file24, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer21);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (byte) 10, 35);
        tarArchiveOutputStream3.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        int int11 = tarArchiveOutputStream3.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        byte[] byteArray6 = new byte[] {};
        tarArchiveOutputStream5.write(byteArray6);
        java.io.OutputStream outputStream8 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, 0);
        byte[] byteArray15 = new byte[] {};
        outputStream9.write(byteArray15);
        outputStream8.write(byteArray15);
        tarArchiveOutputStream5.write(byteArray15);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        tarArchiveOutputStream19.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream19);
        tarArchiveOutputStream21.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream21.putArchiveEntry(archiveEntry23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream8);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 1, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream15.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer17 = tarArchiveOutputStream15.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, (int) (byte) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 1);
        tarArchiveOutputStream21.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream21.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer17);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (byte) 100, 512);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 0, 52);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 512);
        java.lang.Class<?> wildcardClass22 = tarArchiveOutputStream21.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (byte) 10, 35);
        tarArchiveOutputStream3.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream11.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11, 35, 10);
        int int16 = tarArchiveOutputStream15.getRecordSize();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        tarArchiveOutputStream3.closeArchiveEntry();
        int int7 = tarArchiveOutputStream3.getRecordSize();
        int int8 = tarArchiveOutputStream3.getRecordSize();
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12, (int) (byte) 1);
        int int15 = tarArchiveOutputStream12.getRecordSize();
        java.io.OutputStream outputStream16 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream16, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream16, 0);
        byte[] byteArray22 = new byte[] {};
        outputStream16.write(byteArray22);
        tarArchiveOutputStream12.write(byteArray22);
        tarArchiveOutputStream3.write(byteArray22, (int) (byte) 1, (int) (byte) -1);
        tarArchiveOutputStream3.setLongFileMode((int) (short) 1);
        int int30 = tarArchiveOutputStream3.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) 'a');
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(outputStream16);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream10.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, (int) (byte) 1, 512);
        java.io.File file15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = tarArchiveOutputStream10.createArchiveEntry(file15, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (byte) 10, 35);
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, 0);
        byte[] byteArray15 = new byte[] {};
        tarArchiveOutputStream14.write(byteArray15);
        java.io.OutputStream outputStream17 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream18 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18, 0);
        byte[] byteArray24 = new byte[] {};
        outputStream18.write(byteArray24);
        outputStream17.write(byteArray24);
        tarArchiveOutputStream14.write(byteArray24);
        tarArchiveOutputStream3.write(byteArray24);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer30 = tarArchiveOutputStream3.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer32 = tarArchiveOutputStream3.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (short) 10, 52);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream35, 0);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream17);
        org.junit.Assert.assertNotNull(outputStream18);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer30);
        org.junit.Assert.assertNotNull(tarBuffer32);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 1, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14, (int) (short) 1, (int) '4');
        tarArchiveOutputStream14.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14, (int) (short) 10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer21 = tarArchiveOutputStream14.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14);
        tarArchiveOutputStream22.finish();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer25 = tarArchiveOutputStream22.buffer;
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer21);
        org.junit.Assert.assertNotNull(tarBuffer25);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        int int6 = tarArchiveOutputStream3.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream7.setLongFileMode((int) ' ');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = tarArchiveOutputStream7.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7);
        tarArchiveOutputStream11.finish();
        tarArchiveOutputStream11.setLongFileMode(2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        java.io.OutputStream outputStream16 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream16, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream16, 0);
        byte[] byteArray22 = new byte[] {};
        outputStream16.write(byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream11.write(byteArray22, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '35' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(tarBuffer10);
        org.junit.Assert.assertNotNull(outputStream16);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 1, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream15.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer17 = tarArchiveOutputStream15.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, (int) (byte) 10);
        tarArchiveOutputStream15.setLongFileMode((int) 'a');
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer17);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        int int6 = tarArchiveOutputStream3.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream7.setLongFileMode((int) ' ');
        tarArchiveOutputStream7.setLongFileMode(2);
        tarArchiveOutputStream7.finish();
        java.io.OutputStream outputStream13 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13, (int) (byte) 0, (int) (byte) 1);
        java.io.OutputStream outputStream22 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream23 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream23, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream23, 0);
        byte[] byteArray29 = new byte[] {};
        outputStream23.write(byteArray29);
        outputStream22.write(byteArray29);
        tarArchiveOutputStream21.write(byteArray29);
        tarArchiveOutputStream21.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21, 2);
        java.io.OutputStream outputStream36 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream39 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream36, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream36, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer42 = tarArchiveOutputStream41.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer43 = tarArchiveOutputStream41.buffer;
        java.io.OutputStream outputStream44 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream47 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream44, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream49 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream44, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream44, (int) (byte) 0, (int) (byte) 1);
        java.io.OutputStream outputStream53 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream54 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream57 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream54, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream59 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream54, 0);
        byte[] byteArray60 = new byte[] {};
        outputStream54.write(byteArray60);
        outputStream53.write(byteArray60);
        tarArchiveOutputStream52.write(byteArray60);
        tarArchiveOutputStream41.write(byteArray60);
        tarArchiveOutputStream35.write(byteArray60);
        tarArchiveOutputStream7.write(byteArray60);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream67 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7);
        int int68 = tarArchiveOutputStream7.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream69 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream71 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream69, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream74 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream71, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(outputStream13);
        org.junit.Assert.assertNotNull(outputStream22);
        org.junit.Assert.assertNotNull(outputStream23);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream36);
        org.junit.Assert.assertNotNull(tarBuffer42);
        org.junit.Assert.assertNotNull(tarBuffer43);
        org.junit.Assert.assertNotNull(outputStream44);
        org.junit.Assert.assertNotNull(outputStream53);
        org.junit.Assert.assertNotNull(outputStream54);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] {});
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 512 + "'", int68 == 512);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        byte[] byteArray6 = new byte[] {};
        tarArchiveOutputStream5.write(byteArray6);
        tarArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream5.buffer;
        tarArchiveOutputStream5.closeArchiveEntry();
        tarArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14, 52);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer9);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, (int) ' ', 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        tarArchiveOutputStream12.closeArchiveEntry();
        tarArchiveOutputStream12.setLongFileMode((int) ' ');
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        int int6 = tarArchiveOutputStream3.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream7.setLongFileMode((int) ' ');
        tarArchiveOutputStream7.setLongFileMode(2);
        tarArchiveOutputStream7.finish();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7);
        tarArchiveOutputStream13.finish();
        tarArchiveOutputStream13.finish();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        byte[] byteArray6 = new byte[] {};
        tarArchiveOutputStream5.write(byteArray6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, (int) '4');
        java.io.OutputStream outputStream10 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, 0);
        byte[] byteArray16 = new byte[] {};
        tarArchiveOutputStream15.write(byteArray16);
        tarArchiveOutputStream15.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer19 = tarArchiveOutputStream15.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 0, (int) (byte) 100);
        java.io.OutputStream outputStream26 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream26, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream26, 10, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream33);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream33, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream33);
        java.io.OutputStream outputStream38 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream38, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream38, 0);
        byte[] byteArray44 = new byte[] {};
        tarArchiveOutputStream43.write(byteArray44);
        tarArchiveOutputStream43.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer47 = tarArchiveOutputStream43.buffer;
        tarArchiveOutputStream43.closeArchiveEntry();
        java.io.OutputStream outputStream49 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream49, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream54 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream49, 0);
        byte[] byteArray55 = new byte[] {};
        tarArchiveOutputStream54.write(byteArray55);
        tarArchiveOutputStream54.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer58 = tarArchiveOutputStream54.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream60 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream54, 2);
        tarArchiveOutputStream54.closeArchiveEntry();
        java.io.OutputStream outputStream62 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream65 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream62, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream67 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream62, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer68 = tarArchiveOutputStream67.buffer;
        java.io.OutputStream outputStream69 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream72 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream69, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream74 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream69, 0);
        byte[] byteArray75 = new byte[] {};
        outputStream69.write(byteArray75);
        tarArchiveOutputStream67.write(byteArray75);
        tarArchiveOutputStream54.write(byteArray75);
        tarArchiveOutputStream43.write(byteArray75);
        tarArchiveOutputStream33.write(byteArray75);
        tarArchiveOutputStream25.write(byteArray75);
        tarArchiveOutputStream9.write(byteArray75);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream83 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream84 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream84.write((int) '#');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer19);
        org.junit.Assert.assertNotNull(outputStream26);
        org.junit.Assert.assertNotNull(outputStream38);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer47);
        org.junit.Assert.assertNotNull(outputStream49);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer58);
        org.junit.Assert.assertNotNull(outputStream62);
        org.junit.Assert.assertNotNull(tarBuffer68);
        org.junit.Assert.assertNotNull(outputStream69);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] {});
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (short) 0, (int) (byte) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12);
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7, 0, 35);
        tarArchiveOutputStream7.finish();
        tarArchiveOutputStream7.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream7.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '10240' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream13.closeArchiveEntry();
        tarArchiveOutputStream13.setLongFileMode(35);
        tarArchiveOutputStream13.finish();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream13, (int) 'a', 52);
        tarArchiveOutputStream13.flush();
        tarArchiveOutputStream13.setLongFileMode((-1));
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream13.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '10240' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 0, (int) 'a');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream18, (int) (short) 0, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21);
        tarArchiveOutputStream22.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22, 2, 512);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry27 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream26.putArchiveEntry(archiveEntry27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer13);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 32, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (short) 10, 512);
        tarArchiveOutputStream11.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        tarArchiveOutputStream13.flush();
        tarArchiveOutputStream13.setLongFileMode(100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream13, 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream18.putArchiveEntry(archiveEntry19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        int int6 = tarArchiveOutputStream3.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream7.setLongFileMode((int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7, (int) (byte) 1, 512);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream12.write((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        byte[] byteArray6 = new byte[] {};
        tarArchiveOutputStream5.write(byteArray6);
        tarArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream5.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        tarArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        tarArchiveOutputStream14.setLongFileMode(0);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream14.write((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer9);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.closeArchiveEntry();
        tarArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 100);
        int int6 = tarArchiveOutputStream1.getRecordSize();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream7.buffer;
        tarArchiveOutputStream7.setLongFileMode(512);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream7.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '10240' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer12);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream7.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7, (int) ' ', 512);
        int int12 = tarArchiveOutputStream7.getRecordSize();
        int int13 = tarArchiveOutputStream7.getRecordSize();
        tarArchiveOutputStream7.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7, (int) (short) 0, (int) (short) 1);
        tarArchiveOutputStream7.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7, (int) (short) 0, 32);
        java.io.OutputStream outputStream22 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream22, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream22, 10, (int) '#');
        tarArchiveOutputStream28.flush();
        tarArchiveOutputStream28.setLongFileMode((int) (short) 0);
        int int32 = tarArchiveOutputStream28.getRecordSize();
        tarArchiveOutputStream28.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream28);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer35 = tarArchiveOutputStream28.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream28, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream37, 0, (int) 'a');
        java.io.OutputStream outputStream41 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream44 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream41, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream46 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream41, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream49 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream41, (int) (byte) 0, (int) (byte) 1);
        java.io.OutputStream outputStream50 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream51 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream54 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream51, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream56 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream51, 0);
        byte[] byteArray57 = new byte[] {};
        outputStream51.write(byteArray57);
        outputStream50.write(byteArray57);
        tarArchiveOutputStream49.write(byteArray57);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer61 = tarArchiveOutputStream49.buffer;
        java.io.OutputStream outputStream62 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream65 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream62, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream67 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream62, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer68 = tarArchiveOutputStream67.buffer;
        java.io.OutputStream outputStream69 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream72 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream69, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream74 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream69, 0);
        byte[] byteArray75 = new byte[] {};
        outputStream69.write(byteArray75);
        tarArchiveOutputStream67.write(byteArray75);
        tarArchiveOutputStream49.write(byteArray75);
        tarArchiveOutputStream37.write(byteArray75);
        tarArchiveOutputStream7.write(byteArray75, 32, (int) (byte) -1);
        int int83 = tarArchiveOutputStream7.getRecordSize();
        tarArchiveOutputStream7.closeArchiveEntry();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertNotNull(outputStream22);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertNotNull(tarBuffer35);
        org.junit.Assert.assertNotNull(outputStream41);
        org.junit.Assert.assertNotNull(outputStream50);
        org.junit.Assert.assertNotNull(outputStream51);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer61);
        org.junit.Assert.assertNotNull(outputStream62);
        org.junit.Assert.assertNotNull(tarBuffer68);
        org.junit.Assert.assertNotNull(outputStream69);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] {});
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 512 + "'", int83 == 512);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        java.io.OutputStream outputStream12 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream12, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer17 = tarArchiveOutputStream15.buffer;
        java.io.OutputStream outputStream18 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer23 = tarArchiveOutputStream21.buffer;
        tarArchiveOutputStream21.closeArchiveEntry();
        int int25 = tarArchiveOutputStream21.getRecordSize();
        int int26 = tarArchiveOutputStream21.getRecordSize();
        java.io.OutputStream outputStream27 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream27, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream30, (int) (byte) 1);
        int int33 = tarArchiveOutputStream30.getRecordSize();
        java.io.OutputStream outputStream34 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream34, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream39 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream34, 0);
        byte[] byteArray40 = new byte[] {};
        outputStream34.write(byteArray40);
        tarArchiveOutputStream30.write(byteArray40);
        tarArchiveOutputStream21.write(byteArray40, (int) (byte) 1, (int) (byte) -1);
        tarArchiveOutputStream15.write(byteArray40);
        tarArchiveOutputStream6.write(byteArray40);
        tarArchiveOutputStream6.closeArchiveEntry();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 10);
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream54 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 100, (int) (short) 100);
        tarArchiveOutputStream54.flush();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(outputStream12);
        org.junit.Assert.assertNotNull(tarBuffer17);
        org.junit.Assert.assertNotNull(outputStream18);
        org.junit.Assert.assertNotNull(tarBuffer23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertNotNull(outputStream27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertNotNull(outputStream34);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 512, (int) '4');
        tarArchiveOutputStream6.setLongFileMode((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '512' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream7.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7, 0, (int) (short) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11, 2, 512);
        java.io.OutputStream outputStream17 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream17, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream20);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer22 = tarArchiveOutputStream20.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream20, (int) (byte) 10, 35);
        tarArchiveOutputStream20.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream20);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer28 = tarArchiveOutputStream20.buffer;
        java.io.OutputStream outputStream29 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream29, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer34 = tarArchiveOutputStream32.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32, (int) (byte) 10, 35);
        tarArchiveOutputStream32.closeArchiveEntry();
        java.io.OutputStream outputStream39 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream42 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream39, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream42);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer44 = tarArchiveOutputStream42.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream47 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream42, (int) (byte) 10, 35);
        java.io.OutputStream outputStream48 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream51 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream48, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream53 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream48, 0);
        byte[] byteArray54 = new byte[] {};
        tarArchiveOutputStream53.write(byteArray54);
        java.io.OutputStream outputStream56 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream57 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream60 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream57, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream62 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream57, 0);
        byte[] byteArray63 = new byte[] {};
        outputStream57.write(byteArray63);
        outputStream56.write(byteArray63);
        tarArchiveOutputStream53.write(byteArray63);
        tarArchiveOutputStream42.write(byteArray63);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream68 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream42);
        tarArchiveOutputStream68.setLongFileMode((int) (short) 1);
        java.io.OutputStream outputStream71 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream74 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream71, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream76 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream71, 0);
        byte[] byteArray77 = new byte[] {};
        outputStream71.write(byteArray77);
        tarArchiveOutputStream68.write(byteArray77);
        tarArchiveOutputStream32.write(byteArray77);
        tarArchiveOutputStream20.write(byteArray77);
        tarArchiveOutputStream11.write(byteArray77);
        tarArchiveOutputStream11.setLongFileMode(100);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer85 = tarArchiveOutputStream11.buffer;
        tarArchiveOutputStream11.closeArchiveEntry();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream17);
        org.junit.Assert.assertNotNull(tarBuffer22);
        org.junit.Assert.assertNotNull(tarBuffer28);
        org.junit.Assert.assertNotNull(outputStream29);
        org.junit.Assert.assertNotNull(tarBuffer34);
        org.junit.Assert.assertNotNull(outputStream39);
        org.junit.Assert.assertNotNull(tarBuffer44);
        org.junit.Assert.assertNotNull(outputStream48);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream56);
        org.junit.Assert.assertNotNull(outputStream57);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream71);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer85);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 1, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15);
        tarArchiveOutputStream15.flush();
        java.lang.Class<?> wildcardClass18 = tarArchiveOutputStream15.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 0, (int) 'a');
        int int19 = tarArchiveOutputStream15.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, (int) 'a', 10);
        int int23 = tarArchiveOutputStream22.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22, (int) '4', (int) (byte) 100);
        int int27 = tarArchiveOutputStream22.getRecordSize();
        java.io.OutputStream outputStream28 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream28, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream28, 10, (int) '#');
        tarArchiveOutputStream34.flush();
        tarArchiveOutputStream34.setLongFileMode((int) (short) 0);
        int int38 = tarArchiveOutputStream34.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream34, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream34);
        tarArchiveOutputStream41.closeArchiveEntry();
        tarArchiveOutputStream41.setLongFileMode(35);
        tarArchiveOutputStream41.closeArchiveEntry();
        java.io.OutputStream outputStream46 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream49 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream46, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream46, 10, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream53 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream52);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer54 = tarArchiveOutputStream53.buffer;
        tarArchiveOutputStream53.closeArchiveEntry();
        tarArchiveOutputStream53.setLongFileMode((int) (short) 1);
        java.io.OutputStream outputStream58 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream61 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream58, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream63 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream58, 0);
        byte[] byteArray64 = new byte[] {};
        outputStream58.write(byteArray64);
        tarArchiveOutputStream53.write(byteArray64);
        tarArchiveOutputStream41.write(byteArray64);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream22.write(byteArray64, 32, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(outputStream28);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertNotNull(outputStream46);
        org.junit.Assert.assertNotNull(tarBuffer54);
        org.junit.Assert.assertNotNull(outputStream58);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] {});
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = tarArchiveOutputStream12.buffer;
        int int14 = tarArchiveOutputStream12.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12);
        java.io.File file16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = tarArchiveOutputStream15.createArchiveEntry(file16, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 0, (int) (byte) 1);
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream10 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, 0);
        byte[] byteArray16 = new byte[] {};
        outputStream10.write(byteArray16);
        outputStream9.write(byteArray16);
        tarArchiveOutputStream8.write(byteArray16);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer20 = tarArchiveOutputStream8.buffer;
        java.io.OutputStream outputStream21 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream21, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream21, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer27 = tarArchiveOutputStream26.buffer;
        java.io.OutputStream outputStream28 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream28, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream28, 0);
        byte[] byteArray34 = new byte[] {};
        outputStream28.write(byteArray34);
        tarArchiveOutputStream26.write(byteArray34);
        tarArchiveOutputStream8.write(byteArray34);
        tarArchiveOutputStream8.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer39 = tarArchiveOutputStream8.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream42 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, (int) (byte) 100, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream44 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream42, (int) 'a');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream47 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream42, 10, (int) ' ');
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer20);
        org.junit.Assert.assertNotNull(outputStream21);
        org.junit.Assert.assertNotNull(tarBuffer27);
        org.junit.Assert.assertNotNull(outputStream28);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer39);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode(0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (byte) 100);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 2, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream19, 10, (int) (short) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream19, (int) ' ');
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 0);
        int int16 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer17 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        int int19 = tarArchiveOutputStream6.getRecordSize();
        int int20 = tarArchiveOutputStream6.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(tarBuffer17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        int int6 = tarArchiveOutputStream3.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 35);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (byte) 10, 35);
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, 0);
        byte[] byteArray15 = new byte[] {};
        tarArchiveOutputStream14.write(byteArray15);
        java.io.OutputStream outputStream17 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream18 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18, 0);
        byte[] byteArray24 = new byte[] {};
        outputStream18.write(byteArray24);
        outputStream17.write(byteArray24);
        tarArchiveOutputStream14.write(byteArray24);
        tarArchiveOutputStream3.write(byteArray24);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        int int30 = tarArchiveOutputStream3.getRecordSize();
        tarArchiveOutputStream3.setLongFileMode((int) (byte) 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry33 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.putArchiveEntry(archiveEntry33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream17);
        org.junit.Assert.assertNotNull(outputStream18);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 1, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer18 = tarArchiveOutputStream6.buffer;
        java.lang.Class<?> wildcardClass19 = tarBuffer18.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(tarBuffer18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        byte[] byteArray6 = new byte[] {};
        tarArchiveOutputStream5.write(byteArray6);
        tarArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream5.buffer;
        tarArchiveOutputStream5.closeArchiveEntry();
        tarArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream5.buffer;
        tarArchiveOutputStream5.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.close();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 512 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer9);
        org.junit.Assert.assertNotNull(tarBuffer12);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 0, (int) (byte) 1);
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream10 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, 0);
        byte[] byteArray16 = new byte[] {};
        outputStream10.write(byteArray16);
        outputStream9.write(byteArray16);
        tarArchiveOutputStream8.write(byteArray16);
        tarArchiveOutputStream8.setLongFileMode(2);
        tarArchiveOutputStream8.flush();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        int int6 = tarArchiveOutputStream3.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream7.setLongFileMode((int) ' ');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = tarArchiveOutputStream7.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11, (int) (short) 100, 52);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        tarArchiveOutputStream11.flush();
        int int17 = tarArchiveOutputStream11.getRecordSize();
        tarArchiveOutputStream11.finish();
        int int19 = tarArchiveOutputStream11.getRecordSize();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(tarBuffer10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream3.buffer;
        int int6 = tarArchiveOutputStream3.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream7.setLongFileMode((int) ' ');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = tarArchiveOutputStream7.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7);
        tarArchiveOutputStream11.finish();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11, 32, 32);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream17, (int) (byte) 1);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(tarBuffer10);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 10, (int) '#');
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 0);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 1, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15);
        tarArchiveOutputStream16.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream16);
        java.io.OutputStream outputStream19 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, 10, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream25);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer27 = tarArchiveOutputStream26.buffer;
        java.io.OutputStream outputStream28 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream28, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream28, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer34 = tarArchiveOutputStream33.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer35 = tarArchiveOutputStream33.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer36 = tarArchiveOutputStream33.buffer;
        tarArchiveOutputStream33.flush();
        java.io.OutputStream outputStream38 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream38, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream38, 0);
        byte[] byteArray44 = new byte[] {};
        tarArchiveOutputStream43.write(byteArray44);
        java.io.OutputStream outputStream46 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream47 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream50 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream47, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream47, 0);
        byte[] byteArray53 = new byte[] {};
        outputStream47.write(byteArray53);
        outputStream46.write(byteArray53);
        tarArchiveOutputStream43.write(byteArray53);
        tarArchiveOutputStream33.write(byteArray53);
        tarArchiveOutputStream26.write(byteArray53);
        tarArchiveOutputStream18.write(byteArray53);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(outputStream19);
        org.junit.Assert.assertNotNull(tarBuffer27);
        org.junit.Assert.assertNotNull(outputStream28);
        org.junit.Assert.assertNotNull(tarBuffer34);
        org.junit.Assert.assertNotNull(tarBuffer35);
        org.junit.Assert.assertNotNull(tarBuffer36);
        org.junit.Assert.assertNotNull(outputStream38);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertNotNull(outputStream46);
        org.junit.Assert.assertNotNull(outputStream47);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        byte[] byteArray6 = new byte[] {};
        tarArchiveOutputStream5.write(byteArray6);
        tarArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream5.buffer;
        tarArchiveOutputStream5.closeArchiveEntry();
        java.io.OutputStream outputStream11 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream11, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream11, 0);
        byte[] byteArray17 = new byte[] {};
        tarArchiveOutputStream16.write(byteArray17);
        tarArchiveOutputStream16.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer20 = tarArchiveOutputStream16.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream16, 2);
        tarArchiveOutputStream16.closeArchiveEntry();
        java.io.OutputStream outputStream24 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream24, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream24, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer30 = tarArchiveOutputStream29.buffer;
        java.io.OutputStream outputStream31 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream31, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream31, 0);
        byte[] byteArray37 = new byte[] {};
        outputStream31.write(byteArray37);
        tarArchiveOutputStream29.write(byteArray37);
        tarArchiveOutputStream16.write(byteArray37);
        tarArchiveOutputStream5.write(byteArray37);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream42 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        int int43 = tarArchiveOutputStream42.getRecordSize();
        tarArchiveOutputStream42.closeArchiveEntry();
        tarArchiveOutputStream42.flush();
        java.io.OutputStream outputStream46 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream49 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream46, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream46, 10, (int) '#');
        tarArchiveOutputStream52.flush();
        tarArchiveOutputStream52.flush();
        tarArchiveOutputStream52.setLongFileMode((int) (short) 10);
        java.io.OutputStream outputStream57 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream60 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream57, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream63 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream57, 10, (int) '#');
        tarArchiveOutputStream63.flush();
        tarArchiveOutputStream63.setLongFileMode((int) (short) 0);
        int int67 = tarArchiveOutputStream63.getRecordSize();
        tarArchiveOutputStream63.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream70 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream63, 0);
        java.io.OutputStream outputStream71 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream74 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream71, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream76 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream71, 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer77 = tarArchiveOutputStream76.buffer;
        java.io.OutputStream outputStream78 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream81 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream78, (int) (byte) 10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream83 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream78, 0);
        byte[] byteArray84 = new byte[] {};
        outputStream78.write(byteArray84);
        tarArchiveOutputStream76.write(byteArray84);
        tarArchiveOutputStream63.write(byteArray84);
        tarArchiveOutputStream52.write(byteArray84);
        tarArchiveOutputStream42.write(byteArray84, 1, 0);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer9);
        org.junit.Assert.assertNotNull(outputStream11);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer20);
        org.junit.Assert.assertNotNull(outputStream24);
        org.junit.Assert.assertNotNull(tarBuffer30);
        org.junit.Assert.assertNotNull(outputStream31);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 512 + "'", int43 == 512);
        org.junit.Assert.assertNotNull(outputStream46);
        org.junit.Assert.assertNotNull(outputStream57);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 35 + "'", int67 == 35);
        org.junit.Assert.assertNotNull(outputStream71);
        org.junit.Assert.assertNotNull(tarBuffer77);
        org.junit.Assert.assertNotNull(outputStream78);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] {});
    }
}

